package exs;

import java.util.Scanner;

public class FoodDlvr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenCount = Integer.parseInt(scanner.nextLine());
        int fishCount = Integer.parseInt(scanner.nextLine());
        int vegetarianCount = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenCount * 10.35;
        double fishPrice = fishCount * 12.40;
        double vegetarianPrice = vegetarianCount * 8.15;
        double allWithoutDessert = chickenPrice + fishPrice+ vegetarianPrice;
        double dessertPrice = allWithoutDessert * 20 / 100;
        double totalPrice = chickenPrice + fishPrice+ vegetarianPrice + dessertPrice + 2.50;
        System.out.println(totalPrice);
    }
}



