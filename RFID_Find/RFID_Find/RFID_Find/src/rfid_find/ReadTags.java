package rfid_find;

import com.impinj.octane.*;

import java.util.Scanner;


public class ReadTags {
    public static void main(String[] args) {
        readRFIDTags();
    }

    public static void changePowerLevel(ImpinjReader reader, double power, AntennaConfigGroup antennas){
        //gives power / transmit power 
        antennas.getAntenna((short) 1).setTxPowerinDbm(power);
        reader.applySettings(settings);
        reader.start();
    }
    public static void changeEpcTag(ImpinjReader reader, String currentEpc, String newEpc) {
        // put in the EPC function code in here. After double checking. 
    }

    

    public static void readRFIDTags() {

        try {
            // Pass in a reader hostname or IP address as a command line argument when running the example.
            //String hostname = System.getProperty(SampleProperties.hostname);
            //if (hostname == null) {
            //    throw new Exception("Must specify the '" + SampleProperties.hostname + "' property");
            //}
            String hostname = "speedwayr-12-76-f9.local";
            String tag = "E280 1160 6000 0209 E445 BACA";
                    
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
            changePowerLevel(ImpinjReader reader, double power, AntennaConfigGroup antennas);
           
            
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
