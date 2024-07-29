package with.handlers;

import with.CameraRecord;

public class RegistrationHandler extends Handler {

    public RegistrationHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if (!isRegistered(cameraRecord.getLicenseplate())) {
            System.out.println("Sending the owner a ticket: " + cameraRecord);
        } else {
            nextHandler.handle(cameraRecord);
        }
    }

    private boolean isRegistered(String licenseplate) {
        if (licenseplate.contains("33")) return true;
        return false;
    }
}
