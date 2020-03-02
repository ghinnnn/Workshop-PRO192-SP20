package Workshop5.Question1;

import java.util.Scanner;

public class Validation {
    public static Scanner input = new Scanner(System.in);
    private static final String validPhone = "[0-9]{3}[-][0-9]{3}[-][0-9]{4}";

    public static String checkInputString() {
        String result = input.nextLine();
        if (result.isEmpty()) {
            System.out.println("String can't be empty");
            System.out.print("Enter again: ");
            checkInputString();
        }
        return result;
    }

    public static int checkInputInt(){
        int result = input.nextInt();
        input.nextLine();
        if (result<0) {
            System.out.println("Can't be negative number");
            System.out.print("Enter again: ");
            checkInputInt();
        }
        return result;
    }

    public static String checkInputPhone(){
        while (true){
            String result = checkInputString();
            if (result.matches(validPhone)) return result;
            System.out.println("Please input phone number follow: 123-456-7890");
            System.out.print("Enter again: ");
        }
    }
}
