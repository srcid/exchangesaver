/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufc.br.exchangesaver.models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alcid
 */
public class ExecutionTableModel extends AbstractTableModel {
    
    public ExecutionTableModel() {
        this.cols = Arrays.asList("Ticker", "Empresa", "Tipo", "Quantidade", "Valor", "Total", "data");
        this.data = new ArrayList<>();
        
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
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm:ss");
        
        switch (columnIndex) {
            case 0:
                return data.get(rowIndex).getStock().getTicker();
            case 1:
                return data.get(rowIndex).getStock().getComName();
            case 2:
                return data.get(rowIndex).getOrderType().getDesc();
            case 3:
                return data.get(rowIndex).getQtd();
            case 4:
                return data.get(rowIndex).getValue();
            case 5:
                return data.get(rowIndex).getQtd() * data.get(rowIndex).getValue();
            case 6:
                return format.format(data.get(rowIndex).getDate());
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return cols.get(columnIndex);
    }
    
    public void addRow(Execution e) {
        this.data.add(e);
        this.fireTableDataChanged();
    }
    
    public void remRow(int RowIndex) {
        this.data.remove(RowIndex);
        this.fireTableRowsDeleted(RowIndex, RowIndex);
    }
    
    private final List<Execution> data;
    private final List<String> cols;
}
