/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop9;

public class Driver {

    public static void main(String[] args) {
        while(true){
            System.out.print("Enter a: ");
            double a = Validation.checkPositiveDouble();
            System.out.print("Enter b: ");
            double b = Validation.checkPositiveDouble();
            System.out.print("Enter c: ");
            double c = Validation.checkPositiveDouble();
            try {
                RightTriangle rt = new RightTriangle(a, b, c);
                System.out.println("This is a right triSangle!");
            } catch (IllegalTriangleException e1) {
                System.out.println(e1.getMessage());
            } catch (IllegalRightTriangleException e2){
                System.out.println(e2.getMessage());
            }
            System.out.print("Do you want to continue(Y/N)? ");
            if(!Validation.checkInputYN()) break; 
        }
    }
    
}
