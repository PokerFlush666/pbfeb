package lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ///прочитане на вход
        String name = scanner.nextLine();
        //Print Result
        //'Hello <name>!"

        String result = "Hello, " + name + "!";
        System.out.println(result);
    }
}
