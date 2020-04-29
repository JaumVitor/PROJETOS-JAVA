package pacote_dados;

public class Vetor {
	//ATRIBUTOS
	private String vetor[]; //Não estou declarando o tamanho do vetor
	protected int cont;  //variavel de controle do vetor
	
	//METODOS AUXILIARES
	public void statusElementos() {
		//Mostra todos os elementos do vetor
		System.out.println("---------Imprimindo as palavras do vetor----------");
		for (int i=0; i<cont; i++) {
			System.out.println(this.vetor[i]);
		}
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
}
