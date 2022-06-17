package masala0114;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextShort();
        short v1 = scanner.nextShort();
        int x2 = scanner.nextShort();
        short v2 = scanner.nextShort();

        int s1 = 0;
        int s2 = 0;

        while(x1<x2){
            x1 = x1 + v1;
            x2 = x2 + v2;
            if(x1 == x2){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
