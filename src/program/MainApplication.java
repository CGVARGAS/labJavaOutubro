package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class MainApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informe o nome do aluno: ");
		String name = sc.nextLine();
		
		System.out.print("Informe a nota do primeiro trimestre: ");
		double nota1Semestre = sc.nextDouble();
		System.out.print("Informe a nota do segundo trimestre: ");
		double nota2Semestre = sc.nextDouble();
		System.out.print("Informe a nota do terceiro trimestre: ");
		double nota3Semestre = sc.nextDouble();
		
		Student st = new Student(name, nota1Semestre, nota2Semestre, nota3Semestre);	
	
		System.out.println(st.getFinalGradeDetails());
		
		sc.close();
		
	}

}
