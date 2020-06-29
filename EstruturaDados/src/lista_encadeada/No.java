package lista_encadeada;
/*
 * Um No guarda o conteudo e o proximo conteudo referente ao atual ( [P1]-> [P2]-> [ultimo]-> null )
 */

import lista_encadeada.pessoa.Pessoa;

public class No {
	private Pessoa pessoa;  //Conteudo
	private No proxima; 	//Proximo elemento da lista

	public No (Pessoa pessoa) { 
		//Recebendo valores iniciais do No, quando proximo = null, indica que eh o ultimo elemento
		this.pessoa = pessoa; 
		this.proxima = null;  //Apenas para ser mais didadico
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public No getProxima() {
		return proxima;
	}

	public void setProxima(No proxima) {
		this.proxima = proxima;
	}

}
