package com.blackscure;

public class User {
    public String name;

    public User(String name){
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hi, my name is" + " " + name);
    }
}
