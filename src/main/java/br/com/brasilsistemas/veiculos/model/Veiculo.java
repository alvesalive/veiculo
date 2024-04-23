/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brasilsistemas.veiculos.model;

import java.math.BigDecimal;

/**
 *
 * @author alvesalive
 */
public class Veiculo {
    
    String modelo;
    int ano;
    BigDecimal preco;
    String cor;
    String marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + ", cor=" + cor + ", marca=" + marca + '}';
    }

    
    
    
    
}
