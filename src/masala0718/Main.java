package masala0718;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();

        for (int i = 1; i <= t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if(n % 2 == 0 && m<= n/2){
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
    }
}
