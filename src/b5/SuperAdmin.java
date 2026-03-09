package b5;

public class SuperAdmin implements UserActions, AdminActions{
    @Override
    public void logActivity(String activity) {
        System.out.println("SuperAdmin log: " + activity);
    }
}
