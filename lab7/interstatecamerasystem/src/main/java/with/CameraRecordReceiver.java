package with;

public class CameraRecordReceiver {

	CameraRecordsHandler cameraRecordsHandler;

	public CameraRecordReceiver(CameraRecordsHandler cameraRecordsHandler) {
		this.cameraRecordsHandler = cameraRecordsHandler;
	}

	public void receiveCameraRecord(CameraRecord cameraRecord) {
		System.out.println("receiving "+cameraRecord);
		cameraRecordsHandler.handleRecord(cameraRecord);
	}

}
