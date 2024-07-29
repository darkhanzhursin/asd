public class Customer {
    private String name;
    private int age;
    private String address;
    private String zipCode;

    public Customer(String name, int age, String address, String zipCode) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.zipCode = zipCode;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', age=" + age + ", address='" + address + "', zipCode='" + zipCode + "'}";
    }
}
