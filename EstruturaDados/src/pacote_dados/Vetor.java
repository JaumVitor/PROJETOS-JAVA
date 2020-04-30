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

	public void adicionar(String string) throws Exception {
		//adiciona elemento dentro do vetor
		if (this.cont >= this.vetor.length) {
			throw new Exception ("ERRO, O vetor não é capaz de armazenar valores"); //Disparando uma exception
		}
		vetor[cont] = string; 
		this.cont++; 
		System.out.println("Valor adicionado!");
	}
	
	//CONTRUTOR DA CLASSE VETOR
	public Vetor (int tamanho) { //Recebendo o tamanho do vetor como parmetro
		this.vetor = new String[tamanho];
		this.cont = 0;
	}
	
	//METODOS SOBRESCRITOS
	public String toString () {
		String imprimir = "[";  //Inicializando a string
		
		for (int i=0; i<this.cont; i++) { 
			//Pecorrendo cada elemento da string, dps adicionando a variavel e adiciona a virgula ate encontrar o ultimo elem
			if (i != this.cont -1) { 
				imprimir += vetor[i] + ", ";
				continue; 
			}
			imprimir += vetor[i];
		}
		//ao final é so imprimir a string preenchida, como os elementos
		return imprimir + "]";  
	}
}
