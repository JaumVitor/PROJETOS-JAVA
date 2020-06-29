package lista_encadeada;

import lista_encadeada.pessoa.Pessoa;

public class ListaSimples {
	private No ultimo;  //Ultimo elemento da Lista
	private No primeiro;  //Primeiro elemento da lista
	private int size; 

	public boolean isEmpty() {
		return this.primeiro == null; 
	}

	public void adicionarPrimeiroElemento(Pessoa pessoa) {
		No novoNo = new No(pessoa); 
		if (isEmpty()) {
			this.ultimo = novoNo; 
			//na primeira vez o primeiro vai estar com valor igual a null
		}
		novoNo.setProxima(primeiro); 
		this.primeiro = novoNo; //Recebendo valor, para nao entrar na condicao e indicar quem vai ser o novo proximo
		this.size++; 
	}
	
	public void adicionarUltimoElemento(Pessoa pessoa) { //Em teste
		No novoNo = new No (pessoa);
		if (isEmpty()) {
			this.primeiro = novoNo; 
		}else {
			this.ultimo.setProxima(novoNo);
		}
		this.ultimo = novoNo; 
		this.size++; 
	}

	public No getUltimo() {
		return ultimo;
	}

	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(); 
		
		No local = this.primeiro;  //Variavel auxiliar
		str.append("["); 
		while (local != null) {
			str.append(local.getPessoa().getNome()); 
			if (local.getProxima() != null) str.append(", ");
			local = local.getProxima(); 
		}
		str.append("]"); 
		
		return str.toString();
	}
	
}
