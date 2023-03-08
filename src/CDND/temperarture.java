package CDND;

import java.util.Scanner;

public class temperarture {
    public static void main(String[] args) {
        double doF;
        double doC;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter fahrenheit");
                doF = scanner.nextInt();
                System.out.println("Độ C là: "+FahrenheitToCelsius(doF));
                break;
            case 2:
                System.out.println("Enter Celsius");
                doC = scanner.nextInt();
                System.out.println("Độ F là: "+ CelsiusToFahrenheit(doC));
                break;
            case 0:
                System.exit(0);
        }
    }

    public static double FahrenheitToCelsius(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return  doC;
    }

public static double CelsiusToFahrenheit(double doC) {
        double doF = (9.0/5)*doC+32;
        return  doF;
    }
}
