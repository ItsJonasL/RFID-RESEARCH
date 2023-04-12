package rfid_find;

import com.impinj.octane.*;
import java.util.ArrayList;

import java.util.Scanner;


public class ReadTags {
    static short EPC_OP_ID = 123;
    static short PC_BITS_OP_ID = 321;

    static int opSpecID = 1;
    
    public static String[] tags = {"E280 1160 6000 0209 E445 BACA", "E280 1160 6000 0209 E445 BBBB"}; 
    
    public static void main(String[] args) {
        readRFIDTags();
    }

    public static void changePowerLevel(ImpinjReader reader, double power, AntennaConfigGroup antennas, Settings settings) throws OctaneSdkException{
        //gives power / transmit power 
        antennas.getAntenna((short) 1).setTxPowerinDbm(power);
        reader.applySettings(settings);
        reader.start();
    }
    
    public static void programEpc(ImpinjReader reader, String currentEpc, String newEpc) throws Exception {
    
        currentEpc = currentEpc.replace(" ", "");
        newEpc = newEpc.replace(" ", "");

        // Check that the specified EPCs are a valid length
        if ((currentEpc.length() % 4 != 0) || (newEpc.length() % 4 != 0)) {
            throw new Exception("EPCs must be a multiple of 16 bits (4 hex chars): " + currentEpc + "  " + newEpc);
        }
        
        if(currentEpc.length() != newEpc.length()) {
            throw new Exception("EPC must be the same length as the old EPC: " + currentEpc + "  " + newEpc);
        }

        System.out.println("Adding a write operation to change the EPC from :");
        System.out.println(currentEpc + " to " + newEpc);

        // Create a tag operation sequence.
        // You can add multiple read, write, lock, kill and QT operations to this sequence.
        TagOpSequence seq = new TagOpSequence();
        seq.setOps(new ArrayList<>());

        seq.setExecutionCount((short) 1); // delete after one time
        seq.setState(SequenceState.Active);
        seq.setId(opSpecID++);

        // Specify a target tag based on the EPC.
        seq.setTargetTag(new TargetTag());
        seq.getTargetTag().setMemoryBank(MemoryBank.Epc);
        seq.getTargetTag().setBitPointer(BitPointers.Epc);
        seq.getTargetTag().setData(currentEpc);

        // If you are using Monza 4, Monza 5 or Monza X tag chips, uncomment these two lines.
        // This enables 32-bit block writes which significantly improves write performance.
        //seq.setBlockWriteEnabled(true);
        //seq.setBlockWriteWordCount((short) 2);

        // Create a tag write operation to change the EPC.
        TagWriteOp writeEpc = new TagWriteOp();
        // Set an ID so we can tell when this operation has executed.
        writeEpc.Id = EPC_OP_ID;
        // Write to EPC memory
        writeEpc.setMemoryBank(MemoryBank.Epc);
        // Specify the new EPC data
        writeEpc.setData(TagData.fromHexString(newEpc));
        // Starting writing at word 2 (word 0 = CRC, word 1 = PC bits)
        writeEpc.setWordPointer(WordPointers.Epc);

        // Add this tag write op to the tag operation sequence.
        seq.getOps().add(writeEpc);

        // Add the tag operation sequence to the reader.
        // The reader supports multiple sequences.
        reader.addOpSequence(seq);
    }
    
    public static void readRFIDTags() {

        try {
            // Pass in a reader hostname or IP address as a command line argument when running the example.
            //String hostname = System.getProperty(SampleProperties.hostname);
            //if (hostname == null) {
            //    throw new Exception("Must specify the '" + SampleProperties.hostname + "' property");
            //}
            String hostname = "speedwayr-12-76-f9.local";
                    
            ImpinjReader reader = new ImpinjReader();

            // Connect to the reader.
            System.out.println("Connecting");
            reader.connect(hostname);

            // Get the default settings.
            // We'll use these as a starting point and then modify the settings we're interested in.
            Settings settings = reader.queryDefaultSettings();

            ReportConfig report = settings.getReport();

            // Tell the reader to include the antenna number in all tag reports. Other fields can be added
            // to the reports in the same way by setting the appropriate Report.IncludeXXXXXXX property.
            report.setIncludeAntennaPortNumber(true);
            report.setMode(ReportMode.Individual);

            // The reader can be set into various modes in which reader dynamics are optimized for
            // specific regions and environments.
            // The following mode, AutoSetDenseReaderDeepScan, monitors RF noise and interference
            // and then automatically and continuously optimizes the reader's configuration.
            settings.setRfMode(1002);
            settings.setSearchMode(SearchMode.DualTarget);
            settings.setSession(2);

            // Enable antenna #1. Disable all others.
            AntennaConfigGroup antennas = settings.getAntennas();
            antennas.disableAll();
            antennas.enableById(new short[]{1});

            // Set the Transmit Power and
            // Receive Sensitivity to the maximum.
            antennas.getAntenna((short) 1).setIsMaxRxSensitivity(true);
            // antennas.getAntenna((short) 1).setIsMaxTxPower(true);

            // You can also set them to specific values like this...
            double power = 10.0; 
            antennas.getAntenna((short) 1).setTxPowerinDbm(power);
            // antennas.getAntenna((short) 1).setRxSensitivityinDbm(-70);

            // Apply the newly modified settings.
            System.out.println("Applying Settings");
            reader.applySettings(settings);

            // Assign the TagsReported event listener.
            // This specifies which object to inform when tags reports are available.
            reader.setTagReportListener(new TagReportListenerImplementation());

            // Start reading.
            System.out.println("Starting");
            reader.start();


            System.out.println("Wait 10 seconds");
            Thread.sleep(10000);
            
            System.out.println("Power up");
            power = 31.0; //20.0;
            changePowerLevel(reader, power, antennas, settings);
           
            
            // Wait for the user to press enter.
            System.out.println("Press Enter to exit.");
            Scanner s = new Scanner(System.in);
            s.nextLine();

            // Stop reading.
            System.out.println("Stopping");
            reader.stop();

            // Disconnect from the reader.
            System.out.println("Disconnecting");
            reader.disconnect();
        } catch (OctaneSdkException ex) {
            System.out.println("Octane SDK exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception : " + ex.getMessage());
            ex.printStackTrace(System.out);
        }
    }
}
