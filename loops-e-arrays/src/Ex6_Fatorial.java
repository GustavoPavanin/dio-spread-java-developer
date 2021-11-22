import java.util.Scanner;

public class Ex6_Fatorial {

	public static void main(String[] args) {
		// fatorial de um numero inteiro
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		int fatorial = 0;
		
		System.out.println("Fatorial de: ");
		numero = fatorial = scan.nextInt();
		for(int i = numero-1; i > 1; i--) {
			fatorial = fatorial * i;
		}
		
		System.out.println(numero + "! = " + fatorial);

	}

}
