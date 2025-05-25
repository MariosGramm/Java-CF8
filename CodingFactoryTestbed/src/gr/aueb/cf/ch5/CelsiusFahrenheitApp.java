package gr.aueb.cf.ch5;

import java.util.Scanner;

public class CelsiusFahrenheitApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double result;

        result = celsiusToFahrenheit();

        System.out.println("Η θερμοκρασία σε Fahrenheit είναι " + result);

    }

    public static double celsiusToFahrenheit(){
        double celsius ;

        System.out.println("Παρακαλώ δώστε την θερμοκρασία σε βαθμούς celsius");
        celsius = scanner.nextDouble();

        return (celsius * 9/5 + 32);
    }
}
