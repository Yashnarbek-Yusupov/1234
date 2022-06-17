package masala8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long s = a;
        long min = a;
        long max = a;
        for (int i = 0; i < 4; i++) {
            long b = scanner.nextLong();
            s = s + b;
            if(b>=max){
                max = b;
            }
            if(b<=min){
                min = b;
            }
        }
        System.out.println((s-max)+" "+(s-min));
    }
}
