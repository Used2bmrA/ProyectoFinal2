
import java.io.Serializable;

class Comentario implements Serializable {
    private String comentario;

    
    private static final long SerialVersionUID = 444L;
    
    public Comentario(String comentario) {
        this.comentario = comentario;
    }
}
