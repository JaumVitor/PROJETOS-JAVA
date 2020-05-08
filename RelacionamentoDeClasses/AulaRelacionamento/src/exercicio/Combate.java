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
		//Metodo chamado antes da luta, e � responsavel por validar se a luta vai ocorrer ou n�o
		if (lutador1.equals(lutador2) == false) { 
			//Novo metodo equals s� retorna falso quando todos os atributos s�o diferentes
			//Caso tenha um atributo igual, ele vai pra outra condi��o....Se todas forem iguais ele retorna true
			this.statusLuta = true; 
		}
	}
	
	public void lutar () {
		//Usando metodo que eu criei para exibir uma mensagem, caso os lutadors sejam iguais
		try { 
			if (statusLuta != true) {
				//Dispara a exception, e sera usada no catch
				throw new LutaNaoAceita (this.lutador1, this.lutador2); 
			}else {
				//Se n�o for disparada a exception, vai exibir os lutadores
				analiseAtributos (); 
				System.err.println(this.toString());
				
			}
		}catch (LutaNaoAceita exception) {
			System.err.println(exception.getMessage());
		}
	}
	
	public void analiseAtributos () {
		//Responsavel pela analise dos lutadores, pra ver quem tem mais vantagem na luta
			//EXPERICIA: 
		System.out.println("Analisando os atributos dos lutadores");
		if (this.lutador1.getStatusLutador().getVariacao() > this.lutador2.getStatusLutador().getVariacao()) {
			System.out.println("Lutador 1 tem mais experiencia");
			lutador1.setaExp(lutador1.getaExp() + 1);
			
		}else if (this.lutador2.getStatusLutador().getVariacao() > this.lutador1.getStatusLutador().getVariacao()){
			System.out.println("Lutador 2 tem mais experiencia");
			lutador2.setaExp(lutador2.getaExp() + 1);
			
		}else {
			System.out.println("Nenhum dos lutadores tem vantagem de experiencia");
		}
		
			//MOBILIDADE: 
		if (this.lutador1.getAltura() < this.lutador2.getAltura()) {
			System.out.println("Lutador 1 tem mais MOBILIDADE");
		}else if (this.lutador2.getAltura() < this.lutador1.getAltura()) {
			System.out.println("Lutador 2 tem mais MOBILIDADE");
		}else {
			System.out.println("Nenhum dos lutadores tem MOBILIDADE");
		}
		
			//FOR�A: 
		if (this.lutador1.getPeso() > this.lutador2.getPeso()) {
			System.out.println("Lutador 1 tem mais FOR�A");
		}else if (this.lutador2.getPeso() > this.lutador1.getPeso()) {
			System.out.println("Lutador 2 tem mais FOR�A");
		}else {
			System.out.println("Nenhum dos lutadores tem mais for�a");
		}
	}
	
	//SOBREESCREVENDO METODOS
	public String toString () {
		System.out.println("----------A SER� ENTRE OS LUTADORES----------");
		return String.format("%s VS %s", this.lutador1, this.lutador2);
	}
}



