package com.Users;
import java.util.Stack;

import com.System.Book;
public class Client extends User{
    private String name;
    private String email;
    private String id;
    private String password;
    private Stack<Book> histroyBooks;


    public Client(String name, String email, String id, String password) {
        super(name, email, id, password);
        this.histroyBooks = new Stack<Book>();
    }


    public Stack<Book> getHistroyBooks() {
        return histroyBooks;
    }

}
