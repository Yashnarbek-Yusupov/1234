package arrayss;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] nums = { {5, 6, 4},
                          {8, 0, 4, 6, 3},
                          {},
                          {3, 7, 8, 1 ,9, 15}};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
            }
        String weekdays [] = {"Dushanba ", "Seshanba ", "Chorshanba ", "Payshanba ", "Juma ", "Shanba ", "Yakshanba " };
            for (String weekday : weekdays) {
                System.out.print(weekday);
        }
    }
}
