
public class TechEmp extends Employee {
	
    private int bonus=10000;
	public void getBonus() {
		System.out.println("Bonus:"+bonus);
	}
	
	@Override
	public void calSalary() {
		double sal=basicPay+basicPay+55/100+bonus;
		System.out.println("Salary="+sal);
	}
	
	public void doCalculate() {
		int multiply=a*b;
		System.out.println("multiply="+multiply);
		
	}

	public static void main(String[] args) {
		TechEmp e1 = new TechEmp();
		e1.setEmployee(97,"ABC",56000,6,6);
		e1.calSalary();
		e1.getEmployee();
		e1.getBonus();
		e1.doCalculate();
		
		
		
		

	}

}
