package Workshop9;

import java.util.Scanner;

public class Validation {
    private static final Scanner input = new Scanner(System.in);
    
    public static double checkPositiveDouble(){
        while(true){
            try{
                double result = Double.parseDouble(input.nextLine().trim());
                if(result>0) return result;
                System.err.println("Please input positive double!");
                System.out.print("Enter again: ");
            }  catch(NumberFormatException e){
                System.err.println("Please input positive double!");
                System.out.print("Enter again: ");
            }
        }
    }        
    
    public static boolean checkInputYN() {
        while (true) {
            String result = input.nextLine();
            if (result.equalsIgnoreCase("Y"))
                return true;
           if (result.equalsIgnoreCase("N"))
                return false;
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}
