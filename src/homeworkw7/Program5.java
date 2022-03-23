package homeworkw7;

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {


        int empid, bs = 0;
        String name;
        int hra, da, ta, pf, gs;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee name: ");
        name = scanner.nextLine();

        System.out.println("Enter Employee ID: ");
        empid = scanner.nextInt();

        System.out.println("Enter Basic Salary: ");
        bs = scanner.nextInt();

        hra = (bs * 10) / 100;
        da = bs * 8 / 100;
        ta = bs * 9 / 100;
        pf = bs * 20 / 100;
        gs = bs + hra + ta + da - pf;


        System.out.println("|_______________________________|");
        System.out.println("|         Salary Slip           |");
        System.out.println("|_______________________________|");
        System.out.println("| Employee Id       :" + empid + "    |");
        System.out.println("| Employee Name     :" + name + "    |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary      :" + bs + "          |");
        System.out.println("| HRA 10%           :" + hra + "         |");
        System.out.println("| TA 8%             :" + ta + "            |");
        System.out.println("| DA 9%             :" + da + "            |");
        System.out.println("| PF - 20&          :" + pf + "            |");
        System.out.println("|______________________________|");
        System.out.println("| GROSS SALARY      :" + gs + "            |");
        System.out.println("|===========================|");


    }


}