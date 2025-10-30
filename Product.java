public class Product {
    String id;
    String name;
    double price;
    int stockQty;
    String metal;
    String gemstone;

    boolean isAvailable(int qty) { return stockQty >= qty; }
    void updateStock(int delta) { stockQty += delta; }
}
