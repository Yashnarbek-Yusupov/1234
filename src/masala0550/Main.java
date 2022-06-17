package masala0550;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);

        int a = scannaer.nextInt();
        int b = scannaer.nextInt();
        int k = 0;
        if(a<b) {
            while (a<b){
                k++;
                a = a + 10;
            }
            System.out.println(k);
            return;
        }
        else if(a == b){
            System.out.println(0);
        }
        else{
            k = 0;
            while (a>b){
                k++;
                a = a - 10;
            }
            System.out.println(k);
            return;
        }
    }
}
