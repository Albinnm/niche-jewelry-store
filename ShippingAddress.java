public class ShippingAddress {
    String street;
    String city;
    String postalCode;
    String country;

    String format() { return street + ", " + city + ", " + country; }
}
