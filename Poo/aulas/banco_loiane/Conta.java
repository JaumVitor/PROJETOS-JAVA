package banco_loiane;

public class Conta {
    private int numero;
    private double saldo;
    private StringBuilder registro = new StringBuilder();
    
    //Contrutor da classe: 
    public Conta(int numero) {
    	//<> Cria uma conta com saldo zero
        this.numero = numero;
        this.saldo = 0;
    }
    
    public Conta(int numero, double saldo) {
    	//<> Cria uma conta com valor saldo inicial
        this.numero = numero;
        this.saldo = saldo; 
    }
    
    public void buscarConta (int numConta) {
    	//<> Busca a conta pelo numero dela
    }
    
    public void extrato (double extrato, String locale) {
    	//<> Armazena o extrato bancario da conta
    	if (locale.equalsIgnoreCase("saque")) {
    		this.registro.append("SACOU ----- R$" + extrato + "\n");
    	}else if (locale.equalsIgnoreCase("deposito")) {
    		this.registro.append("DEPOSITOU - R$" + extrato + "\n"); 
    	}
    }
    
    public String extrato () { //Retorna o extrato bancario da conta
    	return String.format(this.registro.toString() + "Saldo atual: R$%s", this.saldo);
    }

    public boolean depositaSaldo(double saldo) { 
    	//<> Passando os registros, para colocar no extrato
    	setSaldo(getSaldo() + saldo); 
    	extrato(saldo, "deposito"); 
    	return true; 
    }
    
    public boolean sacarSaldo(double saldo) {
    	if (this.saldo - saldo >= 0) {
    		this.saldo = getSaldo() - saldo;
    		extrato(saldo, "saque"); //Passando os registros, para colocar no extrato
    		return true;
    	}
    	return false; 
    }
    
    protected void setSaldo (double saldo) {
    	this.saldo = saldo; 
    }
    
    protected double getSaldo () {
    	return this.saldo; 
    }
    
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
}
