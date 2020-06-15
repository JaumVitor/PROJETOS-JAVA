package banco_loiane;

public class GerenciaConta {
	private Conta[] vetor = new Conta[3];
	private int cont=0;
	
	public void criarConta (int num, String tipo) throws Exception {
		if (buscar (num) == null) {
			//Passando o tipo de conta refenrente ao tipo desejado
			Conta conta; 
			if (tipo.equalsIgnoreCase("corrente")) {
				conta = new Conta (num); 
			}else if (tipo.equalsIgnoreCase("poupanca")) {
				conta = new ContaPoupanca(num);
			}else if (tipo.equalsIgnoreCase("especial")) {
				conta = new ContaEspecial(num); 
			}else {
				throw new Exception ("Tipo de conta nao existente!");  
				//O tipo de conta que foi pedida, nao existe
			}
			
			this.vetor[cont] = conta ;
			this.cont++; 
		}else {
			throw new Exception ("Esta conta ja existe, escolha outro numero"); 
		}
	}
	
	public Conta buscar (int numeroConta) {
		for (int i=0; i<this.cont; i++) {
			if (this.vetor[i].getNumero() == numeroConta) {
				return vetor[i];
			}
		}
		return null; 
	}
}
