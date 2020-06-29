package lista_encadeada;

import lista_encadeada.pessoa.Pessoa;

public class TesteListaEncadeada {
	public static void main(String[] args) {
		//Criando a lista: 
		ListaSimples lista = new ListaSimples(); 
		
		//Adicionando pessoa no inicio da lista: 
		lista.adicionarPrimeiroElemento(new Pessoa ("3", "15"));
		lista.adicionarPrimeiroElemento(new Pessoa ("2", "18"));
		lista.adicionarPrimeiroElemento(new Pessoa ("1", "19"));
		
		//Adicionando pessoa no final da lista: 
		lista.adicionarUltimoElemento(new Pessoa ("10", "30"));  
		lista.adicionarUltimoElemento(new Pessoa("20", "10"));

		//Imprimindo lista: 
		System.out.println(lista);
		
		System.out.println("Fim");
	}
}
