package pilhas.Exe03;

import java.util.Stack;

public class Exercicio03 {

	public static void main(String[] args) {
		Stack<Livro> stackBooks = new Stack<Livro>();  
		
		//Instanciando livros: 
		Livro book1 = new Livro ("A revolta", "Id123", "Jorivaldo", "12/02/2008"); 
		Livro book2 = new Livro ("Detonado", "Id124", "Domings", "29/01/2010");
		Livro book3 = new Livro ("Sem criatividade", "Id125", "Dom Prior", "12/02/2020");
		
		//Empilhando elementos: 
		stackBooks.push(book1);
		stackBooks.push(book2); 
		stackBooks.push(book3); 
		
		//Imprimindo elementos da pilha: 
		System.out.printf("%d elements were added to the stack: \n\n", stackBooks.size());
		imprimirStack(stackBooks);
		
		//Desempilhando elementos: 
		if (!stackBooks.isEmpty()) {
			System.out.println("The stack is not empty");
			while (!stackBooks.isEmpty()) {
				System.out.println("\tDeleting book from stack" + stackBooks.pop());
			}
		}
		System.err.println("ALL ELEMENTS WERE EXCLUDED");
	}	
	
	public static void imprimirStack (Stack<Livro> stackBooks) {
		for (Livro elements: stackBooks) {
			System.out.println(elements);
		}
		System.out.print("\n");
	}
}
