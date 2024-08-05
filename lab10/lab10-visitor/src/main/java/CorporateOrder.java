import java.util.Date;

public class CorporateOrder extends Order {

    private String company;
    private String contact;

    public CorporateOrder(Date date, int amount, String state,
                          String company, String contact) {
        super(date, amount, state);
        this.company = company;
        this.contact = contact;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
