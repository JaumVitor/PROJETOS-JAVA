package pacote;

public class TesteToString {
	public static void main (String[] args) {
		OtherClass2 obb = new OtherClass2(); //Instanciando um objeto da classe2, para usar o toString composto
		System.out.println(obb); //Printando a instacia da classe2
	}
}

//CLASSE NUMERO 1 -------------------- Onde vai usar o toString para receber a data
class OtherClass {
	int dia, mes, ano; 
	
	public OtherClass(int dia, int mes, int ano){
		this.dia = dia; 
		this.mes = mes; 
		this.ano = ano; 
	}
	
	@Override
	public String toString() {
		return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
	}
}

//CLASSE NUMERO 2 -------------------- Onde vai receber o toString para mandar a mensagem
class OtherClass2 {
	OtherClass dataNiver = new OtherClass(1,3,4444);  //Usando o toString localizado em outra classe 
	
	@Override
	public String toString() {
		return String.format("Data de aniversario: %s", dataNiver);
	}
}



