package masala0048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        int l = 1;
        int k = 1;
       while(l<=n){
           for (int i = 0; i < l; i++) {
               System.out.print(k+" ");
               k++;
           }
           System.out.println();
           l++;
                  }
    }
}
