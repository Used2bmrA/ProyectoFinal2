
import java.io.Serializable;
import java.util.Date;


public class Actividad implements Serializable {
    
    private Date fecha;
    private String titulo;
    private Date recordatorioMinutos;

    private static final long serialVersionUID = 4454L;
    
    
    public Actividad(Date fecha, String titulo, Date recordatorioMinutos) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.recordatorioMinutos = recordatorioMinutos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getRecordatorioMinutos() {
        return recordatorioMinutos;
    }

    public void setRecordatorioMinutos(Date recordatorioMinutos) {
        this.recordatorioMinutos = recordatorioMinutos;
    }

    @Override
    public String toString() {
        return titulo;
    }

    
    
}
