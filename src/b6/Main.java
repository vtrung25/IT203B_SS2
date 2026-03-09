package b6;

import b4.User;

public class Main {
    public static void main(String[] args) {
        UserProcessor processor = UserUtils::convertToUpperCase;

        User user = new User("vtrung");

        String result = processor.process(user);

        System.out.println(result);
    }
}
