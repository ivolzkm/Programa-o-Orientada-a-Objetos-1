package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import dao.PedidoDAO;
import model.Pedido;
import view.SistemaDePedidosInternos;

public class PedidoController implements ActionListener {

    private SistemaDePedidosInternos sistemaPedidos;
    private PedidoDAO pedidoDAO;

    public PedidoController(SistemaDePedidosInternos sistemaPedidos) {
        this.sistemaPedidos = sistemaPedidos;
        this.pedidoDAO = new PedidoDAO();
    }

    public Pedido carregarPedidoDaTela() {
        Pedido pedido = new Pedido();
        pedido.setMatriculaSolicitante(sistemaPedidos.getTextFieldMatricula().getText());
        pedido.setDataPedido(new Date());
        pedido.setCategoria(sistemaPedidos.getComboBoxCategoria().getSelectedItem().toString());
        pedido.setDescricaoPedido(sistemaPedidos.getTextAreaDescricao().getText());
        pedido.setIDpedido((int) (Math.random() * 1000));
        pedido.setPatrimonio(sistemaPedidos.getTextFieldPatrimonio().getText());
        pedido.setPredio(sistemaPedidos.getTextFieldPredio().getText());
        pedido.setSala(sistemaPedidos.getTextFieldSala().getText());
        return pedido;
    }

    public void limpaTela() {
        sistemaPedidos.getTextFieldMatricula().setText("");
        sistemaPedidos.getTextFieldPatrimonio().setText("");
        sistemaPedidos.getTextFieldPredio().setText("");
        sistemaPedidos.getTextFieldSala().setText("");
        sistemaPedidos.getTextAreaDescricao().setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sistemaPedidos.getBtnSalvar()) {
            Pedido p = carregarPedidoDaTela();
            List<String> erros = p.validaCampos();

            if (erros.isEmpty()) {
                pedidoDAO.salvarPedido(p);
                JOptionPane.showMessageDialog(sistemaPedidos, "Pedido salvo com sucesso!");
                limpaTela();
            } else {
                JOptionPane.showMessageDialog(sistemaPedidos, "Preencha os campos: " + erros.toString());
            }
        }
        
        if (e.getSource() == sistemaPedidos.getBtnLimpar()) {
            limpaTela();
        }
    }
}