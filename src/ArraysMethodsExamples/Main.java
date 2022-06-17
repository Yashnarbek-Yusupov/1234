package ArraysMethodsExamples;

import com.sun.xml.internal.ws.server.ServerRtException;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
        int[][] nums = {{5, 6, 4},
                {8, 0, 4, 6, 3},
                {},
                {3, 7, 8, 1, 9, 15}};
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length; j++) {
//                System.out.print(nums[i][j]+" ");
//            }
//            System.out.println();
//        }
        String weekdays[] = {"Dushanba ", "Seshanba ", "Chorshanba ", "Payshanba ", "Juma ", "Shanba ", "Yakshanba "};
//        for (String weekday : weekdays) {
//            System.out.print(weekday);
//        }
//
//        String s = Arrays.toString(weekdays);
//        System.out.println(s);
//
//        String s1 = Arrays.deepToString(nums);
//        System.out.println(s1);
//
//        Arrays.sort(weekdays);
//        System.out.println(Arrays.toString(weekdays));
//
//        Arrays.sort(weekdays, Collections.reverseOrder());
//        System.out.println(Arrays.toString(weekdays));

        String [] workdays = Arrays.copyOf(weekdays,5 );
        System.out.println(Arrays.toString(workdays));

        String weekends [] = Arrays.copyOfRange(weekdays,5,weekdays.length);
        System.out.println(Arrays.toString(weekends ));

        String days [] = new String[10];
        System.arraycopy((weekdays),3,days,4,4);
        System.out.println(Arrays.toString(days));

        int number [] = new int [10];
        Arrays.fill(number,6);
        System.out.println(Arrays.toString(number));

        int number1 [] = new int [10];
        Arrays.fill(number1,6);

        int number2 [] = new int[8];
        Arrays.fill(number1,6);
        boolean isequals;



         isequals = Arrays.equals(number,number1);
        System.out.println(isequals);
         isequals = Arrays.equals(number, number2);
        System.out.println(isequals);
    }
}

