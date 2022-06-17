package masala0113;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a  = scanner.nextByte();
        if(a<38 || a % 5 == 0){
            System.out.println(a);
        }
        else {
            if((a+1) % 5 == 0 || (a+2) % 5 == 0){
                System.out.println((a/5+1)*5);
            }
            else System.out.println(a);
        }
    }
}
