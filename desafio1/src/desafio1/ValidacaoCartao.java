package desafio1;
import java.util.Scanner;

public class ValidacaoCartao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		long numero;
		System.out.print("Digite o numero do cartao: ");
		numero = ler.nextLong();
	     
	    long numero2 = numero;
	    int soma=0,soma2=0;
	    
	    String num = Long.toString(numero2);
	    String bandeira = "";
	    
	    System.out.println("Numero: " + numero);
	    
	    if (num.startsWith("34") || num.startsWith("37")) {
	        bandeira = "AMEX"; 
	    } else if (num.startsWith("51") || num.startsWith("52") ||
	               num.startsWith("53") || num.startsWith("54") ||
	               num.startsWith("55")) {
	    	 bandeira = "MASTERCARD";
	    } else if (num.startsWith("4")) {
	    	 bandeira = "VISA";
	    } 
	      
	    while (numero > 0) {
	    	numero /= 10;
	        int digito = (int) (numero % 10)*2;
	        int digito2 = (int) (numero2 % 10);
	        
	        soma2 += digito2;
	        
	        if (digito>9) {
	        	digito = (digito/10) + (digito%10) ;
	        	soma+=digito;
	        }else
	        	soma+=digito;
	        
	        numero /= 10;
	        numero2 /= 100;
	        }
	    
	    int verificador = soma+soma2;
	    
		if (verificador%10 == 0) 
			System.out.println(bandeira);
		else
			System.out.println("INVALIDO");
	}

}
