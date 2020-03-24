package Workshop7;

import java.util.Date;

 public class Manager extends Employee {
	protected String position;
	protected double positionAllowance;
	protected final double yearReward=100000;

	public Manager() {

	}

    public Manager(String employeeID, String fullName, double salaryCoefficient, Date workStartDate, boolean gender) {
        super(employeeID, fullName, salaryCoefficient, workStartDate, gender);

    }

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		System.out.print("Enter position:");
		position=sc.next();
		this.position = position;
	}
	
	public double getPositionAllowance() {
		return positionAllowance;
	}

	public void setPositionAllowance(double positionAllowance ) {
		System.out.print("Enter positionAllowance:");
		positionAllowance =sc.nextDouble();
		this.positionAllowance = positionAllowance;
	}

	public Manager input() {
		Manager m = new Manager();
		m.setEmployeeID(employeeID);
		m.setFullName(fullName);
		m.setSalaryCoefficient(salaryCoefficient);
		m.setPosition(position);
    	m.setPositionAllowance(positionAllowance);
		m.setGender(gender);
		m.setWorkStartDate(workStartDate);
		return m;
	}



	@Override
	public String toString() {
		return "" + getEmployeeID()+ "|" + getFullName()+ "|" 
	+isGender()
	+"|"+getSalaryCoefficient()+ "|" + reward() +
	"|" + salary() + "|" +  getPosition() 
				+ "|" + getPositionAllowance() ;
	}

	public double reward() {
		return this.yearReward*NumberOfYear();
	}
	
	public double salary() {
		
		return this.salaryCoefficient * basicSalary 
				+ yearSeniorityAllowance + this.positionAllowance;
	}
	
}   

