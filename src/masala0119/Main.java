package masala0119;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        if(t%4 == 0) {
            System.out.println(t / 2);
        }
        else System.out.println(-1);
    }
}
