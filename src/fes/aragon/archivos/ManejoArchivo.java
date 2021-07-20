package fes.aragon.archivos;

import fes.aragon.informacion.DatosGenerales;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


//import java.util.logging.Level;
//import java.util.logging.Logger;

public class ManejoArchivo{

    private File nombreArchivo;

    public ManejoArchivo(String ruta) throws FileNotFoundException, IOException {
        this.nombreArchivo = new File(ruta);
    }

    public void crear(Object objeto) throws FileNotFoundException, IOException {
        FileOutputStream fw;
        fw = new FileOutputStream(nombreArchivo, false);
        ObjectOutputStream os = new ObjectOutputStream(fw);
        os.writeObject(objeto);
        fw.close();
        os.close();

    }

    public void update(Object dato) throws IOException {
        FileOutputStream fw = new FileOutputStream(nombreArchivo, true);
        Salida so = new Salida(fw);
        so.writeObject(dato);
        so.reset();
        fw.close();
        so.close();
    }

    public ArrayList<Object> read() throws FileNotFoundException, ClassNotFoundException {
        ArrayList<Object> arreglo = new ArrayList<>();
        FileInputStream fo=null;
        ObjectInputStream ol=null;
        try {
            fo = new FileInputStream(nombreArchivo);
            ol = new ObjectInputStream(fo);
            Object aux = ol.readObject();
            while (aux != null) {
                if (aux instanceof DatosGenerales) {
                    arreglo.add(aux);                    
                }
                aux = ol.readObject();
            }
            ol.close();
            fo.close();
            
        } catch (Exception e) {
            try {
                // TODO: handle exception
                ol.close();
                fo.close();
                //System.out.println("Fin archivo");
            } catch (IOException ex) {
                
            }
        }
        return arreglo;
    }
    

}
