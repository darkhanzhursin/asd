import java.util.Date;

public class IndividualOrder extends Order {

    private String name;

    public IndividualOrder(Date date, int amount, String state, String name) {
        super(date, amount, state);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
