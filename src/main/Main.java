package main;
import controller.ManageUser;

public class Main {
    public static void main(String[] args) {
        String title= "USER MANAGEMENT SYSTEM";
        String[] s = new String[] {"Create a new account", "Login system", "Exit"};
        new ManageUser(title, s).run();
    }
}