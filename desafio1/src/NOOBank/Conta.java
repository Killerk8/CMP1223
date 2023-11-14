package NOOBank;

public class Conta {

	private double saldo;

	public Conta (){
		 setSaldo(0);
	}
	
	public Conta(double depositoInicial) {
		 setSaldo(depositoInicial);
	}
		
	
	public void depositar(double valor) {
		System.out.println("Valor depositado: " + valor);
		setSaldo(saldo += valor);
	}
	
	public double sacar(double valor) {		
		if (valor > saldo) {
			setSaldo(0);
			return valor;
		}else {
			setSaldo(saldo = saldo - valor);
			return valor;		
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
		

}
