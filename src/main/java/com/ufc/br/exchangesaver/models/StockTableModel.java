/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufc.br.exchangesaver.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alcid
 */
public class StockTableModel extends AbstractTableModel {
    
    public StockTableModel() {
        this.data = new ArrayList<>();
        this.cols = Arrays.asList("Ticker", "Empresa");
    }
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return cols.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch (columnIndex) {
            case 0:
                return data.get(rowIndex).getTicker();
            case 1:
                return data.get(rowIndex).getComName();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return cols.get(columnIndex);
    }
    
    public void addRow(Stock s) {
        this.data.add(s);
        this.fireTableDataChanged();
    }
    
    public void remRow(int rowIndex) {
        this.data.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    public Stock getFirstRow(int columnIndex, String match) {
        
        switch (columnIndex) {
            case 0:
                for (Stock s : data) {
                    if (match.equals(s.getTicker())) {
                        return s;
                    }
                }
            case 1:
                for (Stock s : data) {
                    if (match.equals(s.getComName())) {
                        return s;
                    }
                }
            default:
                return null;
        }
    }
    
    private final List<Stock> data;
    private final List<String> cols;
}
