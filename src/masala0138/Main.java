package masala0138;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        int f;

        f = (int) ( Math.pow(n,5) + 8*(Math.pow(n,4)) - 5*(Math.pow(n,3)) + 3*n*n + n - 12 );

        System.out.println(f);
    }
}
