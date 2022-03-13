package lab;

import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      ///Прочитане на вход
        double inches = Double.parseDouble(scanner.nextLine());
        //Преобразуване от инч към см
        double result = inches * 2.54;
        //Принтиране на резултата
        System.out.println(result);

    }
}
