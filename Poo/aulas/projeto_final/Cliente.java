package projeto_final;

public class Cliente {
	//Atributos
	private String numAgencia;
	private String numConta;
	private double Saldo;
	private String cliente;
	
	//Contrutor da classe
	public Cliente(String numAgencia, String numConta, double saldo, String cliente) {
		super();
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		Saldo = saldo;
		this.cliente = cliente;
	}

	//Metodos auxuliares
	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
}
