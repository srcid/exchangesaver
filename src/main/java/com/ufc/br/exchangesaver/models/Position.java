/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufc.br.exchangesaver.models;

/**
 *
 * @author alcid
 */
public class Position {
    
    public Position(Stock stock, int qtd) {
        this.stock = stock;
        this.qtd = qtd;
    }

    public Stock getStock() {
        return stock;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    private final Stock stock;
    private int qtd;
}
