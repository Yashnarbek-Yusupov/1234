package masala0632;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);

        byte t = scannaer.nextByte();
        int x, y;
        for (int i = 0; i < t; i++) {
            int x1 = scannaer.nextInt();
            int y1 = scannaer.nextInt();
            int x2 = scannaer.nextInt();
            int y2 = scannaer.nextInt();

            x = 2 * x2 - x1;
            y = 2 * y2 - y1;
            System.out.println(x+" "+y);
        }
    }
}