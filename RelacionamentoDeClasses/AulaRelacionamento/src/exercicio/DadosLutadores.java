package exercicio;

import exercicio.Lutadores.StatusLutador;

public class DadosLutadores {
	protected Lutadores[] arrayLutadores = new Lutadores[30]; //Vetor que vai armazenar todos os dados dos lutadores
	private int cont; 
	
	DadosLutadores () {
		this.cont = 0; 
	}
	
	public void cadastrarLutador (String nome, String nacionalidade, int idade, double altura, double peso, 
										StatusLutador statusLutador) {
		
		this.arrayLutadores[cont] = new Lutadores (nome, nacionalidade, idade, altura, peso, statusLutador); 
		this.cont++; 
	}
}
