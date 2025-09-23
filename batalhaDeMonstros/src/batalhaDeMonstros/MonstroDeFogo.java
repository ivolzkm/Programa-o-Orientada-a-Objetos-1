// MonstroDeFogo.java
package batalhaDeMonstros;

public class MonstroDeFogo extends Monstro {
    public MonstroDeFogo(String nome, int pontosDeVida) {
        super(nome, "Fogo", pontosDeVida);
    }

    @Override
    public void atacar(Monstro monstroAlvo) {
        int danoTotal = 10;
        if (monstroAlvo.getTipo().equals("Planta")) {
            danoTotal += 5;
        }
        monstroAlvo.receberDano(danoTotal);
    }
}