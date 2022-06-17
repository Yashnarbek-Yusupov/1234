package masala0082;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);

            int a = scannaer.nextInt();
            if(a%2 == 0){
                System.out.println("Second player");
            }
            else System.out.println("First player");
    }
}
