package NOOBank;

public class ContaAplicacao extends Conta{

	private double taxaJuros;
	
	public ContaAplicacao(double depositoInicial,String nome, int numero) {
		 setSaldo(depositoInicial);
		 setNome(nome);
		 setNumero(numero);

	}
	
	public boolean estaVencida() {
		return false;
	}

	public void vencida() {
		
	}

	public double getTaxaJuros() {
		return this.getTaxaJuros();
	}
	
	public void setTaxaJuros(double juros) {
		
	}
	
	public double sacarComTaxas (double valor) {
		return 0;
	}
	
	// redefinir sacar() para verificar o vencimento e aplicar todas as taxas necessárias

}
