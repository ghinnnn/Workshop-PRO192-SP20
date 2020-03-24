package Workshop7v2;

import java.util.*;

public class EmployeeList{
   
    private final ArrayList<Employee> m = new ArrayList<>();

    public ArrayList<Employee> getM() {
        return m;
    }
    
    public Employee getEmployee(int i){
        return m.get(i);
    }
    
    public void addEmployees(Employee employee){
        m.add(employee);
    }
    
    public ArrayList<Employee> managerList(){
        ArrayList<Employee> list = new ArrayList<>();
        for(Employee v:m)
            if(v instanceof Manager) list.add(v);
        return list;
    }

    public double technicalSalaryAverage(){
        double sum=0;
        double count=0;
        for(Employee v:m){
            if(v instanceof Technician) {
                sum +=  v.salary();
                count++;
        }
    }
        return sum/count;
    }
    public Employee searchID(String id){
        for(Employee v:m){
            if(id.equalsIgnoreCase(v.employeeID)) return v;
        }
        return null;
    }
    public ArrayList<Employee> searchDate(String date){
        ArrayList<Employee> list = new ArrayList<>();
        for(Employee v:m){
            if(date.equalsIgnoreCase(v.getWorkStartDate())) list.add(v); 
        }
        return list;
    }
    public ArrayList<Employee> searchName(String name){
        ArrayList<Employee> list = new ArrayList<>();
        for(Employee v:m){
            if(name.equalsIgnoreCase(v.getFullName())) list.add(v);
        }
        return list;
    }
    public ArrayList<Employee> searchGender(Boolean gender){
        ArrayList<Employee> list = new ArrayList<>();
        for(Employee v:m){
            if(gender==v.isGender()) list.add(v);
        }
        return list;
    }
    public void removeID(String id){
        for(Employee v:m){
            if(id.equalsIgnoreCase(v.getEmployeeID())){
                m.remove(v);
                System.out.println("Remove successfully");
                return;
            }        
        }
        System.out.println("ID not found");
    }
    public void removeDate(String date){
        for(Employee v:m){
            if(date.equalsIgnoreCase(v.getWorkStartDate())){
                m.remove(v);
                System.out.println("Remove successfully");
            }               
        }
    }
    public Employee lastSalaryMax(){
        double max = 0;
        for(Employee v:m){
            if(v.salary()>max) max = v.salary();
        }
        for(Employee v:m){
            if(v.salary()==max) return v;
        }
        return null;
    }
    public void updateEmployee(String id){
        for(Employee v:m){
            if(id.equalsIgnoreCase(v.getEmployeeID())){
                System.out.print("Name: "); v.setFullName(Validation.checkInputString());
                System.out.print("Salary Coefficient: ");v.setSalaryCoefficient(Validation.checkInputPositiveDouble());
                System.out.print("Date start work: ");v.setWorkStartDate(Validation.checkInputDate().toString());              
                System.out.print("Gender: "); v.setGender(Validation.checkInputGender()); 
            }
        }   
        
    }

}