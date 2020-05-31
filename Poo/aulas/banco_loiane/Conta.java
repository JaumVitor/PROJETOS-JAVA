package banco_loiane;

public class Conta {
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;
    
    public Conta(int numero, boolean especial) {
        this.numero = numero;
        this.saldo = 0;
        setEspecial(especial); // Vai colocar o limite do saldo da conta
    }

    public Conta(int numero, double saldo, boolean especial) {
        this.numero = numero; 
        this.setEspecial(especial); // Vai colocar o limite do saldo da conta
    }
    
    public void extrato () {
    	//Imprime extrato bancario
    }

    public double verSaldo() { // Exibe o saldo da conta
        return this.saldo;
    }

    public void depositaSaldo(double saldo) { // Faz o depoisto na conta
    	if (this.saldo + saldo <= this.limite) {
    		this.saldo = verSaldo() + saldo; 
    	}else {
    		System.err.println("Não foi possivel fazer deposito, LIMITE EXCEDIDO!");
    	}
    }
    
    public void sacarSaldo(double saldo) {
    	if (this.saldo - saldo >= 0) {
    		this.saldo = verSaldo() - saldo; 
    	}else {
    		System.err.println("Não foi possivel fazer saque, SALDO INSUFICIENTE");
    	}
    	
    }

    private void setEspecial(boolean especial) {
        if (especial) {this.limite = 1200;} 
        else {this.limite = 800;} 
    }

    public boolean isEspecial(){
        return this.especial; 
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return this.limite;
    }

    private void setLimite(double limite) {
        this.limite = limite;
    }

	@Override
	public String toString() {
		return "[numero=" + numero + ", saldo=" + saldo + ", especial=" + especial + ", limite=" + limite + "]";
	}
}
