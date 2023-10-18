public class Invoice {
    private String invoiceNbr;
    private Stock bookOrder;
    private Shipping shipOrder;
    private double totalCost;

    public Invoice(String invoiceNbr,Stock bookOrder, Shipping shipOrder){
        this.invoiceNbr = invoiceNbr;
        this.bookOrder = bookOrder;
        this.shipOrder = shipOrder;
    }

    public String getInvoiceNbr() {
        return invoiceNbr;
    }
    public double invoice(){
        totalCost = bookOrder.getPrice() + shipOrder.getShipCost();
        return  totalCost;
    }
}
