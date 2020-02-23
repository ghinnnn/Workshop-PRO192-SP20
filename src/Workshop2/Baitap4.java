package Workshop2;
import java.util.Scanner;
public class Baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of money: ");
        int m = sc.nextInt();
        System.out.printf("$5 = %d\n",m/5);
        m%=5;
        System.out.printf("$2 = %d\n",m/2);
        m%=2;
        System.out.printf("$1 = %d\n",m/1);
    }
    }
