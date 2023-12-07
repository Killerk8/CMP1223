package NOOBank;

public class ContaPoupanca extends Conta {

	double taxaJuros;

	public ContaPoupanca(double depositoInicial, String nome, int numero, double taxaJuros) {
		setSaldo(depositoInicial);
		setNome(nome);
		setNumero(numero);
		setTipo("Conta Poupança.");
		setTaxaJuros(taxaJuros);
	}

	public void aplicarJuros() {
		double juros = (getTaxaJuros() / 100);
		System.out.println("Saldo aplicando " + getTaxaJuros() + "% de juros: " + ((getSaldo() * juros) + getSaldo()));
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return this.taxaJuros;
	}

}
