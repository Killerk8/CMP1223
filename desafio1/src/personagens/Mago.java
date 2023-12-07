package personagens;

public class Mago extends Personagem {

	private int poderMagico;

	Mago() {
	}

	Mago(String nome, int nivel, int pontosDeVida, int pontosDeAtaque, int poderMagico) {
		setNome(nome);
		setNivel(nivel);
		setPontosDeVida(pontosDeVida);
		setPontosDeAtaque(pontosDeAtaque);
		setPoderMagico(poderMagico);
	}

	public int getPoderMagico() {
		return this.poderMagico;
	}

	public void setPoderMagico(int poderMagico) {
		this.poderMagico = poderMagico;
	}

	public void lancarFeitiço() {
		System.out.println("lançando feitiço.,");
	}
}
