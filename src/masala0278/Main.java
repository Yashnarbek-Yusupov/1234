package masala0278;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long s = 0;
        int k = 0;
        long i = 3;
                                // n = 11
        while(s < n){           // s1 =0,  s1 = 3,  s1 =
            k++;                // k1 = 1, k2 = 2,  k3 =
            s = s + i;          // s2 = 3, s2 = 9,
            i = i * 2;          // i = 6,  i = 12,
        }

    }
}