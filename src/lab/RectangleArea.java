package lab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/////////prochitane na vhodni danni
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        ///izchisleniq
        int result = a * b;
        ///print result on console
        System.out.println(result);

    }
}
