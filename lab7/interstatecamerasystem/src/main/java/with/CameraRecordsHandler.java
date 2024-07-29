package with;

import with.handlers.Handler;

public class CameraRecordsHandler {

    private Handler chainOfHandlers;

    public void setChainOfHandlers(Handler chainOfHandlers) {
        this.chainOfHandlers = chainOfHandlers;
    }

    public void handleRecord(CameraRecord cameraRecord) {
        chainOfHandlers.handle(cameraRecord);
    }
}
