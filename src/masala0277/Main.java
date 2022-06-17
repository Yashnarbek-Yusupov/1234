package masala0277;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte t = scanner.nextByte();
        for (int i = 0; i < t; i++) {
            short n = scanner.nextShort();
            short k = scanner.nextShort();
            int l = 0;
            for (int j = 0; j < n; j++) {
                byte a = scanner.nextByte();
                if(a<=0){
                    l++;
                }
            }
            if(l >= k){
                System.out.println("Qizg'in");
            }
            else System.out.println("Zerikarli");
        }
    }
}