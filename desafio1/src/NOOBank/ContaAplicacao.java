package NOOBank;

public class ContaAplicacao extends Conta{
	private double taxaJuros;
	private boolean estaVencida;
	private double saldo;
	
	public ContaAplicacao(double depositoInicial, String nome, int numero, boolean estaVencida, double taxaJuros) {
		 setSaldo(depositoInicial);
		 setNome(nome);
		 setNumero(numero);
		 setTipo("Conta Aplicação.");
		 setEstaVencida(estaVencida);
		 setTaxaJuros(taxaJuros/100);
		 
	}
	
	public boolean estaVencida() {
		if (getEstaVencida())
			return true;
		else
			return false;
	}

	public void vencida() {
		if (estaVencida == true) {
			System.out.println("Saque depois do prazo de vencimento.");
			System.out.println("Será cobrado uma taxa de: " + getTaxaJuros() + "%");
		}
		else
			if (estaVencida == false) {
			System.out.println("Saque dentro do prazo de vencimento.");
			}
	}
	
	public boolean getEstaVencida() {
		return this.estaVencida;
	}
	
	public void setEstaVencida(boolean estaVencida) {
		this.estaVencida = estaVencida;
	}
	
	public double getTaxaJuros() {
		return this.taxaJuros;
	}
	
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public double sacar (double valor) {
		if (estaVencida == false) {
		 setSaldo(getSaldo() - valor);		 
		 return  valor; 		 
		}
	else {
		setSaldo(getSaldo() - (valor + (valor * taxaJuros)));
		
		return valor; 
	}
}
		
	
}
