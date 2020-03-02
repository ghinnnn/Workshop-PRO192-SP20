package Workshop5.Question2;

import java.util.Date;

public abstract class Employee {
    private String employeeID;
    private String fullName;
    private Double salaryCoefficint;
    private Date workStartDate;
    private boolean gender;
    protected double basicSalary = 1490000;
    protected double yearSeniorityAllowance = 100000;


    public Employee(String employeeID, String fullName, Double salaryCoefficint, Date workStartDate, boolean gender) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.salaryCoefficint = salaryCoefficint;
        this.workStartDate = workStartDate;
        this.gender = gender;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Double getSalaryCoefficint() {
        return salaryCoefficint;
    }

    public void setSalaryCoefficint(Double salaryCoefficint) {
        this.salaryCoefficint = salaryCoefficint;
    }

    public Date getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(Date workStartDate) {
        this.workStartDate = workStartDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void inputData(){
        System.out.println("--------------------------------------------------");
        System.out.print("Please enter employeeID: ");
        employeeID = Validation.checkInputString();
        System.out.print("Please enter fullName: ");
        fullName = Validation.checkInputString();
        System.out.print("Please enter salaryCoefficint: ");
        salaryCoefficint = Validation.checkInputDouble();
        System.out.print("Please enter workStartDate: ");
        workStartDate = Validation.checkInputDate();
        System.out.print("Please enter gender: ");
        gender = Validation.checkInputYN();
    }

    public void display(){
        System.out.println("-----------------------------------------");
        System.out.println("employeeID: "+employeeID);
        System.out.println("fullName: "+fullName);
        System.out.println("salaryCoefficint: "+salaryCoefficint);
        System.out.println("workStartDate: "+workStartDate);
        System.out.println("gender: "+gender);
    }

}
