package vetor_generico;

public class Contato {
	private String nome; 
	private String end; 
	private String tel;
	
	public Contato(String nome, String end, String tel) {
		this.nome = nome;
		this.end = end;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "{CONTATO nome=" + nome + ", end=" + end + ", tel=" + tel + "} ";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		return true;
	} 
}
