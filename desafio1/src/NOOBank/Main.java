package NOOBank;

public class Main {

	public static void main(String[] args) {
		
		Conta ct = new Conta();
		
		System.out.println(ct.getSaldo());
		ct.depositar(10);
		System.out.println(ct.sacar(3));
		System.out.println(ct.getSaldo());
		
		System.out.println();
		
		Conta ct1 = new Conta(10,"Arthur",123);
		System.out.println("Nome do titular da conta: " + ct1.getNome());
		System.out.println("Numero da conta: " + ct1.getNumero());
		System.out.println("Tipo de conta: " + ct1.getTipo());
		System.out.println("Saldo inicial da conta: " + ct1.getSaldo());
		ct1.depositar(10);
		System.out.println("Valor total: " + ct1.getSaldo());
		
		System.out.println("Valor sacado: " + ct1.sacar(15));
		System.out.println("Saldo após o saque: " + ct1.getSaldo());
		
		System.out.println();
		
		ContaPoupanca ct2 = new ContaPoupanca(1100,"Amorim",456,2);
		System.out.println("Nome do titular da conta: " + ct2.getNome());
		System.out.println("Numero da conta: " + ct2.getNumero());
		System.out.println("Tipo de conta: " + ct2.getTipo());
		System.out.println("Saldo inicial da conta: " + ct2.getSaldo());
		ct2.depositar(100);
		System.out.println("Valor total: " + ct2.getSaldo());
		System.out.println("Valor sacado: " + ct2.sacar(200));
		System.out.println("Saldo após o saque: " + ct2.getSaldo());
		ct2.aplicarJuros();
		
		System.out.println();
		
		ContaAplicacao ct3 = new ContaAplicacao(2000,"Jairo",789,true,5);
		System.out.println("Nome do titular da conta: " + ct3.getNome());
		System.out.println("Numero da conta: " + ct3.getNumero());
		System.out.println("Tipo de conta: " + ct3.getTipo());
		System.out.println("Saldo inicial da conta: " + ct3.getSaldo());
		ct3.depositar(100);
		System.out.println("Valor total: " + ct3.getSaldo());
		ct3.vencida();		
		ct3.sacar(1100);
		System.out.println("Valor após o saldo: " + ct3.getSaldo());


	}
}
