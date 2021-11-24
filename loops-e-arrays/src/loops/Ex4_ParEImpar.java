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
			System.out.println("Quantidade de números: ");
			quantidadeNumeros = scan.nextInt();
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if (numero % 2 >0) impares++;
			else pares++;
			
			count++;
		} while(count < quantidadeNumeros);
		
		System.out.println("Quantidade de números pares: " + pares);
		System.out.println("Quantidade de números ímpares: " + impares);
	}

}
