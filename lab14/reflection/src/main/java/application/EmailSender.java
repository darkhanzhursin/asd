package application;

@Service(name="email")
public class EmailSender {
    public void sendEmail(String content) {
        System.out.println("sending email: "+content);
    }
}
