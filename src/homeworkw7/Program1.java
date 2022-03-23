package homeworkw7;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String EvenOdd = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(num + " is a " + EvenOdd + " number");


    }
}