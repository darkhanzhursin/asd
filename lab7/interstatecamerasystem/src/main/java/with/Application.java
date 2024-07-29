package with;

import with.handlers.RegistrationHandler;
import with.handlers.SpeedingHandler;
import with.handlers.StolenCarHandler;
import with.handlers.TicketsHandler;

public class Application {

    public static void main(String[] args) {
        CameraRecordsHandler recordsHandler = new CameraRecordsHandler();
        RegistrationHandler registrationHandler = new RegistrationHandler(null);
        SpeedingHandler speedingHandler = new SpeedingHandler(registrationHandler);
        StolenCarHandler stolenCarHandler = new StolenCarHandler(speedingHandler);
        TicketsHandler ticketsHandler = new TicketsHandler(stolenCarHandler);

        recordsHandler.setChainOfHandlers(ticketsHandler);

        CameraRecordReceiver cameraRecordReceiver = new CameraRecordReceiver(recordsHandler);
        Camera camera = new Camera(cameraRecordReceiver);
        camera.generateCameraRecords();

    }
}
