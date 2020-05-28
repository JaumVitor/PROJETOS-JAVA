package heranca_animal;

public class Mamifero extends Animal{
        public void coisaDeMamifero() {
	     System.out.println("Fazendo coisa de mamifero");
        }

        @Override
        public void todoAnimalImplementa() {
            System.out.println("Mamifero implementando");
        }
}
