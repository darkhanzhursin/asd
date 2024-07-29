package with.handlers;

import with.CameraRecord;

public class StolenCarHandler extends Handler {

    public StolenCarHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if (isStolen(cameraRecord.getLicenseplate())) {
            System.out.println("Notifying the police " + cameraRecord);
        } else {
            nextHandler.handle(cameraRecord);
        }
    }

    boolean isStolen(String licenseplate) {
        if (licenseplate.contains("33")) return true;
        return false;
    }
}
