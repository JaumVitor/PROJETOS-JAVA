package exercicio;

public class Combate {
	//ATRIBUTOS
	private Lutadores lutador1;
	private Lutadores lutador2; 
	//private int rouds; 
	protected boolean statusLuta; 

	public Combate (Lutadores lutador1, Lutadores lutador2) {
		this.lutador1 = lutador1; 
		this.lutador2 = lutador2; 
		this.statusLuta = false; 
	}
	
	//METODOS DA CLASSE
	public void marcarLuta () {	
		//Metodo chamado antes da luta, e é responsavel por validar se a luta vai ocorrer ou não
		if (lutador1.equals(lutador2) == false && lutador1.getCategoria() == lutador2.getCategoria()) { 
			this.statusLuta = true; 
		}
	}
	
	public void lutar () {
		if (statusLuta) {
			System.out.println(this);
		}else {
			System.out.println("ESTA LUTA NÃO FOI APROVADA!");
		}
	}
	
	//SOBREESCREVENDO METODOS
	public String toString () {
		System.out.println("----------A SERÁ ENTRE OS LUTADORES----------");
		return String.format("%s VS %s", this.lutador1, this.lutador2);
	}
}



