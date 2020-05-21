package heranca_animal;

public class Cachorro extends Mamifero{
        //Atributos: 
        protected String coleira;
        
        //Metodos:
        public void latir () {
	     System.out.println("Latindo, au au");
        }
        
        public void mijarNoPortao() {
	     System.out.println("Mijando no portao");
        }
        
        @Override
        public void comer() {
	     System.out.println("*Cachorro esta comendo!!!!");
        }
        
        @Override  //Estou sobreescrevendo o metodo da classe mamifero
        public void coisaDeMamifero() {
	     System.out.println("Cachorro fazendo coisa de mamifero");
        }
}
