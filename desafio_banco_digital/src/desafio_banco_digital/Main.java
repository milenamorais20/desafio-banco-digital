package desafio_banco_digital;

public class Main {

	public static void main(String[] args) {
		Cliente milena = new Cliente();
		milena.setCliente("Milena");
		
		Conta cc = new ContaCorrente(milena);
		cc.depositar(100);
		cc.imprimirExtrato();
		
		Conta poupanca = new ContaPoupanca(milena);
		poupanca.depositar(100);
		poupanca.imprimirExtrato();
		
		cc.transferir(poupanca, 50);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
;	}

}
