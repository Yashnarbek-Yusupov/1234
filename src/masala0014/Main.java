package masala0014;

import java.util.Scanner;

public class Main {
    static int M = 1_000_000_007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

            System.out.println(k==0?1:pow(k+1,n));
    }
    public static long pow(int n,int k){
        if (k == 0) return 1L;
        else if (k % 2 == 0)
        {
            long d = pow(n,k/2);
            return (d * d) % M;
        }
        else return (n * pow(n,k-1)) % M;
    }
}