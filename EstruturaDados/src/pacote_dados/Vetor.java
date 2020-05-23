package pacote_dados;

public class Vetor {
	//ATRIBUTOS
	private String vetor[]; //Não estou declarando o tamanho do vetor
	protected int cont;  //variavel de controle do vetor
	
	//METODOS AUXILIARES
	public void statusElementos() {
		//Mostra todos os elementos do vetor, usando o toString: 
		System.out.println("---------Imprimindo as palavras do vetor----------");
		System.out.println(this.toString()); //Quando eu quero referenciar o toString da propria classe 
		
		/* Outro modelo de implementação (Imprimindo todos os elementos, pecorrendo o for): 
		for (int i=0; i<cont; i++) {
			System.out.println(this.vetor[i]);
		}
		
		  Segundo modelo de implementação: 
		for (String osDados: vetor) {
			if (osDados == null)  //Pecorrer todos os valores, caso não exista mais ele sai do loping
				break; 
			System.out.println();
		}*/ 
	}

	public boolean adicionar(String string) {
		//adiciona elemento dentro do vetor
		if (this.cont >= this.vetor.length) { return false; }
		
		//Caso tenha espaço no vetor: 
		vetor[cont] = string; 
		this.cont++; 
		return true;
	}
	
	//Sobrecarregando metodo adicionar (Add na posicao pedida)
	public boolean adicionar(String string, int pos) throws Exception{
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
	
	public String buscarElemento (int pos) throws IllegalArgumentException{
		if (pos > this.cont || pos < 0) {
			throw new IllegalArgumentException ("Posição invalida, para buscar elemento");
		}
		return String.format("*Retornano busca por indice - %s", vetor[pos]); 
	}
	
	//Sobrecarregando metodo buscarElemento (Retorna o indice)
	public int buscarElemento (String palavra) {
		for (int i=0; i<this.cont; i++) {
			if (vetor[i].equalsIgnoreCase(palavra)) {
				System.out.print("Retornando busca por String: ");
				return i; //Se econtrar a String dentro do vetor vai retornar o indice
			}
		}
		return -1; 
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
		//ao final é so imprimir a string preenchida, como os elementos
		return imprimir + "]";  
	}*/
	
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








