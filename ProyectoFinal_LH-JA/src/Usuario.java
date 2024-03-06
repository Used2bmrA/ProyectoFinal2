
import java.io.Serializable;
import java.util.Date;
import javax.swing.Icon;

public class Usuario implements Serializable {
    private String nombre, nickname, contrasenia, pais;
    private Date fechaNacimiento;
    private Icon fotografía; 
    
    private static final long SerialVersionUID = 777L;

    public Icon getFotografía() {
        return fotografía;
    }

    public void setFotografía(Icon fotografía) {
        this.fotografía = fotografía;
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
