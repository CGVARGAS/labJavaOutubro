package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Aplication_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee empregado = new Employee(null, 0, 0);
		
		System.out.print("Name: ");
		empregado.name = sc.nextLine();
		System.out.print("Gross salary: ");
		empregado.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		empregado.tax = sc.nextDouble();
		
		System.out.print(empregado);
		
		System.out.print("Adicione o percentual de aumento: ");
		empregado.increaseSalary(sc.nextDouble()); 
		
		System.out.print(empregado);		
		
		sc.close();

	}

}
