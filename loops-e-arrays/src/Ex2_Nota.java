import java.util.Scanner;

public class Ex2_Nota {

	public static void main(String[] args) {
		//nota entre 0 e 10
		//mostra mensagem valor inv�lido
		//pede a nota at� que o valor for valido
		
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		while(true) {
			System.out.println("Nota: ");
			nota = scan.nextInt();
			if(nota >= 0 && nota <= 10) break;
			else
				System.out.println("Valor Inv�lido, digite outra nota.");
		}
	}

}
