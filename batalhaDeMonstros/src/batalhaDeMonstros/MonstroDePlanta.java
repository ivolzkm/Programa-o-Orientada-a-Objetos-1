// MonstroDePlanta.java
package batalhaDeMonstros;

public class MonstroDePlanta extends Monstro {
    public MonstroDePlanta(String nome, int pontosDeVida) {
        super(nome, "Planta", pontosDeVida);
    }

    @Override
    public void atacar(Monstro monstroAlvo) {
        int danoTotal = 10;
        if (monstroAlvo.getTipo().equals("Água")) {
            danoTotal += 5;
        }
        monstroAlvo.receberDano(danoTotal);
    }
}