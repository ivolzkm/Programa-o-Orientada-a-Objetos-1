package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ProdutoController;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JanelaCaixa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textFieldCodigodoProduto;
	public JTextField textFieldQuantidade;
	public JTextField textFieldTotal;
	private JButton btnCalcular;
	

	public JTextField getTextFieldTotal() {
		return textFieldTotal;
	}

	public void setTextFieldTotal(JTextField textFieldTotal) {
		this.textFieldTotal = textFieldTotal;
	}

	public JTextField getTextFieldCodigodoProduto() {
		return textFieldCodigodoProduto;
	}

	public void setTextFieldCodigodoProduto(JTextField textFieldCodigodoProduto) {
		this.textFieldCodigodoProduto = textFieldCodigodoProduto;
	}

	public JTextField getTextFieldQuantidade() {
		return textFieldQuantidade;
	}

	public void setTextFieldQuantidade(JTextField textFieldQuantidade) {
		this.textFieldQuantidade = textFieldQuantidade;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCaixa frame = new JanelaCaixa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaCaixa() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[][][][][][][][][]"));
		
		JLabel lblCodigodoProduto = new JLabel("Código do Produto");
		contentPane.add(lblCodigodoProduto, "cell 0 0");
		
		textFieldCodigodoProduto = new JTextField();
		contentPane.add(textFieldCodigodoProduto, "cell 0 1,growx");
		textFieldCodigodoProduto.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		contentPane.add(lblQuantidade, "cell 0 2");
		
		textFieldQuantidade = new JTextField();
		contentPane.add(textFieldQuantidade, "cell 0 3,growx");
		textFieldQuantidade.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total a Pagar");
		contentPane.add(lblTotal, "cell 0 4");
		
		textFieldTotal = new JTextField();
		contentPane.add(textFieldTotal, "cell 0 5,growx");
		textFieldTotal.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		contentPane.add(btnCalcular, "cell 0 8");
		
		ProdutoController ctrl = new ProdutoController(this);
		btnCalcular.addActionListener(ctrl);

	}

}
