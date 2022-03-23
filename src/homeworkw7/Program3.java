package homeworkw7;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        int math = 0, science = 0, english = 0;
        int tot;
        float per;
        String result = null;
        String grade = null;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = scanner.nextLine();

        System.out.println("Enter student Roll No.: ");
        int rollno = scanner.nextInt();

        System.out.println("Marks in Math: ");
        math = scanner.nextInt();

        System.out.println("Marks in Science: ");
        science = scanner.nextInt();

        System.out.println("Marks in English: ");
        english = scanner.nextInt();

        tot = math + science + english;
        per = (tot * 100 / 300);


        if ((math > 100) || (science > 100) || (english > 100)) {
            System.out.println("Invalid input,Marks should be between 0 to 100");
        } else if (math <= 35 || science <= 35 || english <= 35) {
            result = "Fail";
            grade = "-";

        } else if (per >= 80) {
            grade = "A+";
            result = "pass";
        } else if (per >= 60 && per < 80) {
            grade = "A";
            result = "pass";
        } else if (per >= 50 && per < 60) {
            grade = "B";
            result = "pass";
        } else if (per <= 35) {
            grade = "C";
            result = "fail";
        }

        System.out.println("--------------------------------------");
        System.out.println("|                                    |");
        System.out.println("|           Mark Sheet               |");
        System.out.println("|____________________________________|");
        System.out.println("|   Name     :   " + name + "         | ");
        System.out.println("|   Roll no:           " + rollno + "         | ");
        System.out.println("|____________________________________|");
        System.out.println("|  Subjects     :    Marks           |");
        System.out.println("|____________________________________|");
        System.out.println("|  Math       :       " + math + "             |");
        System.out.println("|  Science:     " + science + "                |");
        System.out.println("|  English:     " + english + "                |");
        System.out.println("|____________________________________|");
        System.out.println("|  Total      :       " + tot + "             |");
        System.out.println("|____________________________________|");
        System.out.println("|  Percentage      :       " + per + "        |");
        System.out.println("|  Result      :       " + result + "        |");
        System.out.println("|  Grade      :       " + grade + "        |");


//| Mark Sheet |
//|_______________________________|
//| Name : Jay |
//| Roll No: 08 |
//|_______________________________|
//| Subjects : Marks |
//|_______________________________|
//| Math : 98 |
//| Science : 90 |
//| English : 85 |
//|_______________________________|
//| Total : 273 |
//|_______________________________|
//| Percentage : 91.0 |
//| Result : Pass |
//| Grade : A+ |
//|_______________________________|


    }
}




