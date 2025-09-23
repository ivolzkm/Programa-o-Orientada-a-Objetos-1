package batalhaDeMonstros;

public class ArenaDeBatalha {

    public void iniciarBatalha(Monstro monstro1, Monstro monstro2) {
        System.out.println("--- INÍCIO DA BATALHA! ---");
        System.out.println(monstro1.getNome() + " vs " + monstro2.getNome());
        System.out.println("---------------------------");

        while (monstro1.getPontosDeVida() > 0 && monstro2.getPontosDeVida() > 0) {
            monstro1.atacar(monstro2);
            if (monstro2.getPontosDeVida() > 0) {
                monstro2.atacar(monstro1);
            }
        }
        
        System.out.println("---------------------------");
        if (monstro1.getPontosDeVida() <= 0) {
            System.out.println("O vencedor é " + monstro2.getNome() + "!");
        } else {
            System.out.println("O vencedor é " + monstro1.getNome() + "!");
        }
    }

    public static void main(String[] args) {
        MonstroDeAgua water = new MonstroDeAgua("Walter", 100);
        MonstroDeFogo fire = new MonstroDeFogo("Fernanda", 100);
        MonstroDePlanta plant = new MonstroDePlanta("Paulo", 100);

        ArenaDeBatalha arena = new ArenaDeBatalha();
        
        arena.iniciarBatalha(water, fire);
    }
}