package exs;

import java.util.Scanner;

public class BasketBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = fee - (fee * 40 / 100.00);
        double clothesPrice = sneakersPrice - (sneakersPrice * 20 / 100);
        double ballPrice = clothesPrice / 4;
        double aksPrice = ballPrice / 5;

        double total = fee + sneakersPrice + clothesPrice + ballPrice + aksPrice;

        System.out.println(total);
    }

}

