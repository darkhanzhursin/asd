package with.handlers;

import with.CameraRecord;

public class SpeedingHandler extends Handler {

    public SpeedingHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if (cameraRecord.getSpeed() > 70) {
            System.out.println("Sending the owner a speeding ticket " + cameraRecord);
        } else {
            nextHandler.handle(cameraRecord);
        }
    }
}
