package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import dao.CotacaoDAO;
import model.Cotacao;
import view.JanelaCotacao;

public class CotacaoController implements ActionListener {
	private JanelaCotacao view;

	public CotacaoController(JanelaCotacao view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String diaTexto = view.getTextDia().getText();
		String moedaTexto = view.getTextMoeda().getText();

		Cotacao cotacao = new Cotacao();
		List<String> erros = cotacao.validarCampos(diaTexto, moedaTexto);

		if (!erros.isEmpty()) {
			JOptionPane.showMessageDialog(view, "Campos em Branco: " + erros.toString());
			return;
		}
		try {
			int dia = Integer.parseInt(diaTexto);

			cotacao.setDia(dia);
			cotacao.setMoeda(moedaTexto);
			CotacaoDAO dao = new CotacaoDAO();
			double resultado = dao.buscarCotacao(cotacao);

			if (resultado == 0.0) {
				JOptionPane.showMessageDialog(view, "Cotação não encontrada.");
			} else {
				view.getTextCotacao().setText(String.valueOf(resultado));
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(view, "Digite um número para o dia.");
		}

	}

}
