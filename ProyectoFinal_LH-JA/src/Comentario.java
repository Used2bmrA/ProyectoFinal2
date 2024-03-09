
import java.io.Serializable;

class Comentario implements Serializable {
    private String comentario;

    
    private static final long SerialVersionUID = 777L;
    
    public Comentario(String comentario) {
        this.comentario = comentario;
    }
}
