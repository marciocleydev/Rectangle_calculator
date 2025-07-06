package aplication;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle1;
        System.out.println("Enter rectangle width and height: ");
        System.out.print("width: ");
        double width = sc.nextDouble();
        System.out.print("height: ");
        double height = sc.nextDouble();
        rectangle1 = new Rectangle(width, height);

        System.out.printf("Area: %.2f\n", rectangle1.area());
        System.out.printf("Perimeter: %.2f\n", rectangle1.perimeter());
        System.out.printf("Diagonal: %.2f\n",  rectangle1.diagonal());
        sc.close();


    }
}
