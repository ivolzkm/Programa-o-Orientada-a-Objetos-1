package playground;

public abstract class F {
	private int v[];
	public void resolve() {
		v = new int[6];
		v[0]=1;
		v[1]=1;
		for (int i = 2; i<6; i++) {
			v[i]=v[i-1]+v[i-2];
		}
		System.out.println(v[5]);
	}
}
