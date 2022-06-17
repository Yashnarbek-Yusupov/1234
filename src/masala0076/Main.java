package masala0076;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);
        int s1 = 0;
        for (int i = 0; i < 7; i++) {
            short a = scannaer.nextShort();
            s1 = s1 + a;
        }
        int s = scannaer.nextInt();
        if(s>=s1) {
            System.out.println(Math.abs(s - s1));
        }
        else System.out.println(0);
    }
}
