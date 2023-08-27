package lista00;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		boolean flag = false;
		
		while (!flag) {
			System.out.println("Digite 0 para parar: ");
			System.out.print("Digite o numero: ");
			numero = ler.nextInt();
			
			if (numero == 0) {
				flag = true;
				break;
			}
			String resultado = verificar(numero);
			System.out.println(resultado);
			

		}
		


		
		
	}

	public static boolean ehPar(int numero) {
		boolean A = true;;
		if (numero%2 == 0)
			A = true;
		else
			if (numero%2 != 0)
			A = false;
		
		return A;
	}
	
	public static String verificar(int numero) {
		String msg = "";
		
		if (ehPar(numero) == true)
			msg += "E par.";
		else
			if (ehPar(numero) == false)
			msg += "Nao e par.";
		
		return msg;
	}
}
