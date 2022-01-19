package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Igor", "Test", (byte) 33);
        userService.saveUser("Oleg", "Don", (byte) 22);
        userService.saveUser("Nika", "Lola", (byte) 44);
        userService.saveUser("Nik", "Perumov", (byte) 23);


        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
