import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		double raio, area;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o raio do circulo? ");
		raio = teclado.nextDouble();
		
		//area = 3.1415 * (raio * raio);
		area = Math.PI * Math.pow(raio, 2);
		System.out.println("A area do circulo e " + area);
		
		teclado.close();
	}

}
