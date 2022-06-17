package masala0025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        long p = 0;
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i)-'0';
            p*=10;
            p+=c;
            p%=86400;
        }
        long n = p;
        long h = n/3600;
        long m = (n - (h * 3600))/60;
        long s = (n - (h * 3600) - (m * 60));
        if(h<24) {
            if (m >= 10 && s >= 10) {
                System.out.println(h + ":" + m + ":" + s);
            }
            if (m < 10 && s < 10) {
                System.out.println(h + ":0" + m + ":0" + s);
            }
            if (m < 10 && s >= 10) {
                System.out.println(h + ":0" + m + ":" + s);
            }
            if (m >= 10 && s < 10) {
                System.out.println(h + ":" + m + ":0" + s);
            }
        }
        else { h = h%24;
            if (m >= 10 && s >= 10) {
                System.out.println(h + ":" + m + ":" + s);
            }
            if (m < 10 && s < 10) {
                System.out.println(h + ":0" + m + ":0" + s);
            }
            if (m < 10 && s >= 10) {
                System.out.println(h + ":0" + m + ":" + s);
            }
            if (m >= 10 && s < 10) {
                System.out.println(h + ":" + m + ":0" + s);
            }
        }
    }
}