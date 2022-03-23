package homeworkw7;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50, 60};
        boolean check = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number you want to find: ");
        int num = sc.nextInt();

//        for ( int i = 0 ; i < a.length ; i++ ) { // to print the array values
//            System.out.print(a[i] + " ");
//        }
        int i;
        for( i =0;i<a.length;i++)
        {
            if(a[i] == num)
            {
                check=true;
                break;
            }
        }
        if(check)
        {
            System.out.println("value found in the array");
            for ( int j = 0 ; j < a.length ; j++ )
            {
                System.out.print(a[j] + " ");
            }

        }
        else
        {
            System.out.println("value not found");
        }

    }
}
