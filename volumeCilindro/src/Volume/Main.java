package Volume;

import Volume.Cilindro;
import java.util.Scanner;

public class Main {
	
	private float numero(String mensagem) {

		float num;
		Scanner input = new Scanner(System.in); 
		
		while (true) {
			System.out.print(mensagem);
			String numS = input.nextLine();
			try {
				num = Float.parseFloat(numS);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Formato Invalido: " + e);
			}
		}
		return num;
	}
	
	public static void main (String[] args) {
		
		Main main = new Main();
		
		float altura = main.numero("Digite um valor de altura: ");
		float raio = main.numero("Digite um valor de raio: ");
		
		Cilindro cilindro = new Cilindro(altura, raio);
		System.out.println("A area e: " + cilindro.area());
		System.out.println("O volume e: " + cilindro.volume());

	}
}