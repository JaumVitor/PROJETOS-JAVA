package filas.filaPrioridade.Classe;

public class Classe implements Comparable<Classe>{  //Implementando a classse comparable, que vai fornecer o metodo compareTo()
	private int prioridade; 
	
	public Classe (int prioridade) {
		this.prioridade = prioridade; 
	}

	@Override
	public String toString() {
		return String.format("%s", prioridade);
	}

	@Override
	public int compareTo(Classe objeto) {	
		//Ditando a regra de comparacao do metodo compareTo
		//obj1 < obj2 (-1)       obj1 > obj2 (1)      obj = obj2 (0)
		if (this.prioridade < objeto.prioridade) {
			return -1; 
		}else if (this.prioridade > objeto.prioridade) {
			return 1; 
		}
		return 0;
	}	
}
