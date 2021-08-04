import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		try (Scanner leia = new Scanner(System.in)) {
			int idade, menor21 = 0, maior50 = 0;
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			while(idade != -99) {
				System.out.println("Digite a idade: ");
				idade = leia.nextInt();
				if(idade < 21) {
					menor21++;
				}
				if(idade > 50) {
					maior50++;
				}
				System.out.println("Quantidade de pessoas com menos de 21 anos: " + menor21);
				System.out.println("Quantidade de pessoas com mais de 50 anos: " + maior50);
			}
		}
	}
}
