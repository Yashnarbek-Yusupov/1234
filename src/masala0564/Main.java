package masala0564;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        short t = scanner.nextShort();
        short k = scanner.nextShort();
        if(t != 1){
            if(k % n == 0){
            if(  k / n + 1 > t){
                System.out.println(1);
            }
            else System.out.println(-1);
        }
            else if( k / n + 1 >= t){
                System.out.println(1);
            }
            else System.out.println(-1);
        }
        else System.out.println(1);
    }
}
