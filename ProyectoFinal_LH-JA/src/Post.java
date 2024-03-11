
import java.io.Serializable;
import java.util.ArrayList;

class Post implements Serializable{
    private String poster;
    private int likes;
    private ArrayList<Comentario> comentarios = new ArrayList();

    
    private static final long SerialVersionUID = 555L;
    
    public Post(String poster, int likes) {
        this.poster = poster;
        this.likes = likes;
    }
    
    
}
