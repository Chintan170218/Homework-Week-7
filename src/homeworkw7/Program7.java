package homeworkw7;

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {

        int salesid;
        String sellername;
        int basicsalary;
        int salesamt;
        int commision;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Seller's name: ");
        sellername = scanner.nextLine();

        System.out.println("Enter Sales ID: ");
        salesid = scanner.nextInt();

        System.out.println("Enter sales Amount: ");
        salesamt = scanner.nextInt();

        System.out.println("Enter Basic Salary: ");
        basicsalary = scanner.nextInt();

        if (salesamt >= 50000) {
            commision = salesamt * 35 / 100;
            System.out.println("commission is: " + commision);
        } else if (salesamt >= 30000 && salesamt < 50000) {
            commision = salesamt * 20 / 100;
            System.out.println("commission is: " + commision);
        } else if (salesamt >= 20000 && salesamt < 30000) {
            commision = salesamt * 10 / 100;
            System.out.println("commission is: " + commision);
        } else if (salesamt >= 10000 && salesamt < 20000) {
            commision = salesamt * 5 / 100;
            System.out.println("commission is: " + commision);
        } else if (salesamt < 10000) {
            commision = salesamt * 2 / 100;
            System.out.println("commission is: " + commision);
        }


    }


}

