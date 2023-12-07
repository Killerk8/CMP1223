package NOOBank;

public class ContaSalario extends Conta {
	private double taxa;
	private int cotasMensais;
	private int qtdTransacoes;

	public ContaSalario(String nome, int numero, double taxa, int cotasMensais, int qtdTransacoes) {
		setNome(nome);
		setNumero(numero);
		setTaxa(taxa);
		setCotasMensais(cotasMensais);
		setQtdTransacoes(qtdTransacoes);
		setTipo("Conta Salário.");
	}

	public void calcularTaxas() {
		if (cotasMensais < qtdTransacoes)
			System.out.println("Sera cobrado: R$" + ((qtdTransacoes - cotasMensais) * getTaxa())
					+ " pelas transações excedentes.");

		else
			System.out.println("Não será cobrado valor excedente.");

	}

	public double getTaxa() {
		return this.taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public int getCotasMensais() {
		return this.cotasMensais;
	}

	public void setCotasMensais(int cotasMensais) {
		this.cotasMensais = cotasMensais;
	}

	public int getQtdTransacoes() {
		return this.qtdTransacoes;
	}

	public int setQtdTransacoes(int qtdTransacoes) {
		return this.qtdTransacoes = qtdTransacoes;
	}

}
