package masala0039;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);
        int n = scannaer.nextInt(); // n = 202
        int x, y;

        for (int i = 1; i < 1000; i++) { //i=152
            x = i%100;   //x = 52
            y = i + x;    // y =204
            if(y == n){
                System.out.print(i+" ");
            }

        }
    }
}
