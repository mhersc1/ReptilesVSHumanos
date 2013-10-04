/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Vistas.Tablero.TableroGUI;
import Vistas.Tablero.TableroGUIHMD;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import Vistas.Tablero.TableroGUIHMF;
import Vistas.Tablero.TableroGUIHMM;
/**
 *
 * @author OMAR
 */
public class Juego extends javax.swing.JPanel {
    private JuegoPrincipal juegoPrincipal;
    private TableroGUI tableroGUI;
    private TableroGUIHMF tableroGUIHMF;
    private TableroGUIHMM tableroGUIHMM;
    private TableroGUIHMD tableroGUIHMD;
    private int tipoJuego;
    private int nivel;
    public static final int HUMANOVSHUMANO=1;
    public static final int HUMANOVSMAQUINA=2;
    public static final int NIVELFACIL=1;
    public static final int NIVELMEDIO=2;
    public static final int NIVELDIFICIL=3;
    
    /**
     * Creates new form Juego
     */
    public Juego() {
       //initComponents();
        tableroGUI=new TableroGUI(5,8,true);
        myInitComponents();
    }
    public Juego(JuegoPrincipal juegoPrincipal,int tipoJuego) {
        //initComponents();
        //Entra aqui si es humano
        this.juegoPrincipal=juegoPrincipal;
        this.tipoJuego=tipoJuego;
        tableroGUI=new TableroGUI(5,8,true);
        myInitComponents();
        this.setBackground(new Color(0, 255, 153));
        juegoPrincipal.getContentPane().setBackground(new Color(0, 255, 153));
        tableroGUI.setJuegoHumanoHumano(this);
    }
    public Juego(JuegoPrincipal juegoPrincipal,int tipoJuego,int nivel) {
        //initComponents();
        this.juegoPrincipal=juegoPrincipal;
        this.tipoJuego=tipoJuego;
        this.nivel=nivel;
        if(this.tipoJuego==HUMANOVSMAQUINA&&this.nivel==NIVELFACIL){
            tableroGUIHMF=new TableroGUIHMF(5,8,true);
            myInitComponents();
            juegoPrincipal.getContentPane().setBackground(new Color(0, 255, 153));
        }
        else if(this.tipoJuego==HUMANOVSMAQUINA&&this.nivel==NIVELMEDIO){
            tableroGUIHMM=new TableroGUIHMM(5,8,true);
            myInitComponents();
            juegoPrincipal.getContentPane().setBackground(new Color(0, 255, 153));
        }
        else if(this.tipoJuego==HUMANOVSMAQUINA&&this.nivel==NIVELDIFICIL){
            tableroGUIHMD=new TableroGUIHMD(5,8,true);
            myInitComponents();
            juegoPrincipal.getContentPane().setBackground(new Color(0, 255, 153));
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAtras = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelReiniciar = new javax.swing.JLabel();
        labelTurno = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 153));

        labelAtras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAtras.setForeground(new java.awt.Color(102, 0, 102));
        labelAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.jpg"))); // NOI18N
        labelAtras.setText("Atras");
        labelAtras.setToolTipText("Volver atras");
        labelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Juego.this.mousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("VIDA SALVAJE");

        labelReiniciar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recargar.jpg"))); // NOI18N
        labelReiniciar.setText("Reiniciar Juego");

        labelTurno.setText("Turno :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel6)
                .addGap(123, 123, 123)
                .addComponent(labelAtras)
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(labelReiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTurno)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(labelReiniciar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTurno)
                        .addGap(72, 72, 72))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousePressed
        
        juegoPrincipal.remove(jLabel6);
        juegoPrincipal.remove(labelAtras);
        juegoPrincipal.remove(labelReiniciar);
        juegoPrincipal.remove(this);
        if(tipoJuego==HUMANOVSHUMANO){
            juegoPrincipal.remove(labelTurno);
            juegoPrincipal.remove(tableroGUI);
        }
        else if(tipoJuego==HUMANOVSMAQUINA&& nivel==NIVELFACIL)
            juegoPrincipal.remove(tableroGUIHMF);
         else if(tipoJuego==HUMANOVSMAQUINA&& nivel==NIVELMEDIO)
            juegoPrincipal.remove(tableroGUIHMM);
        else if(tipoJuego==HUMANOVSMAQUINA&& nivel==NIVELDIFICIL)
            juegoPrincipal.remove(tableroGUIHMD);
        juegoPrincipal.setLayout(new FlowLayout());
        juegoPrincipal.add(new MenuJuego(juegoPrincipal),BorderLayout.CENTER);
        juegoPrincipal.pack();
        juegoPrincipal.setLocationRelativeTo(null);
    }//GEN-LAST:event_mousePressed
     private void mousePressedReiniciar(java.awt.event.MouseEvent evt) {                              
        juegoPrincipal.remove(jLabel6);
        juegoPrincipal.remove(labelAtras);
        juegoPrincipal.remove(labelReiniciar);
        juegoPrincipal.remove(this);
        if(tipoJuego==HUMANOVSHUMANO){
            juegoPrincipal.remove(labelTurno);
            juegoPrincipal.remove(tableroGUI);
            juegoPrincipal.setLayout(new FlowLayout());
            juegoPrincipal.add(new Juego(juegoPrincipal,tipoJuego),BorderLayout.CENTER);}
        else if(tipoJuego==HUMANOVSMAQUINA&& nivel==NIVELFACIL){
            juegoPrincipal.remove(tableroGUIHMF);
            juegoPrincipal.setLayout(new FlowLayout());
            juegoPrincipal.add(new Juego(juegoPrincipal,tipoJuego,nivel),BorderLayout.CENTER);
        }
        else if(tipoJuego==HUMANOVSMAQUINA&& nivel==NIVELMEDIO){
            juegoPrincipal.remove(tableroGUIHMM);
            juegoPrincipal.setLayout(new FlowLayout());
            juegoPrincipal.add(new Juego(juegoPrincipal,tipoJuego,nivel),BorderLayout.CENTER);
        }
        else if(tipoJuego==HUMANOVSMAQUINA&& nivel==NIVELDIFICIL){
            juegoPrincipal.remove(tableroGUIHMD);
            juegoPrincipal.setLayout(new FlowLayout());
            juegoPrincipal.add(new Juego(juegoPrincipal,tipoJuego,nivel),BorderLayout.CENTER);
        }
        juegoPrincipal.pack();
        juegoPrincipal.setLocationRelativeTo(null);
        }          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelAtras;
    private javax.swing.JLabel labelReiniciar;
    private javax.swing.JLabel labelTurno;
    // End of variables declaration//GEN-END:variables
    //private javax.swing.JLabel imagenTurno;
    public JLabel getLabelTurno(){
        return this.labelTurno;
    }
    public void setLabelTurno(JLabel labelTurno){
        this.labelTurno=labelTurno;
    }
    private void myInitComponents() {//poner  imagen del turno
        jLabel6=new JLabel();
        labelAtras=new JLabel();
        labelReiniciar=new JLabel(); 
   
        jLabel6.setText("Vida Salvaje");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20));
        setBackground(new java.awt.Color(0, 255, 153));
        
        labelTurno= new  JLabel(); 
        labelTurno.setText("Turno A");
        labelTurno.setFont(new java.awt.Font("Tahoma", 0, 20));
        setBackground(new java.awt.Color(0, 255, 153));
        
        
        javax.swing.GroupLayout tableroGUILayout=null;//Maycol Zela
        
        
        
        if(tipoJuego==HUMANOVSHUMANO){
             tableroGUILayout= new javax.swing.GroupLayout(tableroGUI);
       
        tableroGUI.setLayout(tableroGUILayout);
        tableroGUILayout.setHorizontalGroup(
            tableroGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0,700, Short.MAX_VALUE)
        );
        tableroGUILayout.setVerticalGroup(
            tableroGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        
        

        labelAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.jpg"))); // NOI18N
        labelAtras.setText("Volver atras");
        labelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Juego.this.mousePressed(evt);
            }
        });
        labelReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recargar.jpg"))); // NOI18N
        labelReiniciar.setText("Reiniciar Juego");
        labelReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Juego.this.mousePressedReiniciar(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(juegoPrincipal.getContentPane());
        juegoPrincipal.getContentPane().setLayout(layout);
        
                    tableroGUILayout= new javax.swing.GroupLayout(tableroGUI);

               layout.setHorizontalGroup(
                   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addGap(30)
                   .addGroup(layout.createSequentialGroup()
                       .addComponent(jLabel6)
                       .addContainerGap(30, Short.MAX_VALUE))

                    .addGroup(layout.createSequentialGroup()
                       .addContainerGap()
                       .addComponent(tableroGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addGap(10)
                       .addComponent(labelTurno)
                       .addContainerGap(10, Short.MAX_VALUE)
                       )

                   .addGroup(layout.createSequentialGroup()
                       .addComponent(labelReiniciar)
                       .addContainerGap(40, Short.MAX_VALUE)
                       .addComponent(labelAtras)
                       .addContainerGap(40,Short.MAX_VALUE))
               );

               layout.setVerticalGroup(
                   layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addGap(50)
                       .addComponent(jLabel6)//Definimos tamaño del Label
                       .addGroup(layout.createParallelGroup()
                         .addGap(15)
                         .addComponent(tableroGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGap(10)
                         .addComponent(labelTurno)
                         .addGap(10)
                       )
                       
                       .addGroup(layout.createParallelGroup()
                           .addGap(30)
                           .addGap(30)
                           .addComponent(labelReiniciar)
                           .addGap(30)
                           .addComponent(labelAtras)
                           .addGap(50)
                       )
                       )
               );
        }
        else if(tipoJuego==HUMANOVSMAQUINA && nivel==NIVELFACIL){
                    tableroGUILayout= new javax.swing.GroupLayout(tableroGUIHMF);
       
                tableroGUIHMF.setLayout(tableroGUILayout);
                tableroGUILayout.setHorizontalGroup(
                    tableroGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0,500, Short.MAX_VALUE)
                );
                tableroGUILayout.setVerticalGroup(
                    tableroGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 400, Short.MAX_VALUE)
                );



                labelAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.jpg"))); // NOI18N
                labelAtras.setText("Volver atras");
                labelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mousePressed(java.awt.event.MouseEvent evt) {
                        Juego.this.mousePressed(evt);
                    }
                });
                labelReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recargar.jpg"))); // NOI18N
                labelReiniciar.setText("Reiniciar Juego");
                labelReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mousePressed(java.awt.event.MouseEvent evt) {
                        Juego.this.mousePressedReiniciar(evt);
                    }
                });
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(juegoPrincipal.getContentPane());
                juegoPrincipal.getContentPane().setLayout(layout);

                            tableroGUILayout= new javax.swing.GroupLayout(tableroGUIHMF);

                       layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                               .addGap(30)
                           .addGroup(layout.createSequentialGroup()
                               .addComponent(jLabel6)
                               .addContainerGap(30, Short.MAX_VALUE))

                            .addGroup(layout.createSequentialGroup()
                               .addContainerGap()
                               .addComponent(tableroGUIHMF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addContainerGap(176, Short.MAX_VALUE))

                           .addGroup(layout.createSequentialGroup()
                               .addComponent(labelReiniciar)
                               .addContainerGap(40, Short.MAX_VALUE)
                               .addComponent(labelAtras)
                               .addContainerGap(40,Short.MAX_VALUE))
                       );

                       layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                               .addGap(50)
                               .addComponent(jLabel6)//Definimos tamaño del Label
                               .addGap(40)
                               .addComponent(tableroGUIHMF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addContainerGap(13, Short.MAX_VALUE)
                               .addGroup(layout.createParallelGroup()
                                   .addGap(30)
                                   .addGap(30)
                                   .addComponent(labelReiniciar)
                                   .addGap(30)
                                   .addComponent(labelAtras)
                                   .addGap(50)
                               )
                               )
                       );
                }
        else if(tipoJuego==HUMANOVSMAQUINA && nivel==NIVELMEDIO){
                    tableroGUILayout= new javax.swing.GroupLayout(tableroGUIHMM);
       
                tableroGUIHMM.setLayout(tableroGUILayout);
                tableroGUILayout.setHorizontalGroup(
                    tableroGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0,700, Short.MAX_VALUE)
                );
                tableroGUILayout.setVerticalGroup(
                    tableroGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 400, Short.MAX_VALUE)
                );



                labelAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.jpg"))); // NOI18N
                labelAtras.setText("Volver atras");
                labelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mousePressed(java.awt.event.MouseEvent evt) {
                        Juego.this.mousePressed(evt);
                    }
                });
                labelReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recargar.jpg"))); // NOI18N
                labelReiniciar.setText("Reiniciar Juego");
                labelReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mousePressed(java.awt.event.MouseEvent evt) {
                        Juego.this.mousePressedReiniciar(evt);
                    }
                });
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(juegoPrincipal.getContentPane());
                juegoPrincipal.getContentPane().setLayout(layout);

                            tableroGUILayout= new javax.swing.GroupLayout(tableroGUIHMM);

                       layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                               .addGap(30)
                           .addGroup(layout.createSequentialGroup()
                               .addComponent(jLabel6)
                               .addContainerGap(30, Short.MAX_VALUE))

                            .addGroup(layout.createSequentialGroup()
                               .addContainerGap()
                               .addComponent(tableroGUIHMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addContainerGap(176, Short.MAX_VALUE))

                           .addGroup(layout.createSequentialGroup()
                               .addComponent(labelReiniciar)
                               .addContainerGap(40, Short.MAX_VALUE)
                               .addComponent(labelAtras)
                               .addContainerGap(40,Short.MAX_VALUE))
                       );

                       layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                               .addGap(50)
                               .addComponent(jLabel6)//Definimos tamaño del Label
                               .addGap(40)
                               .addComponent(tableroGUIHMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addContainerGap(13, Short.MAX_VALUE)
                               .addGroup(layout.createParallelGroup()
                                   .addGap(30)
                                   .addGap(30)
                                   .addComponent(labelReiniciar)
                                   .addGap(30)
                                   .addComponent(labelAtras)
                                   .addGap(50)
                               )
                               )
                       );
                }
        else if(tipoJuego==HUMANOVSMAQUINA && nivel==NIVELDIFICIL){
                    tableroGUILayout= new javax.swing.GroupLayout(tableroGUIHMD);
       
                tableroGUIHMD.setLayout(tableroGUILayout);
                tableroGUILayout.setHorizontalGroup(
                    tableroGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0,700, Short.MAX_VALUE)
                );
                tableroGUILayout.setVerticalGroup(
                    tableroGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGap(0, 400, Short.MAX_VALUE)
                );



                labelAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.jpg"))); // NOI18N
                labelAtras.setText("Volver atras");
                labelAtras.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mousePressed(java.awt.event.MouseEvent evt) {
                        Juego.this.mousePressed(evt);
                    }
                });
                labelReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recargar.jpg"))); // NOI18N
                labelReiniciar.setText("Reiniciar Juego");
                labelReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mousePressed(java.awt.event.MouseEvent evt) {
                        Juego.this.mousePressedReiniciar(evt);
                    }
                });
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(juegoPrincipal.getContentPane());
                juegoPrincipal.getContentPane().setLayout(layout);

                            tableroGUILayout= new javax.swing.GroupLayout(tableroGUIHMD);

                       layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                               .addGap(30)
                           .addGroup(layout.createSequentialGroup()
                               .addComponent(jLabel6)
                               .addContainerGap(30, Short.MAX_VALUE))

                            .addGroup(layout.createSequentialGroup()
                               .addContainerGap()
                               .addComponent(tableroGUIHMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addContainerGap(176, Short.MAX_VALUE))

                           .addGroup(layout.createSequentialGroup()
                               .addComponent(labelReiniciar)
                               .addContainerGap(40, Short.MAX_VALUE)
                               .addComponent(labelAtras)
                               .addContainerGap(40,Short.MAX_VALUE))
                       );

                       layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                               .addGap(50)
                               .addComponent(jLabel6)//Definimos tamaño del Label
                               .addGap(40)
                               .addComponent(tableroGUIHMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                               .addContainerGap(13, Short.MAX_VALUE)
                               .addGroup(layout.createParallelGroup()
                                   .addGap(30)
                                   .addGap(30)
                                   .addComponent(labelReiniciar)
                                   .addGap(30)
                                   .addComponent(labelAtras)
                                   .addGap(50)
                               )
                               )
                       );
                }
    
    
    }
}
