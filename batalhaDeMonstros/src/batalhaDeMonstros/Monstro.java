package batalhaDeMonstros;

public abstract class Monstro {
	private String nome, tipo;	
	private int pontosDeVida;
	public Monstro(String nome, String tipo, int pontosDeVida) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.pontosDeVida = pontosDeVida;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPontosDeVida() {
		return pontosDeVida;
	}
	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}
	public void receberDano(int dano){
		pontosDeVida-=dano;
		System.out.println(getNome() +" recebeu " + dano + " pontos de dano.");
	}
	public abstract void atacar(Monstro monstroAlvo);
}