import java.util.Date;

public class InternalOrder extends Order {
    private String department;

    public InternalOrder(Date date, int amount, String state, String department) {
        super(date, amount, state);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
