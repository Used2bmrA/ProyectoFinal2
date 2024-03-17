
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class NewJFrame extends javax.swing.JFrame {

    int xMouse, yMouse;
    long FlujoTotal;
    long pausa;
    FileInputStream fis;
    BufferedInputStream bis;
    Player player;
    File file = null;
    private final JFXPanel jfx_panel = new JFXPanel();
    private MediaPlayer media;

    public NewJFrame() {
        initComponents();
        this.setExtendedState(NORMAL);
        this.setLocationRelativeTo(null);
        lb_subirMedia.setLayout(new BorderLayout());
        lb_subirMedia.add(jfx_panel, BorderLayout.CENTER);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_muroPersonal = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        lb_proPicReg = new javax.swing.JLabel();
        bt_abrirReproductor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        bt_homeMuroAdmin = new javax.swing.JButton();
        bt_cerrarSesion = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        lb_imagenPublicacion1 = new javax.swing.JLabel();
        bt_likePubPers1 = new javax.swing.JButton();
        bt_comentarPubPers1 = new javax.swing.JButton();
        tf_textoPubPers1 = new javax.swing.JTextField();
        tf_likesPers1 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        lb_imagenPublicacion2 = new javax.swing.JLabel();
        bt_likePubPers2 = new javax.swing.JButton();
        bt_comentarPubPers2 = new javax.swing.JButton();
        tf_textoPubPers2 = new javax.swing.JTextField();
        tf_likesPers2 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        lb_imgSugerencia = new javax.swing.JLabel();
        bt_agregarAmigo = new javax.swing.JButton();
        tf_nombreSugerencia = new javax.swing.JTextField();
        bt_verSolicitudes = new javax.swing.JButton();
        jd_muroPrincipal = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        lb_proPicPrincipalReg = new javax.swing.JLabel();
        bt_homeMuroRegular = new javax.swing.JButton();
        bt_reproductorRegular = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        bt_chatRegular = new javax.swing.JButton();
        bt_agendaRegular = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        pn_postPrincipal1 = new javax.swing.JPanel();
        lb_imagenPrincipal1 = new javax.swing.JLabel();
        bt_likePubPers4 = new javax.swing.JButton();
        bt_comentarPubPers4 = new javax.swing.JButton();
        tf_textoPubPrin1 = new javax.swing.JTextField();
        tf_likesPrin1 = new javax.swing.JTextField();
        pn_postPrincipal2 = new javax.swing.JPanel();
        lb_imagenPrincipal2 = new javax.swing.JLabel();
        bt_likePubPers5 = new javax.swing.JButton();
        bt_comentarPubPers5 = new javax.swing.JButton();
        tf_textoPubPrin2 = new javax.swing.JTextField();
        tf_likesPrin2 = new javax.swing.JTextField();
        jd_createUser = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tf_nombreRegistrarU = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        tf_apellidoRegistrarU = new javax.swing.JTextField();
        tf_apodoRegistrarU = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        bt_registrarteU = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pf_passwordConfirmU = new javax.swing.JPasswordField();
        pf_passwordCreateU = new javax.swing.JPasswordField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        sp_yearU = new javax.swing.JSpinner();
        header_register1 = new javax.swing.JPanel();
        pn_exitBttnRegister1 = new javax.swing.JPanel();
        lb_exitBttnRegister1 = new javax.swing.JLabel();
        sp_dateU = new javax.swing.JSpinner();
        sp_monthU = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        tf_paisCreateU = new javax.swing.JTextField();
        jd_reproductorMusical = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        reproductorTexto = new javax.swing.JLabel();
        AgregarMusica = new javax.swing.JButton();
        Play = new javax.swing.JButton();
        Pausa = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jd_createAdmin = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        tf_nombreAdmin = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        tf_apellidoAdmin = new javax.swing.JTextField();
        tf_apodoAdmin = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        bt_registrarAdmin = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        pf_passwordConfirmAdmin = new javax.swing.JPasswordField();
        pf_passwordCreateAdmin = new javax.swing.JPasswordField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        sp_yearAdmin = new javax.swing.JSpinner();
        header_registerAdmin = new javax.swing.JPanel();
        pn_exitBttnAddAdmin = new javax.swing.JPanel();
        lb_exitBttnAddAdmin = new javax.swing.JLabel();
        sp_dateAdmin = new javax.swing.JSpinner();
        sp_monthAdmin = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        tf_paisAdmin = new javax.swing.JTextField();
        jd_crearPublicacion = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tf_crearPensamiento = new javax.swing.JTextField();
        lb_subirMedia = new javax.swing.JLabel();
        bt_publicar = new javax.swing.JButton();
        lb_agregarVideo = new javax.swing.JLabel();
        lb_agregarFoto = new javax.swing.JLabel();
        jd_muroPrincipalAdministrador = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        lb_proPicPrincipalAdmin = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jl_muroPersonalAdmin = new javax.swing.JLabel();
        bt_reproductorAdmin = new javax.swing.JButton();
        bt_agendaAdmin = new javax.swing.JButton();
        bt_chatAdmin = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jSeparator10 = new javax.swing.JSeparator();
        jd_muroPersonalAdministrador = new javax.swing.JDialog();
        jPanel16 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        lb_proPicAdminPers = new javax.swing.JLabel();
        bt_reproductorPersAdmin = new javax.swing.JButton();
        bt_calendarioPersAdmin = new javax.swing.JButton();
        bt_chatPersAdmin = new javax.swing.JButton();
        bt_agregarAdmin = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        bt_listarUsuario = new javax.swing.JButton();
        bt_modificarUsuario = new javax.swing.JButton();
        bt_eliminarUsuario = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jd_calendario = new javax.swing.JDialog();
        jPanel19 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jd_solicitud = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        lb_imgSolicitud = new javax.swing.JLabel();
        lb_nombreSolicitud = new javax.swing.JLabel();
        bt_aceptar = new javax.swing.JButton();
        bt_rechazar = new javax.swing.JButton();
        jd_modificarUsuarios = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cb_usuariosRegulares = new javax.swing.JComboBox<>();
        jSeparator14 = new javax.swing.JSeparator();
        lb_nuevoNombre = new javax.swing.JLabel();
        tf_nuevoNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_contraseñaNueva = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_paisNuevo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_nicknameNuevo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        lb_nuevaFotoPerfil = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lb_nuevaFechaNacimiento = new javax.swing.JLabel();
        sp_nuevoDia = new javax.swing.JSpinner();
        sp_nuevoMes = new javax.swing.JSpinner();
        sp_nuevoAño = new javax.swing.JSpinner();
        jd_eliminarUsuario = new javax.swing.JDialog();
        jPanel23 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        cb_usuariosRegularesEliminar = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        tf_nombreEliminar = new javax.swing.JTextField();
        tf_contraseñaEliminar = new javax.swing.JTextField();
        tf_paisEliminar = new javax.swing.JTextField();
        tf_nicknameEliminar = new javax.swing.JTextField();
        lb_imagenEliminar = new javax.swing.JLabel();
        sp_diaEliminar = new javax.swing.JSpinner();
        sp_mesEliminar = new javax.swing.JSpinner();
        sp_añoEliminar = new javax.swing.JSpinner();
        jb_eliminarUsuario = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tf_username = new javax.swing.JTextField();
        bt_login = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bt_CreateNewAccount = new javax.swing.JButton();
        pf_password = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pn_header = new javax.swing.JPanel();
        pn_exitBttn = new javax.swing.JPanel();
        lb_exitTxt = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(240, 242, 245));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_proPicReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_proPicReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shadow.png"))); // NOI18N
        lb_proPicReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lb_proPicReg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_proPicReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_proPicRegMouseClicked(evt);
            }
        });
        jPanel3.add(lb_proPicReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 140));

        bt_abrirReproductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reproductorMusical.png"))); // NOI18N
        bt_abrirReproductor.setBorder(null);
        bt_abrirReproductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_abrirReproductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_abrirReproductorMouseClicked(evt);
            }
        });
        jPanel3.add(bt_abrirReproductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, 120));

        jLabel4.setText("Regresar Menu Principal");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("¿Que estas pensando?");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Foto/Video");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel14)
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jSeparator8)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 320, 120));

        bt_homeMuroAdmin.setBackground(new java.awt.Color(240, 242, 245));
        bt_homeMuroAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N
        bt_homeMuroAdmin.setBorder(null);
        bt_homeMuroAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_homeMuroAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_homeMuroAdminMouseClicked(evt);
            }
        });
        jPanel3.add(bt_homeMuroAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        bt_cerrarSesion.setBackground(new java.awt.Color(255, 80, 107));
        bt_cerrarSesion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        bt_cerrarSesion.setText("Cerrar Sesión");
        bt_cerrarSesion.setBorder(null);
        bt_cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_cerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_cerrarSesionMouseExited(evt);
            }
        });
        jPanel3.add(bt_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 80, 20));

        jButton4.setText("Continuar navegando");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        lb_imagenPublicacion1.setBackground(new java.awt.Color(255, 255, 255));
        lb_imagenPublicacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bt_likePubPers1.setText("Like");
        bt_likePubPers1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_likePubPers1MouseClicked(evt);
            }
        });

        bt_comentarPubPers1.setText("Comentar");

        tf_textoPubPers1.setEditable(false);
        tf_textoPubPers1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tf_likesPers1.setEditable(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_imagenPublicacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_textoPubPers1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(tf_likesPers1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_likePubPers1)
                .addGap(18, 18, 18)
                .addComponent(bt_comentarPubPers1)
                .addGap(21, 21, 21))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_textoPubPers1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_imagenPublicacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tf_likesPers1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_comentarPubPers1)
                            .addComponent(bt_likePubPers1))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 320, 170));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        lb_imagenPublicacion2.setBackground(new java.awt.Color(255, 255, 255));
        lb_imagenPublicacion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bt_likePubPers2.setText("Like");

        bt_comentarPubPers2.setText("Comentar");

        tf_textoPubPers2.setEditable(false);
        tf_textoPubPers2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_likesPers2.setEditable(false);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb_imagenPublicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_textoPubPers2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(tf_likesPers2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_likePubPers2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_comentarPubPers2)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_imagenPublicacion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_textoPubPers2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_likesPers2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_likePubPers2)
                            .addComponent(bt_comentarPubPers2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel3.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, 160));

        jPanel21.setBackground(new java.awt.Color(240, 242, 245));

        lb_imgSugerencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bt_agregarAmigo.setText("Agregar amigo");
        bt_agregarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarAmigoMouseClicked(evt);
            }
        });

        tf_nombreSugerencia.setEditable(false);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lb_imgSugerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(bt_agregarAmigo))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf_nombreSugerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_imgSugerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_nombreSugerencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_agregarAmigo)
                .addGap(15, 15, 15))
        );

        jPanel3.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 160, 160));

        bt_verSolicitudes.setText("Solicitudes de amistad");
        bt_verSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_verSolicitudesMouseClicked(evt);
            }
        });
        jPanel3.add(bt_verSolicitudes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        javax.swing.GroupLayout jd_muroPersonalLayout = new javax.swing.GroupLayout(jd_muroPersonal.getContentPane());
        jd_muroPersonal.getContentPane().setLayout(jd_muroPersonalLayout);
        jd_muroPersonalLayout.setHorizontalGroup(
            jd_muroPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );
        jd_muroPersonalLayout.setVerticalGroup(
            jd_muroPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(240, 242, 245));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_proPicPrincipalReg.setBackground(new java.awt.Color(255, 255, 255));
        lb_proPicPrincipalReg.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lb_proPicPrincipalReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_proPicPrincipalReg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shadow.png"))); // NOI18N
        lb_proPicPrincipalReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(lb_proPicPrincipalReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 140));

        bt_homeMuroRegular.setBackground(new java.awt.Color(240, 242, 245));
        bt_homeMuroRegular.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        bt_homeMuroRegular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N
        bt_homeMuroRegular.setBorder(null);
        bt_homeMuroRegular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_homeMuroRegular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_homeMuroRegularMouseClicked(evt);
            }
        });
        jPanel5.add(bt_homeMuroRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        bt_reproductorRegular.setText("Reproductor Musical");
        bt_reproductorRegular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_reproductorRegularMouseClicked(evt);
            }
        });
        jPanel5.add(bt_reproductorRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("¿Que estas pensando? Usuario Regular");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Foto/Video");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 360, 130));

        bt_chatRegular.setText("Chat");
        jPanel5.add(bt_chatRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        bt_agendaRegular.setText("Agendas");
        jPanel5.add(bt_agendaRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel10.setText("Ir a tu Muro Principal");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        pn_postPrincipal1.setBackground(new java.awt.Color(255, 255, 255));

        lb_imagenPrincipal1.setBackground(new java.awt.Color(255, 255, 255));
        lb_imagenPrincipal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bt_likePubPers4.setText("Like");

        bt_comentarPubPers4.setText("Comentar");

        tf_textoPubPrin1.setEditable(false);
        tf_textoPubPrin1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tf_likesPrin1.setEditable(false);

        javax.swing.GroupLayout pn_postPrincipal1Layout = new javax.swing.GroupLayout(pn_postPrincipal1);
        pn_postPrincipal1.setLayout(pn_postPrincipal1Layout);
        pn_postPrincipal1Layout.setHorizontalGroup(
            pn_postPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_postPrincipal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_imagenPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_textoPubPrin1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(pn_postPrincipal1Layout.createSequentialGroup()
                .addComponent(tf_likesPrin1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_likePubPers4)
                .addGap(18, 18, 18)
                .addComponent(bt_comentarPubPers4)
                .addGap(21, 21, 21))
        );
        pn_postPrincipal1Layout.setVerticalGroup(
            pn_postPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_postPrincipal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_postPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_textoPubPrin1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(lb_imagenPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pn_postPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_postPrincipal1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tf_likesPrin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_postPrincipal1Layout.createSequentialGroup()
                        .addGroup(pn_postPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_comentarPubPers4)
                            .addComponent(bt_likePubPers4))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.add(pn_postPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 320, 170));

        pn_postPrincipal2.setBackground(new java.awt.Color(255, 255, 255));

        lb_imagenPrincipal2.setBackground(new java.awt.Color(255, 255, 255));
        lb_imagenPrincipal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bt_likePubPers5.setText("Like");

        bt_comentarPubPers5.setText("Comentar");

        tf_textoPubPrin2.setEditable(false);
        tf_textoPubPrin2.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tf_likesPrin2.setEditable(false);

        javax.swing.GroupLayout pn_postPrincipal2Layout = new javax.swing.GroupLayout(pn_postPrincipal2);
        pn_postPrincipal2.setLayout(pn_postPrincipal2Layout);
        pn_postPrincipal2Layout.setHorizontalGroup(
            pn_postPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_postPrincipal2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_imagenPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_textoPubPrin2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(pn_postPrincipal2Layout.createSequentialGroup()
                .addComponent(tf_likesPrin2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_likePubPers5)
                .addGap(18, 18, 18)
                .addComponent(bt_comentarPubPers5)
                .addGap(21, 21, 21))
        );
        pn_postPrincipal2Layout.setVerticalGroup(
            pn_postPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_postPrincipal2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_postPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_textoPubPrin2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(lb_imagenPrincipal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pn_postPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_postPrincipal2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tf_likesPrin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_postPrincipal2Layout.createSequentialGroup()
                        .addGroup(pn_postPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_comentarPubPers5)
                            .addComponent(bt_likePubPers5))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.add(pn_postPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        javax.swing.GroupLayout jd_muroPrincipalLayout = new javax.swing.GroupLayout(jd_muroPrincipal.getContentPane());
        jd_muroPrincipal.getContentPane().setLayout(jd_muroPrincipalLayout);
        jd_muroPrincipalLayout.setHorizontalGroup(
            jd_muroPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_muroPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_muroPrincipalLayout.setVerticalGroup(
            jd_muroPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_muroPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jd_createUser.setUndecorated(true);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel25.setText("Registrarte");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("Es rápido y fácil.");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        tf_nombreRegistrarU.setBackground(new java.awt.Color(243, 243, 255));
        tf_nombreRegistrarU.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_nombreRegistrarU.setForeground(new java.awt.Color(204, 204, 204));
        tf_nombreRegistrarU.setText("Nombre");
        tf_nombreRegistrarU.setBorder(null);
        tf_nombreRegistrarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_nombreRegistrarUMouseClicked(evt);
            }
        });
        jPanel8.add(tf_nombreRegistrarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 168, 32));
        jPanel8.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 10));

        tf_apellidoRegistrarU.setBackground(new java.awt.Color(243, 243, 255));
        tf_apellidoRegistrarU.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_apellidoRegistrarU.setForeground(new java.awt.Color(204, 204, 204));
        tf_apellidoRegistrarU.setText("Apellido");
        tf_apellidoRegistrarU.setBorder(null);
        tf_apellidoRegistrarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_apellidoRegistrarUMouseClicked(evt);
            }
        });
        jPanel8.add(tf_apellidoRegistrarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 181, 32));

        tf_apodoRegistrarU.setBackground(new java.awt.Color(243, 243, 255));
        tf_apodoRegistrarU.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_apodoRegistrarU.setForeground(new java.awt.Color(204, 204, 204));
        tf_apodoRegistrarU.setText("Apodo");
        tf_apodoRegistrarU.setBorder(null);
        tf_apodoRegistrarU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_apodoRegistrarUMouseClicked(evt);
            }
        });
        jPanel8.add(tf_apodoRegistrarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 370, 40));

        jLabel27.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel27.setText("País");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 35, -1));

        jLabel28.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel28.setText("Año");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        bt_registrarteU.setBackground(new java.awt.Color(0, 177, 0));
        bt_registrarteU.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        bt_registrarteU.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrarteU.setText("Registrarte");
        bt_registrarteU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_registrarteU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarteUMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_registrarteUMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_registrarteUMouseExited(evt);
            }
        });
        jPanel8.add(bt_registrarteU, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 181, 42));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 153, 153));
        jLabel29.setText("Al hacer clic en \"Registrarte\", aceptas nuestras Condiciones la politica de privacidad ");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("y la Política de cookies.");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        pf_passwordConfirmU.setForeground(new java.awt.Color(204, 204, 204));
        pf_passwordConfirmU.setText("Contraseña");
        pf_passwordConfirmU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pf_passwordConfirmUMouseClicked(evt);
            }
        });
        jPanel8.add(pf_passwordConfirmU, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 160, 30));

        pf_passwordCreateU.setForeground(new java.awt.Color(204, 204, 204));
        pf_passwordCreateU.setText("Contraseña");
        pf_passwordCreateU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pf_passwordCreateUMouseClicked(evt);
            }
        });
        jPanel8.add(pf_passwordCreateU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 150, 30));

        jLabel32.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel32.setText("Ingresa tu contraseña: ");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel33.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel33.setText("Confirma tu contraseña: ");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        sp_yearU.setModel(new javax.swing.SpinnerNumberModel(1970, 1970, 2024, 1));
        jPanel8.add(sp_yearU, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        header_register1.setBackground(new java.awt.Color(255, 255, 255));
        header_register1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header_register1MouseDragged(evt);
            }
        });
        header_register1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header_register1MousePressed(evt);
            }
        });

        pn_exitBttnRegister1.setBackground(new java.awt.Color(255, 255, 255));

        lb_exitBttnRegister1.setBackground(new java.awt.Color(255, 255, 255));
        lb_exitBttnRegister1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_exitBttnRegister1.setText("X");
        lb_exitBttnRegister1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_exitBttnRegister1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_exitBttnRegister1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_exitBttnRegister1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_exitBttnRegister1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_exitBttnRegister1Layout = new javax.swing.GroupLayout(pn_exitBttnRegister1);
        pn_exitBttnRegister1.setLayout(pn_exitBttnRegister1Layout);
        pn_exitBttnRegister1Layout.setHorizontalGroup(
            pn_exitBttnRegister1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_exitBttnRegister1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_exitBttnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pn_exitBttnRegister1Layout.setVerticalGroup(
            pn_exitBttnRegister1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_exitBttnRegister1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout header_register1Layout = new javax.swing.GroupLayout(header_register1);
        header_register1.setLayout(header_register1Layout);
        header_register1Layout.setHorizontalGroup(
            header_register1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header_register1Layout.createSequentialGroup()
                .addGap(0, 471, Short.MAX_VALUE)
                .addComponent(pn_exitBttnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header_register1Layout.setVerticalGroup(
            header_register1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_exitBttnRegister1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.add(header_register1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        sp_dateU.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanel8.add(sp_dateU, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        sp_monthU.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        sp_monthU.setModel(new javax.swing.SpinnerListModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
        jPanel8.add(sp_monthU, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 100, -1));

        jLabel34.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel34.setText("Fecha de Nacimiento");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel35.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel35.setText("Día");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel36.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel36.setText("Mes");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        tf_paisCreateU.setBackground(new java.awt.Color(243, 243, 255));
        tf_paisCreateU.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_paisCreateU.setForeground(new java.awt.Color(204, 204, 204));
        tf_paisCreateU.setText("País o región");
        tf_paisCreateU.setBorder(null);
        tf_paisCreateU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_paisCreateUMouseClicked(evt);
            }
        });
        jPanel8.add(tf_paisCreateU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 250, 30));

        javax.swing.GroupLayout jd_createUserLayout = new javax.swing.GroupLayout(jd_createUser.getContentPane());
        jd_createUser.getContentPane().setLayout(jd_createUserLayout);
        jd_createUserLayout.setHorizontalGroup(
            jd_createUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_createUserLayout.setVerticalGroup(
            jd_createUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reproductorTexto.setBackground(new java.awt.Color(255, 255, 255));
        reproductorTexto.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reproductorTexto.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(reproductorTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 209, 326, 32));

        AgregarMusica.setText("Agregar canción");
        AgregarMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AgregarMusicaMouseReleased(evt);
            }
        });
        jPanel2.add(AgregarMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 130, -1));

        Play.setText("Play");
        Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PlayMouseReleased(evt);
            }
        });
        jPanel2.add(Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 274, 83, -1));

        Pausa.setText("Pause");
        Pausa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PausaMouseReleased(evt);
            }
        });
        jPanel2.add(Pausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 274, -1, -1));

        Stop.setText("Stop");
        Stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                StopMouseReleased(evt);
            }
        });
        jPanel2.add(Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 274, -1, -1));

        jPanel12.setBackground(new java.awt.Color(51, 102, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setDoubleBuffered(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 61, -1, -1));

        javax.swing.GroupLayout jd_reproductorMusicalLayout = new javax.swing.GroupLayout(jd_reproductorMusical.getContentPane());
        jd_reproductorMusical.getContentPane().setLayout(jd_reproductorMusicalLayout);
        jd_reproductorMusicalLayout.setHorizontalGroup(
            jd_reproductorMusicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );
        jd_reproductorMusicalLayout.setVerticalGroup(
            jd_reproductorMusicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );

        jd_createAdmin.setUndecorated(true);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel37.setText("Registrar administrador");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel38.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("Es rápido y fácil.");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        tf_nombreAdmin.setBackground(new java.awt.Color(243, 243, 255));
        tf_nombreAdmin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_nombreAdmin.setForeground(new java.awt.Color(204, 204, 204));
        tf_nombreAdmin.setText("Nombre");
        tf_nombreAdmin.setBorder(null);
        tf_nombreAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_nombreAdminMouseClicked(evt);
            }
        });
        jPanel9.add(tf_nombreAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 168, 32));
        jPanel9.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 210, 10));

        tf_apellidoAdmin.setBackground(new java.awt.Color(243, 243, 255));
        tf_apellidoAdmin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_apellidoAdmin.setForeground(new java.awt.Color(204, 204, 204));
        tf_apellidoAdmin.setText("Apellido");
        tf_apellidoAdmin.setBorder(null);
        tf_apellidoAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_apellidoAdminMouseClicked(evt);
            }
        });
        jPanel9.add(tf_apellidoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 181, 32));

        tf_apodoAdmin.setBackground(new java.awt.Color(243, 243, 255));
        tf_apodoAdmin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_apodoAdmin.setForeground(new java.awt.Color(204, 204, 204));
        tf_apodoAdmin.setText("Apodo");
        tf_apodoAdmin.setBorder(null);
        tf_apodoAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_apodoAdminMouseClicked(evt);
            }
        });
        jPanel9.add(tf_apodoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 370, 40));

        jLabel39.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel39.setText("País");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 35, -1));

        jLabel40.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel40.setText("Año");
        jPanel9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        bt_registrarAdmin.setBackground(new java.awt.Color(0, 177, 0));
        bt_registrarAdmin.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        bt_registrarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrarAdmin.setText("Registrar");
        bt_registrarAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_registrarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_registrarAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_registrarAdminMouseExited(evt);
            }
        });
        jPanel9.add(bt_registrarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 181, 42));

        jLabel41.setBackground(new java.awt.Color(204, 204, 204));
        jLabel41.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(153, 153, 153));
        jLabel41.setText("Al hacer clic en \"Registrar\", el administrador nuevo acepta nuestros ");
        jPanel9.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel42.setBackground(new java.awt.Color(204, 204, 204));
        jLabel42.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(153, 153, 153));
        jLabel42.setText("Términos y Condiciones aplicables a administradores.");
        jPanel9.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        pf_passwordConfirmAdmin.setForeground(new java.awt.Color(204, 204, 204));
        pf_passwordConfirmAdmin.setText("Contraseña");
        pf_passwordConfirmAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pf_passwordConfirmAdminMouseClicked(evt);
            }
        });
        jPanel9.add(pf_passwordConfirmAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 160, 30));

        pf_passwordCreateAdmin.setForeground(new java.awt.Color(204, 204, 204));
        pf_passwordCreateAdmin.setText("Contraseña");
        pf_passwordCreateAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pf_passwordCreateAdminMouseClicked(evt);
            }
        });
        jPanel9.add(pf_passwordCreateAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 150, 30));

        jLabel44.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel44.setText("Ingresa tu contraseña: ");
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel45.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel45.setText("Confirma tu contraseña: ");
        jPanel9.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        sp_yearAdmin.setModel(new javax.swing.SpinnerNumberModel(1970, 1970, 2024, 1));
        jPanel9.add(sp_yearAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        header_registerAdmin.setBackground(new java.awt.Color(255, 255, 255));
        header_registerAdmin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                header_registerAdminMouseDragged(evt);
            }
        });
        header_registerAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                header_registerAdminMousePressed(evt);
            }
        });

        pn_exitBttnAddAdmin.setBackground(new java.awt.Color(255, 255, 255));

        lb_exitBttnAddAdmin.setBackground(new java.awt.Color(255, 255, 255));
        lb_exitBttnAddAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_exitBttnAddAdmin.setText("X");
        lb_exitBttnAddAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_exitBttnAddAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_exitBttnAddAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_exitBttnAddAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_exitBttnAddAdminMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_exitBttnAddAdminLayout = new javax.swing.GroupLayout(pn_exitBttnAddAdmin);
        pn_exitBttnAddAdmin.setLayout(pn_exitBttnAddAdminLayout);
        pn_exitBttnAddAdminLayout.setHorizontalGroup(
            pn_exitBttnAddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_exitBttnAddAdminLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_exitBttnAddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pn_exitBttnAddAdminLayout.setVerticalGroup(
            pn_exitBttnAddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_exitBttnAddAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout header_registerAdminLayout = new javax.swing.GroupLayout(header_registerAdmin);
        header_registerAdmin.setLayout(header_registerAdminLayout);
        header_registerAdminLayout.setHorizontalGroup(
            header_registerAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header_registerAdminLayout.createSequentialGroup()
                .addGap(0, 471, Short.MAX_VALUE)
                .addComponent(pn_exitBttnAddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        header_registerAdminLayout.setVerticalGroup(
            header_registerAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_exitBttnAddAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.add(header_registerAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

        sp_dateAdmin.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanel9.add(sp_dateAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        sp_monthAdmin.setModel(new javax.swing.SpinnerListModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
        jPanel9.add(sp_monthAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 100, -1));

        jLabel46.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel46.setText("Fecha de Nacimiento");
        jPanel9.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel47.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel47.setText("Día");
        jPanel9.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel48.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel48.setText("Mes");
        jPanel9.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        tf_paisAdmin.setBackground(new java.awt.Color(243, 243, 255));
        tf_paisAdmin.setForeground(new java.awt.Color(204, 204, 204));
        tf_paisAdmin.setText("País o región");
        tf_paisAdmin.setBorder(null);
        tf_paisAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_paisAdminMouseClicked(evt);
            }
        });
        jPanel9.add(tf_paisAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 250, 30));

        javax.swing.GroupLayout jd_createAdminLayout = new javax.swing.GroupLayout(jd_createAdmin.getContentPane());
        jd_createAdmin.getContentPane().setLayout(jd_createAdminLayout);
        jd_createAdminLayout.setHorizontalGroup(
            jd_createAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_createAdminLayout.setVerticalGroup(
            jd_createAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Crear Publicacion");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 20, 154, 37));
        jPanel6.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 63, 482, 10));

        tf_crearPensamiento.setForeground(new java.awt.Color(204, 204, 204));
        tf_crearPensamiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_crearPensamiento.setText("¿Qué estás pensando?");
        tf_crearPensamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf_crearPensamientoMousePressed(evt);
            }
        });
        jPanel6.add(tf_crearPensamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 85, 422, 31));

        lb_subirMedia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lb_subirMedia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_subirMedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_subirMediaMouseClicked(evt);
            }
        });
        jPanel6.add(lb_subirMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 196, 430, 280));

        bt_publicar.setBackground(new java.awt.Color(0, 102, 255));
        bt_publicar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        bt_publicar.setForeground(new java.awt.Color(255, 255, 255));
        bt_publicar.setText("Publicar");
        bt_publicar.setBorder(null);
        bt_publicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_publicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_publicarMouseClicked(evt);
            }
        });
        jPanel6.add(bt_publicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 493, 266, 42));

        lb_agregarVideo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_agregarVideo.setText("Agregar Videos");
        lb_agregarVideo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_agregarVideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_agregarVideoMouseClicked(evt);
            }
        });
        jPanel6.add(lb_agregarVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 128, -1, 40));

        lb_agregarFoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_agregarFoto.setText("Agregar Fotos");
        lb_agregarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_agregarFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_agregarFotoMouseClicked(evt);
            }
        });
        jPanel6.add(lb_agregarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 133, -1, 30));

        javax.swing.GroupLayout jd_crearPublicacionLayout = new javax.swing.GroupLayout(jd_crearPublicacion.getContentPane());
        jd_crearPublicacion.getContentPane().setLayout(jd_crearPublicacionLayout);
        jd_crearPublicacionLayout.setHorizontalGroup(
            jd_crearPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );
        jd_crearPublicacionLayout.setVerticalGroup(
            jd_crearPublicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(240, 242, 245));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_proPicPrincipalAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shadow.png"))); // NOI18N
        lb_proPicPrincipalAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel13.add(lb_proPicPrincipalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 181, 156));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("¿Que estas pensando, Usuario Administrador?");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Foto/Video");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator9)
                .addContainerGap())
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 6, -1, -1));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setText("Muro Principal Admin");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(181, 181, 181))
        );

        jPanel13.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 174, 428, 391));

        jLabel23.setText("Ir al muro Personal");
        jPanel13.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 44, -1, -1));

        jl_muroPersonalAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N
        jl_muroPersonalAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jl_muroPersonalAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_muroPersonalAdminMouseClicked(evt);
            }
        });
        jPanel13.add(jl_muroPersonalAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 78, -1, -1));

        bt_reproductorAdmin.setText("Reproductor Musica");
        jPanel13.add(bt_reproductorAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        bt_agendaAdmin.setText("Agenda");
        jPanel13.add(bt_agendaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        bt_chatAdmin.setText("Chat");
        jPanel13.add(bt_chatAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jList2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(jList2);

        jPanel13.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 174, 196, 376));

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 334, 202, 12));

        javax.swing.GroupLayout jd_muroPrincipalAdministradorLayout = new javax.swing.GroupLayout(jd_muroPrincipalAdministrador.getContentPane());
        jd_muroPrincipalAdministrador.getContentPane().setLayout(jd_muroPrincipalAdministradorLayout);
        jd_muroPrincipalAdministradorLayout.setHorizontalGroup(
            jd_muroPrincipalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );
        jd_muroPrincipalAdministradorLayout.setVerticalGroup(
            jd_muroPrincipalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel16.setBackground(new java.awt.Color(240, 242, 245));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("Regresar al Muro Principal");
        jPanel16.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 32, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 102, 102));
        jLabel49.setText("¿Que estas pensando?, Usuario Admin");
        jLabel49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Foto/Video");
        jLabel50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel50)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setText("Muro");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 340, 391));

        lb_proPicAdminPers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shadow.png"))); // NOI18N
        lb_proPicAdminPers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lb_proPicAdminPers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_proPicAdminPers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_proPicAdminPersMouseClicked(evt);
            }
        });
        jPanel16.add(lb_proPicAdminPers, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 148));

        bt_reproductorPersAdmin.setText("Reproductor de Musica");
        bt_reproductorPersAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_reproductorPersAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_reproductorPersAdminMouseClicked(evt);
            }
        });
        jPanel16.add(bt_reproductorPersAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        bt_calendarioPersAdmin.setText("Calendario");
        jPanel16.add(bt_calendarioPersAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, -1));

        bt_chatPersAdmin.setText("Chat");
        jPanel16.add(bt_chatPersAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 80, -1));

        bt_agregarAdmin.setText("Agregar Usuario Administrador");
        bt_agregarAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_agregarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_agregarAdminMouseClicked(evt);
            }
        });
        jPanel16.add(bt_agregarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        jPanel16.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 189, 10));

        bt_listarUsuario.setText("Agregar Usuario Regular");
        bt_listarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_listarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_listarUsuarioMouseClicked(evt);
            }
        });
        jPanel16.add(bt_listarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        bt_modificarUsuario.setText("Modificar Usuario");
        bt_modificarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_modificarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarUsuarioMouseClicked(evt);
            }
        });
        jPanel16.add(bt_modificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        bt_eliminarUsuario.setText("Eliminar Usuario");
        bt_eliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_eliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarUsuarioMouseClicked(evt);
            }
        });
        jPanel16.add(bt_eliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jScrollPane3.setViewportView(jList3);

        jPanel16.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 177, 350));

        jButton1.setBackground(new java.awt.Color(255, 51, 102));
        jButton1.setText("Cerrar Sesion");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel16.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, -1));
        jPanel16.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 220, 20));

        javax.swing.GroupLayout jd_muroPersonalAdministradorLayout = new javax.swing.GroupLayout(jd_muroPersonalAdministrador.getContentPane());
        jd_muroPersonalAdministrador.getContentPane().setLayout(jd_muroPersonalAdministradorLayout);
        jd_muroPersonalAdministradorLayout.setHorizontalGroup(
            jd_muroPersonalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_muroPersonalAdministradorLayout.setVerticalGroup(
            jd_muroPersonalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_muroPersonalAdministradorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jd_calendarioLayout = new javax.swing.GroupLayout(jd_calendario.getContentPane());
        jd_calendario.getContentPane().setLayout(jd_calendarioLayout);
        jd_calendarioLayout.setHorizontalGroup(
            jd_calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jd_calendarioLayout.setVerticalGroup(
            jd_calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_calendarioLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_imgSolicitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(lb_imgSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 130, 100));

        lb_nombreSolicitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(lb_nombreSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 151, 20));

        bt_aceptar.setText("Aceptar");
        bt_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_aceptarMouseClicked(evt);
            }
        });
        jPanel7.add(bt_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 202, -1, -1));

        bt_rechazar.setText("Rechazar");
        bt_rechazar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_rechazarMouseClicked(evt);
            }
        });
        jPanel7.add(bt_rechazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 202, -1, -1));

        javax.swing.GroupLayout jd_solicitudLayout = new javax.swing.GroupLayout(jd_solicitud.getContentPane());
        jd_solicitud.getContentPane().setLayout(jd_solicitudLayout);
        jd_solicitudLayout.setHorizontalGroup(
            jd_solicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_solicitudLayout.setVerticalGroup(
            jd_solicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Modificar Usuario");

        cb_usuariosRegulares.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_usuariosRegularesItemStateChanged(evt);
            }
        });

        lb_nuevoNombre.setText("Nombre:");

        jLabel11.setText("Contraseña:");

        jLabel12.setText("Pais:");

        jLabel15.setText("NickName:");

        jLabel16.setText("Foto de Perfil:");

        lb_nuevaFotoPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton2.setText("Modificar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Modificar Foto de Perfil");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        lb_nuevaFechaNacimiento.setText("Fecha de Nacimiento:");

        sp_nuevoDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        sp_nuevoMes.setModel(new javax.swing.SpinnerListModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));

        sp_nuevoAño.setModel(new javax.swing.SpinnerNumberModel(1970, 1970, 2024, 1));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lb_nuevoNombre)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_paisNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(4, 4, 4)))
                        .addGap(18, 18, 18)
                        .addComponent(tf_nicknameNuevo))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel16))
                                .addGap(72, 72, 72))
                            .addComponent(jButton3)
                            .addComponent(lb_nuevaFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(tf_contraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(sp_nuevoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_nuevoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_nuevoAño, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_nuevaFechaNacimiento)
                                .addGap(100, 100, 100)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cb_usuariosRegulares, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_usuariosRegulares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nuevoNombre)
                    .addComponent(jLabel11)
                    .addComponent(tf_contraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_paisNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(tf_nicknameNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lb_nuevaFechaNacimiento))
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sp_nuevoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sp_nuevoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sp_nuevoAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_nuevaFotoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(78, 78, 78)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jd_modificarUsuariosLayout = new javax.swing.GroupLayout(jd_modificarUsuarios.getContentPane());
        jd_modificarUsuarios.getContentPane().setLayout(jd_modificarUsuariosLayout);
        jd_modificarUsuariosLayout.setHorizontalGroup(
            jd_modificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_modificarUsuariosLayout.setVerticalGroup(
            jd_modificarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_modificarUsuariosLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("Eliminar Usuario");

        cb_usuariosRegularesEliminar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_usuariosRegularesEliminarItemStateChanged(evt);
            }
        });

        jLabel18.setText("Nombre:");

        jLabel20.setText("Pais:");

        jLabel24.setText("Contraseña:");

        jLabel52.setText("Foto de Perfil");

        jLabel53.setText("Fecha de Nacimiento");

        jLabel54.setText("NickName:");

        tf_nombreEliminar.setEditable(false);

        tf_contraseñaEliminar.setEditable(false);

        tf_paisEliminar.setEditable(false);
        tf_paisEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_paisEliminarActionPerformed(evt);
            }
        });

        tf_nicknameEliminar.setEditable(false);

        lb_imagenEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        sp_diaEliminar.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        sp_mesEliminar.setModel(new javax.swing.SpinnerListModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));

        sp_añoEliminar.setModel(new javax.swing.SpinnerNumberModel(1990, 1990, 2024, 1));

        jb_eliminarUsuario.setText("Eliminar Usuario");
        jb_eliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_eliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminarUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator15))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel20))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tf_nombreEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_nicknameEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel54)
                                            .addComponent(jLabel24))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tf_paisEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_contraseñaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel52)
                                        .addGap(171, 171, 171)
                                        .addComponent(jLabel53))
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(lb_imagenEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(sp_diaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sp_mesEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(sp_añoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jb_eliminarUsuario)))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(223, 223, 223))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(cb_usuariosRegularesEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cb_usuariosRegularesEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel24)
                    .addComponent(tf_nombreEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_contraseñaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel54)
                    .addComponent(tf_paisEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nicknameEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp_diaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_mesEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp_añoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lb_imagenEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jb_eliminarUsuario)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jd_eliminarUsuarioLayout = new javax.swing.GroupLayout(jd_eliminarUsuario.getContentPane());
        jd_eliminarUsuario.getContentPane().setLayout(jd_eliminarUsuarioLayout);
        jd_eliminarUsuarioLayout.setHorizontalGroup(
            jd_eliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarUsuarioLayout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_eliminarUsuarioLayout.setVerticalGroup(
            jd_eliminarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Landing");
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(240, 242, 245));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tf_username.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tf_username.setForeground(new java.awt.Color(204, 204, 204));
        tf_username.setText("Usuario");
        tf_username.setBorder(null);
        tf_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tf_usernameMousePressed(evt);
            }
        });

        bt_login.setBackground(new java.awt.Color(0, 102, 255));
        bt_login.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        bt_login.setForeground(new java.awt.Color(255, 255, 255));
        bt_login.setText("Iniciar sesión");
        bt_login.setBorder(null);
        bt_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_loginMouseExited(evt);
            }
        });

        bt_CreateNewAccount.setBackground(new java.awt.Color(0, 188, 3));
        bt_CreateNewAccount.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        bt_CreateNewAccount.setForeground(new java.awt.Color(255, 255, 255));
        bt_CreateNewAccount.setText("Crear cuenta nueva");
        bt_CreateNewAccount.setBorder(null);
        bt_CreateNewAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_CreateNewAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_CreateNewAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_CreateNewAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_CreateNewAccountMouseExited(evt);
            }
        });

        pf_password.setForeground(new java.awt.Color(204, 204, 204));
        pf_password.setText("Contraseña");
        pf_password.setBorder(null);
        pf_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pf_passwordMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pf_password, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(tf_username)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(bt_CreateNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bt_CreateNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Facebook te ayuda a comunicarte y");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("compartir con las personas que forman");
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("parte de tu vida.");
        panelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facebook logo2.png"))); // NOI18N
        panelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        pn_header.setBackground(new java.awt.Color(240, 242, 255));
        pn_header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pn_headerMouseDragged(evt);
            }
        });
        pn_header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pn_headerMousePressed(evt);
            }
        });

        pn_exitBttn.setBackground(new java.awt.Color(240, 242, 255));

        lb_exitTxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lb_exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_exitTxt.setText("X");
        lb_exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_exitBttnLayout = new javax.swing.GroupLayout(pn_exitBttn);
        pn_exitBttn.setLayout(pn_exitBttnLayout);
        pn_exitBttnLayout.setHorizontalGroup(
            pn_exitBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );
        pn_exitBttnLayout.setVerticalGroup(
            pn_exitBttnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_headerLayout = new javax.swing.GroupLayout(pn_header);
        pn_header.setLayout(pn_headerLayout);
        pn_headerLayout.setHorizontalGroup(
            pn_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_headerLayout.createSequentialGroup()
                .addGap(0, 888, Short.MAX_VALUE)
                .addComponent(pn_exitBttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pn_headerLayout.setVerticalGroup(
            pn_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_exitBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelPrincipal.add(pn_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CreateNewAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CreateNewAccountMouseClicked
        jd_createUser.setModal(true);
        jd_createUser.pack();
        jd_createUser.setLocationRelativeTo(null);
        jd_createUser.setVisible(true);

    }//GEN-LAST:event_bt_CreateNewAccountMouseClicked

    private void lb_exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lb_exitTxtMouseClicked

    private void lb_exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitTxtMouseEntered
        pn_exitBttn.setBackground(Color.red);
        lb_exitTxt.setForeground(Color.white);

    }//GEN-LAST:event_lb_exitTxtMouseEntered

    private void lb_exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitTxtMouseExited
        pn_exitBttn.setBackground(new Color(240, 242, 255));
        lb_exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_lb_exitTxtMouseExited

    private void pn_headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pn_headerMousePressed

    private void pn_headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pn_headerMouseDragged

    private void tf_usernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_usernameMousePressed
        if (tf_username.getText().equals("Usuario")) {
            tf_username.setText("");
            tf_username.setForeground(Color.black);
        }
        if (pf_password.getText().equals("")) {
            pf_password.setText("Contraseña");
            pf_password.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_tf_usernameMousePressed

    private void pf_passwordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_passwordMousePressed
        if (pf_password.getText().equals("Contraseña")) {
            pf_password.setText("");
            pf_password.setForeground(Color.black);
        }
        if (tf_username.getText().equals("")) {
            tf_username.setText("Usuario");
            tf_username.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_pf_passwordMousePressed

    private void bt_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseExited
        bt_login.setBackground(new Color(0, 10, 255));
    }//GEN-LAST:event_bt_loginMouseExited

    private void bt_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseEntered
        bt_login.setBackground(new Color(0, 70, 255));
    }//GEN-LAST:event_bt_loginMouseEntered

    private void bt_CreateNewAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CreateNewAccountMouseEntered
        bt_CreateNewAccount.setBackground(new Color(0, 180, 0));
    }//GEN-LAST:event_bt_CreateNewAccountMouseEntered

    private void bt_CreateNewAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_CreateNewAccountMouseExited
        bt_CreateNewAccount.setBackground(new Color(0, 204, 0));
    }//GEN-LAST:event_bt_CreateNewAccountMouseExited

    private void bt_registrarteUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarteUMouseClicked
        if (UsuarioValido()) {
            int dia;
            int mes;
            int anio;
            String mesFromSp = sp_monthU.getValue().toString();

            if (mesFromSp.equals("Enero")) {
                mes = 0;
            } else if (mesFromSp.equals("Febrero")) {
                mes = 1;
            } else if (mesFromSp.equals("Marzo")) {
                mes = 2;
            } else if (mesFromSp.equals("Abril")) {
                mes = 3;
            } else if (mesFromSp.equals("Mayo")) {
                mes = 4;
            } else if (mesFromSp.equals("Junio")) {
                mes = 5;
            } else if (mesFromSp.equals("Julio")) {
                mes = 6;
            } else if (mesFromSp.equals("Agosto")) {
                mes = 7;
            } else if (mesFromSp.equals("Septiembre")) {
                mes = 8;
            } else if (mesFromSp.equals("Octubre")) {
                mes = 9;
            } else if (mesFromSp.equals("Noviembre")) {
                mes = 10;
            } else {
                mes = 11;
            }

            if (pf_passwordCreateU.getText().equals(pf_passwordConfirmU.getText())) {
                dia = (int) sp_dateU.getValue();
                anio = (int) sp_yearU.getValue();
                String nombreCompleto = tf_nombreRegistrarU.getText() + " " + tf_apellidoRegistrarU.getText();
                String apodo = tf_apodoRegistrarU.getText();
                String contrasenia = pf_passwordCreateU.getText();
                String pais = tf_paisCreateU.getText();
                Date fechaNacimiento = new Date(anio, mes, dia);
                Usuario nuevoUsuario = new Regular(nombreCompleto, apodo, contrasenia, pais, fechaNacimiento);
                administradorUsuario admin = new administradorUsuario("./UsuariosRegulares.pfb");
                admin.cargarArchivo();
                admin.setPersona(nuevoUsuario);
                admin.escribirArchivo();
                JOptionPane.showMessageDialog(jd_createUser, "Bienvenido a Facebook");

                tf_nombreRegistrarU.setText("");
                tf_apellidoRegistrarU.setText("");
                tf_apodoRegistrarU.setText("");
                pf_passwordCreateU.setText("");
                pf_passwordConfirmU.setText("");
                tf_paisCreateU.setText("");
                sp_dateU.setValue(1);
                sp_monthU.setValue("Enero");
                sp_yearU.setValue(1970);
                LlenarEspacios();
                jd_createUser.dispose();

            } else {
                JOptionPane.showMessageDialog(jd_createUser, "Las contraseñas "
                        + "ingresadas no son iguales. Intente otra vez.");
            }
        } else {
            JOptionPane.showMessageDialog(jd_createUser, "Ya existe un usuario con ese nombre.");
        }


    }//GEN-LAST:event_bt_registrarteUMouseClicked

    private void bt_registrarteUMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarteUMouseEntered
        bt_registrarteU.setBackground(new Color(0, 155, 0));
    }//GEN-LAST:event_bt_registrarteUMouseEntered

    private void bt_registrarteUMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarteUMouseExited
        bt_registrarteU.setBackground(new Color(0, 177, 0));
    }//GEN-LAST:event_bt_registrarteUMouseExited

    private void pf_passwordConfirmUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_passwordConfirmUMouseClicked
        LlenarEspacios();

        if (pf_passwordConfirmU.getText().equals("Contraseña")) {
            pf_passwordConfirmU.setText("");
            pf_passwordConfirmU.setForeground(Color.black);
        }
    }//GEN-LAST:event_pf_passwordConfirmUMouseClicked

    private void pf_passwordCreateUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_passwordCreateUMouseClicked
        LlenarEspacios();

        if (pf_passwordCreateU.getText().equals("Contraseña")) {
            pf_passwordCreateU.setText("");
            pf_passwordCreateU.setForeground(Color.black);
        }
    }//GEN-LAST:event_pf_passwordCreateUMouseClicked

    private void lb_exitBttnRegister1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitBttnRegister1MouseClicked
        jd_createUser.dispose();
    }//GEN-LAST:event_lb_exitBttnRegister1MouseClicked

    private void lb_exitBttnRegister1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitBttnRegister1MouseEntered
        pn_exitBttnRegister1.setBackground(Color.red);
        lb_exitBttnRegister1.setForeground(Color.white);
    }//GEN-LAST:event_lb_exitBttnRegister1MouseEntered

    private void lb_exitBttnRegister1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitBttnRegister1MouseExited
        pn_exitBttnRegister1.setBackground(Color.white);
        lb_exitBttnRegister1.setForeground(Color.black);
    }//GEN-LAST:event_lb_exitBttnRegister1MouseExited

    private void header_register1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_register1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        jd_createUser.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header_register1MouseDragged

    private void header_register1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_register1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header_register1MousePressed

    private void tf_nombreAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nombreAdminMouseClicked
        LlenarEspaciosAdmin();
        if (tf_nombreAdmin.getText().equals("Nombre")) {
            tf_nombreAdmin.setText("");
            tf_nombreAdmin.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_nombreAdminMouseClicked

    private void bt_registrarAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarAdminMouseClicked
        if (AdminValido()) {
            int dia;
            int mes;
            int anio;
            String mesFromSp = sp_monthAdmin.getValue().toString();

            if (mesFromSp.equals("Enero")) {
                mes = 0;
            } else if (mesFromSp.equals("Febrero")) {
                mes = 1;
            } else if (mesFromSp.equals("Marzo")) {
                mes = 2;
            } else if (mesFromSp.equals("Abril")) {
                mes = 3;
            } else if (mesFromSp.equals("Mayo")) {
                mes = 4;
            } else if (mesFromSp.equals("Junio")) {
                mes = 5;
            } else if (mesFromSp.equals("Julio")) {
                mes = 6;
            } else if (mesFromSp.equals("Agosto")) {
                mes = 7;
            } else if (mesFromSp.equals("Septiembre")) {
                mes = 8;
            } else if (mesFromSp.equals("Octubre")) {
                mes = 9;
            } else if (mesFromSp.equals("Noviembre")) {
                mes = 10;
            } else {
                mes = 11;
            }

            if (pf_passwordCreateAdmin.getText().equals(pf_passwordConfirmAdmin.getText())) {
                dia = (int) sp_dateAdmin.getValue();
                anio = (int) sp_yearAdmin.getValue();
                String nombreCompleto = tf_nombreAdmin.getText() + " " + tf_apellidoAdmin.getText();
                String apodo = tf_apodoAdmin.getText();
                String contrasenia = pf_passwordCreateAdmin.getText();
                String pais = tf_paisAdmin.getText();
                Date fechaNacimiento = new Date(anio, mes, dia);
                Usuario nuevoUsuario = new Administrador(nombreCompleto, apodo, contrasenia, pais, fechaNacimiento);
                administradorUsuario admin = new administradorUsuario("./Administradores.pfb");
                admin.cargarArchivo();
                admin.setPersona(nuevoUsuario);
                admin.escribirArchivo();
                JOptionPane.showMessageDialog(jd_createAdmin, "Bienvenido a Facebook");

                tf_nombreAdmin.setText("");
                tf_apellidoAdmin.setText("");
                tf_apodoAdmin.setText("");
                pf_passwordCreateAdmin.setText("");
                pf_passwordCreateAdmin.setText("");
                tf_paisAdmin.setText("");
                sp_dateAdmin.setValue(1);
                sp_monthAdmin.setValue("Enero");
                sp_yearAdmin.setValue(1970);
                LlenarEspaciosAdmin();
                jd_createAdmin.dispose();

            } else {
                JOptionPane.showMessageDialog(jd_createUser, "Las contraseñas "
                        + "ingresadas no son iguales. Intente otra vez.");
            }
        } else {
            JOptionPane.showMessageDialog(jd_createUser, "Ya existe un usuario con ese nombre.");
        }
    }//GEN-LAST:event_bt_registrarAdminMouseClicked

    private void bt_registrarAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarAdminMouseEntered
        bt_registrarAdmin.setBackground(new Color(0, 155, 0));
    }//GEN-LAST:event_bt_registrarAdminMouseEntered

    private void bt_registrarAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarAdminMouseExited
        bt_registrarAdmin.setBackground(new Color(0, 177, 0));
    }//GEN-LAST:event_bt_registrarAdminMouseExited

    private void pf_passwordConfirmAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_passwordConfirmAdminMouseClicked
        LlenarEspaciosAdmin();

        if (pf_passwordConfirmAdmin.getText().equals("Contraseña")) {
            pf_passwordConfirmAdmin.setText("");
            pf_passwordConfirmAdmin.setForeground(Color.black);
        }
    }//GEN-LAST:event_pf_passwordConfirmAdminMouseClicked

    private void pf_passwordCreateAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_passwordCreateAdminMouseClicked
        LlenarEspaciosAdmin();

        if (pf_passwordCreateAdmin.getText().equals("Contraseña")) {
            pf_passwordCreateAdmin.setText("");
            pf_passwordCreateAdmin.setForeground(Color.black);
        }
    }//GEN-LAST:event_pf_passwordCreateAdminMouseClicked

    private void lb_exitBttnAddAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitBttnAddAdminMouseClicked
        jd_createAdmin.dispose();
    }//GEN-LAST:event_lb_exitBttnAddAdminMouseClicked

    private void lb_exitBttnAddAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitBttnAddAdminMouseEntered
        pn_exitBttnAddAdmin.setBackground(Color.red);
        lb_exitBttnAddAdmin.setForeground(Color.white);
    }//GEN-LAST:event_lb_exitBttnAddAdminMouseEntered

    private void lb_exitBttnAddAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exitBttnAddAdminMouseExited
        pn_exitBttnAddAdmin.setBackground(Color.white);
        lb_exitBttnAddAdmin.setForeground(Color.black);
    }//GEN-LAST:event_lb_exitBttnAddAdminMouseExited

    private void header_registerAdminMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_registerAdminMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        jd_createAdmin.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_header_registerAdminMouseDragged

    private void header_registerAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_header_registerAdminMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_header_registerAdminMousePressed

    private void tf_nombreRegistrarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nombreRegistrarUMouseClicked
        LlenarEspacios();

        if (tf_nombreRegistrarU.getText().equals("Nombre")) {
            tf_nombreRegistrarU.setText("");
            tf_nombreRegistrarU.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_nombreRegistrarUMouseClicked

    private void tf_apellidoRegistrarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_apellidoRegistrarUMouseClicked
        LlenarEspacios();

        if (tf_apellidoRegistrarU.getText().equals("Apellido")) {
            tf_apellidoRegistrarU.setText("");
            tf_apellidoRegistrarU.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_apellidoRegistrarUMouseClicked

    private void tf_apellidoAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_apellidoAdminMouseClicked
        LlenarEspaciosAdmin();

        if (tf_apellidoAdmin.getText().equals("Apellido")) {
            tf_apellidoAdmin.setText("");
            tf_apellidoAdmin.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_apellidoAdminMouseClicked

    private void tf_apodoAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_apodoAdminMouseClicked
        LlenarEspaciosAdmin();

        if (tf_apodoAdmin.getText().equals("Apodo")) {
            tf_apodoAdmin.setText("");
            tf_apodoAdmin.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_apodoAdminMouseClicked

    private void tf_apodoRegistrarUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_apodoRegistrarUMouseClicked
        LlenarEspacios();

        if (tf_apodoRegistrarU.getText().equals("Apodo")) {
            tf_apodoRegistrarU.setText("");
            tf_apodoRegistrarU.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_apodoRegistrarUMouseClicked

    private void tf_paisCreateUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_paisCreateUMouseClicked
        LlenarEspacios();

        if (tf_paisCreateU.getText().equals("País o región")) {
            tf_paisCreateU.setText("");
            tf_paisCreateU.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_paisCreateUMouseClicked

    private void tf_paisAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_paisAdminMouseClicked
        LlenarEspaciosAdmin();

        if (tf_paisAdmin.getText().equals("País o región")) {
            tf_paisAdmin.setText("");
            tf_paisAdmin.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_paisAdminMouseClicked

    private void AgregarMusicaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMusicaMouseReleased
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Audio", "mp3", "Mp3", "wav", "Wav");
        chooser.setFileFilter(filtro);
        int valor = chooser.showOpenDialog(null);
        if (valor == JFileChooser.CANCEL_OPTION) {
        } else {
            if (valor == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
                if (file == null) {
                } else {
                    String cancion = file + "";
                    String nombre = chooser.getSelectedFile().getName();
                    reproductorTexto.setText(nombre);
                }
            }
            try {
                if (file == null) {
                } else {
                    fis = new FileInputStream(file);
                    bis = new BufferedInputStream(fis);
                    player = new Player(bis);
                    FlujoTotal = fis.available();
                    new Thread() {
                        public void run() {
                            try {
                                player.play();
                            } catch (Exception e) {
                                e.printStackTrace();

                            }
                        }
                    }.start();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (JavaLayerException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_AgregarMusicaMouseReleased

    private void PausaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PausaMouseReleased
        if (file != null && player != null) {
            try {
                pausa = fis.available();
                player.close();
                player = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_PausaMouseReleased

    private void PlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseReleased
        try {
            if (file == null) {
            } else {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                player = new Player(bis);
                fis.skip(FlujoTotal - pausa);
                new Thread() {
                    public void run() {
                        try {
                            player.play();
                        } catch (JavaLayerException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (JavaLayerException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PlayMouseReleased

    private void StopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopMouseReleased
        if (player != null) {
            reproductorTexto.setText("");
            player.close();
            reproductorTexto.setText("");
            file = null;
        }
    }//GEN-LAST:event_StopMouseReleased

    private void bt_homeMuroRegularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_homeMuroRegularMouseClicked
        jd_muroPrincipal.setVisible(false);
        jd_muroPersonal.pack();
        jd_muroPersonal.setLocationRelativeTo(null);
        RefreshMuroPersonalUsuario();
        jd_muroPersonal.setVisible(true);

    }//GEN-LAST:event_bt_homeMuroRegularMouseClicked

    private void bt_reproductorRegularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_reproductorRegularMouseClicked
        jd_reproductorMusical.setVisible(true);
        jd_reproductorMusical.pack();
        jd_reproductorMusical.setLocationRelativeTo(null);
    }//GEN-LAST:event_bt_reproductorRegularMouseClicked

    private void bt_abrirReproductorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_abrirReproductorMouseClicked
        jd_reproductorMusical.pack();
        jd_reproductorMusical.setLocationRelativeTo(null);
        jd_reproductorMusical.setVisible(true);
    }//GEN-LAST:event_bt_abrirReproductorMouseClicked

    private void bt_homeMuroAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_homeMuroAdminMouseClicked
        jd_muroPersonal.setVisible(false);
        jd_muroPrincipal.pack();
        jd_muroPrincipal.setLocationRelativeTo(null);
        lb_proPicPrincipalReg.setIcon(usuarioActual.getFotografia());
        RefreshMuroPrincipal();
        jd_muroPrincipal.setVisible(true);

    }//GEN-LAST:event_bt_homeMuroAdminMouseClicked

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        if (ExisteUsuario(tf_username.getText())) {
            boolean encontrado = false;
            indiceActual = -1;
            administradorUsuario admin = new administradorUsuario("./UsuariosRegulares.pfb");
            admin.cargarArchivo();
            for (Usuario regular : admin.getUsuarios()) {
                if (regular.getNombre().equals(tf_username.getText()) && regular.getContrasenia().equals(pf_password.getText())) {
                    encontrado = true;
                    usuarioActual = regular;
                    RefreshMuroPrincipal();
                    jd_muroPrincipal.pack();
                    jd_muroPrincipal.setLocationRelativeTo(null);
                    RefreshMuroPrincipal();
                    jd_muroPrincipal.setVisible(true);
                    this.setVisible(false);
                }
                indiceActual++;
            }

            if (!encontrado) {
                indiceActual = -1;
                admin = new administradorUsuario("./Administradores.pfb");
                admin.cargarArchivo();
                for (Usuario administrador : admin.getUsuarios()) {
                    if (administrador.getNombre().equals(tf_username.getText()) && administrador.getContrasenia().equals(pf_password.getText())) {
                        usuarioActual = administrador;
                        jd_muroPrincipalAdministrador.pack();
                        lb_proPicPrincipalAdmin.setIcon(usuarioActual.getFotografia());
                        lb_proPicAdminPers.setIcon(usuarioActual.getFotografia());
                        jd_muroPrincipalAdministrador.setLocationRelativeTo(null);
                        jd_muroPrincipalAdministrador.setVisible(true);
                        this.setVisible(false);
                    }
                }
                indiceActual++;
            }

        } else {
            JOptionPane.showMessageDialog(this, "Registrate a Facebook para comenzar.");
        }
    }//GEN-LAST:event_bt_loginMouseClicked

    private void lb_subirMediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_subirMediaMouseClicked

    }//GEN-LAST:event_lb_subirMediaMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        crearPublicacion();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        crearPublicacion();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void tf_crearPensamientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_crearPensamientoMousePressed
        if (tf_crearPensamiento.getText().equals("")) {
            tf_crearPensamiento.setText("¿Qué estás pensando?");
            tf_crearPensamiento.setForeground(Color.gray);
        }
        if (tf_crearPensamiento.getText().equals("¿Qué estás pensando?")) {
            tf_crearPensamiento.setText("");
            tf_crearPensamiento.setForeground(Color.black);
        }
    }//GEN-LAST:event_tf_crearPensamientoMousePressed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        crearPublicacion();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        crearPublicacion();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void lb_agregarVideoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_agregarVideoMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Videos", "mp4", "Mp4");
        fileChooser.setFileFilter(filtro);
        int result = fileChooser.showOpenDialog(jd_crearPublicacion);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            media = new MediaPlayer(new Media(selectedFile.toURI().toString()));
            MediaView view = new MediaView(media);
            jfx_panel.setScene(new Scene(new Group(view), 500, 600));
            view.setFitHeight(500);
            view.setFitWidth(600);
            media.setVolume(0.2);
            media.setCycleCount(MediaPlayer.INDEFINITE);

        }
    }//GEN-LAST:event_lb_agregarVideoMouseClicked

    private void lb_agregarFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_agregarFotoMouseClicked
        JFileChooser fc = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Imagenes", "png", "jpg", "jpeg", "gif");
        fc.setMultiSelectionEnabled(true);
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(jd_muroPrincipal);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(430, 280, 0);
            this.lb_subirMedia.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_lb_agregarFotoMouseClicked

    private void bt_publicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_publicarMouseClicked
        Publicacion nuevaPublicacion = new Publicacion(usuarioActual.getNombre(), tf_crearPensamiento.getText(), lb_subirMedia.getIcon());
        usuarioActual.getPublicaciones().add(nuevaPublicacion);
        administradorUsuario admin = new administradorUsuario("./UsuariosRegulares.pfb");
        admin.cargarArchivo();
        admin.getUsuarios().get(indiceActual).getPublicaciones().add(nuevaPublicacion);
        admin.escribirArchivo();
        RefreshMuroPersonalUsuario();

        JOptionPane.showMessageDialog(jd_crearPublicacion, "Post ingresado correctamente");
        jd_crearPublicacion.setVisible(false);
        lb_subirMedia.setIcon(null);
        tf_crearPensamiento.setText("¿Qué estás pensando?");

    }//GEN-LAST:event_bt_publicarMouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        crearPublicacion();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        crearPublicacion();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jl_muroPersonalAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_muroPersonalAdminMouseClicked
        jd_muroPrincipalAdministrador.setVisible(false);
        jd_muroPersonalAdministrador.pack();
        jd_muroPersonalAdministrador.setLocationRelativeTo(null);
        jd_muroPersonalAdministrador.setVisible(true);
    }//GEN-LAST:event_jl_muroPersonalAdminMouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        jd_muroPersonalAdministrador.setVisible(false);
        jd_muroPersonalAdministrador.pack();
        jd_muroPersonalAdministrador.setLocationRelativeTo(null);
        jd_muroPrincipalAdministrador.setVisible(true);
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        crearPublicacion();
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        crearPublicacion();
    }//GEN-LAST:event_jLabel49MouseClicked

    private void bt_cerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrarSesionMouseEntered
        bt_cerrarSesion.setBackground(new Color(255, 24, 86));
    }//GEN-LAST:event_bt_cerrarSesionMouseEntered

    private void bt_cerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrarSesionMouseExited
        bt_cerrarSesion.setBackground(new Color(255, 80, 107));
    }//GEN-LAST:event_bt_cerrarSesionMouseExited

    private void bt_cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cerrarSesionMouseClicked
        jd_muroPersonal.dispose();
        lb_imagenPrincipal1.setIcon(null);
        lb_imagenPrincipal2.setIcon(null);
        lb_imagenPublicacion1.setIcon(null);
        lb_imagenPublicacion2.setIcon(null);
        tf_textoPubPers1.setText("");
        tf_textoPubPers2.setText("");
        tf_likesPers1.setText("");
        tf_likesPers2.setText("");
        tf_textoPubPrin1.setText("");
        tf_textoPubPrin2.setText("");
        tf_likesPrin1.setText("");
        tf_likesPrin2.setText("");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }//GEN-LAST:event_bt_cerrarSesionMouseClicked

    private void lb_proPicRegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_proPicRegMouseClicked
        JFileChooser fc = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Imagenes", "png", "jpg", "jpeg", "gif");
        fc.setMultiSelectionEnabled(false);
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(jd_muroPrincipal);
        Image img;
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            img = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(170, 140, 0);
            this.lb_proPicReg.setIcon(new ImageIcon(img));
            lb_proPicPrincipalReg.setIcon(usuarioActual.getFotografia());
        }

        administradorUsuario admin = new administradorUsuario("./UsuariosRegulares.pfb");
        admin.cargarArchivo();
        for (Usuario usuario : admin.getUsuarios()) {
            if (usuario.getNombre().equals(usuarioActual.getNombre())) {
                usuario.setFotografia(lb_proPicReg.getIcon());

            }
        }
        admin.escribirArchivo();

    }//GEN-LAST:event_lb_proPicRegMouseClicked

    private void bt_agregarAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarAdminMouseClicked
        jd_muroPersonalAdministrador.dispose();
        jd_createAdmin.pack();
        jd_createAdmin.setLocationRelativeTo(null);
        jd_createAdmin.setVisible(true);
    }//GEN-LAST:event_bt_agregarAdminMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jd_muroPersonalAdministrador.dispose();
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1MouseClicked

    private void bt_reproductorPersAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_reproductorPersAdminMouseClicked
        ReproductorMusical();
    }//GEN-LAST:event_bt_reproductorPersAdminMouseClicked

    private void lb_proPicAdminPersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_proPicAdminPersMouseClicked
        JFileChooser fc = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Imagenes", "png", "jpg", "jpeg", "gif");
        fc.setMultiSelectionEnabled(false);
        fc.setFileFilter(filtro);
        File archivo;
        int op = fc.showOpenDialog(jd_muroPrincipal);
        Image img;
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
            img = Toolkit.getDefaultToolkit().createImage(archivo.getPath()).getScaledInstance(190, 148, 0);
            this.lb_proPicAdminPers.setIcon(new ImageIcon(img));
            lb_proPicPrincipalAdmin.setIcon(usuarioActual.getFotografia());
        }

        administradorUsuario admin = new administradorUsuario("./Administradores.pfb");
        admin.cargarArchivo();
        for (Usuario usuario : admin.getUsuarios()) {
            if (usuario.getNombre().equals(usuarioActual.getNombre())) {
                usuario.setFotografia(lb_proPicAdminPers.getIcon());

            }
        }
        admin.escribirArchivo();

    }//GEN-LAST:event_lb_proPicAdminPersMouseClicked

    private void PlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PlayMouseClicked

    private void bt_agregarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_agregarAmigoMouseClicked
        administradorUsuario admin = new administradorUsuario("./UsuariosRegulares.pfb");
        boolean encontrado = false;
        admin.cargarArchivo();
        for (Usuario reg : admin.getUsuarios()) {
            if (tf_nombreSugerencia.getText().equals(reg.getNombre())) {
                reg.getSolicitudes().add(usuarioActual.getNombre());
                encontrado = true;
            }
        }

        if (!encontrado) {
            admin = new administradorUsuario("./Administradores.pfb");
            admin.cargarArchivo();
            for (Usuario administrador : admin.getUsuarios()) {
                if (tf_nombreSugerencia.getText().equals(administrador.getNombre())) {
                    administrador.getSolicitudes().add(usuarioActual.getNombre());
                }
            }
        }

    }//GEN-LAST:event_bt_agregarAmigoMouseClicked

    private void bt_verSolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_verSolicitudesMouseClicked
        if (!usuarioActual.getSolicitudes().isEmpty()) {
            boolean encontrado = false;
            administradorUsuario admin = new administradorUsuario("./UsuariosRegulares.pfb");
            admin.cargarArchivo();
            for (Usuario reg : admin.getUsuarios()) {
                if (reg.getNombre().equals(usuarioActual.getSolicitudes().get(0))) {
                    lb_nombreSolicitud.setText(reg.getNombre());
                    ImageIcon icono = (ImageIcon) reg.getFotografia();
                    Image icono2 = (Image) icono.getImage();
                    Image renderizada = icono2.getScaledInstance(130, 100, Image.SCALE_SMOOTH);
                    Icon renderizado2 = new ImageIcon(renderizada);
                    lb_imgSolicitud.setIcon(renderizado2);
                    encontrado = true;
                }
            }

            if (!encontrado) {
                admin = new administradorUsuario("./Administradores.pfb");
                admin.cargarArchivo();
                for (Usuario administrador : admin.getUsuarios()) {
                    if (administrador.getNombre().equals(usuarioActual.getSolicitudes().get(0))) {
                        lb_nombreSolicitud.setText(administrador.getNombre());
                        ImageIcon icono = (ImageIcon) administrador.getFotografia();
                        Image icono2 = (Image) icono.getImage();
                        Image renderizada = icono2.getScaledInstance(130, 100, Image.SCALE_SMOOTH);
                        Icon renderizado2 = new ImageIcon(renderizada);
                        lb_imgSolicitud.setIcon(renderizado2);
                    }
                }
            }

            jd_solicitud.pack();
            jd_solicitud.setLocationRelativeTo(jd_muroPersonal);
            jd_solicitud.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(jd_muroPersonal, "No tienes solicitudes pendientes.");
        }
    }//GEN-LAST:event_bt_verSolicitudesMouseClicked

    private void bt_aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_aceptarMouseClicked
        boolean encontrado = false;
        administradorUsuario admin = new administradorUsuario("./UsuariosRegulares.pfb");
        admin.cargarArchivo();
        for (Usuario reg : admin.getUsuarios()) {
            if (reg.getNombre().equals(usuarioActual.getSolicitudes().get(0))) {
                reg.getAmigos().add(usuarioActual);
                usuarioActual.getAmigos().add(reg);
                encontrado = true;
            }
        }

        if (!encontrado) {
            admin = new administradorUsuario("./Administradores.pfb");
            admin.cargarArchivo();
            for (Usuario administrador : admin.getUsuarios()) {
                if (administrador.getNombre().equals(usuarioActual.getSolicitudes().get(0))) {
                    administrador.getAmigos().add(usuarioActual);
                    usuarioActual.getAmigos().add(administrador);
                }
            }
        }

        JOptionPane.showMessageDialog(jd_solicitud, "Ahora " + lb_nombreSolicitud + " y tú, son amigos!");
    }//GEN-LAST:event_bt_aceptarMouseClicked

    private void bt_rechazarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_rechazarMouseClicked
        usuarioActual.getSolicitudes().remove(0);
        JOptionPane.showMessageDialog(jd_solicitud, "Has rechazado la solicitud de " + lb_nombreSolicitud.getText() + ".");
    }//GEN-LAST:event_bt_rechazarMouseClicked

    private void bt_modificarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarUsuarioMouseClicked
        administradorUsuario u = new administradorUsuario("./UsuariosRegulares.pfb");
        u.cargarArchivo();
        DefaultComboBoxModel e = new DefaultComboBoxModel(u.getUsuarios().toArray());
        cb_usuariosRegulares.setModel(e);

        jd_modificarUsuarios.pack();
        jd_modificarUsuarios.setLocationRelativeTo(null);
        jd_modificarUsuarios.setVisible(true);
    }//GEN-LAST:event_bt_modificarUsuarioMouseClicked

    private void bt_eliminarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarUsuarioMouseClicked
        administradorUsuario u = new administradorUsuario("./UsuariosRegulares.pfb");
        u.cargarArchivo();
        DefaultComboBoxModel ee = new DefaultComboBoxModel(u.getUsuarios().toArray());
        cb_usuariosRegularesEliminar.setModel(ee);

        jd_eliminarUsuario.pack();
        jd_eliminarUsuario.setLocationRelativeTo(null);
        jd_eliminarUsuario.setVisible(true);

    }//GEN-LAST:event_bt_eliminarUsuarioMouseClicked

    private void cb_usuariosRegularesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_usuariosRegularesItemStateChanged

        if (evt.getStateChange() == 1) {
            Usuario usuario = (Usuario) cb_usuariosRegulares.getSelectedItem();
            pos = cb_usuariosRegulares.getSelectedIndex();
            if (usuario != null) {
                tf_nuevoNombre.setText(usuario.getNombre());
                tf_nicknameNuevo.setText(usuario.getNickname());
                tf_contraseñaNueva.setText(usuario.getContrasenia());
                tf_paisNuevo.setText(usuario.getPais());
                int mes1 = usuario.getFechaNacimiento().getMonth();
                String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
                String mes = meses[mes1];
                sp_nuevoMes.setValue(mes);
                sp_nuevoAño.setValue(usuario.getFechaNacimiento().getYear());
                sp_nuevoDia.setValue(usuario.getFechaNacimiento().getDate());
                if (usuario.getFotografia() == null) {
                    lb_nuevaFotoPerfil.setIcon(null);
                } else {
                    ImageIcon icono = (ImageIcon) usuario.getFotografia();
                    Image icono2 = (Image) icono.getImage();
                    Image renderizada = icono2.getScaledInstance(145, 124, Image.SCALE_SMOOTH);
                    Icon renderizado2 = new ImageIcon(renderizada);
                    lb_nuevaFotoPerfil.setIcon(renderizado2);
                }
            }
        }
    }//GEN-LAST:event_cb_usuariosRegularesItemStateChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int dia11;
        int mes1;
        int año1;
        String mesFromSp = sp_nuevoMes.getValue().toString();

        if (mesFromSp.equals("Enero")) {
            mes1 = 0;
        } else if (mesFromSp.equals("Febrero")) {
            mes1 = 1;
        } else if (mesFromSp.equals("Marzo")) {
            mes1 = 2;
        } else if (mesFromSp.equals("Abril")) {
            mes1 = 3;
        } else if (mesFromSp.equals("Mayo")) {
            mes1 = 4;
        } else if (mesFromSp.equals("Junio")) {
            mes1 = 5;
        } else if (mesFromSp.equals("Julio")) {
            mes1 = 6;
        } else if (mesFromSp.equals("Agosto")) {
            mes1 = 7;
        } else if (mesFromSp.equals("Septiembre")) {
            mes1 = 8;
        } else if (mesFromSp.equals("Octubre")) {
            mes1 = 9;
        } else if (mesFromSp.equals("Noviembre")) {
            mes1 = 10;
        } else {
            mes1 = 11;
        }

        dia11 = (int) sp_nuevoDia.getValue();
        año1 = (int) sp_nuevoAño.getValue();
        Date nacimiento = new Date(año1, mes1, dia11);
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_usuariosRegulares.getModel();
        Usuario usuario1 = (Usuario) modelo.getElementAt(pos);
        usuario1.setNombre(tf_nuevoNombre.getText());
        usuario1.setContrasenia(tf_contraseñaNueva.getText());
        usuario1.setNickname(tf_nicknameNuevo.getText());
        usuario1.setPais(tf_paisNuevo.getText());
        usuario1.setFechaNacimiento(nacimiento);

        administradorUsuario usuario = new administradorUsuario("./UsuariosRegulares.pfb");
        usuario.cargarArchivo();
        usuario.getUsuarios().get(pos).setNombre(tf_nuevoNombre.getText());
        usuario.getUsuarios().get(pos).setContrasenia(tf_contraseñaNueva.getText());
        usuario.getUsuarios().get(pos).setNickname(tf_nicknameNuevo.getText());
        usuario.getUsuarios().get(pos).setPais(tf_paisNuevo.getText());
        usuario.getUsuarios().get(pos).setFechaNacimiento(nacimiento);
        usuario.escribirArchivo();
        JOptionPane.showMessageDialog(jd_muroPersonalAdministrador, "Usuario modificado exitosamente");

        jd_modificarUsuarios.setVisible(false);
        jd_muroPersonalAdministrador.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        JFileChooser f = new JFileChooser();
        FileNameExtensionFilter r = new FileNameExtensionFilter("Imagenes", "png", "peg");
        f.setFileFilter(r);
        int opcion = f.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            File file;
            file = f.getSelectedFile();
            Image img = Toolkit.getDefaultToolkit().createImage(file.getPath()).getScaledInstance(146, 124, 0);
            this.lb_nuevaFotoPerfil.setIcon(new ImageIcon(img));

            DefaultComboBoxModel e = (DefaultComboBoxModel) cb_usuariosRegulares.getModel();
            Usuario ts = (Usuario) e.getElementAt(pos);
            ts.setFotografia(lb_nuevaFotoPerfil.getIcon());
            cb_usuariosRegulares.setModel(e);

            administradorUsuario admin2 = new administradorUsuario("./UsuariosRegulares.pfb");
            admin2.cargarArchivo();
            admin2.getUsuarios().get(pos).setFotografia(lb_nuevaFotoPerfil.getIcon());
            JOptionPane.showMessageDialog(jd_muroPersonalAdministrador, "Foto de Perfil Modificada exitosamente");
            admin2.escribirArchivo();
        } else {
            JOptionPane.showMessageDialog(jd_muroPersonalAdministrador, "No ha modificado nada.");

            jd_muroPersonalAdministrador.setVisible(true);
            jd_modificarUsuarios.setVisible(false);

        }

    }//GEN-LAST:event_jButton3MouseClicked

    private void bt_listarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_listarUsuarioMouseClicked
        jd_muroPersonalAdministrador.dispose();
        jd_createUser.pack();
        jd_createUser.setLocationRelativeTo(null);
        jd_createUser.setVisible(true);
    }//GEN-LAST:event_bt_listarUsuarioMouseClicked

    private void tf_paisEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_paisEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_paisEliminarActionPerformed

    private void cb_usuariosRegularesEliminarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_usuariosRegularesEliminarItemStateChanged

        if (evt.getStateChange() == 1) {
            Usuario usuario2 = (Usuario) cb_usuariosRegularesEliminar.getSelectedItem();
            pos = cb_usuariosRegularesEliminar.getSelectedIndex();
            if (usuario2 != null) {
                tf_nombreEliminar.setText(usuario2.getNombre());
                tf_contraseñaEliminar.setText(usuario2.getContrasenia());
                tf_nicknameEliminar.setText(usuario2.getNickname());
                tf_paisEliminar.setText(usuario2.getPais());
                sp_diaEliminar.setValue(usuario2.getFechaNacimiento().getDate());
                int mes2 = usuario2.getFechaNacimiento().getMonth();
                String[] meses2 = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
                String mesess = meses2[mes2];
                sp_mesEliminar.setValue(mesess);
                sp_añoEliminar.setValue(usuario2.getFechaNacimiento().getYear());
                if (usuario2.getFotografia() == null) {
                    lb_imagenEliminar.setIcon(null);
                } else {
                    ImageIcon icono = (ImageIcon) usuario2.getFotografia();
                    Image icono2 = (Image) icono.getImage();
                    Image renderizada = icono2.getScaledInstance(175, 146, Image.SCALE_SMOOTH);
                    Icon renderizado2 = new ImageIcon(renderizada);
                    lb_imagenEliminar.setIcon(renderizado2);
                }
            }
        }

    }//GEN-LAST:event_cb_usuariosRegularesEliminarItemStateChanged

    private void jb_eliminarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminarUsuarioMouseClicked
        administradorUsuario admin = new administradorUsuario("./UsuariosRegulares.pfb");
admin.cargarArchivo();
DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_usuariosRegularesEliminar.getModel();
int eliminarUsuario = cb_usuariosRegularesEliminar.getSelectedIndex(); 
if (admin.getUsuarios() != null && eliminarUsuario != -1 && eliminarUsuario < modelo.getSize()) { 
    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar ese usuario?", "Eliminar", JOptionPane.YES_NO_OPTION);
    if (confirmacion == JOptionPane.YES_OPTION) {
        modelo.removeElementAt(eliminarUsuario);
        admin.getUsuarios().remove(eliminarUsuario);
        cb_usuariosRegularesEliminar.setModel(modelo);
        admin.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente");
    } else {
        JOptionPane.showMessageDialog(this, "Su usuario no ha sido eliminado");
    }
} else {
    JOptionPane.showMessageDialog(this, "Selecciona un usuario válido");
}
    }//GEN-LAST:event_jb_eliminarUsuarioMouseClicked

    private void bt_likePubPers1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_likePubPers1MouseClicked
 //El like aqui se agrega
    }//GEN-LAST:event_bt_likePubPers1MouseClicked

    public void ReproductorMusical() {
        jd_reproductorMusical.setVisible(true);
        jd_reproductorMusical.pack();
        jd_reproductorMusical.setLocationRelativeTo(null);
    }

    public void crearPublicacion() {
        jd_crearPublicacion.setVisible(true);
        jd_crearPublicacion.pack();
        jd_crearPublicacion.setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarMusica;
    private javax.swing.JButton Pausa;
    private javax.swing.JButton Play;
    private javax.swing.JButton Stop;
    private javax.swing.JButton bt_CreateNewAccount;
    private javax.swing.JButton bt_abrirReproductor;
    private javax.swing.JButton bt_aceptar;
    private javax.swing.JButton bt_agendaAdmin;
    private javax.swing.JButton bt_agendaRegular;
    private javax.swing.JButton bt_agregarAdmin;
    private javax.swing.JButton bt_agregarAmigo;
    private javax.swing.JButton bt_calendarioPersAdmin;
    private javax.swing.JButton bt_cerrarSesion;
    private javax.swing.JButton bt_chatAdmin;
    private javax.swing.JButton bt_chatPersAdmin;
    private javax.swing.JButton bt_chatRegular;
    private javax.swing.JButton bt_comentarPubPers1;
    private javax.swing.JButton bt_comentarPubPers2;
    private javax.swing.JButton bt_comentarPubPers4;
    private javax.swing.JButton bt_comentarPubPers5;
    private javax.swing.JButton bt_eliminarUsuario;
    private javax.swing.JButton bt_homeMuroAdmin;
    private javax.swing.JButton bt_homeMuroRegular;
    private javax.swing.JButton bt_likePubPers1;
    private javax.swing.JButton bt_likePubPers2;
    private javax.swing.JButton bt_likePubPers4;
    private javax.swing.JButton bt_likePubPers5;
    private javax.swing.JButton bt_listarUsuario;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_modificarUsuario;
    private javax.swing.JButton bt_publicar;
    private javax.swing.JButton bt_rechazar;
    private javax.swing.JButton bt_registrarAdmin;
    private javax.swing.JButton bt_registrarteU;
    private javax.swing.JButton bt_reproductorAdmin;
    private javax.swing.JButton bt_reproductorPersAdmin;
    private javax.swing.JButton bt_reproductorRegular;
    private javax.swing.JButton bt_verSolicitudes;
    private javax.swing.JComboBox<String> cb_usuariosRegulares;
    private javax.swing.JComboBox<String> cb_usuariosRegularesEliminar;
    private javax.swing.JPanel header_register1;
    private javax.swing.JPanel header_registerAdmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton jb_eliminarUsuario;
    private javax.swing.JDialog jd_calendario;
    private javax.swing.JDialog jd_crearPublicacion;
    private javax.swing.JDialog jd_createAdmin;
    private javax.swing.JDialog jd_createUser;
    private javax.swing.JDialog jd_eliminarUsuario;
    private javax.swing.JDialog jd_modificarUsuarios;
    private javax.swing.JDialog jd_muroPersonal;
    private javax.swing.JDialog jd_muroPersonalAdministrador;
    private javax.swing.JDialog jd_muroPrincipal;
    private javax.swing.JDialog jd_muroPrincipalAdministrador;
    private javax.swing.JDialog jd_reproductorMusical;
    private javax.swing.JDialog jd_solicitud;
    private javax.swing.JLabel jl_muroPersonalAdmin;
    private javax.swing.JLabel lb_agregarFoto;
    private javax.swing.JLabel lb_agregarVideo;
    private javax.swing.JLabel lb_exitBttnAddAdmin;
    private javax.swing.JLabel lb_exitBttnRegister1;
    private javax.swing.JLabel lb_exitTxt;
    private javax.swing.JLabel lb_imagenEliminar;
    private javax.swing.JLabel lb_imagenPrincipal1;
    private javax.swing.JLabel lb_imagenPrincipal2;
    private javax.swing.JLabel lb_imagenPublicacion1;
    private javax.swing.JLabel lb_imagenPublicacion2;
    private javax.swing.JLabel lb_imgSolicitud;
    private javax.swing.JLabel lb_imgSugerencia;
    private javax.swing.JLabel lb_nombreSolicitud;
    private javax.swing.JLabel lb_nuevaFechaNacimiento;
    private javax.swing.JLabel lb_nuevaFotoPerfil;
    private javax.swing.JLabel lb_nuevoNombre;
    private javax.swing.JLabel lb_proPicAdminPers;
    private javax.swing.JLabel lb_proPicPrincipalAdmin;
    private javax.swing.JLabel lb_proPicPrincipalReg;
    private javax.swing.JLabel lb_proPicReg;
    private javax.swing.JLabel lb_subirMedia;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPasswordField pf_passwordConfirmAdmin;
    private javax.swing.JPasswordField pf_passwordConfirmU;
    private javax.swing.JPasswordField pf_passwordCreateAdmin;
    private javax.swing.JPasswordField pf_passwordCreateU;
    private javax.swing.JPanel pn_exitBttn;
    private javax.swing.JPanel pn_exitBttnAddAdmin;
    private javax.swing.JPanel pn_exitBttnRegister1;
    private javax.swing.JPanel pn_header;
    private javax.swing.JPanel pn_postPrincipal1;
    private javax.swing.JPanel pn_postPrincipal2;
    private javax.swing.JLabel reproductorTexto;
    private javax.swing.JSpinner sp_añoEliminar;
    private javax.swing.JSpinner sp_dateAdmin;
    private javax.swing.JSpinner sp_dateU;
    private javax.swing.JSpinner sp_diaEliminar;
    private javax.swing.JSpinner sp_mesEliminar;
    private javax.swing.JSpinner sp_monthAdmin;
    private javax.swing.JSpinner sp_monthU;
    private javax.swing.JSpinner sp_nuevoAño;
    private javax.swing.JSpinner sp_nuevoDia;
    private javax.swing.JSpinner sp_nuevoMes;
    private javax.swing.JSpinner sp_yearAdmin;
    private javax.swing.JSpinner sp_yearU;
    private javax.swing.JTextField tf_apellidoAdmin;
    private javax.swing.JTextField tf_apellidoRegistrarU;
    private javax.swing.JTextField tf_apodoAdmin;
    private javax.swing.JTextField tf_apodoRegistrarU;
    private javax.swing.JTextField tf_contraseñaEliminar;
    private javax.swing.JTextField tf_contraseñaNueva;
    private javax.swing.JTextField tf_crearPensamiento;
    private javax.swing.JTextField tf_likesPers1;
    private javax.swing.JTextField tf_likesPers2;
    private javax.swing.JTextField tf_likesPrin1;
    private javax.swing.JTextField tf_likesPrin2;
    private javax.swing.JTextField tf_nicknameEliminar;
    private javax.swing.JTextField tf_nicknameNuevo;
    private javax.swing.JTextField tf_nombreAdmin;
    private javax.swing.JTextField tf_nombreEliminar;
    private javax.swing.JTextField tf_nombreRegistrarU;
    private javax.swing.JTextField tf_nombreSugerencia;
    private javax.swing.JTextField tf_nuevoNombre;
    private javax.swing.JTextField tf_paisAdmin;
    private javax.swing.JTextField tf_paisCreateU;
    private javax.swing.JTextField tf_paisEliminar;
    private javax.swing.JTextField tf_paisNuevo;
    private javax.swing.JTextField tf_textoPubPers1;
    private javax.swing.JTextField tf_textoPubPers2;
    private javax.swing.JTextField tf_textoPubPrin1;
    private javax.swing.JTextField tf_textoPubPrin2;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables

    static Usuario usuarioActual;
    static ArrayList<Usuario> amigos;
    static int indiceActual;
    static int indiceAmigo;
    static int pos;

    public void LlenarEspacios() {

        if (tf_nombreRegistrarU.getText().equals("")) {
            tf_nombreRegistrarU.setText("Nombre");
            tf_nombreRegistrarU.setForeground(Color.gray);
        }
        if (tf_apellidoRegistrarU.getText().equals("")) {
            tf_apellidoRegistrarU.setText("Apellido");
            tf_apellidoRegistrarU.setForeground(Color.gray);
        }

        if (tf_apodoRegistrarU.getText().equals("")) {
            tf_apodoRegistrarU.setText("Apodo");
            tf_apodoRegistrarU.setForeground(Color.gray);
        }

        if (pf_passwordConfirmU.getText().equals("")) {
            pf_passwordConfirmU.setText("Contraseña");
            pf_passwordConfirmU.setForeground(Color.gray);
        }

        if (pf_passwordCreateU.getText().equals("")) {
            pf_passwordCreateU.setText("Contraseña");
            pf_passwordCreateU.setForeground(Color.gray);
        }

        if (tf_paisCreateU.getText().equals("")) {
            tf_paisCreateU.setText("País o región");
            tf_paisCreateU.setForeground(Color.gray);
        }
    }

    public void LlenarEspaciosAdmin() {

        if (tf_nombreAdmin.getText().equals("")) {
            tf_nombreAdmin.setText("Nombre");
            tf_nombreAdmin.setForeground(Color.gray);
        }
        if (tf_apellidoAdmin.getText().equals("")) {
            tf_apellidoAdmin.setText("Apellido");
            tf_apellidoAdmin.setForeground(Color.gray);
        }

        if (tf_apodoAdmin.getText().equals("")) {
            tf_apodoAdmin.setText("Apodo");
            tf_apodoAdmin.setForeground(Color.gray);
        }

        if (pf_passwordConfirmAdmin.getText().equals("")) {
            pf_passwordConfirmAdmin.setText("Contraseña");
            pf_passwordConfirmAdmin.setForeground(Color.gray);
        }

        if (pf_passwordCreateAdmin.getText().equals("")) {
            pf_passwordCreateAdmin.setText("Contraseña");
            pf_passwordCreateAdmin.setForeground(Color.gray);
        }

        if (tf_paisAdmin.getText().equals("")) {
            tf_paisAdmin.setText("País o región");
            tf_paisAdmin.setForeground(Color.gray);
        }
    }

    private boolean UsuarioValido() {
        String nombreCompleto = tf_nombreRegistrarU.getText() + " " + tf_apellidoRegistrarU.getText();
        if (!ExisteUsuario(nombreCompleto)) {
            if (tf_nombreRegistrarU.getText().equalsIgnoreCase("nombre")) {
                JOptionPane.showMessageDialog(jd_createUser, "Tu nombre no puede ser \"Nombre\".");
            } else if (tf_apellidoRegistrarU.getText().equalsIgnoreCase("apellido")) {
                JOptionPane.showMessageDialog(jd_createUser, "Tu apellido no puede ser \"Apellido\".");
            } else if (pf_passwordCreateU.getText().equalsIgnoreCase("Contraseña")) {
                JOptionPane.showMessageDialog(jd_createUser, "Tu contraseña no puede ser \"Contraseña\".");
            } else if (tf_paisCreateU.getText().equalsIgnoreCase("País o región")) {
                JOptionPane.showMessageDialog(jd_createUser, "Por favor ingresa tu país o región.");
            } else {
                return true;
            }
        }

        return false;
    }

    private boolean ExisteUsuario(String nombreCompleto) {
        boolean existe = false;

        administradorUsuario admin = new administradorUsuario("./UsuariosRegulares.pfb");
        admin.cargarArchivo();
        for (Object regular : admin.getUsuarios()) {
            if (((Usuario) regular).getNombre().equalsIgnoreCase(nombreCompleto)) {
                return true;
            }
        }

        if (!existe) {
            admin = new administradorUsuario("./Administradores.pfb");
            admin.cargarArchivo();
            for (Object administrador : admin.getUsuarios()) {
                if (((Usuario) administrador).getNombre().equalsIgnoreCase(nombreCompleto)) {
                    return true;
                }
            }
        }
        return existe;
    }

    private boolean AdminValido() {
        String nombreCompleto = tf_nombreAdmin.getText() + " " + tf_apellidoAdmin.getText();
        if (!ExisteUsuario(nombreCompleto)) {
            if (tf_nombreAdmin.getText().equalsIgnoreCase("nombre")) {
                JOptionPane.showMessageDialog(jd_createAdmin, "Tu nombre no puede ser \"Nombre\".");
            } else if (tf_apellidoAdmin.getText().equalsIgnoreCase("apellido")) {
                JOptionPane.showMessageDialog(jd_createAdmin, "Tu apellido no puede ser \"Apellido\".");
            } else if (pf_passwordCreateAdmin.getText().equalsIgnoreCase("Contraseña")) {
                JOptionPane.showMessageDialog(jd_createAdmin, "Tu contraseña no puede ser \"Contraseña\".");
            } else if (tf_paisAdmin.getText().equalsIgnoreCase("País o región")) {
                JOptionPane.showMessageDialog(jd_createAdmin, "Por favor ingresa tu país o región.");
            } else {
                return true;
            }
        }

        return false;
    }

    private void RefreshMuroPersonalUsuario() {
        SecureRandom sr = new SecureRandom();
        int random = sr.nextInt(1, 3);

        try {
            Publicacion publicacion1 = usuarioActual.getPublicaciones().get(usuarioActual.getPublicaciones().size() - 1);
            if (publicacion1.getImagen() == null) {
                lb_imagenPublicacion1.setIcon(null);
            } else {
                ImageIcon icono = (ImageIcon) publicacion1.getImagen();
                Image icono2 = (Image) icono.getImage();
                Image renderizada = icono2.getScaledInstance(106, 110, Image.SCALE_SMOOTH);
                Icon renderizado2 = new ImageIcon(renderizada);
                lb_imagenPublicacion1.setIcon(renderizado2);
            }
            tf_textoPubPers1.setText(publicacion1.getPublicador() + ": " + publicacion1.getComentario());
            tf_likesPers1.setText(Integer.toString(publicacion1.getLikes()));

            Publicacion publicacion2 = usuarioActual.getPublicaciones().get(usuarioActual.getPublicaciones().size() - 2);
            if (publicacion2.getImagen() == null) {
            } else {
                ImageIcon icono = (ImageIcon) publicacion2.getImagen();
                Image icono2 = (Image) icono.getImage();
                Image renderizada = icono2.getScaledInstance(106, 110, Image.SCALE_SMOOTH);
                Icon renderizado2 = new ImageIcon(renderizada);
                lb_imagenPublicacion2.setIcon(renderizado2);
            }
            tf_textoPubPers2.setText(publicacion2.getPublicador() + ": " + publicacion2.getComentario());
            tf_likesPers2.setText(Integer.toString(publicacion2.getLikes()));

            administradorUsuario admin;

            switch (random) {
                case 1:
                    admin = new administradorUsuario("./UsuariosRegulares.pfb");
                    admin.cargarArchivo();
                    indiceAmigo = sr.nextInt(0, admin.getUsuarios().size());
                    Usuario sugerencia = admin.getUsuarios().get(indiceAmigo);
                    ImageIcon icono = (ImageIcon) sugerencia.getFotografia();
                    Image icono2 = (Image) icono.getImage();
                    Image renderizada = icono2.getScaledInstance(75, 60, Image.SCALE_SMOOTH);
                    Icon renderizado2 = new ImageIcon(renderizada);
                    lb_imgSugerencia.setIcon(renderizado2);
                    tf_nombreSugerencia.setText(sugerencia.getNombre());
                    break;
                case 2:
                    admin = new administradorUsuario("./Administradores.pfb");
                    admin.cargarArchivo();
                    indiceAmigo = sr.nextInt(0, admin.getUsuarios().size());
                    sugerencia = admin.getUsuarios().get(indiceAmigo);
                    icono = (ImageIcon) sugerencia.getFotografia();
                    icono2 = (Image) icono.getImage();
                    renderizada = icono2.getScaledInstance(75, 60, Image.SCALE_SMOOTH);
                    renderizado2 = new ImageIcon(renderizada);
                    lb_imgSugerencia.setIcon(renderizado2);
                    tf_nombreSugerencia.setText(sugerencia.getNombre());
                    break;
                default:
            }

        } catch (IndexOutOfBoundsException e) {

        }

    }

    private void RefreshMuroPrincipal() {
        SecureRandom sr = new SecureRandom();
        int seleccion = sr.nextInt(1, 3);
        Usuario amigo1;
        Usuario amigo2;

        try {
            if (usuarioActual.getAmigos().isEmpty()) {

            } else {
                switch (seleccion) {
                    case 1: //2 amigos
                        amigo1 = usuarioActual.getAmigos().get(sr.nextInt(0, usuarioActual.getAmigos().size()));
                        amigo2 = usuarioActual.getAmigos().get(sr.nextInt(0, usuarioActual.getAmigos().size()));
                        if (amigo1.getPublicaciones().isEmpty() || amigo2.getPublicaciones().isEmpty()) {

                        } else {
                            Publicacion publicacion1 = amigo1.getPublicaciones().get(sr.nextInt(0, amigo1.getPublicaciones().size()));
                            Publicacion publicacion2 = amigo2.getPublicaciones().get(sr.nextInt(0, amigo2.getPublicaciones().size()));
                            tf_textoPubPrin1.setText(publicacion1.getPublicador() + ": " + publicacion1.getComentario());
                            lb_imagenPrincipal1.setIcon(publicacion1.getImagen());
                            tf_likesPrin1.setText(Integer.toString(publicacion1.getLikes()));

                            tf_textoPubPrin2.setText(publicacion2.getPublicador() + ": " + publicacion2.getComentario());
                            lb_imagenPrincipal2.setIcon(publicacion2.getImagen());
                            tf_likesPrin2.setText(Integer.toString(publicacion2.getLikes()));
                        }

                        break;
                    case 2: //1 amigo, 1 personal
                        amigo1 = usuarioActual.getAmigos().get(sr.nextInt(0, usuarioActual.getAmigos().size()));
                        if (amigo1.getPublicaciones().isEmpty() || usuarioActual.getPublicaciones().isEmpty()) {

                        } else {
                            Publicacion publicacion3 = amigo1.getPublicaciones().get(sr.nextInt(0, amigo1.getPublicaciones().size()));
                            Publicacion publicacion4 = usuarioActual.getPublicaciones().get(sr.nextInt(0, usuarioActual.getPublicaciones().size()));

                            tf_textoPubPrin1.setText(publicacion3.getPublicador() + ": " + publicacion3.getComentario());
                            lb_imagenPrincipal1.setIcon(publicacion3.getImagen());
                            tf_likesPrin1.setText(Integer.toString(publicacion3.getLikes()));

                            tf_textoPubPrin2.setText(publicacion4.getPublicador() + ": " + publicacion4.getComentario());
                            lb_imagenPrincipal2.setIcon(publicacion4.getImagen());
                            tf_likesPrin2.setText(Integer.toString(publicacion4.getLikes()));
                        }

                        break;
                    default:
                }
            }

        } catch (IndexOutOfBoundsException e) {

        }

        lb_proPicPrincipalReg.setIcon(usuarioActual.getFotografia());
        lb_proPicReg.setIcon(usuarioActual.getFotografia());
    }
}
