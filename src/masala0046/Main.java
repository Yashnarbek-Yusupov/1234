package masala0046;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long a [][] = new long[n][n];
    long k = 0;
    a[1][1] = 1;
    a[1][2] = 1;
    for (int i = 1; i < a.length ; i++) {
        for (int j = 1; j < a.length  ; j++) {
            a[i][j] = a[i-1][j-1] + a[i-1][j];
            if(a[i][j] % 2 == 0 ){
                k++;
            }
        }
    }
        System.out.println(k);
    }
}
