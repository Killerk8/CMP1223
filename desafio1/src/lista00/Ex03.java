package lista00;
import java.util.Scanner;


public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int tamanho =0,op=0;
		char caracter;
		boolean A = true;
		
		while (A == true) {
		System.out.println("Escolha uma forma Geometrica:");
		System.out.println("1. Quadrado");
		System.out.println("2. Triangulo");
		System.out.println("3. Circulo");
		System.out.println("4. Losango");
		System.out.print("Opcao: ");
		op = ler.nextInt();
			
			if (op == 1) {
				System.out.print("Digite o tamanho: ");
				tamanho = ler.nextInt();
				
				System.out.print("Digite o tipo de caracter: ");
				caracter = ler.next().charAt(0);
				
				imprimirQuadrado(tamanho, caracter);
			}
			
			if (op == 2) {
				System.out.print("Digite o tamanho: ");
				tamanho = ler.nextInt();
				
				System.out.print("Digite o tipo de caracter: ");
				caracter = ler.next().charAt(0);
				
				imprimirTriangulo(tamanho, caracter);
			}
			
			if (op == 3) {
				System.out.print("Digite o tamanho: ");
				tamanho = ler.nextInt();
				
				System.out.print("Digite o tipo de caracter: ");
				caracter = ler.next().charAt(0);
				
				imprimirCirculo(tamanho, caracter);
			}
			
			if (op == 4 ) {
				System.out.print("Digite o tamanho: ");
				tamanho = ler.nextInt();
				
				System.out.print("Digite o tipo de caracter: ");
				caracter = ler.next().charAt(0);
				
				imprimirLosango(tamanho, caracter);
			}
			
			if (op <1 || op>4)
				System.out.println("Fomra geometrica invalida.");
			else 
				A = false;
		
		
		
		}				
	}
	
	public static void imprimirLinha (int tamanho, char caracter) {
		for (int i=0; i < tamanho; i++) {
			System.out.print(caracter + " ");
		}
		System.out.println();
	}	
	
	public static void imprimirQuadrado (int tamanho, char caracter) {
		for (int i=0; i<tamanho; i++) {
			imprimirLinha(tamanho, caracter);
		}		
		
	}
	
	public static void imprimirTriangulo (int tamanho, char caracter) {
	     for (int linha = 1; linha <= tamanho; linha++) {
	            for (int espacos = tamanho - linha; espacos > 0; espacos--) {
	                System.out.print(" ");
	            }
	            for (int caracteres = 1; caracteres <= 2 * linha - 1; caracteres++) {
	                System.out.print(caracter);
	            }
	            System.out.println();
	        }                  	
	      }
	
	public static void imprimirLosango (int tamanho, char caracter) {
		imprimirTriangulo(tamanho, caracter);
		for (int linha = tamanho-1; linha >= 1; linha--) {
            for (int espacos = tamanho - linha; espacos > 0; espacos--) {
                System.out.print(" ");
            }
            for (int caracteres = 1; caracteres <= 2 * linha - 1; caracteres++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
	}
	
	public static void imprimirCirculo (int tamanho, char caracter) {
		for (int y = -tamanho; y <= tamanho; y++) {
            for (int x = -tamanho; x <= tamanho; x++) {
                if (x * x + y * y <= tamanho * tamanho) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
}
}

