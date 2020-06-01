package banco_loiane;

public class GerenciaConta {
	private Conta[] vetor = new Conta[3];
	
	public void criarConta (int num) {
		Conta x = new Conta (num);
		vetor[0] = x ;
	}
}
