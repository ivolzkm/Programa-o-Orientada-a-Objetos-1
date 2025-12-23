package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int IDpedido;
    private String matriculaSolicitante;
    private Date dataPedido;
    private String categoria;
    private String descricaoPedido;
    private String predio;
    private String sala;
    private String patrimonio;

    public int getIDpedido() {
        return IDpedido;
    }

    public void setIDpedido(int iDpedido) {
        this.IDpedido = iDpedido;
    }

    public String getMatriculaSolicitante() {
        return matriculaSolicitante;
    }

    public void setMatriculaSolicitante(String matriculaSolicitante) {
        this.matriculaSolicitante = matriculaSolicitante;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public List<String> validaCampos() {
        List<String> vazios = new ArrayList<>();

        if (matriculaSolicitante == null || matriculaSolicitante.trim().isEmpty()) {
            vazios.add("Matrícula");
        }
        if (categoria == null || categoria.trim().isEmpty()) {
            vazios.add("Categoria");
        }
        if (descricaoPedido == null || descricaoPedido.trim().isEmpty()) {
            vazios.add("Descrição do Pedido");
        }
        if (predio == null || predio.trim().isEmpty()) {
            vazios.add("Prédio");
        }
        if (sala == null || sala.trim().isEmpty()) {
            vazios.