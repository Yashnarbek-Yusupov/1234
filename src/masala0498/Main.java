package masala0498;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        int s1 = 0;
        int s2 = 0;
        for (int i = 1; i < n; i++) {
            byte a = scanner.nextByte();
            s1 = s1 + a;
            byte b = scanner.nextByte();
            s2 = s2 = b;
        }
        short m = scanner.nextShort();
        System.out.println("0");




    }
}