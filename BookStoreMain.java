import java.awt.*;
import java.time.LocalDate;

public class BookStoreMain {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        Customer customer1 = new Customer("Jane Words", "+4472394586971", "wordsj@gmail.com");
        Stock stock1 = new Stock("Death in the afternoon","Hemingway E.", 15.45);
        Order order1 = new Order(customer1, stock1);
        int year1 = 2022;
        int month1 = 12;
        int dayOfMonth1 = 25;
        LocalDate shipDate1 = LocalDate.of(year1, month1,dayOfMonth1);
        Shipping shipping1 = new Shipping(order1,shipDate1);
        shipping1.calcShipCost(true);
        double shipCost1 = shipping1.getShipCost();
        Invoice invoice1 = new Invoice("DIT001",stock1,shipping1);
        invoice1.invoice();
        BookStore.getInvoices().add(invoice1);
        bookStore.pilingUpOfOrders();

        Customer customer2 = new Customer("Safwa Woods", "+447981234582", "woodss@gmail.com");
        Stock stock2 = new Stock("Lord of the rings","Tolkien J.R.R.", 12.95);
        Order order2 = new Order(customer2, stock2);
        int year2 = 2022;
        int month2 = 12;
        int dayOfMonth2 = 25;
        LocalDate shipDate2 = LocalDate.of(year2, month2,dayOfMonth2);
        Shipping shipping2 = new Shipping(order2,shipDate2);
        shipping2.calcShipCost(true);
        double shipCost2 = shipping2.getShipCost();
        Invoice invoice2 = new Invoice("LOT111",stock2,shipping2);
        invoice2.invoice();
        BookStore.getInvoices().add(invoice2);
        bookStore.pilingUpOfOrders();

        Invoice foundinvoice = new Invoice(invoice1.getInvoiceNbr(),stock1,shipping1);
        bookStore.searchOrder(foundinvoice.getInvoiceNbr());

    }
}

