package masala0565;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m[] = new int[n];
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int k = 0;
        for (int i = a-1; i < b; i++) {
            m[i] = 1;
        }
        for (int i = c-1; i < d; i++) {
            m[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            if(m[i] == 0){
                k++;
            }
        }
        System.out.println(k);
    }
}
