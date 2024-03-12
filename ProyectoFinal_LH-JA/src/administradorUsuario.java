
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class administradorUsuario {
    
    private ArrayList<Usuario> usuarios = new ArrayList();
    private File archivo = null;

    public administradorUsuario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setPersona(Usuario persona) {
        this.usuarios.add(persona);
    }
    
    @Override
    public String toString() {
        return "administradorUsuario{" + "usuarios=" + usuarios + ", archivo=" + archivo + '}';
    }
    
    public void cargarArchivo() {
        try {
            usuarios = new ArrayList();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        usuarios.add(temp);
                    }
                } catch (EOFException e) {
                    //Final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            for (Usuario u : usuarios) {
                oos.writeObject(u);
            }
            oos.flush();
        } catch (Exception ex) {
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (Exception ex) {
            }
        }
    }

    
}

