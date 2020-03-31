package Workshop10;

import java.util.ArrayList;
import java.util.Scanner;


public class Validation {
    private static final Scanner input = new Scanner(System.in);
    
    public static int checkInputLimit(int a, int b){
        while(true){
            try {
                int result = Integer.parseInt( input.nextLine() );
                if(result>=a && result <=b) return result;
                System.err.printf("Must be between %d and %d\n",a,b);
                System.out.print("Enter again: ");
            } catch(NumberFormatException e){
                System.err.println("Please input integer");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static String checkInputString(){
        String result = input.nextLine();
        if(result.isEmpty()) {
            System.err.println("String can't be empty");
            System.out.print("Enter again: ");
            checkInputString();
        }
        return result;
    }
    
    public static double checkInputDouble(){
        double result = input.nextDouble();
        input.nextLine();
        if (result<0) {
            System.err.println("Can't be negative number");
            System.out.print("Enter again: ");
            checkInputDouble();
        }
        return result;
    }  
    
    public static int checkInputInt(){
        int result=1;
        try {
            result = Integer.parseInt( input.nextLine() );
        } catch(NumberFormatException e){
            System.err.println("Please input integer");
            System.out.print("Enter again: ");
            checkInputInt();         
        }
        if (result<0) {
            System.err.println("Can't be negative number");
            System.out.print("Enter again: ");
            checkInputInt();
        }
        return result;
    }
    
}
