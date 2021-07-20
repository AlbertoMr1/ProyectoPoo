/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.modelo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import javax.swing.JPanel;

/**
 *
 * @author ACER
 */
public class Imagen extends JPanel {

    private Image imagen = null;
    private MediaTracker tracker;

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            try {
                tracker = new MediaTracker(this);
                tracker.addImage(imagen, 1);
                tracker.waitForAll();
                g.drawImage(imagen, 15, 20, this.getWidth() - 30, this.getHeight() - 30, null);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
