package masala0514;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextByte();
        int b = scanner.nextByte();

       float s = b*100f/a;

        System.out.println(String.format("%.2f",s)+"%");
    }
}
