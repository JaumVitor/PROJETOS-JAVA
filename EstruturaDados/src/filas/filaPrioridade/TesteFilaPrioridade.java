package filas.filaPrioridade;

import filas.filaPrioridade.Classe.Classe;

public class TesteFilaPrioridade {
	public static void main(String[] args) {
		FilaPrioridade<Integer> filaInteger = new FilaPrioridade<Integer>(); 
		FilaPrioridade<String> filaString = new FilaPrioridade<String>();
		FilaPrioridade<Character> filaChar = new FilaPrioridade<Character>();
		FilaPrioridade<Classe> filaClasse= new FilaPrioridade<Classe>();
		
		//Adicionado elementos na fila<Integer>
		filaInteger.enfileirar(1);
		filaInteger.enfileirar(0);
		filaInteger.enfileirar(2);
		filaInteger.enfileirar(3);
		
		//Adionando elementos na fila<String> 
		filaString.enfileirar("bcd"); //3
		filaString.enfileirar("abc"); //2
		filaString.enfileirar("aac"); //1
		
		//Adionando elementos na fila<Character>
		filaChar.enfileirar('a'); 
		filaChar.enfileirar('c');
		filaChar.enfileirar('b');

		//Adionando elementos na fila<Classe>
		filaClasse.enfileirar(new Classe(5));
		filaClasse.enfileirar(new Classe(1));
		filaClasse.enfileirar(new Classe(2));
		filaClasse.enfileirar(new Classe(0));
		
		System.out.println(filaClasse);
	}
}
