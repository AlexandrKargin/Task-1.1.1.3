package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    private static final UserServiceImpl userService = new UserServiceImpl();

    public static void main(String[] args) {

        userService.createUsersTable();

        userService.saveUser("Alex", "Alexiev", (byte)25);
        userService.saveUser("Max", "Maxov", (byte)18);
        userService.saveUser("Den", "Denisov", (byte)45);
        userService.saveUser("Petr", "Petrov", (byte)37);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
