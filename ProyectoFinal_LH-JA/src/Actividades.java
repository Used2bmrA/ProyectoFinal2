
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class Actividades {
    
    private Date fecha;
    private String titulo;
    private int recordatorioMinutos;

    public Actividades(Date fecha, String titulo, int recordatorioMinutos) {
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

    public int getRecordatorioMinutos() {
        return recordatorioMinutos;
    }

    public void setRecordatorioMinutos(int recordatorioMinutos) {
        this.recordatorioMinutos = recordatorioMinutos;
    }

    @Override
    public String toString() {
        return "Actividades{" + "fecha=" + fecha + ", titulo=" + titulo + ", recordatorioMinutos=" + recordatorioMinutos + '}';
    }

    
    
}
