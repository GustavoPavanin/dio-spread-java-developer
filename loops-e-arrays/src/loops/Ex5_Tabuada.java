package loops;
import java.util.Scanner;

public class Ex5_Tabuada {

	public static void main(String[] args) {
		// gerador de tabuada

		Scanner scan = new Scanner(System.in);
		
		int tabuada;
		
		while(true) {
			System.out.println("Tabuada: ");
			tabuada = scan.nextInt();
			if(tabuada >= 0 && tabuada <= 10) break;
			else System.out.println("Tabuada Inválida.");
		}

		for(int i = 1; i <=10; i++) {
			System.out.println(tabuada + " X "+ i + " = " + tabuada*i);
		}
	}

}
