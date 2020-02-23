package Workshop2;
import java.util.Scanner;
public class Baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        double e = 1;
        for(int i = 1;i<n;i++){
            e+=Math.pow(x,i)/factorial(i);
        }
        System.out.println(e);
        System.out.println(Math.pow(Math.E,x));
    }
    public static double factorial(int n){
        double fac = 0;
        for(int i=1;i<=n;i++){
            fac +=i;
        }
        return fac;
    }
}
