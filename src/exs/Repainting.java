package exs;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        int totalNylon = nylon + 2;
        double totalPaint = paint + (paint * 10 / 100.00);

        double priceNylon = totalNylon * 1.50;
        double pricePaint = totalPaint * 14.50;
        double priceThinner = thinner * 5.00;

        double priceM = priceNylon + pricePaint + priceThinner + 0.40;

        double priceWorkman = (priceM * 30 / 100.00) * workHours;

        double totalPrice = priceM + priceWorkman;

        System.out.println(totalPrice);


    }
}
