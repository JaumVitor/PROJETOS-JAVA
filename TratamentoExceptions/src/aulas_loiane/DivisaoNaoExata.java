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
		return "A divisão dos numeros " + numerador + " / " + denominador + " não é exata";
	}
}
