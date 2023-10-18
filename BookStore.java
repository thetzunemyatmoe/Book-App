import java.util.ArrayList;
public class BookStore {
    private final String message = "The urgent orders are piling up .... time to ship quicker";
    private static ArrayList<Invoice> invoices;
   public BookStore(){
       this.invoices = new ArrayList<>();


   }



    public static ArrayList<Invoice> getInvoices() {
        return invoices;
    }
    public Invoice searchOrder(String invoiceNbr){
       for(int i = 0; i<invoices.size();i++){
           if (invoiceNbr.equals(invoices.get(i).getInvoiceNbr())) {
               return invoices.get(i);
           }

       }
        return null;
    }



    public String pilingUpOfOrders(){
       if (Shipping.countUrgent > 5){
           return message;
        }
       return null;
    }
}
