package masala0367;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);
        String s = scannaer.nextLine();
        long l = 0;
        for (int i = 0; i < s.length(); i++) {
            l = l + (int)(s.charAt(i) - 48);
        }
        System.out.println(l);
    }
}