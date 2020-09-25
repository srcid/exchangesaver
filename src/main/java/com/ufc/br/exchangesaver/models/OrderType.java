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
public enum OrderType {
    
    SELL ("Selling order"),
    BUY ("Buying order");
    
    private final String desc;
    
    private OrderType(String desc) {
        this.desc = desc;
    }
    
    public String getDesc() {
        return desc;
    }
}
