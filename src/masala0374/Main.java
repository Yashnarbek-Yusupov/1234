package masala0374;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = n;
        int max = n;

        for (int i = 0; i < 2; i++) {
            int a = scanner.nextInt();
            if(a>=max){
                max = a;
            }
            if(a<=min){
                min = a;
            }
        }
        System.out.println(max-min);
    }
}