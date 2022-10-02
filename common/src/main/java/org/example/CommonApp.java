package org.example;

public class CommonApp {

    public static void main(String[] args) {
        System.out.println("Hello Common!");
    }

    public String createGreeting(String name) {
        String s = "Hi";
        if (name != null) {
            s = String.format("Hello %s. How do you do?\n", name);
        }
        return s;
    }
}
