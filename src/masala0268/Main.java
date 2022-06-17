package masala0268;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a = scanner.nextByte();
        byte b = scanner.nextByte();
        byte c = scanner.nextByte();

        if(Math.abs(c-a) > Math.abs(c-b)){
            System.out.println("2-mushuk");
        }
        else  if(Math.abs(c-a) < Math.abs(c-b)){
            System.out.println("1-mushuk");
        }
        else System.out.println("sichqon");
    }
}