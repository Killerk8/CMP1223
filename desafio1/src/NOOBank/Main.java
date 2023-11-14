package NOOBank;

public class Main {

	public static void main(String[] args) {
		Conta ct1 = new Conta(10);
		Conta ct = new Conta();
		
		System.out.println(ct.getSaldo());
		ct.depositar(10);
		System.out.println(ct.sacar(3));
		System.out.println(ct.getSaldo());
		
		System.out.println("Conta criada com saldo de: " + ct1.getSaldo());
		ct1.depositar(10);
		System.out.println("Valor total: " + ct1.getSaldo());
		
		System.out.println("Valor sacado: " + ct1.sacar(15));
		System.out.println("Saldo após o saque: " + ct1.getSaldo());
	}

}
