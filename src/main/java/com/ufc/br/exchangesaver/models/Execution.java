/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufc.br.exchangesaver.models;

import java.util.Date;

/**
 *
 * @author alcid
 */
public class Execution {

    public Execution(Stock stock, OrderType orderType, int qtd, float value, Date date) {
        this.stock = stock;
        this.orderType = orderType;
        this.qtd = qtd;
        this.value = value;
        this.date = date;
    }

    public Stock getStock() {
        return stock;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public int getQtd() {
        return qtd;
    }

    public float getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }

    private final Stock stock;
    private final OrderType orderType;
    private final int qtd;
    private final float value;
    private final Date date;

}
