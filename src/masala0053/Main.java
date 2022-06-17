package masala0053;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if(n>3) {

            System.out.println(n % 2 == 0 ? n/2*(n - 3) : (n - 3)/2*n);
        }
        else System.out.println(0);
    }
}