package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pedido;

public class PedidoDAO {

    private File arq = new File("pedidos.txt");
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void salvarPedido(Pedido p) {
        try (FileWriter fw = new FileWriter(arq, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            
            String linha = p.getIDpedido() + "#" +
                           p.getMatriculaSolicitante() + "#" +
                           sdf.format(p.getDataPedido()) + "#" +
                           p.getCategoria() + "#" +
                           p.getDescricaoPedido() + "#" +
                           p.getPredio() + "#" +
                           p.getSala() + "#" +
                           p.getPatrimonio();
            
            bw.write(linha);
            bw.newLine();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e.getMessage());
        }
    }

    public List<Pedido> listarTodos() {
        List<Pedido> lista = new ArrayList<>();
        if (!arq.exists()) return lista;

        try (FileReader fr = new FileReader(arq);
             BufferedReader br = new BufferedReader(fr)) {
            
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split("#");
                Pedido p = new Pedido();
                p.setIDpedido(Integer.parseInt(partes[0]));
                p.setMatriculaSolicitante(partes[1]);
                p.setDataPedido(sdf.parse(partes[2]));
                p.setCategoria(partes[3]);
                p.setDescricaoPedido(partes[4]);
                p.setPredio(partes[5]);
                p.setSala(partes[6]);
                p.setPatrimonio(partes[7]);
                lista.add(p);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + e.getMessage());
        }
        return lista;
    }
}