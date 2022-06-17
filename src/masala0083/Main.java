package masala0083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);

        short olma = 0;
        short apelsin = 0;

        int l = 0;

        short s = scannaer.nextShort();
        short t = scannaer.nextShort();

        short a = scannaer.nextShort();
        short b = scannaer.nextShort();

        short m = scannaer.nextShort();
        short n = scannaer.nextShort();

        for (short i = 0; i < m; i++) {
            short d = scannaer.nextShort();
                l = a + d;
                if(l >= s && l <= t){
                    olma++;
            }
        }
         l = 0;
        for (short i = 0; i < n; i++) {
            short d = scannaer.nextShort();
                l = b + d;
                if(l >= s && l <= t){
                    apelsin++;
                }
            }
        System.out.println(olma);
        System.out.println(apelsin);
    }
}