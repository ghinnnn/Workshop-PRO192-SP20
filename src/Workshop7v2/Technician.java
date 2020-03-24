package Workshop7v2;


public class Technician extends Employee  {

    
    private String work;
    public static double yearRewarddouble=50000;

    public Technician() {
    }
    
    
    
    public Technician(String employeeID, String fullName, double salaryCoefficient, String workStartDate, boolean gender, String work){
        super( employeeID,  fullName,  salaryCoefficient,  workStartDate,  gender);
        this.work = work;
    }

    public Technician(String work) {
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    
    public double salary() {
        return this.salaryCoefficient* Employee.basicSalary;
    }
    
    public Technician inputData(){
        System.out.print("Enter technicain id : ");
        String id = Validation.checkInputString();
        System.out.print("Enter name: ");
        String n = Validation.checkInputString();
        System.out.print("Enter salaryCoefficient: ");
        double s = Validation.checkInputPositiveDouble();
        System.out.print("Enter workStartDate: ");
        String w = Validation.checkInputDate().toString();
        System.out.print("Are you Male/Female?");
        boolean g = Validation.checkInputGender();
        System.out.print("Enter work: ");
        String wk = Validation.checkInputString();
        Technician std = new Technician(id, n, s, w, g, wk);
        return std;
    }
    
    @Override
    public String toString() {
        return "Technician{" + super.toString() + "work=" + work + '}';
    }

}
