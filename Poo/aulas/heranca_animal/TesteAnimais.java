package heranca_animal;

public class TesteAnimais {
        public static void main(String[] args) {
	     //Criando variavel do tipo animal, e instancia Animal:
	     Animal animal = new Animal();
	     animal.comer(); //usando metodo que todo animal tem
	     animal.fazerBarulho();
	     animal.setIdade(10);
	     animal.setNome("Animalzera");

	     //Posso criar qualquer tipo de intancia que herde Animal: 
	     Animal cachorro = new Cachorro ();
	     cachorro.comer();
	     cachorro.fazerBarulho();
	     //cachorro.latir();   Não funciona, pois este cachorro é do tipo animal e não pode acessar os metodos da classe cachorro
	     
	     //Outra forma de instanciar cachorro, mas agora ele pode acessar os atributos de cachorro:
	     Cachorro cachorro2 = new Cachorro();
	     cachorro2.comer();
	     cachorro2.latir();
	     cachorro2.mijarNoPortao();
	     cachorro2.coleira= "fdsfsdf";
	     cachorro2.coisaDeMamifero();
	     
	     //Posso fazer um casting em na variavel cachorro e usa-la: 
	     ((Cachorro) cachorro).coleira = "fjsdfjhdf"; 
	     
	     Cachorro convert = (Cachorro) cachorro;
	     convert.coleira = "fdskjfd"; //Posso usar metodos que não podia antes, por ser um animal
	     
        }
}
