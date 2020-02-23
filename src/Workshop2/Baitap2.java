package Workshop2;

public class Baitap2 {
    static void usingForLoop() {
        for(int i=2; i<=10; i++) {
            if(i%2!=0) continue;
            System.out.printf("%d, ",i);
        }
    }
    static void usingWhileLoop() {
        int i=2;
        boolean check=false;
        while (i<=10) {
            if (i%2==0) check=true;
            else check=false;
            if (check) System.out.printf("%d, ",i);
            i++;
        }
    }
    public static void main(String[] args){
        System.out.printf("Even numbers from 2 to 10(using for loop): ");
        usingForLoop();
        System.out.printf("\nEven numbers from 2 to 10(using while loop): ");
        usingWhileLoop();
    }
}
