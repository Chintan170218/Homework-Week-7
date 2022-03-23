package homeworkw7;
import java.util.*;
public class Program16 {

        public static void main(String arr[])
        {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number:");
            n=sc.nextInt();

            if(n>0)
                System.out.println("Positive");
            else if(n<0)
                System.out.println("Negative");
            else if(n == 0)
                System.out.println("Zero");


        }
    }

