package filas.filaPrioridade;

import filas.Fila;

public class FilaPrioridade<Tipo> extends Fila<Tipo>{
	@Override
	public void enfileirar(Tipo elemento) {
		//O metodo vai adicionar todos os elementos em sua ordem de prioridade  
		//Dependendo de qual vai ser o tipo do elemento
		//Elemento de maior prioridade sempre fica no inicio da lista 

		Comparable<Tipo> compare = (Comparable<Tipo>) elemento; 
		//Para qualquer classe que seja terá o compareTo(), pois esta intanciando comparable; 

		int index=0; 
		if (!isEmpty()) {
			for (index=0; index<this.cont; index++) {
				if (compare.compareTo(this.vetor[index]) < 0) { //Verificando se o elemento tem mais prioridade  
					break;
				}
			}
		}
		try {
			super.adicionar(elemento, index);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} //Adiciona elemento na posicao desejada
	}

	@Override
	public String toString() {
		StringBuilder valores = new StringBuilder(); 
		valores.append("["); 
		
		for (int i=0; i<this.cont; i++) {
			valores.append(vetor[i]); 
			if (i != this.cont-1) { //Se for diferente do ultimo elemento
				valores.append(", "); 
			}else {
				valores.append("]"); 
			}
		}
		return valores.toString();
	}
}
