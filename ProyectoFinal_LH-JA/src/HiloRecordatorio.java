
import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JLabel;
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
    private Actividad actividadActual;
    private JLabel label;
    private JDialog dialog;

    public HiloRecordatorio(Actividad actividadActual, JLabel label, JDialog dialog) {
        this.actividadActual = actividadActual;
        this.label = label;
        this.dialog = dialog;
    }



    

    public Actividad getActividades() {
        return actividadActual;
    }

    public void setActividades(Actividad actividades) {
        this.actividadActual = actividades;
    }

    public void run() {
        boolean bandera = true;
        while (bandera) {
            Date ahora = new Date();
            Date recordatorio = actividadActual.getRecordatorioMinutos();
            
            if (ahora.getYear() == recordatorio.getYear()) {
                if (ahora.getMonth() == recordatorio.getMonth()) {
                    if (ahora.getDate() == recordatorio.getDate()) {
                        if (ahora.getHours() == recordatorio.getHours()) {
                            if (ahora.getMinutes() == recordatorio.getMinutes()) {
                                dialog.pack();
                                dialog.setLocationRelativeTo(null);
                                dialog.setVisible(true);
                                dialog.setModal(true);
                                label.setText("Este es tu recordatorio de la tarea " + actividadActual.getTitulo() + ".");
                                bandera = false;
                            }
                        }
                    }
                }
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}


