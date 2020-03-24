package Workshop7v2;

import java.util.Date;


public class Manager extends Employee {

    
    private String position;
    private double positionAllowance;
    double yearReward = 100000;

    public Manager(){  
        
    }
    public Manager(String employeeID, String fullName, double salaryCoefficient, String workStartDate, boolean gender, String position, double positionAllowantce) {
        super(employeeID,fullName,salaryCoefficient,workStartDate,gender);
        this.position = position;
        this.positionAllowance = positionAllowantce;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getPositionAllowance() {
        return positionAllowance;
    }

    public void setPositionAllowance(double positionAllowance) {
        this.positionAllowance = positionAllowance;
    }
    
    public double salary() {
        return this.salaryCoefficient* Employee.basicSalary +yearReward;
    }
    
    public Manager inputData(){
        System.out.print("Enter manager id : ");
        String id = Validation.checkInputString();
        System.out.print("Enter name: ");
        String n = Validation.checkInputString();
        System.out.print("Enter salaryCoefficient: ");
        double s = Validation.checkInputPositiveDouble();
        System.out.print("Enter workStartDate: ");
        String w = Validation.checkInputDate().toString();
        System.out.print("Are you Male/Female?");
        boolean g = Validation.checkInputGender();
        System.out.print("Enter position: ");
        String p = Validation.checkInputString();
        System.out.print("Enter position allowance: ");
        double pA = Validation.checkInputPositiveDouble();
        Manager std = new Manager(id, n, s, w, g, p, pA);
        return std;
    }
    
    @Override
    public String toString() {
        return "Manager{" + super.toString() + "position=" + position + ", positionAllowance=" + positionAllowance + '}';
    }
    

}
