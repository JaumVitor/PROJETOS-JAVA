package aula11b;
/*Criando classe Bolsista, que é decendente de Pessoa
 * herda todos os atributos e metodos de Pessoa e Aluno
 * Bolsista é uma especialização de Aluno*/

public class Bolsista extends Aluno{
	private int bolsa; 

	public void renovarBolsa() {
		System.out.printf("Renovando bolsa do aluno (Bolsista) %s\n", getNome());
	}
	
	@Override
	//Estou usando o pagar mensalidade 2 vezes no msm metodo: 
	public void pagarMensalidade () {
		System.out.println(">>Pagando mesnsalidade de Bolsista"); //Usando a classe sobreescrita
		super.pagarMensalidade(); //Chamando o PegarMensalidade da superClasse
	}
	
	public Bolsista() {  //Contrutor da Classe Bolsista
		this.setNome("Virgina");
		this.setIdade(14);
		this.setSexo('F');
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
