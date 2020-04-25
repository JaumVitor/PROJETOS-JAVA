package exercicio;

public class Combate {
	//ATRIBUTOS
	private Lutadores lutador1;
	private Lutadores lutador2; 
	private int rouds; 
	private boolean statusLuta; 

	public Combate (Lutadores lutador1, Lutadores lutador2) {
		this.lutador1 = lutador1; 
		this.lutador2 = lutador2; 
		this.statusLuta = false; 
	}
	
	//METODOS DA CLASSE
	public void marcarLuta () {	
		//Metodo chamado antes da luta, e é responsavel por validar se a luta vai ocorrer ou não
		if ( this.lutador1.getCategoria() == this.lutador2.getCategoria()) {
			System.out.println("Luta liberada!");
			this.statusLuta = true; 
		}else {
			System.out.println("Luta não liberada");
		}
	}
	
	public void teste(Lutadores l1, Lutadores l2) {
		if (l1.equals(l2) == false) {
			System.out.println("Lutadores diferentes");
		}
	}
	
	public void lutar () {
		if (statusLuta) {
			System.out.printf("LUTANDO!, %s x %s", this.lutador1.getNome(), this.lutador2.getNome());
		}else {
			System.out.println("ESTA LUTA NÃO FOI APROVADA!");
		}
	}
}
