package masala21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int s = 0;
        if(a%2 == 0){
            s = s + a/2;
        }
        else s = s + a/2 + 1;

        if(b%2 == 0){
            s = s + b/2;
        }
        else s = s + b/2 + 1;

        if(c%2 == 0){
            s = s + c/2;
        }
        else s = s + c/2 + 1;
        System.out.println(s);



    }
}
