package masla5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a>=1000) {
            if (a % 400 == 0) {
                System.out.println("12/09/" + a);
            } else if (a % 4 == 0 && a % 100 != 0) {
                System.out.println("12/09/" + a);
            } else System.out.println("13/09/" + a);
        }
        if(a<1000 && a>=100){
            if (a % 400 == 0) {
                System.out.println("12/09/0" + a);
            } else if (a % 4 == 0 && a%100 != 0){
                System.out.println("12/09/0" + a);
            }
            else System.out.println("13/09/0"+a);
        }
        if(a<100 && a>=10){
            if (a % 400 == 0) {
                System.out.println("12/09/00" + a);
            } else if (a % 4 == 0 && a%100 != 0){
                System.out.println("12/09/00" + a);
            }
            else System.out.println("13/09/00"+a);
        }
        if(a<10){
            if (a % 400 == 0) {
                System.out.println("12/09/000" + a);
            } else if (a % 4 == 0 && a%100 != 0){
                System.out.println("12/09/000" + a);
            }
            else System.out.println("13/09/000"+a);
        }

        }
    }

