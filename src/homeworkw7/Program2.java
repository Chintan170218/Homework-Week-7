package homeworkw7;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        int Year;
        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        Year = scanner.nextInt();

        if (((Year % 4 == 0) && (Year % 100!= 0)) || (Year%400 == 0))
            System.out.println("The entered year is a leap year");
        else
            System.out.println("The entered year is not a leap year");

    }
}

