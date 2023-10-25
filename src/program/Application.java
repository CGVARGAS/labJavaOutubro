package program;

import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle(0, 0);
		
		System.out.println("Entre com a largura e altura do retângulo: ");
		retangulo.widht = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.print(retangulo);
				
		sc.close();
	}

}
