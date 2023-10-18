public class Customer {
    private String name;
    private String phone;
    private String eMailAddress;

    public Customer(String name, String phone, String emailAddress) { //2 marks
        this.name = name;
        this.phone = phone;
        this.eMailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmailAddress() {
        return eMailAddress;
    }

}
