package fes.aragon.archivos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Salida extends ObjectOutputStream {

    public Salida(OutputStream out) throws IOException {
        super(out);
        // TODO Auto-generated constructor stub
    }

    public Salida() throws IOException {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void writeStreamHeader() throws IOException {

    }

}
