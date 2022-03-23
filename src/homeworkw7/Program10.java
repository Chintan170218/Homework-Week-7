package homeworkw7;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter 1st number: ");
        int a = scanner.nextInt();

        System.out.println("Enter 2nd number: ");
        int b = scanner.nextInt();

        System.out.println("select which operation you want to perform \n + - * / ");
        String s = scanner.next();

        char operation = s.charAt(0);
        if (operation == '+') {
            System.out.println("Addition is " + a + b);
        } else if (operation == '-') {
            System.out.println("Substraction is " + (a - b));
        } else if (operation == '*') {
            System.out.println("Multiplication is " + a * b);
        } else if (operation == '/') {
            System.out.println("Division is " + a / b);
        } else
            System.out.println("Invalid entery");


    }
}

