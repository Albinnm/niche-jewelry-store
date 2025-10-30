public class Payment {
    String id;
    String method;
    String status;
    String paidAt;
    String transactionId;

    boolean process(double amount) { return true; }
    boolean refund(double amount) { return true; }
}
