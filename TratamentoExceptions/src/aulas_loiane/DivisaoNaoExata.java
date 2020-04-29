package aulas_loiane;

@SuppressWarnings("serial")  //Para retirar o warning da classe
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
		//Este toString serve para printar a mesagem, quando a exception for disparada
		return "A divisão dos numeros " + numerador + " / " + denominador + " não é exata";
	}
}
