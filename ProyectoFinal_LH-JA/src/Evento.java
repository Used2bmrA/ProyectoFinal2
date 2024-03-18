
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class Evento extends Actividad {
    
    private Date horaInicio;
    private Date horaFin;

    public Evento(Date horaInicio, Date horaFin, Date fecha, String titulo, Date recordatorioMinutos) {
        super(fecha, titulo, recordatorioMinutos);
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    
    
    
    
    
    
}
