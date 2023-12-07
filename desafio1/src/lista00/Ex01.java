package lista00;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numClientes = 0, horaEntrada = 0, horaSaida = 0;
		double totalRecebido = 0;

		System.out.print("Quantas pessoas estacionaram ontem? ");
		numClientes = ler.nextInt();

		for (int i = 1; i <= numClientes; i++) {
			System.out.println("Cliente " + i + ".");
			System.out.print("Hora de entrada: ");
			horaEntrada = ler.nextInt();

			System.out.print("Hora de Saida: ");
			horaSaida = ler.nextInt();

			double tarifa = calcularTarifa(horaEntrada, horaSaida);
			System.out.println("Valor a pagar: " + tarifa);
			totalRecebido += tarifa;
		}

		System.out.println("Total arrecadado ontem: " + totalRecebido);
	}

	public static int calcularTarifa(int horaEntrada, int horaSaida) {
		int tarifaTotal = 0;

		int horasEstacionado = horaSaida - horaEntrada;

		tarifaTotal += 5;

		if (horasEstacionado > 3) {
			int horasAdicionais = horasEstacionado - 3;
			tarifaTotal += horasAdicionais;
		}

		tarifaTotal = Math.min(tarifaTotal, 30);

		return tarifaTotal;
	}
}
