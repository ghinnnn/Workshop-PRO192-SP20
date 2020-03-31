package Workshop10;


public class Manager {

    public static int menu() {
        System.out.println("**********************Car************************");
        System.out.println("<1> Add new car");
        System.out.println("<2> Display all");
        System.out.println("<3> Number of items");
        System.out.println("<4> Remove item by position");
        System.out.println("<0> Exit");
        System.out.println("*************************************************");
        System.out.print("Enter your choice(0-4): ");
        int choice = Validation.checkInputInt();
        return choice;
    }
}
