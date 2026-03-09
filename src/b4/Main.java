package b4;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Trung"),
                new User("Son"),
                new User("Huy")
        );

        System.out.println("Usernames:");

//        users.forEach(System.out::println);
        users.stream()
                .map(User::getUserName)
                .forEach(System.out::println);

        Supplier<User> createUser = User::new;

        User newUser = createUser.get();
        newUser.setUserName("1234");

        System.out.println("\nUser mới:");
        System.out.println(newUser.getUserName());
    }
}
