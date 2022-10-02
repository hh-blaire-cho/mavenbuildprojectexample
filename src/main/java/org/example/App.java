package org.example;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        CommonApp common = new CommonApp();
        String s = common.createGreeting("James");
        System.out.print(s);
    }
}
