package lista00;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero;

		do {
			System.out.print("\nDigite um numero inteiro entre 1 e 99999 (0 para sair): ");
			numero = scanner.nextInt();

			if (numero >= 1 && numero <= 99999) {
				int quociente = Q(numero, 10);
				int resto = R(numero, 10);

				System.out.println("Quociente: " + quociente);
				System.out.println("Resto: " + resto);

				System.out.print("Digitos separados por hifen: ");
				displayDigitos(numero);
				System.out.println();

			} else if (numero != 0) {
				System.out.println("Número fora da faixa permitida.");
			}
		} while (numero != 0);

		System.out.println("Fim do programa.");
	}

	public static int Q(int num1, int num2) {
		return num1 / num2;
	}

	public static int R(int num1, int num2) {
		return num1 % num2;
	}

	public static void displayDigitos(int num) {
		if (num < 10) {
			System.out.print(num);
		} else {
			displayDigitos(num / 10);
			System.out.print(" - " + num % 10);
		}
	}
}
