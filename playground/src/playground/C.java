package playground;

public class C {
	private final int x[];
	public C() {
		x = new int[10];
	}
	public void preenche() {
		for (int i = 0; i<10; i++) {
			x[i]= 10- i;
		}
	}
	public void imprime() {
		for ( int i=0;i<10;i++) {
			if (i%2 == 0) {
				System.out.println(x[i]+" ");
			}
		}
	}

}
