package desafio_banco_digital;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== EXTRATO CONTA POUPANCA ===");
		super.imprimirInfosComuns();
	}
}
