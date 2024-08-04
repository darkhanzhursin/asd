import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private List<Orderline> orderlineList;
    private Date date;
    private int amount;
    private String state;

    public Order(Date date, int amount, String state) {
        this.orderlineList = new ArrayList<>();
        this.date = date;
        this.amount = amount;
        this.state = state;
    }

    public List<Orderline> getOrderlineList() {
        return orderlineList;
    }

    public void setOrderlineList(List<Orderline> orderlineList) {
        this.orderlineList = orderlineList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
