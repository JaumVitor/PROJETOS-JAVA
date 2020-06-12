package vetor_generico;

public class Lista <Tipo> {
	//ATRIBUTOS
	private Tipo vetor[]; //Não estou declarando o tamanho do vetor
	protected int cont;  //variavel de controle do vetor

	//CONTRUTOR DA CLASSE VETOR
	public Lista (int tamanho) { //Recebendo o tamanho do vetor como parmetro
		this.vetor = (Tipo[]) new Object[tamanho];
		this.cont = 0;
	}

	//METODOS AUXILIARES
	private void aumentarCapacidade() {
		if (this.cont == this.vetor.length) {
			Tipo vetorAux[] = (Tipo[]) new Object[vetor.length * 2]; //Criando um vetor com o dobro do tamanho
			for (int i=0; i<this.vetor.length; i++) {
				vetorAux[i] = vetor[i];  
			}
			this.vetor = vetorAux; 
		}
	}

	public boolean adicionar(Tipo string) {
		//adiciona elemento dentro do vetor
		aumentarCapacidade(); 
		if (this.cont >= this.vetor.length) { return false; } //Funcionaria caso o vetor podesse ficar cheio

		//Caso tenha espaço no vetor: 
		vetor[cont] = string; 
		this.cont++; 
		return true;
	}

	//Sobrecarregando metodo adicionar (Add na posicao pedida)
	public boolean adicionar(Tipo string, int pos) throws Exception{
		aumentarCapacidade();
		if (this.cont + 1 > vetor.length) {
			throw new Exception ("Vetor esta cheio, e nao pode add elemento"); 
		}else if (pos > this.cont || pos < 0 ) {
			throw new IllegalArgumentException ("Posição invalida, para adicionar elemento");
		}else {
			for (int i=this.cont; i>pos; i--) { //Movendo valores para liberar espaço
				vetor[i] = vetor[i-1]; 
			}
			vetor[pos] = string;
			this.cont++; 
			return true; 
		}
	}

	public Tipo buscarElemento (int pos) throws IllegalArgumentException{
		if (pos > this.cont || pos < 0) {
			throw new IllegalArgumentException ("Posição invalida, para buscar elemento");
		}
		return vetor[pos]; 
	}

	//Sobrecarregando metodo buscarElemento (Retorna o indice)
	public int buscarElemento (Tipo palavra) {
		for (int i=0; i<this.cont; i++) {
			if (vetor[i].equals(palavra)) {
				return i; //Se econtrar a String dentro do vetor vai retornar o indice
			}
		}
		return -1; 
	}

	public boolean remover (Tipo palavra) {
		int indice = buscarElemento(palavra);
		if (indice != -1) {
			for (int i=indice; i<this.cont-1; i++) {
				vetor[i] = vetor[i+1];
			} 
			this.cont--;
			return true; 
		}
		return false; 
	}

	public boolean remover (int pos) {
		if (pos > this.cont || pos < 0 || pos == -1) {
			return false; 
		}else {
			remover (this.vetor[pos]); //Usando o metodo sobrecarregado
			return true; 
		}
	}

	public int getTamanho () {
		return this.cont; 
	}

	//METODOS SOBRESCRITOS
	public String toString () {
		StringBuilder s = new StringBuilder(); 
		s.append("["); 

		for (int i=0; i<this.cont-1; i++) {
			s.append(vetor[i]).append(", "); 
		}

		if (this.cont > 0) {  //Se cont for maior que 0, pois caso não fosse poderia dar exception
			s.append(vetor[this.cont-1]);  //Adiconando o ultimo elemento separadamente
		}

		String imprimir = s.toString() + "]"; 
		return imprimir; 
	}
}
