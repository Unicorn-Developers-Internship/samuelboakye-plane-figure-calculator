package com.unicorn;


import java.math.MathContext;
import java.util.Scanner;
public class Main {

   /* Common plane figures
        -circle
        -square
        -triangle
        -trapezium
        -kite
     */

    public static void displayMenu() {
        String[] planeFigures =  {"Circle", "Square", "Triangle", "Rectangle", "Trapezium", "Kite"};
        System.out.println("================================\n");
        System.out.println("Menu\n");
        System.out.println("Here goes the options available to select\n");
        for (int i = 0; i < planeFigures.length; i++) {
            System.out.println(i + " - "+ planeFigures[i]);
        }
        System.out.println("===================================\n");

        System.out.println("Enter your selection");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();

        if(selection == 0) {
            System.out.println("The area of circle is: " +  displayForCircle());
        } else if (selection > 6) {
            System.out.println("Wrong option selected1");
        } else if (selection == 1) {
            System.out.println("The area of Square is " + displayForSquare());
        } else if (selection == 2) {
            System.out.println("The area of the triangle is " + displayForTriangle());
        } else if (selection == 3) {
            System.out.println("The area of the rectangle is " + displayForRectangel());
        } else if (selection == 4) {
            System.out.println("The area of the trapezium is: " + displayForTrapezium());
        } else if (selection== 5) {
            System.out.println("The area of the Kite is: " + displayForKite());
        }



    }
    public static double displayForCircle() {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================\n");
        System.out.println("The area of a circle is calculated as pi * r * r");
        //Take the radius of the circle to be calculated
        System.out.println("Enter the radius of the circle: ");
        double rad = input.nextDouble();
        //Call the calculate area of circle function
        double result = calculateAreaOfCircle(rad);
        return result;

    }
    public static double calculateAreaOfCircle(double radius) {
        final double PI = Math.PI;
        double area =  PI * Math.pow(radius, 2);

        return area;
    }


    public static double displayForSquare() {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================\n");
        System.out.println("The area of a square is calculated as l*l (length * length)");
        //Take the length of the square to be calculated
        System.out.println("Enter the length of one side of the circle: ");
        double len = input.nextDouble();
        //Call the calculate area of circle function
        double result = calculateAreaOfSquare(len);
        return result;
    }

    public static double calculateAreaOfSquare(double len) {
        double area = Math.pow(len, 2);
        return area;
    }

    public static double displayForTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================\n");
        System.out.println("The area of a Triangle is calculated by the formula 1/2 b * height");
        //Take the length of the square to be calculated
        System.out.println("Enter the value of the height triangle ");
//        double ar = input.nextDouble();

        double height = input.nextDouble();
        //Call the calculate area of circle function
        System.out.println("Enter the value of the breadth of the triangle ");
        double breadth = input.nextDouble();
        double result = calculateAreaOfTriangle(height,breadth);
        return result;
    }

    public static double calculateAreaOfTriangle(double height, double breadth) {
        double area = height/2 * breadth;
        return area;
    }

    public static double displayForRectangel() {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================\n");
        System.out.println("The area of a rectangle is calculated by the formula l*b");
        //Take the length of the square to be calculated
        System.out.println("Enter the value of length: ");
        double slenght = input.nextDouble();
        //Call the calculate area of circle function
        System.out.println("Enter the value of length: ");
        double sbreadth = input.nextDouble();
        double result = calculateAreaOfRectangle(slenght, sbreadth);
        return result;
    }

    public static double calculateAreaOfRectangle(double slenght, double sbreadth) {
        double area = slenght * sbreadth;
        return area;
    }


    public static double displayForTrapezium() {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================\n");
        System.out.println("The area of a rectangle is calculated by the formula l*b");
        //Take the length of the square to be calculated
        System.out.println("Enter the value of the first base: ");
        double base1 = input.nextDouble();
        //Call the calculate area of circle function
        System.out.println("Enter the value of the second base: ");
        double base2 = input.nextDouble();
        System.out.println("Enter the value of the height: ");
        double height = input.nextDouble();
        double result = calculateAreaOfTrapezium(base1, base2, height );
        return result;
    }

    public static double calculateAreaOfTrapezium(double base1, double base2, double height) {
        double area = (base1 + base2) / 2 * height;
        return area;
    }

    public static double displayForKite() {
        Scanner input = new Scanner(System.in);
        System.out.println("===================================\n");
        System.out.println("The area of a rectangle is calculated by the formula l*b");
        //Take the length of the square to be calculated
        System.out.println("Enter the value of the first diagonal: ");
        double diagonalP = input.nextDouble();
        //Call the calculate area of circle function
        System.out.println("Enter the value of the second diagonal : ");
        double diagonalQ = input.nextDouble();
        double result = calculateAreaOfKite(diagonalP, diagonalQ );
        return result;
    }

    public static double calculateAreaOfKite(double diagonalP, double diagonalQ) {
        double area = (diagonalP * diagonalQ) / 2;
        return area;
    }

    public static void main(String[] args){
        displayMenu();
//        displayForCircle();
    }



}
