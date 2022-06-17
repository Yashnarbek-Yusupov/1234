package masala0609;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);
        short n = scannaer.nextShort();
        short k = scannaer.nextShort();
        if(k%n == 0){
            System.out.println("Yes");
        }
        else System.out.println("No");
        }
    }