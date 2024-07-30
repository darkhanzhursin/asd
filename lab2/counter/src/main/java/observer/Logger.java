package observer;

public class Logger implements Observer {

    @Override
    public void update(int counter) {
        log(counter);
    }

    private void log(int counter) {
        System.out.println("Log: " + counter);
    }
}
