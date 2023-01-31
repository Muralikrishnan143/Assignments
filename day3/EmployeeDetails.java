package week1.day2;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.EmployeeName("murali",1078);
		emp.EmployeeAddress("Ranipet");
		emp.EmployeeSalary(100000.50);
		emp.MobileNo(8679834526l);
		
	}
	
public void EmployeeName(String empName,int empId) {
		System.out.println("Employeename : "+empName);
		System.out.println("EmployeeId : "+empId);
	}
public void EmployeeAddress(String empAddress) {
		
		System.out.println("EmployeeAddress :"+empAddress);
		
	}
public void EmployeeSalary(double empSalary) {
	
	System.out.println("EmployeeSalary :"+empSalary);
}
public void MobileNo(long mblno) {
		
		System.out.println("Emp Mobileno :"+mblno);
		
	}

}
