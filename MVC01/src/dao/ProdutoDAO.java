package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import model.Produto;

public class ProdutoDAO {
	private File arq;
	
	public ProdutoDAO(){
		arq = new File ("produtos.txt");
	}
	
	public double buscarPreco(Produto codigoProduto) throws IOException {
		try (FileReader fr = new FileReader(arq);
		BufferedReader br = new BufferedReader(fr)){
		String linha=null;
		while ((linha=br.readLine())!=null){
			String partes[] = linha.split("#");
			if (Integer.parseInt(partes[0].trim())==codigoProduto.getCodigoDoProduto()) {
				 String textoPreco = partes[2].trim();
				 return Double.parseDouble(textoPreco);
			}
		}
		} catch (Exception e) {
		e.printStackTrace();
		} 
		return -1.0;
	}
	}

