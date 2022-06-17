package masala0049;

import java.util.Scanner;

public class Main {
    static long s = 0;
    static boolean x = false;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 1; i <= t; i++) {
            int m = scanner.nextInt();
             if(son(m) == true){
                 System.out.print(1);
             }
                 else System.out.println(0);
             }

    }

    public  static boolean son(int m) {
        long l = 0;
        s = 0;
        while(s < m) {
            s = s + l;
            l++;
        }
        if(s == m) x = true;
        return x;
    }
}