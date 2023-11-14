package NOOBank;


public class Conta {

	private double saldo;
	public String nome;
	public String tipo = "Conta Bancaria.";
	public int numero;
	
	
	public Conta (){
		 setSaldo(0);
		 nome = "";
		 numero = 0;
	}
	
	public Conta(double depositoInicial, String nome, int numero) {
		 setSaldo(depositoInicial);
		 setNome(nome);
		 setNumero(numero);
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
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return this.tipo;
	}	
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
