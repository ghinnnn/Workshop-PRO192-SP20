package Workshop7v2;


public abstract class Employee implements IEmployee {
    
    protected String employeeID;
    protected String fullName;
    protected double salaryCoefficient;
    protected String workStartDate;
    protected boolean gender;
    public static double basicSalary =1490000;
    public static double yearSeniorityAllowance =100000 ;
    
    public Employee(){
        
    }
    public Employee(String employeeID, String fullName, double salaryCoefficient, String workStartDate, boolean gender) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.salaryCoefficient = salaryCoefficient;
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

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public String getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(String workStartDate) {
        this.workStartDate = workStartDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    

    @Override
    public String toString() {
        return "EmployeeA{" + "employeeID=" + employeeID + ", fullName=" + fullName + ", salaryCoefficient=" + salaryCoefficient + ", workStartDate=" + workStartDate + ", gender=" + gender + ", basicSalary=" + basicSalary + ", yearSeniorityAllowance=" + yearSeniorityAllowance + '}';
    }
   

    
}
