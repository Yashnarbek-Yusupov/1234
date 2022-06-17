package masala0562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);
      short m = scannaer.nextShort();
      short n = scannaer.nextShort();

      int i;
      short a [] = new short [n];
        for ( i = 0; i < n; i++) {
            a[i] = scannaer.nextShort();
        }
        short c = a[0];
        for ( i = 0; i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                if(a[i] >= a[j]){
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }
        int s = 0;
        short k = 0;
        for ( i = n-1; i >=0 ; i--) {
            k++;
            s = s + a[i];
            if(s >= m){
                System.out.println(k);
                return;
            }
            if(i == 0){
                System.out.println(-1);
                return;
            }
        }
    }
}
