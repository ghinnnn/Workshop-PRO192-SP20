package Workshop4.Question1;

import Workshop4.Question2.Validation;

public class TriangleDriver {
    public static void main(String[] args){
        do {
            System.out.println("------------------------------");
            Triangle.inputData();
            Triangle.display();
            Triangle.kindOf();
            System.out.println("--------------------------------");
            System.out.println("Do you want to continue? ");
            System.out.println("Input y/Y to continue, n/N to exit");
            System.out.println("Enter your choice: ");
        } while (Validation.checkInputYN());
    }
}
