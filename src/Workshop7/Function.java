package Workshop7;


public class Function {
    public static int Menu(){
        int choice;
        System.out.println("-------------------------------MENU-----------------------------");
        System.out.println("> 1.Add new employees to the ArrayList  <");
        System.out.println("> 2.List all managers in the ArrayList  <");
        System.out.println("> 3.Compute the average salary of all technicians <");
        System.out.println("> 4.Search employee by employee index  <");
        System.out.println("> 5.Search employee by fullname  <");
        System.out.println("> 6.Search employee by gender  <");
        System.out.println("> 7.Search employee by working start date  <");
        System.out.println("> 8.Remove employee having specified employee index  <");
        System.out.println("> 9.Remove employees with working start date after the specified date  <");
        System.out.println("> 10.Search the last occurrence of the employee having maximum salary  <");
        System.out.println("> 11.Update employee information  <");
        System.out.println("> 12.Quit  <");
        System.out.println("-----------------------------------------------------------------");
        do {
            System.out.print("Please enter your choice: ");
            choice = Validation.checkInputInt();
        } while (choice<1 && choice>12);
        return choice;
    }
}
