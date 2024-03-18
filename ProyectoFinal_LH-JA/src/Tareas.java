
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author josed
 */
public class Tareas extends Actividades {

    private String contenido;
    private String notas;

    public Tareas(String contenido, String notas, Date fecha, String titulo, int recordatorioMinutos) {
        super(fecha, titulo, recordatorioMinutos);
        this.contenido = contenido;
        this.notas = notas;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

}
