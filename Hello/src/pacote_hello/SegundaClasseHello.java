package pacote_hello;

public class SegundaClasseHello {
	private int num;
	private int add; 
	
	//Contrutor da classe
	public SegundaClasseHello(int num){
		this.num = num; 
	}
	
	public void getNum () {
		System.out.printf ("O numero é --> %d", this.num); 
	}
}
