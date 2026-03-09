package b1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Predicate: Kiểm tra User xem có phải là admin ko.
        Predicate<User> isAdmin = user -> user.getRole().equals("ADMIN");

        //Function: chuyển đổi từ user sang string.
        Function<User, String> toString = user -> user.getUserName();

        //Consumer: in ra thông tin ra màn hình.
        Consumer<User> printUser = user -> System.out.println(user);

        //Supplier: Khởi tạo giá trị mặc định.
        Supplier<User> newUser = User::new;

        User user1 = new User("minh", "ADMIN");
        User user2 = newUser.get();

        System.out.println("User1: " + isAdmin.test(user1));
        System.out.println("User2: " + isAdmin.test(user2));

        System.out.println("Username1: " + toString.apply(user1));
        System.out.println("Username2: " + toString.apply(user2));

        printUser.accept(user1);
        printUser.accept(user2);


    }
}
