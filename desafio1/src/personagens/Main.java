package personagens;

public class Main {

	public static void main(String[] args) {
		Guerreiro guerreiro = new Guerreiro("Garen", 100, 2000, 250, 100);
		Mago mago = new Mago("Ryze", 100, 1500, 300,80);

		System.out.println("Em uma floresta existem 2 personagems cujas classes sao distintas:");
		
		System.out.println("De um lado " + guerreiro.getNome() + " um guerreiro com sua espada.");
		System.out.println("Com o nível " + guerreiro.getNivel()+ " e de força " + guerreiro.getForca());
		System.out.println("Contendo " + guerreiro.getPontosDeVida() + " pontos de vida.");
		System.out.println("E com " + guerreiro.getPontosDeAtaque() + " pontos de ataque.");
		
		System.out.println();
		
		System.out.println("Do outro lado " + mago.getNome() + " utilizando sua força mágica.");
		System.out.println("Com o nível " + mago.getNivel()+ " e com " + mago.getPoderMagico() + " de poder mágico.");
		System.out.println("Contendo " + mago.getPontosDeVida() + " pontos de vida.");
		System.out.println("E com " + mago.getPontosDeAtaque() + " pontos de ataque.");
		
		System.out.println();
		
		System.out.println("Os dois irão lutar contra um grande monstro chamado Baron.");
		System.out.println("Que tem o total de 550 pontos de vida e 500 de dano.");
		
		System.out.println();
		
		System.out.print(guerreiro.getNome() + " inicia o combate "); 
		guerreiro.atacar();
		guerreiro.usarEspada();
		
		System.out.println("Causando " + guerreiro.getPontosDeAtaque() + " de dano no baron.");
		System.out.println("Deixando o Baron com 300 de vida.");
		
		System.out.println();
		
		System.out.println("Baron fica furioso e solta um grande poder causando 500 de dano em ambos personagens.");
		System.out.println(guerreiro.getNome() + " recebe " + guerreiro.receberDano(500) + " de dano e fica com " + guerreiro.getPontosDeVida() + " pontos de vida.");
		System.out.println(mago.getNome() + " recebe " + mago.receberDano(500) + " de dano fica com " + mago.getPontosDeVida() + " pontos de vida.");
		
		System.out.println();
		
		System.out.print("Em seguida " + mago.getNome() + " utiliza sua habilidade mágica e ajuda "); 
		mago.lancarFeitiço();
		System.out.println("Causando " + mago.getPontosDeAtaque() + " de dano no baron.");
		System.out.println("Matando o baron com seu feitiço.");
		System.out.println("Com isso os grandes guerreiros saem vitoriosis dessa grande batalha.");
		

	}

}
