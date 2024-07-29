package with.handlers;

import with.CameraRecord;

public class TicketsHandler extends Handler {

    public TicketsHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if (hasUnpaidTickets(cameraRecord.getLicenseplate())) {
            System.out.println("Notifying the police " + cameraRecord);
        } else {
            nextHandler.handle(cameraRecord);
        }
    }

    private boolean hasUnpaidTickets(String licenseplate) {
        if (licenseplate.contains("33")) return true;
        return false;
    }
}
