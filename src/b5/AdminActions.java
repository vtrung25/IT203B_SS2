package b5;

interface AdminActions {
    default void logActivity(String activity){
        System.out.println("User log: " + activity);
    }

}
