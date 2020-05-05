package exercicio;
//Classe responsavel por alertar se a luta pode ocorrer ou não entre os lutadores
//Se os lutadores forem iguas, a exception será disparada...com a mesagem do toString()
@SuppressWarnings("serial")
public class LutaNaoAceita extends Exception{
	private Lutadores lutador1; 
	private Lutadores lutador2; 
	
	public LutaNaoAceita(Lutadores lutador1, Lutadores lutador2) {
		super(); 
		this.lutador1 = lutador1; 
		this.lutador2 = lutador2; 
	}
	
	@Override
	public String toString () {
		return String.format("NAO FOI POSSIVEL REALIZAR A LUTA ENTRE: %s VS %s", this.lutador1, this.lutador2);
	}
}
