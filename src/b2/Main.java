package b2;

public class Main {
    @FunctionalInterface
    interface PasswordValidator{
        boolean isValid(String passWord);
    }

    public static void main(String[] args) {
        PasswordValidator isValid = passWord -> {return passWord.length() >= 8;};

        System.out.println(isValid.isValid("1234"));
        System.out.println(isValid.isValid("12345678"));
    }
}
