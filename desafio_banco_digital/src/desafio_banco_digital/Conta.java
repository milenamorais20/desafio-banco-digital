package desafio_banco_digital;

public abstract class Conta implements IConta{
	private static final int AGENCIA = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
		
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	// É um método util apenas para os filhos dela
	protected void imprimirInfosComuns() {
		System.out.println("TITULAR: " + this.cliente.getCliente());
		System.out.println("AGENCIA: "+ this.agencia);
		System.out.println("NUMERO: "+ this.numero);
		System.out.println("SALDO: "+ this.saldo);

	}
}
