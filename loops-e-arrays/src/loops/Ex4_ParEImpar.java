package loops;
import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		// programa que pede n numeros inteiros
		// mostre a quantidade de numeros pares e impares
		
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNumeros;
		int pares = 0;
		int impares = 0;
		int count = 0;
		int numero;
			System.out.println("Quantidade de n�meros: ");
			quantidadeNumeros = scan.nextInt();
		do {
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			if (numero % 2 >0) impares++;
			else pares++;
			
			count++;
		} while(count < quantidadeNumeros);
		
		System.out.println("Quantidade de n�meros pares: " + pares);
		System.out.println("Quantidade de n�meros �mpares: " + impares);
	}

}
