
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class HiloRecordatorio extends Thread{
    private Actividad actividades;

    public HiloRecordatorio(Actividad actividades) {
        this.actividades = actividades;
    }

    public Actividad getActividades() {
        return actividades;
    }

    public void setActividades(Actividad actividades) {
        this.actividades = actividades;
    }
    
    public void run(){
        
    }

}
