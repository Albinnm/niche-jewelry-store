public class Order {
    String id;
    String orderDate;
    String status;
    double totalAmount;

    double calculateTotal() { return 0.0; }
    void markPaid(Payment payment) { }
    void cancel(String reason) { }
}
