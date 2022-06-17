package masala12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        int x = 0;
        int s = 0;
        int m = 1;
        int l = 1;

        while(k!=n) {

            m = l;
            s = 0;

            while (m > 0) {
                s = s + m % 10;
                m = m/10;
            }

            if(l%(s*s) == 0 ){
                x=l;
                k++;
            }

            l++;
        }
        System.out.println(x);

    }
}
