package NOOBank;

public class Conta {

	private double valor;
	private double saldo;
	
	public Conta (){
		double saldo = 0;
	}
	
	public Conta(double depositoInicial) {}
		
	
	public void depositar(double valor) {
		
	}
	
	public double sacar(double valor) {
		if (valor < saldo)
			return saldo;
		else
			return saldo-valor;
	}
	
	public double getSaldo() {
		
	}

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {	

	}

}
