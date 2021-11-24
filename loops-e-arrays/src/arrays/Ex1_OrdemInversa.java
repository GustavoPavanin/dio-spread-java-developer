package arrays;

public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		// criar vetor de 6 numeros inteiros e mostre-os na ordem inversa
		
		int[] vetor = {-5,-6, 15, 50, 8, 4};
		
		int count = 0;
			System.out.println("Vetor: ");
		while (count < (vetor.length)) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		
		System.out.println("");
		System.out.println("Vetor invertido: ");
		for(int i = vetor.length-1; i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
		
	}

}
