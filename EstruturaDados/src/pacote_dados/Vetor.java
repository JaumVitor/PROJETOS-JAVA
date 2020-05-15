package pacote_dados;

public class Vetor {
	//ATRIBUTOS
	private String vetor[]; //N�o estou declarando o tamanho do vetor
	protected int cont;  //variavel de controle do vetor
	
	//METODOS AUXILIARES
	public void statusElementos() {
		//Mostra todos os elementos do vetor, usando o toString: 
		System.out.println("---------Imprimindo as palavras do vetor----------");
		System.out.println(this.toString()); //Quando eu quero referenciar o toString da propria classe 
		
		/* Outro modelo de implementa��o (Imprimindo todos os elementos, pecorrendo o for): 
		for (int i=0; i<cont; i++) {
			System.out.println(this.vetor[i]);
		}
		
		  Segundo modelo de implementa��o: 
		for (String osDados: vetor) {
			if (osDados == null)  //Pecorrer todos os valores, caso n�o exista mais ele sai do loping
				break; 
			System.out.println();
		}*/ 
	}

	public void adicionar(String string) throws Exception {
		//adiciona elemento dentro do vetor
		if (this.cont >= this.vetor.length) {
			throw new Exception ("ERRO, O vetor n�o � capaz de armazenar valores"); //Disparando uma exception
		}
		//Caso tenha espa�o no vetor: 
		vetor[cont] = string; 
		this.cont++; 
		System.out.println("Valor adicionado!");
	}
	
	public int getTamanho () {
		return this.cont; 
	}
	
	public String buscarElemento (int pos) {
		if (pos > this.cont || pos < 0) {throw new IllegalArgumentException ("Posi��o invalida");}
		
		return vetor[pos]; 
	}
	
	//CONTRUTOR DA CLASSE VETOR
	public Vetor (int tamanho) { //Recebendo o tamanho do vetor como parmetro
		this.vetor = new String[tamanho];
		this.cont = 0;
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








