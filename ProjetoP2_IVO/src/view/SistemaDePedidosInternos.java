package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;

public class SistemaDePedidosInternos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldMatricula;
	private JTextField textFieldNome;
	private JTextField textFieldPredio;
	private JTextField textFieldSala;
	private JTextField textFieldPatrimonio;

	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SistemaDePedidosInternos frame = new SistemaDePedidosInternos();
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
	
	
	
	public SistemaDePedidosInternos() {
		setResizable(false);
		setTitle("Sistema de Pedidos Internos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new MigLayout("", "[][grow][grow][][][grow]", "[][][]"));
		
		JLabel lblNewLabel = new JLabel("Matrícula:");
		panel.add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textFieldMatricula = new JTextField();
		panel.add(textFieldMatricula, "flowx,cell 1 0,growx");
		textFieldMatricula.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		panel.add(lblNewLabel_1, "cell 1 0");
		
		textFieldNome = new JTextField();
		panel.add(textFieldNome, "cell 2 0,growx");
		textFieldNome.setColumns(10);
		
		JLabel Categoria = new JLabel("Categoria");
		panel.add(Categoria, "flowx,cell 3 0");
		
		JComboBox comboBoxCategoria = new JComboBox();
		comboBoxCategoria.setModel(new DefaultComboBoxModel(new String[] {"", "Hardware", "Software"}));
		comboBoxCategoria.setToolTipText("");
		panel.add(comboBoxCategoria, "cell 3 0");
		
		JLabel lblPrédio = new JLabel("Prédio");
		panel.add(lblPrédio, "cell 4 0,alignx trailing");
		
		textFieldPredio = new JTextField();
		panel.add(textFieldPredio, "cell 5 0,growx");
		textFieldPredio.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Sala");
		panel.add(lblNewLabel_4, "cell 0 1,alignx trailing");
		
		textFieldSala = new JTextField();
		panel.add(textFieldSala, "flowx,cell 1 1,growx");
		textFieldSala.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Patrimônio CPU");
		panel.add(lblNewLabel_5, "cell 1 1");
		
		textFieldPatrimonio = new JTextField();
		panel.add(textFieldPatrimonio, "cell 2 1,growx");
		textFieldPatrimonio.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Descrição do Pedido:");
		panel.add(lblNewLabel_6, "cell 0 2");
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JButton btnRegistrarPI = new JButton("Registrar PI");
		btnRegistrarPI.setIcon(new ImageIcon(SistemaDePedidosInternos.class.getResource("/icons/salvar.png")));
		
		btnRegistrarPI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnRegistrarPI);
		
		JButton btnLimparTela = new JButton("Limpar Tela");
		btnLimparTela.setIcon(new ImageIcon(SistemaDePedidosInternos.class.getResource("/icons/limpar .png")));
		panel_1.add(btnLimparTela);
		
		JTextArea textAreaDescricao = new JTextArea();
		contentPane.add(textAreaDescricao, BorderLayout.CENTER);

	}

	public JTextField getTextFieldMatricula() {
		return textFieldMatricula;
	}
	public void setTextFieldMatricula(JTextField textFieldMatricula) {
		this.textFieldMatricula = textFieldMatricula;
	}

	public JTextField getTextFieldNome() {
		return textFieldNome;
	}

	public void setTextFieldNome(JTextField textFieldNome) {
		this.textFieldNome = textFieldNome;
	}

	public JTextField getTextFieldPredio() {
		return textFieldPredio;
	}

	public void setTextFieldPredio(JTextField textFieldPredio) {
		this.textFieldPredio = textFieldPredio;
	}

	public JTextField getTextFieldSala() {
		return textFieldSala;
	}

	public void setTextFieldSala(JTextField textFieldSala) {
		this.textFieldSala = textFieldSala;
	}

	public JTextField getTextFieldPatrimonio() {
		return textFieldPatrimonio;
	}

	public void setTextFieldPatrimonio(JTextField textFieldPatrimonio) {
		this.textFieldPatrimonio = textFieldPatrimonio;
	}

}
