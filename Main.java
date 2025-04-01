public class Main {
    public static void main(String[] args) {

        System.out.println();
        Order order = new BasicOrder();
        InvoiceGenerator invoiceService = new InvoiceService();
        EmailNotifier emailService = new EmailService();
        
        OrderProcessor processor = new OrderProcessor(order, invoiceService, emailService);
        processor.processOrder("John Doe", "123 Main St", 10.0, 2, "order_123.pdf", "johndoe@example.com");
        System.out.println();
    }

}
