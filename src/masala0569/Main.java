package masala0569;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannaer = new Scanner(System.in);
        String s = scannaer.nextLine();
        char a [] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
            if(a[i] == 'P'){
                System.out.println("yes");
                return;
            }
            if(a[i] == 'Q'){
                System.out.println("yes");
                return;
            }
            if(a[i] == '7'){
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
}
