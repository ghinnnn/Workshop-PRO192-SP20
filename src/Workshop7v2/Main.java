package Workshop7v2;

import java.util.ArrayList;




public class Main {
    
    private static EmployeeList empList = new EmployeeList();
    
     private static void initial(){
        Technician t1 = new Technician("DE109321", "Lan", 1.2, "02/09/2020", false, "technician");
        Technician t2 = new Technician("DE109121", "Nam", 1.3, "23/09/2020", true, "technician");
        Technician t3 = new Technician("DE109221", "Nam",1.1, "23/09/2020", false, "technician");
        Manager m1 = new Manager("DE140193" , "Son", 3.2, "11/09/2019", true, "Manager", 1.3);
        Manager m2 = new Manager("DE140192" , "Ha", 4.2, "11/09/2019", false, "Manager", 1.3);
        Manager m3 = new Manager("DE140191" , "Son", 5.2, "31/09/2019", true, "Manager", 1.3);
        empList.addEmployees(t1);
        empList.addEmployees(t2);
        empList.addEmployees(t3);
        empList.addEmployees(m1);
        empList.addEmployees(m2);
        empList.addEmployees(m3);
     }
    private static int Menu(){
     int choice;
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^MENU^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("> 1-Add new employees \t\t\t\t\t\t<");
        System.out.println("> 2-List all managers \t\t\t\t\t<");
        System.out.println("> 3-Compute the average salary of all technicians \t\t\t\t\t<");
        System.out.println("> 4-Search employee \t\t\t\t\t<");
        System.out.println("> 5-Remove employee having specified employee index \t\t\t\t\t<");
        System.out.println("> 6-Remove employees with working start date after the specified date. \t\t\t\t\t<");
        System.out.println("> 7-Search the last occurrence of the employee having maximum salary  \t\t\t\t\t<");
        System.out.println("> 8-Update employee information \t\t\t\t\t<");
        System.out.println("> 9-Quit \t\t\t\t\t\t<");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Enter your choice: ");
        choice = Validation.checkInputRange(1, 9);
        return choice;
    }
    
    public static int AddMenu() {
        int choice;
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^MENU^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("> 1-Add manager \t\t\t\t\t\t<");
        System.out.println("> 2-Add technician \t\t\t\t\t\t<");
        System.out.println("> 3-Quit \t\t\t\t\t\t<");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Enter your choice: ");
        choice = Validation.checkInputRange(1, 3); 
        return choice;
    }
    
    public static int SearchMenu() {
        int choice;
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^MENU^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("> 1-Search by employee index \t\t\t\t\t\t<");
        System.out.println("> 2-Search by fullname \t\t\t\t\t\t<");
        System.out.println("> 3-Search by gender \t\t\t\t\t\t<");
        System.out.println("> 4-Search by working start date \t\t\t\t\t\t<");
        System.out.println("> 5-Quit \t\t\t\t\t\t<");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Enter your choice: ");
        choice = Validation.checkInputRange(1, 5); 
        return choice;
    }
    
    public static void main(String[] args) {
        initial();
        Manager manager = new Manager();
        Technician technician = new Technician();
        int uChoice, uSearchChoice, uAddChoice;
        do{
            uChoice=Menu();
            switch(uChoice)
            {
                case 1:
                    do{
                        uAddChoice=AddMenu();
                        switch(uAddChoice){
                            case 1:
                                empList.addEmployees(manager.inputData());
                                System.out.println("Add successfully");
                                break;
                            case 2: 
                                empList.addEmployees(technician.inputData());
                                System.out.println("Add successfully");
                                break;
                        }                    
                    } while(uAddChoice!=3); 
                    break;
                case 2:
                    ArrayList<Employee> managerList = new ArrayList<>();
                    managerList = empList.managerList();
                    for(Employee m: managerList){
                        System.out.println(m.toString());
                    }
                   
                    break;
                case 3: 
                    System.out.println("The average salary of all technicians is: "+empList.technicalSalaryAverage());
                    break;
                case 4:
                    ArrayList<Employee> eList = new ArrayList<>();
                    do{
                    uSearchChoice=SearchMenu();
                        switch(uSearchChoice){
                            case 1:
                                System.out.print("Enter ID to search: ");
                                String id = Validation.checkInputString();
                                System.out.println(empList.searchID(id));
                                break;
                            case 2: 
                                System.out.print("Enter name to search: ");
                                String name = Validation.checkInputString();
                                eList = empList.searchName(name);
                                for(Employee m: eList){
                                    System.out.println(m.toString());
                                }
                                break;
                            case 3: 
                                System.out.print("Enter gender to search: ");
                                boolean gender = Validation.checkInputGender();
                                eList = empList.searchGender(gender);
                                for(Employee m: eList){
                                    System.out.println(m.toString());
                                }
                                break;
                            case 4: 
                                System.out.print("Enter date to search: ");
                                String date = Validation.checkInputString();
                                eList = empList.searchDate(date);
                                for(Employee m: eList){
                                    System.out.println(m.toString());
                                }
                                break;   
                        }                       
                    }while(uSearchChoice!=5); 
                    
                    break;
                case 5: 
                    System.out.print("Enter ID: ");
                    String ep = Validation.checkInputString();
                    empList.removeID(ep);
                    break;
                case 6: 
                    System.out.print("Enter date: ");
                    String d = Validation.checkInputString();
                    empList.removeDate(d);
                    break;
                case 7: 
                    System.out.println(empList.lastSalaryMax());
                    break;
                case 8:
                    System.out.print("Enter ID to update: ");
                    String mp = Validation.checkInputString();
                    empList.updateEmployee(mp);
                    break;
            }  
        } while(uChoice!=9);
    }
    
}
