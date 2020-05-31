package pacote;

public class Gerenciamento {
	//Metodo cria um obj cliente e retorna
	private Cliente[] vetor = new Cliente[3]; 
	
	int teste; 
	public void criarCliente (String nome, int idade) {
		Cliente c = new Cliente (nome, idade); 
		vetor[0] = c;
	}
}
