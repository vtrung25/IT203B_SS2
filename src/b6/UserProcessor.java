package b6;

import b4.User;

@FunctionalInterface
interface UserProcessor {
    String process(User u);
}
