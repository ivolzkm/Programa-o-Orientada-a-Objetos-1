// MonstroDeAgua.java
package batalhaDeMonstros;

public class MonstroDeAgua extends Monstro {
    public MonstroDeAgua(String nome, int pontosDeVida) {
        super(nome, "Água", pontosDeVida);
    }

    @Override
    public void atacar(Monstro monstroAlvo) {
        int danoTotal = 10;
        if (monstroAlvo.getTipo().equals("Fogo")) {
            danoTotal += 5;
        }
        monstroAlvo.receberDano(danoTotal);
    }
}