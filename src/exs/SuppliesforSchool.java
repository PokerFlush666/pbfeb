package exs;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int vero = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt((scanner.nextLine()));

        double pricePens = pens * 5.80;
        double priceMarkers = markers * 7.20;
        double priceVero = vero * 1.20;

        double totalPrice = pricePens + priceMarkers + priceVero;

        double totalPriceDiscount = totalPrice - (totalPrice * percent / 100);

        System.out.println(totalPriceDiscount);


    }
}
