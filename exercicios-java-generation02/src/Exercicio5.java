import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Adivinhe o n�mero: ");
			num = leia.nextInt();
			soma = soma + num;
		}
		
		while(num != 0);
		
		System.out.println("Acertou! A soma dos n�meros digitados � de: " + soma);
		
		leia.close();
	}
}
