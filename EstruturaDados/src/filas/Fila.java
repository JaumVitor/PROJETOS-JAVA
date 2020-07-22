package filas;

import vetor_generico.Lista;

public class Fila<Tipo> extends Lista<Tipo> {
	public Fila (int tamanho) {
		super(tamanho); 
	}

	public Fila () {
		super(); 
	}

	public void enfileirar (Tipo elemento) {
		//Adiciona o elemento ao final da fila
		this.aumentarCapacidade();
		this.vetor[this.cont++] = elemento; //Adicionando valor no inicio 
	}

	public Tipo desenfilerar () {
		//Retira o primeiro elemento da lista
		if (!isEmpty()) {
			Tipo aux = vetor[0]; 
			this.remover(vetor[0]); 
			return aux; 
		}
		return null; 
	}

	public Tipo espiar () {
		if (!isEmpty()) {
			return this.vetor[0]; 
		}
		return null; 
	}
}
