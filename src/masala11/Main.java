package masala11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte a [] = new byte[n];
        a[0] = scanner.nextByte();
        a[1] = scanner.nextByte();
        byte max1, max2;
        if(a[1] > a[0]) {
             max1 = a[1];
             max2 = a[0];
        }
        else  {
            max1 = a[0];
            max2 = a[1];
        }
        for (int i = 2; i < n; i++) {
            a[i] = scanner.nextByte();
            if(a[i] >= max1){
                max2 = max1;
                max1 = a[i];
            }
            else {
                if (a[i] >= max2 && a[i] < max1) {
                    max2 = a[i];
                }
                else
                    max1 = max1;
                    max2 = max2;
            }
        }
        System.out.println(max2);
    }
}