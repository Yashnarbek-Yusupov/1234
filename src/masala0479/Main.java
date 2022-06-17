package masala0479;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short t = scanner.nextShort();
        double l;
        if(t % 100 == 0){
            System.out.println(t/100);
        }
        else {
            l = (double) t / 100;
            System.out.println(l);
        }
    }
}