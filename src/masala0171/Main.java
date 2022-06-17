package masala0171;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long a[] = new long [n];

        long s = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
            s = s + a[i];
        }
        System.out.println(s);
    }
}
