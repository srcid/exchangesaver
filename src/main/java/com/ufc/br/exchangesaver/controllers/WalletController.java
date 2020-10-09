/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufc.br.exchangesaver.controllers;

import com.ufc.br.exchangesaver.models.Position;
import com.ufc.br.exchangesaver.models.Stock;
import com.ufc.br.exchangesaver.models.WalletTableModel;

/**
 *
 * @author alcid
 */
public class WalletController {

    public WalletController() {
        this.wtm = new WalletTableModel();
    }
    
    public WalletTableModel getTableModel() {
        return wtm;
    }
    
    public void addPos(String tickerStr, String qtdStr) throws Exception {
        
        if (tickerStr == null || qtdStr == null) {
            throw new NullPointerException("Null pointer at addPos method of WalletController");
        } else if (tickerStr.length() <= 0 || qtdStr.length() <= 0) {
            throw new Exception("Empty parameter at addPos method of WalletController");
        } else {
            StockController sc = StockController.getInstance();
            Stock stock = sc.findStock(tickerStr.toUpperCase());
            int qtd = Integer.parseInt(qtdStr);
            
            /**
             * verifica se stock não é nulo
             */
            
            if (stock == null) {
                throw new Exception("Ticker does not match with any Stock");
            }
            
            wtm.addRow(new Position(stock, qtd));
            
        }
        
    }
    
    public void remPos(int rowIndex) throws Exception {
        
        if (rowIndex < 0) {
            throw new Exception("No line select at remPos of WalletController");
        }
        
        wtm.remRow(rowIndex);
    }
    
    private WalletTableModel wtm;
}
