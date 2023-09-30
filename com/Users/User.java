package com.Users;
import java.util.regex.*;

import com.System.Manager;


public class User {
    private String name;
    private String email;
    private String id;
    private String password;

    public User(){}
    public User(String name, String email, String id, String password) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);
        while (!matcher.matches()) {
            System.out.println("Invalid email address");
            System.out.print("Enter email address: ");
            email = Manager.input.nextLine();
            matcher = pattern.matcher(email);
        }

        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
        Matcher matcher = pattern.matcher(password);
        while (!matcher.matches()) {
            System.out.println("WEAK PASSWORD");
            System.out.print("Enter a Strong Password: ");
            email = Manager.input.nextLine();
            matcher = pattern.matcher(email);
        }
        this.password = password;
    }
}
