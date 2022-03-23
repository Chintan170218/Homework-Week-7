package homeworkw7;

import java.util.Arrays;

public class Program17 {

    public static void main(String[] args) {
        int a[] = {10, 5, 89, 20, 92, 100, -9, 0, 8};
        String s[] = {"Hello", "Good Morning", "Prime", "Testing"};

        System.out.println("numbers before sorting" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("numbers after sorting" + Arrays.toString(a));


        System.out.println("string before sorting" + Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("string after sorting" + Arrays.toString(s));
    }

}
