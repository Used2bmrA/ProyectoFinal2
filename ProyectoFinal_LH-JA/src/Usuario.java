
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JDialog;

public class Usuario implements Serializable {
    private String nombre, nickname, contrasenia, pais;
    private Date fechaNacimiento;
    private transient Icon fotografía;
    private ArrayList<Usuario> amigos = new ArrayList();
//    private ArrayList<String> fotos = new ArrayList(); 
//    private ArrayList<String> amigos = new ArrayList(); Incluida la ruta de las fotos de tus amigos
    private ArrayList<Post> posts = new ArrayList();
    private JDialog personal, principal;
    
    private static final long serialVersionUID = 4636744672262166683L;

    
    public Usuario(){
        principal = new JDialog();
        principal.setTitle("Muro Principal");
        principal.setSize(700,700);
        principal.setLocationRelativeTo(null);
        principal.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public JDialog getPersonal() {
        return personal;
    }

    public void setPersonal(JDialog personal) {
        this.personal = personal;
    }

    public JDialog getPrincipal() {
        return principal;
    }

    public void setPrincipal(JDialog principal) {
        this.principal = principal;
    }

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
    
    public void desplegarDialogs(){
        principal.setVisible(true);
        
        
    }
    
    @Override
    public String toString() {
        return "Ususario{" + "nombre=" + nombre + ", nickname=" + nickname + ", contrasenia=" + contrasenia + ", pais=" + pais + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
