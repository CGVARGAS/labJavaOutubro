package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	
	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
		
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary += (grossSalary * (percentage/100));
	}

	@Override
	public String toString() {
		return "Employee: " + name + ", $ " + String.format("%.2f\n\n", netSalary());
	}
	
}
