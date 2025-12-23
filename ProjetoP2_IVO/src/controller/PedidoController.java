package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import model.Pedido;
import view.SistemaDePedidosInternos;

public class PedidoController implements ActionListener{
	// O controle faz a ponte entre a visão e o modelo, conectando todos os pontos entre as duas classes. 
	
	SistemaDePedidosInternos sistemaPedidos = new SistemaDePedidosInternos();	
Pedido pedido = new Pedido();
	
	public Pedido PedidoController() {
		pedido.setMatriculaSolicitante(sistemaPedidos.getTextFieldMatricula().getText());
		pedido.setDataPedido(new Date());
		pedido.setCategoria();
		pedido.setDescricaoPedido(sistemaPedidos);
		pedido.setIDpedido(1);
		pedido.setPartrimonio(sistemaPedidos.getTextFieldPatrimonio().getText());
		pedido.setPredio(sistemaPedidos.getTextFieldPredio().getText());		
		pedido.setSala(sistemaPedidos.getTextFieldSala().getText());
		return pedido;		
		
		//
	}
	public void LimpaTela() {
		
		sistemaPedidos.setTextFieldMatricula(null);
		sistemaPedidos.setTextFieldNome(null);
		sistemaPedidos.setTextFieldPatrimonio(null);
		sistemaPedidos.setTextFieldPredio(null);
		sistemaPedidos.setTextFieldSala(null);
			
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	sistemaPedidos.btnConsultar //Adiciona o evento no botão consultar, gravando todos os itens.
		
		
	}

}
