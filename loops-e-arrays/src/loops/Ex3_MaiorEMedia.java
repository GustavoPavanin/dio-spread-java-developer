package loops;
import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		//pedir 5 numeros, informar maior e média
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int count = 0;
		int maior = 0;
		int soma = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if(numero>maior) maior = numero;
			
			soma = soma+numero;
			count++;
		} while(count < 5);
		
		System.out.println("Maior:"+ maior);
		System.out.println("Media dos valores: " + (soma/count));
	}

}
