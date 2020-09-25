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
public class Stock {
    
    public Stock(String ticker, String comName) {
        this.ticker = ticker;
        this.comName = comName;
    }

    public String getTicker() {
        return ticker;
    }

    public String getComName() {
        return comName;
    }
    
    private final String ticker;
    private final String comName;
}
