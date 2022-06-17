package masala0511;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        if (n>-10) System.out.println(n);
        else
        {
            String str = n+"";
            String a = str.charAt(1)+"";
            String b = str.substring(2);
            System.out.println(Long.parseLong(b)-Long.parseLong(a));
        }
    }
}
