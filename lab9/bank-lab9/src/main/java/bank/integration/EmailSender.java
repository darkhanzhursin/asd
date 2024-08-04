package bank.integration;

public class EmailSender implements IEmail {
    private static EmailSender emailSender;

    private EmailSender() {
        if (emailSender != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static EmailSender getInstance() {
        if (emailSender == null) {
            synchronized (EmailSender.class) {
                if (emailSender == null) emailSender = new EmailSender();
            }
        }
        return emailSender;
    }

    public void send(String msg) {
        System.out.println("Sending message: " + msg);
    }

    protected Object readResolve() {
        return getInstance();
    }
}
