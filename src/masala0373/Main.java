package masala0373;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);
        String s = scannaer.nextLine();
        long l = 0;
        long l1 = 0;
        if(s.length() == 6) {
            for (int i = 0; i < s.length()/2; i++) {
                l = l + (int) (s.charAt(i) - 48);
            }
            for (int i = 3; i < s.length() ; i++) {
                l1 = l1 + (int) (s.charAt(i) - 48);
            }
            if( l1 == l){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        else System.out.println("NO");
    }
}