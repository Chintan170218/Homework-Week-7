package homeworkw7;

import java.util.Scanner;

public class Program11 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Divided by 3: ");
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Divided by 5: ");
        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
