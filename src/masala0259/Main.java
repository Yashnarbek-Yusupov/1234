package masala0259;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt() % 26;
        scanner.nextLine();
        String s = scanner.nextLine();
        for (int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            System.out.print(f(c, m));
        }


    }
    public static char f(char c, int k){
        int t;
        if (c >= 'a' && c<='z')
        {
            t = (c - 'a' + k) % 26;
            return (char)(t + 'a');
        }
        else if (c >= 'A' && c<='Z')
        {
            t = (c - 'A' + k) % 26;
            return (char)(t + 'A');
        }
        return c;
    }
}