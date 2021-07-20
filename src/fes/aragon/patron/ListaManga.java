/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.patron;

import fes.aragon.informacion.DatosGenerales;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class ListaManga implements Serializable{
    private static ListaManga lista;
    private ArrayList<DatosGenerales> listaMangas;

    private ListaManga() {
        listaMangas = new ArrayList<>();
    }

    public static ListaManga getListaManga(){
        if(lista == null){
            lista = new ListaManga();
        }
        return lista;
    }
    
    public ArrayList<DatosGenerales> getElementos(){
        return listaMangas;
    }

    public void setListaMangas(ArrayList<DatosGenerales> listaMangas) {
        this.listaMangas = listaMangas;
    }
}
