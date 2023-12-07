package personagens;

public class Personagem {

	public String nome;
	private int nivel;
	private int pontosDeVida;
	private int pontosDeAtaque;

	Personagem() {
	}

	Personagem(String nome, int nivel, int pontosDeVida, int pontosDeAtaque) {
		setNome(nome);
		setNivel(nivel);
		setPontosDeVida(pontosDeVida);
		setPontosDeAtaque(pontosDeAtaque);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNivel() {
		return this.nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPontosDeVida() {
		return this.pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public int getPontosDeAtaque() {
		return this.pontosDeAtaque;
	}

	public void setPontosDeAtaque(int pontosDeAtaque) {
		this.pontosDeAtaque = pontosDeAtaque;
	}

	public void atacar() {
		System.out.print("atacando ");
	}

	public int receberDano(int dano) {
		setPontosDeVida(getPontosDeVida() - dano);
		return dano;
	}
}
