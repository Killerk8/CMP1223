package NOOBank;

public class Main {

	public static void main(String[] args) {
		Conta ct1 = new Conta(100);

		System.out.println("Conta criada com saldo de: " + ct1.getSaldo());
		ct1.depositar(500);
		System.out.println("Valor total: " + ct1.getSaldo());
		
		System.out.println("Valor sacado: " + ct1.sacar(100));
		System.out.println("Saldo após o saque: " + ct1.getSaldo());
	}

}
