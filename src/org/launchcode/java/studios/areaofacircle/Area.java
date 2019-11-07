package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input;
        Double radius = -10.0;
        Boolean validInput = false;

        input = new Scanner(System.in);
        while(radius < 0) {
            System.out.println("Enter a radius:");
            while (!validInput) {
                try {
                    radius = input.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Cannot enter in a non numeric number!");
                    break;
                }
            }

            if (validInput.equals(true)) {
                if (radius < 0) {
                    System.out.print("Cannot use negative number!\n");
                    validInput = false;
                } else {
                    System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
                }
            }
        }
    }
}
