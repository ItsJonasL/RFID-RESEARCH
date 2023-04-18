package rfid_find;

import com.impinj.octane.ImpinjReader;
import com.impinj.octane.Tag;
import com.impinj.octane.TagReport;
import com.impinj.octane.TagReportListener;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TagReportListenerImplementation implements TagReportListener {
    
    private int iteration = 0;
    
    public TagReportListenerImplementation() {
        iteration = 0;
    }
    
    @Override
    public void onTagReported(ImpinjReader reader, TagReport report) {
        iteration += 1;
        
        List<Tag> tags = report.getTags();

        for (Tag t : tags) {
            System.out.print(" EPC: " + t.getEpc().toString());

            if ((reader.getName() != null) && !reader.getName().isEmpty()) {
                System.out.print(" Reader_name: " + reader.getName());
            } else {
                System.out.print(" Reader_ip: " + reader.getAddress());
            }

            if (t.isAntennaPortNumberPresent()) {
                System.out.print(" antenna: " + t.getAntennaPortNumber());
            }

            if (t.isFirstSeenTimePresent()) {
                System.out.print(" first: " + t.getFirstSeenTime().ToString());
            }

            if (t.isLastSeenTimePresent()) {
                System.out.print(" last: " + t.getLastSeenTime().ToString());
            }

            if (t.isSeenCountPresent()) {
                System.out.print(" count: " + t.getTagSeenCount());
            }

            if (t.isRfDopplerFrequencyPresent()) {
                System.out.print(" doppler: " + t.getRfDopplerFrequency());
            }

            if (t.isPeakRssiInDbmPresent()) {
                System.out.print(" peak_rssi: " + t.getPeakRssiInDbm());
            }

            if (t.isChannelInMhzPresent()) {
                System.out.print(" chan_MHz: " + t.getChannelInMhz());
            }

            if (t.isRfPhaseAnglePresent()) {
                System.out.print(" phase angle: " + t.getPhaseAngleInRadians());
            }

            if (t.isFastIdPresent()) {
                System.out.print("\n     fast_id: " + t.getTid().toString());

                System.out.print(" model: " +
                        t.getModelDetails().getModelName());

                System.out.print(" epcsize: " +
                        t.getModelDetails().getEpcSizeBits());

                System.out.print(" usermemsize: " +
                        t.getModelDetails().getUserMemorySizeBits());

                System.out.print(" Supports QT: " + t.getModelDetails().isSupportsQt());
            }

            System.out.println("");
            
            processTag(t, reader);
        }
    }

    public void processTag(Tag t, ImpinjReader reader) {
        if(iteration % 10 == 0) {
            try {
                if(t.getEpc().toString().equals(ReadTags.tags[0])) {
                        String currentEpc = t.getEpc().toHexString();
                        String newEpc = ReadTags.tags[1];
                        ReadTags.programEpc(reader, currentEpc, newEpc);
                } else if(t.getEpc().toString().equals(ReadTags.tags[1])) {
                        String currentEpc = t.getEpc().toHexString();
                        String newEpc = ReadTags.tags[0];
                        ReadTags.programEpc(reader, currentEpc, newEpc);
                }
            } catch (Exception ex) {
                Logger.getLogger(TagReportListenerImplementation.class.getName()).log(Level.WARNING, null, ex);
            }
        }
    }
}
