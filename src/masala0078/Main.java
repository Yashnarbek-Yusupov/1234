package masala0078;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0,t;

        for (int i = 0; i < n; i++) {
            t = scanner.nextInt();
            count = Math.max(count + t - k,0);
        }
        System.out.println(count);
    }
}