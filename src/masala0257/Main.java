package masala0257;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char a[] = new char [s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }
        int x = s.indexOf('1');
       // System.out.println(x);
        for (int i = x+1; i < s.length(); i++) {
            if(a[i] == '1'){
                if(i-x == 1){
                    x=i;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
        }
            System.out.println("YES");
    }
}