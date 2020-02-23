package Workshop2;

import java.util.Scanner;

public class Baitap3 {

    private static final Scanner in = new Scanner(System.in);
    // kiem tra input//
    private static int CheckInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please Input Your Subject");
                System.out.print("Enter again");
            }
        }
    }

    private static int InputSizeOfArray(){
        System.out.print("Enter Your Subject: ");
        int n = CheckInputInt();
        return n;
    }

    private static int[] InputValueOfArray(int n){
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.print("Enter Mark of Subject a["+i+"]: ");
            a[i] = CheckInputInt();
        }
        return a;
    }

    private static void checkRankStudent(int[] a){
        int sum =0;
        int count =0;
        for (int i = 0; i < a.length ; i++) {
            if (a[i]<=10 && a[i] >0){
                sum = sum + a[i];
                count ++;

            }
        }
        double avg =  sum/count;
        System.out.print("The ranks a student is: ");
        if (avg >= 9) {
            System.out.print("excellent");
        }
        else if (avg >= 8 && avg<9) {
            System.out.print("very good");
        }
        else if (avg >= 7 && avg<8) {
            System.out.print("good");
        }
        else if (avg >= 5 && avg<7) {
            System.out.print("average");
        }
        else {System.out.print("bad");}
    }
    public static void main(String args[])
    {
        int n= InputSizeOfArray();
        int[] a = InputValueOfArray(n);
        checkRankStudent(a);

    }
}
