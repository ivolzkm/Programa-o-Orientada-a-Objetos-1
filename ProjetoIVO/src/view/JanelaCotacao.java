package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import controller.CotacaoController;
import net.miginfocom.swing.MigLayout;

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

    // Getters
    public JTextField getTextDia() { return textDia; }
    public void setTextDia(JTextField textDia) { this.textDia = textDia; }
    public JTextField getTextMoeda() { return textMoeda; }
    public void setTextMoeda(JTextField textMoeda) { this.textMoeda = textMoeda; }
    public JTextField getTextCotacao() { return textCotacao; }
    public void setTextCotacao(JTextField textCotacao) { this.textCotacao = textCotacao; }

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
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        contentPane.add(panel, BorderLayout.NORTH);
        panel.setLayout(new MigLayout("", "[grow]", "[][][][][][]")); 
        
        Font fontLabels = new Font("Segoe UI", Font.BOLD, 13);
        
        lblDia = new JLabel("Dia");
        lblDia.setFont(fontLabels);
        panel.add(lblDia, "cell 0 0, wrap"); 
        
        textDia = new JTextField();
        textDia.setFont(fontLabels); 
        panel.add(textDia, "cell 0 1, growx, wrap");
        textDia.setColumns(10);
        
        labelMoeda = new JLabel("Moeda");
        labelMoeda.setFont(fontLabels);
        panel.add(labelMoeda, "cell 0 2, wrap"); 
        
        textMoeda = new JTextField();
        textMoeda.setFont(fontLabels);
        panel.add(textMoeda, "cell 0 3, growx, wrap");
        textMoeda.setColumns(10);
        
        lblNewLabel_1 = new JLabel("Cotação");
        lblNewLabel_1.setFont(fontLabels);
        panel.add(lblNewLabel_1, "cell 0 4, wrap"); 
        
        textCotacao = new JTextField();
        textCotacao.setFont(fontLabels);
        panel.add(textCotacao, "cell 0 5, growx");
        textCotacao.setColumns(10);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED));  
        contentPane.add(panel_1, BorderLayout.SOUTH);
        panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5)); 
        
        btnConsultar = new JButton("Consultar");
        btnConsultar.setFont(new Font("Segoe UI", Font.PLAIN, 13)); 
        panel_1.add(btnConsultar);
        
        CotacaoController controller = new CotacaoController(this);
        btnConsultar.addActionListener(controller); 
    }
}