package b3;

@FunctionalInterface
interface Authenticatable {

    // 1. Abstract method
    String getPassword();

    // 2. Default method
    default boolean isAuthenticated() {
        return getPassword() != null && !getPassword().isEmpty();
    }

    // 3. Static method
    static String encrypt(String rawPassword) {
        return "ENC_" + rawPassword;
    }
}