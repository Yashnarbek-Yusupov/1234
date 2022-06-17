package masala0372;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int max = a;
        int b = scanner.nextInt();
        if(b>=max){
            max = b;
        }
        int c = scanner.nextInt();
        if(c>max){
            max = c;
        }
        System.out.println(max);
    }
}