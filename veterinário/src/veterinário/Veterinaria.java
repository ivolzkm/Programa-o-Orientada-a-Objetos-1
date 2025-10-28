package veterinário;

public class Veterinaria {

	public static void main(String[] args) {
	 for (int i = 0; i<10; i++) {
		 Animal animal;
		 if (Math.random()<0.5) {
			 animal = new Gato("Gato", i+1);
		 } else {
			 animal = new Cachorro("Cachorro", i+1);
		 }
		 System.out.println(animal.fazerBarulho());
	 }
		
		
	}

}
