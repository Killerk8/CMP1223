package NOOBank;

public class Conta {

	private double valor;
	private double saldo;
	private double depositoInicial;

	public Conta (){
		 saldo = 0;
	}
	
	public Conta(double depositoInicial) {
		saldo = depositoInicial;
	}
		
	
	public void depositar(double valor) {
		System.out.println("Valor depositado: " + valor);
		saldo += valor;
	}
	
	public double sacar(double valor) {		
		if (valor > saldo) {
			saldo = 0;
			return valor;
		}else {
			saldo = saldo - valor;
			return valor;		
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getValor() {
		return  valor;
	}			
		

}
