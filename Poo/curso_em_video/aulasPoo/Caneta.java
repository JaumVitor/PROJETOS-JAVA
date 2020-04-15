package aulasPoo;

public class Caneta {
	String modelo; 
	String cor; 
	float ponta; 
	int carga; 
	boolean tampada; 
	
	void status () {
		System.out.println (this.modelo);
		System.out.println (this.cor);
		System.out.println (this.ponta);
		System.out.println (this.carga);
		System.out.println (this.tampada);
	}
	
	void rabiscar () {
		if (this.tampada == true) {
			System.out.println ("Não posso rabiscar");
		}else if (this.tampada == false){
			System.out.println ("Estou rabiscando");
		}
	}
	
	void tampar () {
		this.tampada = true; 
	}
	
	void destampar () {
		this.tampada = false; 
	}
	
}
