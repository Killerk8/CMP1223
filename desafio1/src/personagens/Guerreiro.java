package personagens;

public class Guerreiro extends Personagem {

	private int forca;

	Guerreiro(String nome, int nivel, int pontosDeVida, int pontosDeAtaque, int forca) {
		setNome(nome);
		setNivel(nivel);
		setPontosDeVida(pontosDeVida);
		setPontosDeAtaque(pontosDeAtaque);
		setForca(forca);
	}

	public void usarEspada() {
		System.out.println("usando a espada.");
	}

	public int getForca() {
		return this.forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}
}
