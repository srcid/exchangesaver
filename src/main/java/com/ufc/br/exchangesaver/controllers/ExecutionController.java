/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufc.br.exchangesaver.controllers;

import com.ufc.br.exchangesaver.models.Execution;
import com.ufc.br.exchangesaver.models.ExecutionTableModel;
import com.ufc.br.exchangesaver.models.OrderType;
import com.ufc.br.exchangesaver.models.Stock;
import java.util.Date;

/**
 *
 * @author alcid
 */
public class ExecutionController {

    public ExecutionController() {
        this.etm = new ExecutionTableModel();
    }
    
    public void add(String tickerStr, String typeStr, String valueStr, String qtdStr) throws Exception {
        
        if (tickerStr == null || typeStr == null || valueStr == null || qtdStr == null) {
            throw new Exception("null pointer on method add of ExecutionController");
        } else if (tickerStr.length() == 0 || typeStr.length() == 0 || valueStr.length() == 0 || qtdStr.length() == 0) {
            throw new Exception("Empty parameter on method add of ExecutionController");
        } else {
            StockController sc = new StockController();
            Stock stock = sc.findStock(tickerStr.toUpperCase());
            OrderType type = OrderType.valueOf(typeStr);
            float value = Float.parseFloat(valueStr);
            int qtd = Integer.parseInt(qtdStr);
            
            /**
             * verifica se stock não é nulo
             */
            
            if (stock == null) {
                throw new Exception("Ticker does not match with any Stock");
            }
            
            
            Execution e = new Execution(
                    stock,
                    type,
                    qtd,
                    value,
                    new Date() 
            );

            etm.addRow(e);
        }
    }
    
    public void rem(int rowIndex) throws Exception {
        
        if (rowIndex < 0) {
            throw new Exception("Invalid row index");
        } else {
            etm.remRow(rowIndex);
        }
    }
    
    public ExecutionTableModel getTableModel() {
        return etm;
    }

    private ExecutionTableModel etm;
    
}
