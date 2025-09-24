package caderno;

public class Caderno {
	private int id;
	private String nomeDono;
	private int numFolhas;
	private float preco;
	public Caderno(int id, String nomeDono, int numFolhas, float preco) {
		this.id = id;
		this.nomeDono = nomeDono;
		this.numFolhas = numFolhas;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
	public int getNumFolhas() {
		return numFolhas;
	}
	public void setNumFolhas(int numFolhas) {
		this.numFolhas = numFolhas;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "-----Caderno----- \n ID: " + id + "\nNome do Dono: " + nomeDono + "\nNúmero de Folhas: " + numFolhas + ", "
				+ "\nPreco :" + preco + "";
	}
	
	

}
