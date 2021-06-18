package display.trainee.details.week2.program38;

public class Trainee {

	private static final String BATCH_CODE = "CHNFSD";
	
	int employeeId;
	
	String employeeName;
	
	Trainee(int employeeId,String employeeName){
		
		this.employeeId = employeeId;
		
		this.employeeName = employeeName;
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void display() {
		
		System.out.println(getEmployeeId() + "  " + getEmployeeName() +  "  " + BATCH_CODE);
		
	}

	
}
