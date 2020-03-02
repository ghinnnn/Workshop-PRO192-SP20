package Workshop5.Question1;

public class Manager {
    public static int Menu(){
        int choice;
        System.out.println("-------------------------------MENU-----------------------------");
        System.out.println("> 1.Local phone  <");
        System.out.println("> 2.International phone  <");
        System.out.println("> 3.Output phone number  <");
        System.out.println("> 4.Quit  <");
        System.out.println("-----------------------------------------------------------------");
        do {
            System.out.print("Please enter your choice: ");
            choice = Validation.checkInputInt();
        } while (choice<1 && choice>4);
        return choice;
    }
}
