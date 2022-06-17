package masala0028;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);
        int n = scannaer.nextInt();
        for (int i = 1; i <= n; i++) {
            int x1 = scannaer.nextInt();
            int y1 = scannaer.nextInt();
            int x2 = scannaer.nextInt();
            int y2 = scannaer.nextInt();
            int x3 = Math.abs(x2 - x1);
            int y3 = Math.abs(y2 - y1);
            int x,y;
            if(x1>x2){
                x = x2 - x3;
            }
            else {
                if (x1 < x2) {
                    x = x2 + x3;
                }
                else x = x1;
            }
            if(y1>y2){
                y = y2 - y3;
            }
            else {
                if (y1 < y2) {
                    y = y2 + y3;
                }
                else y = y1;
            }

            System.out.println(x+" "+y);
        }
    }
}
