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
		if (lutador1.equals(lutador2) == false) { 
			//Novo metodo equals só retorna falso quando todos os atributos são diferentes
			//Caso tenha um atributo igual, ele vai pra outra condição....Se todas forem iguais ele retorna true
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
				//Se não for disparada a exception, vai exibir os lutadores
				System.err.println(this.toString());
			}
		}catch (LutaNaoAceita exception) {
			System.err.println(exception.toString());
		}
	}
	
	//SOBREESCREVENDO METODOS
	public String toString () {
		System.out.println("----------A SERÁ ENTRE OS LUTADORES----------");
		return String.format("%s VS %s", this.lutador1, this.lutador2);
	}
}



