package week1.day1;

public class EmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int empId=1000001;
		long phoneNumber=9677962520l;
		String eName="Ajayganesh";
	    String dept = "HR";
	    char shType='D';
	    float salry=50600.00f;
	    boolean status=true;
	   
		//Update a new value to the existing variable
		//value=20;
		System.out.println("------------------------THE EMPLOYEE DETAILS-------------------\n");
		System.out.println("Name of the Employee : "+eName);
		System.out.print("The Employee ID:"+"AA"+empId+"\n");
		System.out.println("The phone number is : "+phoneNumber);
		System.out.println("The Deprtment : "+dept);
		System.out.println("Shift Timing : Day (D)/Night(N) : "+shType);
		System.out.println("Employee Salary : RS "+salry);
		if (status)
		{
		System.out.println("The Employee presently working : "+"Currently working");
		}
		else
		{
		System.out.println("The Employee presently working :"+"Releived");
		}
			
	}

}
