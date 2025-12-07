package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import dao.ProdutoDAO;
import model.Produto;
import view.JanelaCaixa;

public class ProdutoController implements ActionListener{
	
	private JanelaCaixa view;
	public ProdutoController(JanelaCaixa view) {
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String textoCodigo = view.getTextFieldCodigodoProduto().getText();
		String textoQuantidade = view.getTextFieldQuantidade().getText();
		
		if(textoCodigo.isEmpty()) {
			JOptionPane.showMessageDialog(view, "Digite o código do produto.");
			return;
		}
		if (textoQuantidade.isEmpty()) {
			JOptionPane.showMessageDialog(view, "Digite a quantidade do produto.");
			return;
		}
		try {
		int codigo = Integer.parseInt(textoCodigo);
		int quantidade = Integer.parseInt(textoQuantidade);
		Produto prod = new Produto();
		prod.setCodigoDoProduto(codigo);
		ProdutoDAO dao = new ProdutoDAO();
		double precoUnitario = dao.buscarPreco(prod);
		if (precoUnitario==-1.0) {
			JOptionPane.showMessageDialog(view, "Não foi possível achar o produto.");
		} else {
			double total = quantidade * precoUnitario;
			view.getTextFieldTotal().setText(String.format("%.2f", total));			
		} } catch(NumberFormatException e2) {
			JOptionPane.showMessageDialog(view, "Digite um número.");
			
		}
				catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		
	}

	
	
	
	
	
}
