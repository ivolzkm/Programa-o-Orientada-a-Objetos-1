package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import model.Cotacao;

public class CotacaoDAO {

	private File arq;

	public CotacaoDAO() {
		arq = new File("cotacoes.txt");
	}

	public double buscarCotacao(Cotacao cotacaoAlvo) {
		try (FileReader fr = new FileReader(arq); BufferedReader br = new BufferedReader(fr)) {

			String linha;
			while ((linha = br.readLine()) != null) {

				String[] partes = linha.split("#");

				if (Integer.parseInt(partes[0].trim()) == cotacaoAlvo.getDia()) {
					String moedaBuscada = cotacaoAlvo.getMoeda().trim();

					// retornar o valor do dolar, substituindo "," por "." e retornando um double.
					if (moedaBuscada.equalsIgnoreCase("dolar")) {
						return Double.parseDouble(partes[2].replace(",", "."));

						// retornar o valor do euro, substiutindo "," por "." e retornando um double.
					} else if (moedaBuscada.equalsIgnoreCase("euro")) {
						return Double.parseDouble(partes[4].replace(",", "."));
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0.0;

	}
}
