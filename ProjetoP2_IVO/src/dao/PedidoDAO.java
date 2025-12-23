package dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.FilerException;
import javax.swing.JOptionPane;

import model.Pedido;

public class PedidoDAO {

	// O DAO (Data Access Object) possui como função mediar o acesso entre o
	// programa e os dados, selecionando os dados de escrita ou/e leitura.

	File arq = new File("pedidos.txt");

	// Lógica para a escrita no arquivo "pedidos.txt"
	public Pedido buscaPedido() {
		try(FileWriter fw = new FileWriter(arq);
				BufferedWriter bw = new BufferedWriter(fw);
				){
			String linhas[]= null;
			String[] partes; //Vetor Partes[]= linhas.split ("#");	
			
			//partes[0]=ID, partes[1]=matricula, partes [2] = nome , partes[3] = data ; partes [4] = categora; 
			//partes [5] = descricaopedido; partes[6]= predio ; partes[7] = sala; partes[8]=patrimonio
			
			while(bw!=null){
				//loop para a escrita de dados no arquivo.			
			}

			//Exceções
		} catch (FilerException e) {
			JOptionPane.showMessageDialog("Erro no registro.", e);
		} catch (IOException e1) {
			JOptionPane.showMessageDialog("Erro no registro.", e1);
		}catch (Exception e2) {
			JOptionPane.showMessageDialog("Erro no registro.", e2);
		}  {

		}
		return null;

	}
}
