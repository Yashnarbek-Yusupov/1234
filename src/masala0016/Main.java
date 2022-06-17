package masala0016;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long a[] = {1000000000, 1000000, 1000, 100};

        String b[] = {"milliard ", "million ", "ming ", "yuz "};

        String c[] = {"", "o'n ", "yigirma ", "o'ttiz ", "qirq ", "ellik ", "oltmish ", "yetmish ", "sakson ", "to'qson "};

        String d[] = {"", "bir ", "ikki ", "uch ", "to'rt ", "besh ", "olti ", "yetti ", "sakkiz ", "to'qqiz "};

        if (n >= a[0]) {
                int x = (int) (n / a[0]);
                for (int i = 0; i < 3; i++) {
                    if (x >= 100) {
                        System.out.print(d[x / 100] + "yuz ");
                        x = x % 100;
                    } else if (x >= 10) {
                        System.out.print(c[x / 10]);
                        x = x % 10;
                    } else {
                        System.out.print(d[x]);
                        System.out.print(b[0]);
                        break;
                    }
                }
                n = n %a[0];
            } // mlrd uchun

        if (n >= a[1]) {
            int x = (int) (n / a[1]);
            for (int i = 0; i < 3; i++) {
                if (x >= 100) {
                    System.out.print(d[x / 100] + "yuz ");
                    x = x % 100;
                } else if (x >= 10) {
                    System.out.print(c[x / 10]);
                    x = x % 10;
                } else {
                    System.out.print(d[x]);
                    System.out.print(b[1]);
                    break;
                }
            }
            n = n %a[1];
        }  //mln uchun

        if (n >= a[2]) {
            int x = (int) (n / a[2]);
            for (int i = 0; i < 3; i++) {
                if (x >= 100) {
                    System.out.print(d[x / 100] + "yuz ");
                    x = x % 100;
                } else if (x >= 10) {
                    System.out.print(c[x / 10]);
                    x = x % 10;
                } else {
                    System.out.print(d[x]);
                    System.out.print(b[2]);
                    break;
                }
            }
            n = n %a[2];
        }  //ming uchun

        if (n >= a[3]) {
            int x = (int) (n / a[3]);
            for (int i = 0; i < 3; i++) {
                if (x >=100) {
                    System.out.print(d[x / 100] + "yuz ");
                    x = x % 100;
                } else if (x >= 10) {
                    System.out.print(c[x / 10]);
                    x = x % 10;
                } else {
                    System.out.print(d[x]);
                    System.out.print(b[3]);
                    break;
                }
            }
            n = n %a[3];
        }  // yuz uchun

        if (n >= 10) {
            System.out.print(c[(int) (n/10)]);
            System.out.println(d[(int)n%10]);
        }

        if(n<10) System.out.println(d[(int) n]);
    }
}
