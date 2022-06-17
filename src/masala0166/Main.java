package masala0166;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte k1 = scanner.nextByte();
        byte o1 = scanner.nextByte();
        short y1 = scanner.nextShort();

        byte k2 = scanner.nextByte();
        byte o2 = scanner.nextByte();
        short y2 = scanner.nextShort();

        if(y1 > y2){
            System.out.println(10000);
        }
        else {
            if (y1 < y2) {
                System.out.println(0);
            } else {
                if(o1 < o2){
                    System.out.println(0);
                }
                else {
                    if (o1 > o2) {
                        System.out.println((o1 - o2) * 500);
                    } else {
                        if(k1 <= k2){
                            System.out.println(0);
                        }
                        else System.out.println((k1 - k2)*15);
                    }
                }
            }
        }
    }
}
