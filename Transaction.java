
/**
 * Write a description of class Transaction here.
 *
 * @author Gilang
 * @version  */
public class Transaction
{
    public static void orderNewItem(Supplier supplier){
        ItemCategory category = ItemCategory.Electronics;
        ItemStatus status1 = ItemStatus.New;
        Item item1 = new Item(1, "Komputer",13, 10000000, category, supplier,status1);
        DatabaseItem.addItem(item1);
        
        InvoiceStatus invoicestatus1 = InvoiceStatus.Paid;
        Invoice pesan1 = new Invoice(1, item1, "14 Maret 2019", item1.getPrice(), invoicestatus1);
        item1.setStatus(status1);
        pesan1.setInvoiceStatus(invoicestatus1);
        
        item1.printData();
        pesan1.printData();
    }

    public static void orderSecondItem (Supplier supplier){
        ItemCategory category = ItemCategory.Furniture;
        ItemStatus status2 = ItemStatus.Second;
        Item item2 = new Item(2, "Meja",23, 1000000, category, supplier,status2);
        DatabaseItem.addItem(item2);
        
        InvoiceStatus invoicestatus2 = InvoiceStatus.Paid;
        Invoice pesan2 = new Invoice(1, item2, "14 Maret 2019", item2.getPrice(), invoicestatus2);
        item2.setStatus(status2);
        pesan2.setInvoiceStatus(invoicestatus2);
        item2.printData();
        pesan2.printData();

    }
    public static void orderRefurbishedItem(Supplier supplier){
        ItemCategory category = ItemCategory.Stationery;
        ItemStatus status3 = ItemStatus.Refurbished;
        Item item3 = new Item(3, "Pulpen", 33, 10000, category, supplier,status3);
        DatabaseItem.addItem(item3);
        
        InvoiceStatus invoicestatus3 = InvoiceStatus.Paid;
        Invoice pesan3 = new Invoice(1, item3, "14 Maret 2019", item3.getPrice(), invoicestatus3);
        item3.setStatus(status3);
        pesan3.setInvoiceStatus(invoicestatus3);
        item3.printData();
        pesan3.printData();

    }
    public static void sellItemPaid(Item item){
        InvoiceStatus statusInvoice4 = InvoiceStatus.Paid;
        ItemStatus statusItem4 = ItemStatus.Sold;

        Invoice pesan4 = new Invoice(4, item, "14 Maret 2019", item.getPrice(), statusInvoice4);

        pesan4.setInvoiceStatus(statusInvoice4);
        item.setStatus(statusItem4);
        
        pesan4.printData();
        item.printData();

    }
    public static void sellItemUnpaid(Item item){
            InvoiceStatus statusInvoice5 = InvoiceStatus.Unpaid;
        ItemStatus statusItem5 = ItemStatus.Sold;

        Invoice pesan5 = new Invoice(5, item, "14 Maret 2019", item.getPrice(), statusInvoice5);

        pesan5.setInvoiceStatus(statusInvoice5);
        item.setStatus(statusItem5);

        pesan5.printData();
        item.printData();
        
    }
    public static void sellItemInstallment(Item item){
         InvoiceStatus statusInvoice6 = InvoiceStatus.Installment;
        ItemStatus statusItem6 = ItemStatus.Sold;

        Invoice pesan6 = new Invoice(6, item, "14 Maret 2019", item.getPrice(), statusInvoice6);

        pesan6.setInvoiceStatus(statusInvoice6);
        item.setStatus(statusItem6);

        pesan6.printData();
        item.printData();
        
    }


}
