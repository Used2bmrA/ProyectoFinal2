
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

class Publicacion implements Serializable{
    private String publicador;
    private String comentario;
    private int likes;
    private ArrayList<Publicacion> comentarios = new ArrayList();
    private Icon imagen;
//    private Video video;
    private Date fechaPublicacion = new Date();
//    private int llave;
//    private Video videos = new ArrayList(); Dirección para un video
//    private ArrayList<String> fotos = new ArrayList(); Dirección para fotos

    
    private static final long SerialVersionUID = 555L;

    public Publicacion(String publicador, String comentario) {
        this.publicador = publicador;
        this.comentario = comentario;
        Date fechaPublicacion = new Date();
        likes = 0;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getPublicador() {
        return publicador;
    }

    public void setPublicador(String publicador) {
        this.publicador = publicador;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Publicacion> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Publicacion> comentarios) {
        this.comentarios = comentarios;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    public Date getFechaPublicacion() {
        DateFormat formato = new SimpleDateFormat("hh:mm");
        formato.format(fechaPublicacion);
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    

    
    
    
}
