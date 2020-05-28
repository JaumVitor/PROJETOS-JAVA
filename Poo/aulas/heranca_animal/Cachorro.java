package heranca_animal;

public class Cachorro extends Mamifero{
        //Atributos: 
        protected String coleira;
        
        @Override
        public void todoAnimalHerda() { //Sobreescrevendo metodo herdado (tem a mesma assinatura)
            System.out.println("* Cachorro herdando metodo");
        }
        
        public void todoAnimalHerda(int num) { // Sobrecarregando metodo herdado (Tem assinaturas diferentes)
            System.out.printf("*%d Cachorro herdando metodo", num);
        }

        @Override
        public void todoAnimalImplementa(){ //Sobreescrevendo implementacao
            System.out.println("** Cachorro Implementando");   
        }

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
