package entities;

public class Student {
	private String name;
	private double nota1Semestre;
	private double nota2Semestre;
	private double nota3Semestre;
	
	
	public Student(String name, double nota1Semestre, double nota2Semestre, double nota3Semestre) {
		this.name = name;
		this.nota1Semestre = nota1Semestre;
		this.nota2Semestre = nota2Semestre;
		this.nota3Semestre = nota3Semestre;
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getN1() {
		return nota1Semestre;
	}


	public double getN2() {
		return nota2Semestre;
	}


	public double getN3() {
		return nota3Semestre;
	}

	/*Neste código, a função calculateTotalGrade() é responsável apenas pelo cálculo da nota total do aluno. 
	 * Enquanto a função getFinalGradeDetails() gera uma string com os detalhes da nota final.
	 */
	public double calculatorTotalGrade() {
		return nota1Semestre + nota2Semestre + nota3Semestre;
	}
	
	/*O método da classe abaixo é do tipo String onde a mesma recebe o resultado do método "calculatorTotalGrade()"
	 * e mostra o resultado do tipo String com os detalhes da nota final. 
	 */
	public String getFinalGradeDetails() {
		 double totalGrade = calculatorTotalGrade();
		
		 if (totalGrade >= (60.00)) {
			 return String.format("Final Grade: %.2f\nPASS", totalGrade);
		 }else {
			 return String.format("Final Grade: %.2f\nFAILED\nMISSING %.2f POINTS", totalGrade, (60.00) - totalGrade);
		 }
	}
}
