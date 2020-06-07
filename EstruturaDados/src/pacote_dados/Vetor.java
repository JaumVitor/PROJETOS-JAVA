package pacote_dados;

public class Vetor {
	//ATRIBUTOS
	private String vetor[]; //N�o estou declarando o tamanho do vetor
	protected int cont;  //variavel de controle do vetor
	
	//METODOS AUXILIARES
	private void aumentarCapacidade() {
		if (this.cont == this.vetor.length) {
			String vetorAux[] = new String[vetor.length * 2]; //Criando um vetor com o dobro do tamanho
			for (int i=0; i<this.vetor.length; i++) {
				vetorAux[i] = vetor[i];  
			}
			this.vetor = vetorAux; 
		}
	}
	
	public boolean adicionar(String string) {
		//adiciona elemento dentro do vetor
		aumentarCapacidade(); 
		if (this.cont >= this.vetor.length) { return false; } //Funcionaria caso o vetor podesse ficar cheio
		
		//Caso tenha espa�o no vetor: 
		vetor[cont] = string; 
		this.cont++; 
		return true;
	}
	
	//Sobrecarregando metodo adicionar (Add na posicao pedida)
	public boolean adicionar(String string, int pos) throws Exception{
		aumentarCapacidade();
		if (this.cont + 1 > vetor.length) {
			throw new Exception ("Vetor esta cheio, e nao pode add elemento"); 
		}else if (pos > this.cont || pos < 0 ) {
			throw new IllegalArgumentException ("Posi��o invalida, para adicionar elemento");
		}else {
			for (int i=this.cont; i>pos; i--) { //Movendo valores para liberar espa�o
				vetor[i] = vetor[i-1]; 
			}
			vetor[pos] = string;
			this.cont++; 
			return true; 
		}
	}
	
	public String buscarElemento (int pos) throws IllegalArgumentException{
		if (pos > this.cont || pos < 0) {
			throw new IllegalArgumentException ("Posi��o invalida, para buscar elemento");
		}
		return vetor[pos]; 
	}
	
	//Sobrecarregando metodo buscarElemento (Retorna o indice)
	public int buscarElemento (String palavra) {
		for (int i=0; i<this.cont; i++) {
			if (vetor[i].equalsIgnoreCase(palavra)) {
				return i; //Se econtrar a String dentro do vetor vai retornar o indice
			}
		}
		return -1; 
	}
	
	public boolean remover (String palavra) {
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
	
	//CONTRUTOR DA CLASSE VETOR
	public Vetor (int tamanho) { //Recebendo o tamanho do vetor como parmetro
		this.vetor = new String[tamanho];
		this.cont = 0;
	}
	
	public int getTamanho () {
		return this.cont; 
	}
	
	//METODOS SOBRESCRITOS
	/*public String toString () { 		//IMPRIMINDO VALORES DO ARRAY PELO METODO ARRAY.TOSTRING
		return Arrays.toString(vetor); 
	}
		
	public String toString () {			//MODO QUE EU IMPLEMENTEI (SEM O STRING BILDER)
		String imprimir = "[";  //Inicializando a string
		
		for (int i=0; i<this.cont; i++) { 
			//Pecorrendo cada elemento da string, dps adicionando a variavel e adiciona a virgula ate encontrar o ultimo elem
			if (i != this.cont -1) { 
				imprimir += vetor[i] + ", ";
				continue; 
			}
			imprimir += vetor[i]; //Ultimo elemento do vetor
		}
		//ao final � so imprimir a string preenchida, como os elementos
		return imprimir + "]";  
	}*/
	
	public String toString () {
		StringBuilder s = new StringBuilder(); 
		s.append("["); 
		
		for (int i=0; i<this.cont-1; i++) {
			s.append(vetor[i]).append(", "); 
		}
		
		if (this.cont > 0) {  //Se cont for maior que 0, pois caso n�o fosse poderia dar exception
			s.append(vetor[this.cont-1]);  //Adiconando o ultimo elemento separadamente
		}
		
		String imprimir = s.toString() + "]"; 
		return imprimir; 
	}
}








