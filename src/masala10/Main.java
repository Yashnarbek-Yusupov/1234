package masala10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long s = a+b+c;
        if(s>=n)
            System.out.println("Yes");
        else System.out.println("No");
    }
}

