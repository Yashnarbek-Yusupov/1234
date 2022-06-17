package masla9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte a [] = new byte[n];
        for (byte l = 0; l < n; l++) {
            a[l] = scanner.nextByte();
        }
        byte k = 0, z = 0;
        for (byte i = 0; i < n; i++) {
            for (byte j = 0; j < n; j++) {
                if(a[i] == a[j]){
                    k++;
                }
            }
            if(k == 1){
                z = i;
                break;
            }
            else k = 0;
        }
        System.out.println(a[z]);
    }
}
