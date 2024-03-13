
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

public class Usuario implements Serializable {
    private String nombre, nickname, contrasenia, pais;
    private Date fechaNacimiento;
    private Icon fotografia;
    private ArrayList<Usuario> amigos = new ArrayList();
    private ArrayList<String> solicitudes = new ArrayList();
    private ArrayList<Publicacion> publicaciones = new ArrayList();
    
    private static final long serialVersionUID = 444L;

    public ArrayList<String> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<String> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public Icon getFotografia() {
        return fotografia;
    }

    public void setFotografia(Icon fotografía) {
        this.fotografia = fotografía;
    }

    public Usuario(String nombre, String nickname, String contrasenia, String pais, Date fechaNacimiento) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.contrasenia = contrasenia;
        this.pais = pais;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    @Override
    public String toString() {
        return "Ususario{" + "nombre=" + nombre + ", nickname=" + nickname + ", contrasenia=" + contrasenia + ", pais=" + pais + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
