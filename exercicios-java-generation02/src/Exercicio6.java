import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int soma = 0, numero;
		double media;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0) {
				soma = soma + numero;
			}
			
		}while(numero != 0);
				media = soma / 2;
				
		System.out.println("A média dos números é: " + media);
		
		leia.close();

	}
}
