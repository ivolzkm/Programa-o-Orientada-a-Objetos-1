package Atividades;

public class Aplicacao{ 

    public static void main(String[] args) {
        
        Caderno meuCaderno = new Caderno(19.90, true, "azul", 160);       
        System.out.println(meuCaderno.getPreco());
        System.out.println(meuCaderno.isCapaDura());
        System.out.println(meuCaderno.getCor());
        System.out.println(meuCaderno.getNumeroDeFolhas());
           
        Luminaria minhaLuminaria = new Luminaria(199.90, true, 40, "Branca");
    	System.out.println(minhaLuminaria.getPreco());
    	System.out.println(minhaLuminaria.isBluetooth());
    	System.out.println(minhaLuminaria.getTamanhoEmCM());
    	System.out.println(minhaLuminaria.getCor());
    	
    	Caneta minhaCaneta = new Caneta(1.99, 8, "Preta", true);
    	System.out.println(minhaCaneta.getPreco());
    	System.out.println(minhaCaneta.getTamanhoEmCM());
    	System.out.println(minhaCaneta.getCor());
    	System.out.println(minhaCaneta.isCanetaFina());
    
}
}
   