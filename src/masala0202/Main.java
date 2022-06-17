package masala0202;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a[] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        long s = 0;
        long n = scanner.nextLong();
        if (n != 0) {
            while (n > 0) {
                s = s + a[(int) n % 10];
                n = n / 10;
            }
            System.out.println(s);
        }
        else System.out.println(6);
    }
}