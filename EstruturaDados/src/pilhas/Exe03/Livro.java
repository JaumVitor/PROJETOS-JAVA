package pilhas.Exe03;

public class Livro {
	//Atributos: 
	private String nome; 
	private String isbn; 
	private String autor; 
	private DataLancamento dataLancamento; 
	
	public Livro(String nome, String isbn, String autor, String dataLancamento) {
		this.nome = nome;
		this.isbn = isbn;
		this.autor = autor;
		this.dataLancamento = new DataLancamento (dataLancamento.split("/"));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public DataLancamento getDataLancamento() {
		return dataLancamento;
	}

	@Override
	public String toString() {
		return "ISBN: " + isbn + "[nome=" + nome + ", autor=" + autor + ", dataLancamento=" + dataLancamento + "]";
	}
	
}
