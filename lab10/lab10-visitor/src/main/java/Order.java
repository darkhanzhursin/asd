import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private List<Orderline> orderlineList;
    private Date date;
    private int amount;
    private String state;
    private int counter;

    public Order(Date date, int amount, String state) {
        this.orderlineList = new ArrayList<>();
        this.date = date;
        this.amount = amount;
        this.state = state;
    }

    public List<Orderline> getOrderlineList() {
        return orderlineList;
    }

    public void addOrderline(Orderline orderline) {
        orderlineList.add(orderline);
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

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
