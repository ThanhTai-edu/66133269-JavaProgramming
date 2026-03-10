
public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double price) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = price;
    }

    public double getTotal() {
        return qty * unitPrice;
    }
}