package projeto_final;

public class ContaCorrente {
	//Atributos
	private String nome; 
	private String cpf; 
	private String telefone; 
	private String endereco;
	private String email;
	private int quantConta;
	
	//Contrutor da classe
	public ContaCorrente(String nome, String cpf, String telefone, String endereco, String email, int quantConta) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.quantConta = quantConta;
	}
	
	//Metodos auxiliares 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuantConta() {
		return quantConta;
	}

	public void setQuantConta(int quantConta) {
		this.quantConta = quantConta;
	}
	
	
	
}
