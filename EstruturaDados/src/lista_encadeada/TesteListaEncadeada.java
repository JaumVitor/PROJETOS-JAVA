package lista_encadeada;

import lista_encadeada.pessoa.Pessoa;

public class TesteListaEncadeada {
	public static void main(String[] args) {
		//Criando a lista: 
		ListaSimples lista = new ListaSimples(); 
		
		//Adicionando pessoa no inicio da lista: 
		lista.adicionarPrimeiroElemento(new Pessoa ("1", "19"));
		lista.adicionarPrimeiroElemento(new Pessoa ("0", "19"));

		//Adicionando pessoa no final da lista: 
		lista.adicionarUltimoElemento(new Pessoa ("2", "19"));
		lista.adicionarUltimoElemento(new Pessoa ("3", "19"));
		
		//Removendo elementos: 
		lista.removerElemento(new Pessoa ("3", "19")); 
		lista.removerElemento(new Pessoa ("1", "19")); 
		
		//Imprimindo lista: 
		System.out.println(lista);
		
		System.out.println("Fim");
	}
}
