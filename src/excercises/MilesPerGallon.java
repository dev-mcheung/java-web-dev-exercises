package excercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input;
        Double miles;
        Double amountOfGas;

        input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = input.nextDouble();

        System.out.println("How much gas have you consumed (in gallons)?");
        amountOfGas = input.nextDouble();

        System.out.println("The miles-per-gallon you driven is: " + miles/amountOfGas + "mpg");
    }
}
