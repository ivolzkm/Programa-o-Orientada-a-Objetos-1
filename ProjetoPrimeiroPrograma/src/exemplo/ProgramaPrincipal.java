package exemplo;

public class ProgramaPrincipal
{

	public static void main(String[] args) 
	{
	/*	
		System.out.println("Olá Mundo!");
	*/
		
		Carro carro1 = new Carro("Vermelho", 2010);
		Carro carro2= new Carro("Branco", 2007);
		Carro carro3= new Carro("Azul", 2001);
		
		carro1.setCor("Ouro");
		
		System.out.println("A cor do carro 1 é : " + carro1.getCor());
		System.out.println("O ano do carro 1 é : " + carro1.getAno());
		System.out.println("A cor do carro 2 é : " + carro2.getCor());
		System.out.println("O ano do carro 2 é :" + carro2.getAno());
		System.out.println("A cor do carro 3 é : "+ carro3.getCor());
		

		
	}
	
}
