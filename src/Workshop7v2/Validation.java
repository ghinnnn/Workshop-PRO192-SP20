package Workshop7v2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Validation {
    
    public static Scanner input = new Scanner(System.in);
    
    public static int checkInputRange(int a, int b){
                while(true){
            try {
                int result = Integer.parseInt( input.nextLine() );
                if(result>=a && result<=b)return result;
                System.err.println("Must be between "+a+" and "+b);
                System.out.print("Enter again: ");
            } catch(NumberFormatException e){
                System.err.println("Please input integer");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static String checkInputString(){
        while(true){
            String result = input.nextLine();
            if(!result.isEmpty()) return result;
            System.err.println("String can't be empty");
            System.out.print("Enter again: ");
        }
    }
    
    public static int checkInputInt(){
        while(true){
            try {
                int result = Integer.parseInt( input.nextLine() );
                return result;
            } catch(NumberFormatException e){
                System.err.println("Please input integer");
                System.out.print("Enter again: ");
            }
        }
    }
 
    public static int checkInputPositiveInt(){
        while(true){
            try {
                int result = Integer.parseInt( input.nextLine() );
                if(result>0) return result;
                System.err.println("Must be positive integer");
                System.out.print("Enter again: ");
            } catch(NumberFormatException e){
                System.err.println("Please input integer");
                System.out.print("Enter again: ");
            }
        }
    }

    public static double checkInputDouble(){
        while(true){
            try {
                double result = Double.parseDouble( input.nextLine() );
                return result;
            } catch(NumberFormatException e){
                System.err.println("Please input a double");
                System.out.print("Enter again: ");
            }
        }
    }    
    
    public static double checkInputPositiveDouble(){
        while(true){
            try {
                double result = Double.parseDouble( input.nextLine() );
                if(result>0) return result;
                System.err.println("Can't be a negative number");
                System.out.print("Enter again: ");
            } catch(NumberFormatException e){
                System.err.println("Please input a double");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static boolean checkInputGender(){
        while(true){
            String result = checkInputString();
            if(result.equalsIgnoreCase("male")) return true;
            if(result.equalsIgnoreCase("female")) return false;
            System.err.println("Please enter male or female");
            System.out.print("Enter again: ");
        }
    }
    
    public static boolean checkInputYN() {
        while (true) {
            String result = input.nextLine();
            if (result.equalsIgnoreCase("Y")) return true;
            if (result.equalsIgnoreCase("N")) return false;
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    public static Date checkInputDate(){
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy"); 
        Date date = new Date();
        while(true){
            String result = checkInputString();
            try{
                date = formater.parse(result);
                return date;
            } catch(ParseException e) {
                System.err.println("Please input in format (dd/MM/yyyy)");
                System.out.print("Enter again: ");
            }
        }
    }
}
