package aula11b;

public class Heranca {
	public static void main(String[] args) {
		Visitante visitante = new Visitante();
		Aluno aluno = new Aluno(); 
		Bolsista bolsista = new Bolsista(); 
		
		//Pessoa pessoa = new Pessoa(); Pessoa é uma classe abstrata 
		
		System.out.println(visitante.toString()); 
		aluno.pagarMensalidade();
		bolsista.renovarBolsa();
		bolsista.pagarMensalidade();
		
	}
}
