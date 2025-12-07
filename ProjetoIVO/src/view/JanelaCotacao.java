package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class JanelaCotacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDia;
	private JLabel labelMoeda;
	private JLabel lblDia;
	private JTextField textMoeda;
	private JLabel lblNewLabel_1;
	private JTextField textCotacao;
	private JButton btnConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaCotacao frame = new JanelaCotacao();
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
	public JanelaCotacao() {
		setTitle("Tela de Cotações");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new MigLayout("", "[grow]", "[][][][]"));
		
		lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Dialog", Font.PLAIN, 13));
		panel.add(lblDia, "cell 0 0,wrap");
		
		textDia = new JTextField();
		panel.add(textDia, "cell 0 1,growx");
		textDia.setColumns(10);
		
		labelMoeda = new JLabel("Moeda");
		labelMoeda.setFont(new Font("Dialog", Font.PLAIN, 13));
		panel.add(labelMoeda, "flowy,cell 0 2");
		
		textMoeda = new JTextField();
		panel.add(textMoeda, "cell 0 2,growx");
		textMoeda.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Cotação");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		panel.add(lblNewLabel_1, "cell 0 2");
		
		textCotacao = new JTextField();
		panel.add(textCotacao, "cell 0 3,growx");
		textCotacao.setColumns(10);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Dialog", Font.PLAIN, 13));
		panel_1.add(btnConsultar);

	}

}
