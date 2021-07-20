/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.informacion;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author ACER
 */
public class DatosGenerales implements Serializable{
    private String nombre;
    private String genero;
    private String autor;
    private int anio;
    private int numTomos;
    private int numCapitulos;
    private Opiniones opiniones;
    private ImageIcon imagen;

    public DatosGenerales() {
        opiniones = new Opiniones();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumTomos() {
        return numTomos;
    }

    public void setNumTomos(int numTomos) {
        this.numTomos = numTomos;
    }

    public int getNumCapitulos() {
        return numCapitulos;
    }

    public void setNumCapitulos(int numCapitulos) {
        this.numCapitulos = numCapitulos;
    }

    public Opiniones getOpiniones() {
        return opiniones;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
}
