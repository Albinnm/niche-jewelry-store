public class User {
    String id;
    String name;
    String email;
    String password;
    String role;

    boolean login(String email, String password) { return true; }
    void logout() { }
}
