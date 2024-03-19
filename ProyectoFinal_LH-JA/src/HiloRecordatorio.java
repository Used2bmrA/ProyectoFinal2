
import java.util.Calendar;
import java.util.Date;
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
    private int minutosActividad;

    public HiloRecordatorio(Actividad actividades, int minutosActividad) {
        this.actividades = actividades;
        this.minutosActividad = minutosActividad;
    }

    public Actividad getActividades() {
        return actividades;
    }

    public void setActividades(Actividad actividades) {
        this.actividades = actividades;
    }

    public int getMinutosActividad() {
        return minutosActividad;
    }

    public void setMinutosActividad(int minutosActividad) {
        this.minutosActividad = minutosActividad;
    }

    
    
    public void run(){
       while(true){
           try {
                Date ahora = new Date();
         
                Date horaInicio = new Date(ahora.getTime() + minutosActividad * 60000);

                long tiempoRestante = actividades.getRecordatorioMinutos().getTime() - horaInicio.getTime();

                if (tiempoRestante <= 0) {
                    JOptionPane.showMessageDialog(null, "Es hora de tu actividad llamada" + actividades.getTitulo() + "!");
                    break;
                }
                Thread.sleep(tiempoRestante - 60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
           
       }
        
    }


