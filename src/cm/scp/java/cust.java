package cm.scp.java;

class Employee{
	int empId;
	String empName;
	int empAge;
	String empAddress;
	
	static{
			System.out.println("inside static block of emp");
	}
	{
		System.out.println("inside instance block of emp");
	}
	public Employee() {
		System.out.println("inside Emp constructor");
	}
	
	
	
}