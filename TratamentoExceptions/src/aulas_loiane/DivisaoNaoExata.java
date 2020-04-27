package aulas_loiane;

@SuppressWarnings("serial")
public class DivisaoNaoExata extends Exception{
	private int numerador; 
	private int denominador;
	
	public DivisaoNaoExata(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	} 
	
	@Override
	public String toString () {
		return "A divis�o dos numeros " + numerador + " / " + denominador + " n�o � exata";
	}
}
