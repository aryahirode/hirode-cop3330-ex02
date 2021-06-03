package base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        myApp.output(myApp.stringPrompt());
    }

    public String stringPrompt() {
        System.out.print("What is the input string? ");
        return in.nextLine();
    }

    public void output(String name) {
        System.out.println(name + "has " + name.length() + " characters");
    }
}
