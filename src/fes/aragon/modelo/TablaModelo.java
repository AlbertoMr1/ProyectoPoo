/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import fes.aragon.informacion.DatosGenerales;
import fes.aragon.patron.ListaManga;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ACER
 */
public class TablaModelo extends AbstractTableModel {

    private ArrayList<DatosGenerales> lista = new ArrayList<>();
    private String[] nombresColumna = {"Nombre", "Genero" , "Autor"};

    public TablaModelo() {
        lista = ListaManga.getListaManga().getElementos();
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return nombresColumna.length;
    }

    @Override
    public String getColumnName(int column) {
        return nombresColumna[column];
    }

    public ArrayList<DatosGenerales> getLista() {
        return lista;
    }

    public void setLista(ArrayList<DatosGenerales> lista) {
        this.lista = lista;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String tmp = "";
        if (columnIndex == 0) {
            tmp = lista.get(rowIndex).getNombre();
        } else if (columnIndex == 1) {
            tmp = lista.get(rowIndex).getGenero();
        } else if (columnIndex == 2){
            tmp = lista.get(rowIndex).getAutor();
        }
        return tmp;
    }

}
