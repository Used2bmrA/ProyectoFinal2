
import java.util.ArrayList;

class Post {
    private String poster;
    private int likes;
    private ArrayList<Comentario> comentarios = new ArrayList();

    public Post(String poster, int likes) {
        this.poster = poster;
        this.likes = likes;
    }
    
    
}
