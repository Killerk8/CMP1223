package NOOBank;

public class ContaEspecial extends Conta{
		private double taxaCredito;
	
	public ContaEspecial(double depositoInicial, String nome, int numero, double taxaCredito){
		 setSaldo(depositoInicial);
		 setNome(nome);
		 setNumero(numero);
		 setTaxaCredito(taxaCredito/100);
		 setTipo("Conta Especial.");
	}
	
	public double getTaxaCredito() {
		return this.taxaCredito;
	}

	
	public void setTaxaCredito(double taxaCredito) {
		this.taxaCredito = taxaCredito;
	}
	
	public double sacar (double valor) {
		setSaldo(getSaldo() - valor);
		
		if (getSaldo() < valor) {
			setSaldo(getSaldo());
		}
		
		return valor;
	}

	public void cobrarJuros() {
		System.out.println("Valor do juros: " + (getSaldo() * -1) * getTaxaCredito());
		System.out.println("Valor total com juros: " + getSaldo() * -1 + (getSaldo() * -1) * getTaxaCredito());
	}
}
