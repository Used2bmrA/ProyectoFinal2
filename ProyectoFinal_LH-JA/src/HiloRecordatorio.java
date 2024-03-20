
import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class HiloRecordatorio extends Thread{
    private Actividad actividadActual;
private JTextField texto;

    public HiloRecordatorio(Actividad actividadActual, JTextField texto) {
        this.actividadActual = actividadActual;
        this.texto = texto;
    }


public void run(){
   Date ahora = new Date();
        Date horaInicio = actividadActual.getFecha();
        Date recordatorioMinutos = actividadActual.getRecordatorioMinutos();
        
        long horaInicioMinutos = horaInicio.getTime();
        long tiempoRecordatorioMs = recordatorioMinutos.getTime(); 
        long horaRecordatorioMs = horaInicioMinutos - tiempoRecordatorioMs;

        while (ahora.getTime() <= horaRecordatorioMs) {
            ahora = new Date(); 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        String recordatorioMensaje = "Recordatorio: " + actividadActual.getTitulo() + " - " + horaInicio;
        texto.setText(recordatorioMensaje);
    }

}

    




