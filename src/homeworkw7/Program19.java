package homeworkw7;

public class Program19 {
    public static void main(String[] args) {

        int store = 0;
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        double total = 0;
        double average = 0;
        for(int i = 0; i <a.length; i++)
        {
            total = total +a[i];

        }
        average = total / a.length;

        System.out.println("Average is " +  average) ;



    }

}
