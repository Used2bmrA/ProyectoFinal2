
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
    private JSpinner minuto;
    private JSpinner hora;
    private JSpinner tiempoAmPm;
    private JSpinner minutosRecordatorio;
    private JOptionPane aviso;
    private Calendar calendario;

    public HiloRecordatorio(JSpinner minuto, JSpinner hora, JSpinner tiempoAmPm, JSpinner minutosRecordatorio, JOptionPane aviso, Calendar calendario) {
        this.minuto = minuto;
        this.hora = hora;
        this.tiempoAmPm = tiempoAmPm;
        this.minutosRecordatorio = minutosRecordatorio;
        this.aviso = aviso;
        this.calendario = calendario;
    }
    
    public void run(){
        while(true){
       int minutoRecordatorio = (int) minutosRecordatorio.getValue();
    int horaRecordatorio = (int) hora.getValue();
    int minutoHoraRecordatorio = (int) minuto.getValue();
    String amPm = (String) tiempoAmPm.getValue();

    int diferenciaHora = horaRecordatorio - minutoRecordatorio;
    int diferenciaMinuto = minutoHoraRecordatorio - minutoRecordatorio;
    int tiempoRestante = (diferenciaHora * 60) + diferenciaMinuto - minutoRecordatorio;

    try {
        Thread.sleep(tiempoRestante * 60 * 1000); 
        aviso.showMessageDialog(null, "Ya es horra de tu actividad");
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        }
    }
    
    
    

    
}
