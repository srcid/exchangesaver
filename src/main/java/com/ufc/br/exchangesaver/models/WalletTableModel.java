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
public class WalletTableModel extends AbstractTableModel {
    
    public WalletTableModel() {
        this.data = new ArrayList<>();
        this.cols = Arrays.asList("Ticker", "Empresa", "Quantidade");
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
                return data.get(rowIndex).getStock().getTicker();
            case 1:
                return data.get(rowIndex).getStock().getComName();
            case 2:
                return data.get(rowIndex).getQtd();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return cols.get(column);
    }
    
    public void addRow(Position p) {
        this.data.add(p);
        this.fireTableDataChanged();
    }
    
    public void remRow(int rowIndex) {
        this.data.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    private final List<Position> data;
    private final List<String> cols;
}
