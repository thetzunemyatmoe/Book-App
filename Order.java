public class Order {
    private Customer customer;
    private Stock stock;

    public Order(Customer customer, Stock stock) {
        this.customer = customer;
        this.stock = stock;
    }


    public Customer getCustomer() {
        return customer;
    }

    public Stock getStock() {
        return stock;
    }
}
