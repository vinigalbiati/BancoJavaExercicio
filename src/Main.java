
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Banco itau = new Banco("itau");
		
		Conta cc = new ContaCorrente(venilton, itau);
		Conta poupanca = new ContaPoupanca(venilton, itau);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		System.out.println(itau.listarContas());

	}

}
