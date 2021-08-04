import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num, soma = 0;
		
		do {
			System.out.println("Adivinhe o número: ");
			num = leia.nextInt();
			soma = soma + num;
		}
		
		while(num != 0);
		
		System.out.println("Acertou! A soma dos números digitados é de: " + soma);
		
		leia.close();
	}
}
