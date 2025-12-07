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
		try (
				FileReader fr = new FileReader(arq);
				BufferedReader br = new BufferedReader(fr)
				) {

			String linha;
			while ((linha = br.readLine()) != null) {

				String[] partes = linha.split("#");

				if (Integer.parseInt(partes[0]) == cotacaoAlvo.getDia()) {
					String moedaBuscada = cotacaoAlvo.getMoeda();

					//dolar
					if (moedaBuscada.equals("dolar")) {
						return Double.parseDouble(partes[2].replace(",", "."));

						//euro
					} else if (moedaBuscada.equals("euro")) {
						return Double.parseDouble(partes[4].replace(",", "."));
					}

				}
				}}
			catch (Exception e) {
				e.printStackTrace();
			}
		return 0.0;

		}
}

	

