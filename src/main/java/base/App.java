/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        myApp.output(myApp.stringPrompt());
    }

    private String stringPrompt() {
        System.out.print("What is the input string? ");
        return in.nextLine();
    }

    private void output(String name) {
        System.out.println(name + " has " + name.length() + " characters");
    }
}
