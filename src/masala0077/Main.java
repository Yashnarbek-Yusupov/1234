package masala0077;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int d = 0;
        int ans = 0;
        while(d < 100){
            ans ++;
           if (ans != 1) d -= y;
            d+=x;
            if (d>=100) break;
            d -= 2 * y;
        }
        System.out.println(ans);

    }
}