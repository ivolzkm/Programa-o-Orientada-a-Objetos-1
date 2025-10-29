package linkedList;

import java.util.LinkedList;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.add("E");
		lista.add("F");
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i));
			if(i<lista.size()-1) {
				System.out.print("-");
			}
		}
		
		
	}

}
