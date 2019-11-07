package excercises;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Double length;
        Double width;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle:");
        length = input.nextDouble();

        System.out.println("What is the width of the rectangle:");
        width = input.nextDouble();

        System.out.println("Area of a rectangle is: " + length*width);
    }
}
