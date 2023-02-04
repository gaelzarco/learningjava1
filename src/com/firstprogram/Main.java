package com.firstprogram;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // Declaration
        String name;
        // Assignment
        name = "Gael Zarco";

        // Initialization
        int x = 1;
        long y = 1236483648463843L;
        float z = 123.02f;
        double w = 123.054;
        boolean a = false;
        char symbol = '@';

        System.out.println("name = " + name);
        System.out.println("a = " + a);
        System.out.println("w = " + w);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("symbol = " + symbol);
        System.out.println("\nI love Arroz con Leche");
        System.out.println("It's fantastic!");

        // Swapping variables in Java
        String e = "Water";
        String f = "Kool-Aid";

        // Can assign null to temp or just declare the variable
        String temp;

        temp = e;
        e = f;
        f = temp;

        System.out.println("\ne: " + e);
        System.out.println("f: " + f);


        // User input in Java
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        String userName = scanner.nextLine();
//
//        System.out.println("How old are you?");
//        int userAge = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("What is your favorite food?");
//        String userFood = scanner.nextLine();
//
//        System.out.println("Hello " + userName);
//        System.out.println("You are " + userAge + " years old.");
//        System.out.println("You like " + userFood);

        // Expressions
//        double friends = 10;
//
//        friends = (double) friends / 3;
//
//        System.out.println("\nYou have "+ friends + " friends.");
//
//        // GUI
//        String GUIname = JOptionPane.showInputDialog("Enter your name");
//        int GUIage = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        double GUIheight = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//
//        JOptionPane.showMessageDialog(null, "Hello " + GUIname + ". You are " + GUIheight + " cm tall. You are also " + GUIage + " years old.");

        // Math class
//        double xx = 3.14;
//        double yy = -10;
//
//        double zz = Math.max(xx, yy);
//        double ww = Math.min(xx, yy);
//        double vv = Math.abs(yy);
//        double aa = Math.sqrt(xx);
//        double bb = Math.floor(x);
//
//        System.out.println(zz);
//        System.out.println(ww);
//        System.out.println(vv);
//        System.out.println(aa);
//        System.out.println(bb);
//
//        double xVar;
//        double yVar;
//        double zVar;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter side x:");
//        xVar = scanner.nextDouble();
//        System.out.println("Enter side y:");
//        yVar = scanner.nextDouble();
//
//        zVar = Math.sqrt((xVar * xVar) + (yVar * yVar));
//
//        System.out.print("The hypotenuse is: " + zVar);
//
//        scanner.close();

        System.out.println("Testing learning how to use GitHub with IntelliJ IDE.");
    }
}