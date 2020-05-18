package aula11b;
/*Classe visitante se tornou filha da classe Pessoa 
 * Herdando todos os atributos e metodos da classe Mae (Pessoa)
 * Tipo de herança de implementação, pois não tem nehum atrb ou metod para somar*/ 

public class Visitante extends Pessoa{  
	
	public void status() {
		this.fazerAniversario();
		System.out.println(this.getIdade());
	}
	
	public Visitante() {
		this.setIdade(18);
		this.setSexo('M'); 
		this.setNome("Marcus");
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s\nIdade: %s\nSexo: %s\n", getNome(), getIdade(), getSexo());
	}
}
