package masala29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int k;
        for (int j = 1; j <= t; j++) {
            int n = scanner.nextInt();
            k=0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if ( n % i == 0 ) {
                    if( i%2 == 0 && (n/i)%2 != 0 ) {
                        k++;
                    }
                    if( i%2 != 0 && (n/i)%2 == 0 ) {
                        k++;
                    }
                    if( i%2 == 0 && (n/i)%2 == 0 ) {
                        k++;
                        if(n != i*i){
                        k++;}
                    }
                }
            }
            System.out.println(k);
        }
    }
}
