package homeworkw7;

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is a Even number");
        } else
            System.out.println(num + " is a odd number");

    }

}

