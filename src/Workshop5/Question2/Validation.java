package Workshop5.Question2;

import java.util.Date;
import java.util.Scanner;

public class Validation {
    public static Scanner input = new Scanner(System.in);

    public static String checkInputString(){
        String result;
        result = input.nextLine();

        if (result.isEmpty()) {
            System.out.println("String can't be empty");
            System.out.print("Please enter again: ");
            return checkInputString();
        }
        return result;
    }

    public static double checkInputDouble(){
        double result;
        do {
            result = input.nextDouble();
            input.nextLine();
            if (result<0) {
                System.out.println("Can't be negative number");
                System.out.print("Please enter again: ");
            } else return result;
        } while(result<0);
        return result;
    }

    public static int checkInputInt(){
        int result;
        result = input.nextInt();
        input.nextLine();
        if (result<0) {
            System.out.println("Can't be negative number");
            System.out.print("Please enter again: ");
            return checkInputInt();
        }
        return result;
    }

    public static boolean checkInputYN(){
        while(true){
            String result;
            result = checkInputString();
            if(result.equalsIgnoreCase("Male")) return true;
            if(result.equalsIgnoreCase("Female")) return false;
            System.out.println("Please input Male or Female");
            System.out.print("Enter again: ");
            checkInputYN();
        }
    }

    public static Date checkInputDate(){
        String result = checkInputString();
        Date dt = new Date(result);
        return dt;
    }
}
