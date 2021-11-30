
public class Employee {
	private int eno;
	private String name;
	protected double basicPay;
	public int a;
	public int b;
	
	public void setEmployee(int eno,String name,double basicPay,int a,int b) {
		this.eno=eno;
		this.name=name;
		this.basicPay=basicPay;
		this.a=a;
		this.b=b;
		
	}
	public void calSalary() {
		double sal=basicPay+basicPay+55/100;
		System.out.println("Salary="+sal);
		
	}
	
	public void doCalculate() {
		int sum=a+b;
		System.out.println("Sum="+sum);
	}
	public void getEmployee() {
		System.out.println("employee.no= "+ eno + " ,employee name= "+ name +" ,basicPay= "+ basicPay);
	}
	

}
