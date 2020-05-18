package aula11b;
/*Aluno esta herdando de Pessoa
 * Tendo metodos unicos de sua classe, sua herança é pra diferença*/

public class Aluno extends Pessoa{
	private int matricula; 
	private String curso; 
	
	public void pagarMensalidade () {
		System.out.printf("Pagando Mensalidade de %s\n", this.getNome());
	}
	
	public Aluno() {
		this.setNome("Alfredo");
		this.setIdade(20);
		this.setSexo('M');
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
