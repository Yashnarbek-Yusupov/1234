package masala0248;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        int k = scanner.nextInt();
        long m = n-n/k;
        long nth = n;
        while(m<n){
            nth += Math.abs(n-m);
            m = nth - nth/k;
        }
        System.out.println(nth);

    }
}