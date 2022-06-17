package masala0045;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = 0;
        if(n != 0) {
            for (int i = 1; i <= n; i++) {
                s = s + i;
            }
            System.out.println(s);
        }
        else System.out.println("0");
    }
}
