package lista00;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner ler = new Scanner(System.in);

		int soma = 0, continuar = 0, soma2 = 0, pontos = 0;
		boolean op = true, continuarRolando = false;

		while (op) {
			System.out.println("Bem vindo ao jogo Craps!");
			System.out.println("Aperte enter para iniciar.");
			ler.nextLine();

			int dado1 = rolarDado(random);
			System.out.println("Valor do primeiro dado: " + dado1);

			int dado2 = rolarDado(random);
			System.out.println("Valor do segundo dado: " + dado2);

			soma = dado1 + dado2;
			pontos = soma;

			System.out.println("Soma dos dados: " + soma);

			String resultado = verificarResultado(soma);
			System.out.println(resultado);

			if (resultado.equals("Voce pontuou.")) {
				continuarRolando = true;
				op = false;
			}

			while (continuarRolando == true) {
				System.out.println("Pressione Enter para rolar novamente...");
				ler.nextLine();

				System.out.println("Seus pontos: " + soma);

				int novoDado1 = rolarDado(random);
				System.out.println("Valor do primeiro dado: " + novoDado1);

				int novoDado2 = rolarDado(random);
				System.out.println("Valor do primeiro dado: " + novoDado2);

				soma2 = novoDado1 + novoDado2;
				System.out.println("Soma dos dados: " + soma2);

				String resultado2 = verificarRodada2(soma2, pontos);
				System.out.println(resultado2);

				if (resultado2.equals("Voce rolou um 7.\nVoce perdeu.")
						|| resultado2.equals("Voce rolou sua pontuacao!\nVoce ganhou.")) {
					continuarRolando = false;
				}
			}

			boolean op2 = true;

			while (op2 == true) {
				System.out.println("Deseja continuar jogando?");
				System.out.println("1. SIM");
				System.out.println("2. NAO");
				System.out.print("OPCAO: ");
				continuar = ler.nextInt();
				if (continuar < 1 || continuar > 2)
					System.out.println("Opcao invalida.");

				else if (continuar == 1) {
					op = true;
					op2 = false;
				} else if (continuar == 2)
					op2 = false;
			}

		}

	}

	public static int rolarDado(Random random) {
		return random.nextInt(6) + 1;
	}

	public static String verificarResultado(int soma) {
		String mensagem = "";

		if (soma == 7)
			mensagem += "SEVEN!\nVoce ganhou.";

		else if (soma == 11)
			mensagem += "YO LEVEN!\nVoce ganhou.";

		else if (soma == 2 || soma == 3 || soma == 12)
			mensagem += "CRAPS!\nVoce perdeu.";

		else if (soma == 4 || soma == 5 || soma == 6 || soma == 8 || soma == 9 || soma == 10)
			mensagem += "Voce pontuou.";

		return mensagem;
	}

	public static String verificarRodada2(int soma2, int pontos) {
		String mensagem = "";

		if (soma2 == pontos)
			return mensagem += "Voce rolou sua pontuacao!\nVoce ganhou.";

		else if (soma2 == 7)
			return mensagem += "Voce rolou um 7.\nVoce perdeu.";

		return mensagem += "Continue rolando os dados.";

	}
}
