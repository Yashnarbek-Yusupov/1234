package masala0465;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = (long)((-1.0 + Math.sqrt(1+8*n))/2);
        System.out.println(ans);
    }

}