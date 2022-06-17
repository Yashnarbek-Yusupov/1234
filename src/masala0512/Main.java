package masala0512;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte k = scanner.nextByte();
        byte a [] = new byte[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextByte();
        }
        byte m = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i] >= a[j]) {
                    byte c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }
        byte l = a[n-k];

        for (int i = 0; i < n; i++) {
            if(a[i] > 0 && a[i] >= l){
                m++;
            }
        }
        System.out.println(m);
    }
}
