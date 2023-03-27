package org.cadenzu.androidex2;

import java.util.ArrayList;

public class UserStorage {
    private ArrayList<User> users = new ArrayList<>();
    private static UserStorage storage = null;

    private UserStorage() {
        this.users = users;
    }

    public static UserStorage getInstance() {
        if (storage == null) {
            storage = new UserStorage();
        }
        return storage;
    }

    void addUser(User user) {
        users.add(user);
    }

    ArrayList<User> getUsers() {
        return users;
    }

}
