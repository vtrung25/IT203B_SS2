package b3;

public class Main {
    public static void main(String[] args) {

        User user = new User("123456");

        System.out.println(user.isAuthenticated());

        System.out.println(Authenticatable.encrypt("123456"));
    }
}