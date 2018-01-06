/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Classes.Matriz;
import Classes.Quadrado;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.ControlMatriz;


public class Facil extends javax.swing.JFrame {

    
    

    public Facil() {
        initComponents();
        initFacil();

    }

    public Matriz matriz = new Matriz();
    //ArrayList<Quadrado> listMatriz = matriz.getMatriz();
    ControlMatriz control = new ControlMatriz();
            
    public void initFacil() {
        
        matriz.add( new Quadrado( Campo11, 1, 1 ) );
        matriz.add( new Quadrado( Campo12, 1, 2 ) );
        matriz.add( new Quadrado( Campo13, 1, 3 ) );
        matriz.add( new Quadrado( Campo14, 1, 4 ) );
        matriz.add( new Quadrado( Campo15, 1, 5 ) );
        matriz.add( new Quadrado( Campo16, 1, 6 ) );
        matriz.add( new Quadrado( Campo17, 1, 7 ) );
        matriz.add( new Quadrado( Campo18, 1, 8 ) );
        matriz.add( new Quadrado( Campo19, 1, 9 ) );
        matriz.add( new Quadrado( Campo110, 1, 10 ) );
        
        matriz.add( new Quadrado( Campo21, 2, 1 ) );
        matriz.add( new Quadrado( Campo22, 2, 2 ) );
        matriz.add( new Quadrado( Campo23, 2, 3 ) );
        matriz.add( new Quadrado( Campo24, 2, 4 ) );
        matriz.add( new Quadrado( Campo25, 2, 5 ) );
        matriz.add( new Quadrado( Campo26, 2, 6 ) );
        matriz.add( new Quadrado( Campo27, 2, 7 ) );
        matriz.add( new Quadrado( Campo28, 2, 8 ) );
        matriz.add( new Quadrado( Campo29, 2, 9 ) );
        matriz.add( new Quadrado( Campo210, 2, 10 ) );

        matriz.add( new Quadrado( Campo31, 3, 1 ) );
        matriz.add( new Quadrado( Campo32, 3, 2 ) );
        matriz.add( new Quadrado( Campo33, 3, 3 ) );
        matriz.add( new Quadrado( Campo34, 3, 4 ) );
        matriz.add( new Quadrado( Campo35, 3, 5 ) );
        matriz.add( new Quadrado( Campo36, 3, 6 ) );
        matriz.add( new Quadrado( Campo37, 3, 7 ) );
        matriz.add( new Quadrado( Campo38, 3, 8 ) );
        matriz.add( new Quadrado( Campo39, 3, 9 ) );
        matriz.add( new Quadrado( Campo310, 3, 10 ) );
        
        matriz.add( new Quadrado( Campo41, 4, 1 ) );
        matriz.add( new Quadrado( Campo42, 4, 2 ) );
        matriz.add( new Quadrado( Campo43, 4, 3 ) );
        matriz.add( new Quadrado( Campo44, 4, 4 ) );
        matriz.add( new Quadrado( Campo45, 4, 5 ) );
        matriz.add( new Quadrado( Campo46, 4, 6 ) );
        matriz.add( new Quadrado( Campo47, 4, 7 ) );
        matriz.add( new Quadrado( Campo48, 4, 8 ) );
        matriz.add( new Quadrado( Campo49, 4, 9 ) );
        matriz.add( new Quadrado( Campo410, 4, 10 ) );
        
        matriz.add( new Quadrado( Campo51, 5, 1 ) );
        matriz.add( new Quadrado( Campo52, 5, 2 ) );
        matriz.add( new Quadrado( Campo53, 5, 3 ) );
        matriz.add( new Quadrado( Campo54, 5, 4 ) );
        matriz.add( new Quadrado( Campo55, 5, 5 ) );
        matriz.add( new Quadrado( Campo56, 5, 6 ) );
        matriz.add( new Quadrado( Campo57, 5, 7 ) );
        matriz.add( new Quadrado( Campo58, 5, 8 ) );
        matriz.add( new Quadrado( Campo59, 5, 9 ) );
        matriz.add( new Quadrado( Campo510, 5, 10 ) );
        
        matriz.add( new Quadrado( Campo61, 6, 1 ) );
        matriz.add( new Quadrado( Campo62, 6, 2 ) );
        matriz.add( new Quadrado( Campo63, 6, 3 ) );
        matriz.add( new Quadrado( Campo64, 6, 4 ) );
        matriz.add( new Quadrado( Campo65, 6, 5 ) );
        matriz.add( new Quadrado( Campo66, 6, 6 ) );
        matriz.add( new Quadrado( Campo67, 6, 7 ) );
        matriz.add( new Quadrado( Campo68, 6, 8 ) );
        matriz.add( new Quadrado( Campo69, 6, 9 ) );
        matriz.add( new Quadrado( Campo610, 6, 10 ) );
        
        matriz.add( new Quadrado( Campo71, 7, 1 ) );
        matriz.add( new Quadrado( Campo72, 7, 2 ) );
        matriz.add( new Quadrado( Campo73, 7, 3 ) );
        matriz.add( new Quadrado( Campo74, 7, 4 ) );
        matriz.add( new Quadrado( Campo75, 7, 5 ) );
        matriz.add( new Quadrado( Campo76, 7, 6 ) );
        matriz.add( new Quadrado( Campo77, 7, 7 ) );
        matriz.add( new Quadrado( Campo78, 7, 8 ) );
        matriz.add( new Quadrado( Campo79, 7, 9 ) );
        matriz.add( new Quadrado( Campo710, 7, 10 ) );
        
        matriz.add( new Quadrado( Campo81, 8, 1 ) );
        matriz.add( new Quadrado( Campo82, 8, 2 ) );
        matriz.add( new Quadrado( Campo83, 8, 3 ) );
        matriz.add( new Quadrado( Campo84, 8, 4 ) );
        matriz.add( new Quadrado( Campo85, 8, 5 ) );
        matriz.add( new Quadrado( Campo86, 8, 6 ) );
        matriz.add( new Quadrado( Campo87, 8, 7 ) );
        matriz.add( new Quadrado( Campo88, 8, 8 ) );
        matriz.add( new Quadrado( Campo89, 8, 9 ) );
        matriz.add( new Quadrado( Campo810, 8, 10 ) );
        
        matriz.add( new Quadrado( Campo91, 9, 1 ) );
        matriz.add( new Quadrado( Campo92, 9, 2 ) );
        matriz.add( new Quadrado( Campo93, 9, 3 ) );
        matriz.add( new Quadrado( Campo94, 9, 4 ) );
        matriz.add( new Quadrado( Campo95, 9, 5 ) );
        matriz.add( new Quadrado( Campo96, 9, 6 ) );
        matriz.add( new Quadrado( Campo97, 9, 7 ) );
        matriz.add( new Quadrado( Campo98, 9, 8 ) );
        matriz.add( new Quadrado( Campo99, 9, 9 ) );
        matriz.add( new Quadrado( Campo910, 9, 10 ) );
        
        matriz.add( new Quadrado( Campo101, 10, 1 ) );
        matriz.add( new Quadrado( Campo102, 10, 2 ) );
        matriz.add( new Quadrado( Campo103, 10, 3 ) );
        matriz.add( new Quadrado( Campo104, 10, 4 ) );
        matriz.add( new Quadrado( Campo105, 10, 5 ) );
        matriz.add( new Quadrado( Campo106, 10, 6 ) );
        matriz.add( new Quadrado( Campo107, 10, 7 ) );
        matriz.add( new Quadrado( Campo108, 10, 8 ) );
        matriz.add( new Quadrado( Campo109, 10, 9 ) );
        matriz.add( new Quadrado( Campo1010, 10, 10 ) );
    
        control.inicializarMetodos();
    }
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Campo11 = new javax.swing.JLabel();
        Campo12 = new javax.swing.JLabel();
        Campo13 = new javax.swing.JLabel();
        Campo14 = new javax.swing.JLabel();
        Campo15 = new javax.swing.JLabel();
        Campo16 = new javax.swing.JLabel();
        Campo17 = new javax.swing.JLabel();
        Campo18 = new javax.swing.JLabel();
        Campo19 = new javax.swing.JLabel();
        Campo110 = new javax.swing.JLabel();
        Campo41 = new javax.swing.JLabel();
        Campo22 = new javax.swing.JLabel();
        Campo21 = new javax.swing.JLabel();
        Campo31 = new javax.swing.JLabel();
        Campo71 = new javax.swing.JLabel();
        Campo61 = new javax.swing.JLabel();
        Campo51 = new javax.swing.JLabel();
        Campo42 = new javax.swing.JLabel();
        Campo32 = new javax.swing.JLabel();
        Campo72 = new javax.swing.JLabel();
        Campo62 = new javax.swing.JLabel();
        Campo52 = new javax.swing.JLabel();
        Campo43 = new javax.swing.JLabel();
        Campo23 = new javax.swing.JLabel();
        Campo33 = new javax.swing.JLabel();
        Campo73 = new javax.swing.JLabel();
        Campo63 = new javax.swing.JLabel();
        Campo53 = new javax.swing.JLabel();
        Campo44 = new javax.swing.JLabel();
        Campo24 = new javax.swing.JLabel();
        Campo34 = new javax.swing.JLabel();
        Campo74 = new javax.swing.JLabel();
        Campo64 = new javax.swing.JLabel();
        Campo54 = new javax.swing.JLabel();
        Campo45 = new javax.swing.JLabel();
        Campo25 = new javax.swing.JLabel();
        Campo35 = new javax.swing.JLabel();
        Campo75 = new javax.swing.JLabel();
        Campo65 = new javax.swing.JLabel();
        Campo55 = new javax.swing.JLabel();
        Campo46 = new javax.swing.JLabel();
        Campo26 = new javax.swing.JLabel();
        Campo36 = new javax.swing.JLabel();
        Campo76 = new javax.swing.JLabel();
        Campo66 = new javax.swing.JLabel();
        Campo56 = new javax.swing.JLabel();
        Campo47 = new javax.swing.JLabel();
        Campo27 = new javax.swing.JLabel();
        Campo37 = new javax.swing.JLabel();
        Campo77 = new javax.swing.JLabel();
        Campo67 = new javax.swing.JLabel();
        Campo57 = new javax.swing.JLabel();
        Campo48 = new javax.swing.JLabel();
        Campo28 = new javax.swing.JLabel();
        Campo38 = new javax.swing.JLabel();
        Campo78 = new javax.swing.JLabel();
        Campo68 = new javax.swing.JLabel();
        Campo58 = new javax.swing.JLabel();
        Campo49 = new javax.swing.JLabel();
        Campo29 = new javax.swing.JLabel();
        Campo39 = new javax.swing.JLabel();
        Campo79 = new javax.swing.JLabel();
        Campo69 = new javax.swing.JLabel();
        Campo59 = new javax.swing.JLabel();
        Campo410 = new javax.swing.JLabel();
        Campo210 = new javax.swing.JLabel();
        Campo310 = new javax.swing.JLabel();
        Campo710 = new javax.swing.JLabel();
        Campo610 = new javax.swing.JLabel();
        Campo510 = new javax.swing.JLabel();
        Campo101 = new javax.swing.JLabel();
        Campo91 = new javax.swing.JLabel();
        Campo81 = new javax.swing.JLabel();
        Campo102 = new javax.swing.JLabel();
        Campo92 = new javax.swing.JLabel();
        Campo82 = new javax.swing.JLabel();
        Campo103 = new javax.swing.JLabel();
        Campo93 = new javax.swing.JLabel();
        Campo83 = new javax.swing.JLabel();
        Campo104 = new javax.swing.JLabel();
        Campo94 = new javax.swing.JLabel();
        Campo84 = new javax.swing.JLabel();
        Campo105 = new javax.swing.JLabel();
        Campo95 = new javax.swing.JLabel();
        Campo85 = new javax.swing.JLabel();
        Campo106 = new javax.swing.JLabel();
        Campo96 = new javax.swing.JLabel();
        Campo86 = new javax.swing.JLabel();
        Campo107 = new javax.swing.JLabel();
        Campo97 = new javax.swing.JLabel();
        Campo87 = new javax.swing.JLabel();
        Campo108 = new javax.swing.JLabel();
        Campo98 = new javax.swing.JLabel();
        Campo88 = new javax.swing.JLabel();
        Campo109 = new javax.swing.JLabel();
        Campo99 = new javax.swing.JLabel();
        Campo89 = new javax.swing.JLabel();
        Campo1010 = new javax.swing.JLabel();
        Campo910 = new javax.swing.JLabel();
        Campo810 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 12, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Campo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo11.setText("jLabel3");
        Campo11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Campo11.setFocusable(false);
        Campo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Campo11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Campo11MouseExited(evt);
            }
        });
        jPanel1.add(Campo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        Campo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo12.setText("jLabel3");
        Campo12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo12MouseClicked(evt);
            }
        });
        jPanel1.add(Campo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 30, 30));

        Campo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo13.setText("jLabel3");
        Campo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo13MouseClicked(evt);
            }
        });
        jPanel1.add(Campo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 30, 30));

        Campo14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo14.setText("jLabel3");
        Campo14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo14MouseClicked(evt);
            }
        });
        jPanel1.add(Campo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 30, 30));

        Campo15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo15.setText("jLabel3");
        Campo15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo15MouseClicked(evt);
            }
        });
        jPanel1.add(Campo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 30, 30));

        Campo16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo16.setText("jLabel3");
        Campo16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo16MouseClicked(evt);
            }
        });
        jPanel1.add(Campo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 30, 30));

        Campo17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo17.setText("jLabel3");
        Campo17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo17MouseClicked(evt);
            }
        });
        jPanel1.add(Campo17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 30, 30));

        Campo18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo18.setText("jLabel3");
        Campo18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo18MouseClicked(evt);
            }
        });
        jPanel1.add(Campo18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 30, 30));

        Campo19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo19.setText("jLabel3");
        Campo19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo19MouseClicked(evt);
            }
        });
        jPanel1.add(Campo19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 30, 30));

        Campo110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo110.setText("jLabel3");
        Campo110.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo110MouseClicked(evt);
            }
        });
        jPanel1.add(Campo110, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 30, 30));

        Campo41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo41.setText("jLabel3");
        Campo41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo41MouseClicked(evt);
            }
        });
        jPanel1.add(Campo41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 30, 30));

        Campo22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo22.setText("jLabel3");
        Campo22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo22MouseClicked(evt);
            }
        });
        jPanel1.add(Campo22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 30, 30));

        Campo21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo21.setText("jLabel3");
        Campo21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo21MouseClicked(evt);
            }
        });
        jPanel1.add(Campo21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 30, 30));

        Campo31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo31.setText("jLabel3");
        Campo31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo31MouseClicked(evt);
            }
        });
        jPanel1.add(Campo31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 30, 30));

        Campo71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo71.setText("jLabel3");
        Campo71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo71MouseClicked(evt);
            }
        });
        jPanel1.add(Campo71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 30, 30));

        Campo61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo61.setText("jLabel3");
        Campo61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo61MouseClicked(evt);
            }
        });
        jPanel1.add(Campo61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 30, 30));

        Campo51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo51.setText("jLabel3");
        Campo51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo51MouseClicked(evt);
            }
        });
        jPanel1.add(Campo51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 30, 30));

        Campo42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo42.setText("jLabel3");
        Campo42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo42MouseClicked(evt);
            }
        });
        jPanel1.add(Campo42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 30, 30));

        Campo32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo32.setText("jLabel3");
        Campo32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo32MouseClicked(evt);
            }
        });
        jPanel1.add(Campo32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 30, 30));

        Campo72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo72.setText("jLabel3");
        Campo72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo72MouseClicked(evt);
            }
        });
        jPanel1.add(Campo72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 30, 30));

        Campo62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo62.setText("jLabel3");
        Campo62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo62MouseClicked(evt);
            }
        });
        jPanel1.add(Campo62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 30, 30));

        Campo52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo52.setText("jLabel3");
        Campo52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo52MouseClicked(evt);
            }
        });
        jPanel1.add(Campo52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 30, 30));

        Campo43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo43.setText("jLabel3");
        Campo43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo43MouseClicked(evt);
            }
        });
        jPanel1.add(Campo43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 30, 30));

        Campo23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo23.setText("jLabel3");
        Campo23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Campo23MouseEntered(evt);
            }
        });
        jPanel1.add(Campo23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 30, 30));

        Campo33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo33.setText("jLabel3");
        Campo33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo33MouseClicked(evt);
            }
        });
        jPanel1.add(Campo33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 30, 30));

        Campo73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo73.setText("jLabel3");
        Campo73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo73MouseClicked(evt);
            }
        });
        jPanel1.add(Campo73, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 30, 30));

        Campo63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo63.setText("jLabel3");
        Campo63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo63MouseClicked(evt);
            }
        });
        jPanel1.add(Campo63, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 30, 30));

        Campo53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo53.setText("jLabel3");
        Campo53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo53MouseClicked(evt);
            }
        });
        jPanel1.add(Campo53, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 30, 30));

        Campo44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo44.setText("jLabel3");
        Campo44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo44MouseClicked(evt);
            }
        });
        jPanel1.add(Campo44, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 30, 30));

        Campo24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo24.setText("jLabel3");
        Campo24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo24MouseClicked(evt);
            }
        });
        jPanel1.add(Campo24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 30, 30));

        Campo34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo34.setText("jLabel3");
        Campo34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo34MouseClicked(evt);
            }
        });
        jPanel1.add(Campo34, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 30, 30));

        Campo74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo74.setText("jLabel3");
        Campo74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo74MouseClicked(evt);
            }
        });
        jPanel1.add(Campo74, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 30, 30));

        Campo64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo64.setText("jLabel3");
        Campo64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo64MouseClicked(evt);
            }
        });
        jPanel1.add(Campo64, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 30, 30));

        Campo54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo54.setText("jLabel3");
        Campo54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo54MouseClicked(evt);
            }
        });
        jPanel1.add(Campo54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 30, 30));

        Campo45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo45.setText("jLabel3");
        Campo45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo45MouseClicked(evt);
            }
        });
        jPanel1.add(Campo45, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 30, 30));

        Campo25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo25.setText("jLabel3");
        Campo25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo25MouseClicked(evt);
            }
        });
        jPanel1.add(Campo25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 30, 30));

        Campo35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo35.setText("jLabel3");
        Campo35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo35MouseClicked(evt);
            }
        });
        jPanel1.add(Campo35, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 30, 30));

        Campo75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo75.setText("jLabel3");
        Campo75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo75MouseClicked(evt);
            }
        });
        jPanel1.add(Campo75, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 30, 30));

        Campo65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo65.setText("jLabel3");
        Campo65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo65MouseClicked(evt);
            }
        });
        jPanel1.add(Campo65, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 30, 30));

        Campo55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo55.setText("jLabel3");
        Campo55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo55MouseClicked(evt);
            }
        });
        jPanel1.add(Campo55, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 30, 30));

        Campo46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo46.setText("jLabel3");
        Campo46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo46MouseClicked(evt);
            }
        });
        jPanel1.add(Campo46, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 30, 30));

        Campo26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo26.setText("jLabel3");
        Campo26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo26MouseClicked(evt);
            }
        });
        jPanel1.add(Campo26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 30, 30));

        Campo36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo36.setText("jLabel3");
        Campo36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo36MouseClicked(evt);
            }
        });
        jPanel1.add(Campo36, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 30, 30));

        Campo76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo76.setText("jLabel3");
        Campo76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo76MouseClicked(evt);
            }
        });
        jPanel1.add(Campo76, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 30, 30));

        Campo66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo66.setText("jLabel3");
        Campo66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo66MouseClicked(evt);
            }
        });
        jPanel1.add(Campo66, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 30, 30));

        Campo56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo56.setText("jLabel3");
        Campo56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo56MouseClicked(evt);
            }
        });
        jPanel1.add(Campo56, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 30, 30));

        Campo47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo47.setText("jLabel3");
        Campo47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo47MouseClicked(evt);
            }
        });
        jPanel1.add(Campo47, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 30, 30));

        Campo27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo27.setText("jLabel3");
        Campo27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo27MouseClicked(evt);
            }
        });
        jPanel1.add(Campo27, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 30, 30));

        Campo37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo37.setText("jLabel3");
        Campo37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo37MouseClicked(evt);
            }
        });
        jPanel1.add(Campo37, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 30, 30));

        Campo77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo77.setText("jLabel3");
        Campo77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo77MouseClicked(evt);
            }
        });
        jPanel1.add(Campo77, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 30, 30));

        Campo67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo67.setText("jLabel3");
        Campo67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo67MouseClicked(evt);
            }
        });
        jPanel1.add(Campo67, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 30, 30));

        Campo57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo57.setText("jLabel3");
        Campo57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo57MouseClicked(evt);
            }
        });
        jPanel1.add(Campo57, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 30, 30));

        Campo48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo48.setText("jLabel3");
        Campo48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo48MouseClicked(evt);
            }
        });
        jPanel1.add(Campo48, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 30, 30));

        Campo28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo28.setText("jLabel3");
        Campo28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo28MouseClicked(evt);
            }
        });
        jPanel1.add(Campo28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 30, 30));

        Campo38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo38.setText("jLabel3");
        Campo38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo38MouseClicked(evt);
            }
        });
        jPanel1.add(Campo38, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 30, 30));

        Campo78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo78.setText("jLabel3");
        Campo78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo78MouseClicked(evt);
            }
        });
        jPanel1.add(Campo78, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 30, 30));

        Campo68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo68.setText("jLabel3");
        Campo68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo68MouseClicked(evt);
            }
        });
        jPanel1.add(Campo68, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 30, 30));

        Campo58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo58.setText("jLabel3");
        Campo58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo58MouseClicked(evt);
            }
        });
        jPanel1.add(Campo58, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 30, 30));

        Campo49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo49.setText("jLabel3");
        Campo49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo49MouseClicked(evt);
            }
        });
        jPanel1.add(Campo49, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 30, 30));

        Campo29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo29.setText("jLabel3");
        Campo29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo29MouseClicked(evt);
            }
        });
        jPanel1.add(Campo29, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 30, 30));

        Campo39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo39.setText("jLabel3");
        Campo39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo39MouseClicked(evt);
            }
        });
        jPanel1.add(Campo39, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 30, 30));

        Campo79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo79.setText("jLabel3");
        Campo79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo79MouseClicked(evt);
            }
        });
        jPanel1.add(Campo79, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 30, 30));

        Campo69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo69.setText("jLabel3");
        Campo69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo69MouseClicked(evt);
            }
        });
        jPanel1.add(Campo69, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 30, 30));

        Campo59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo59.setText("jLabel3");
        Campo59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo59MouseClicked(evt);
            }
        });
        jPanel1.add(Campo59, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 30, 30));

        Campo410.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo410.setText("jLabel3");
        Campo410.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo410MouseClicked(evt);
            }
        });
        jPanel1.add(Campo410, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 30, 30));

        Campo210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo210.setText("jLabel3");
        Campo210.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo210MouseClicked(evt);
            }
        });
        jPanel1.add(Campo210, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 30, 30));

        Campo310.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo310.setText("jLabel3");
        Campo310.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo310MouseClicked(evt);
            }
        });
        jPanel1.add(Campo310, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 30, 30));

        Campo710.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo710.setText("jLabel3");
        Campo710.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo710MouseClicked(evt);
            }
        });
        jPanel1.add(Campo710, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 30, 30));

        Campo610.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo610.setText("jLabel3");
        Campo610.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo610MouseClicked(evt);
            }
        });
        jPanel1.add(Campo610, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 30, 30));

        Campo510.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo510.setText("jLabel3");
        Campo510.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo510MouseClicked(evt);
            }
        });
        jPanel1.add(Campo510, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 30, 30));

        Campo101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo101.setText("jLabel3");
        Campo101.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo101MouseClicked(evt);
            }
        });
        jPanel1.add(Campo101, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 30, 30));

        Campo91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo91.setText("jLabel3");
        Campo91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo91MouseClicked(evt);
            }
        });
        jPanel1.add(Campo91, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 30, 30));

        Campo81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo81.setText("jLabel3");
        Campo81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo81MouseClicked(evt);
            }
        });
        jPanel1.add(Campo81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 30, 30));

        Campo102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo102.setText("jLabel3");
        Campo102.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo102MouseClicked(evt);
            }
        });
        jPanel1.add(Campo102, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 30, 30));

        Campo92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo92.setText("jLabel3");
        Campo92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo92MouseClicked(evt);
            }
        });
        jPanel1.add(Campo92, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 30, 30));

        Campo82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo82.setText("jLabel3");
        Campo82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo82MouseClicked(evt);
            }
        });
        jPanel1.add(Campo82, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 30, 30));

        Campo103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo103.setText("jLabel3");
        Campo103.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo103MouseClicked(evt);
            }
        });
        jPanel1.add(Campo103, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 30, 30));

        Campo93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo93.setText("jLabel3");
        Campo93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo93MouseClicked(evt);
            }
        });
        jPanel1.add(Campo93, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 30, 30));

        Campo83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo83.setText("jLabel3");
        Campo83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo83MouseClicked(evt);
            }
        });
        jPanel1.add(Campo83, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 30, 30));

        Campo104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo104.setText("jLabel3");
        Campo104.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo104MouseClicked(evt);
            }
        });
        jPanel1.add(Campo104, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 30, 30));

        Campo94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo94.setText("jLabel3");
        Campo94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo94MouseClicked(evt);
            }
        });
        jPanel1.add(Campo94, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 30, 30));

        Campo84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo84.setText("jLabel3");
        Campo84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo84MouseClicked(evt);
            }
        });
        jPanel1.add(Campo84, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 30, 30));

        Campo105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo105.setText("jLabel3");
        Campo105.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo105MouseClicked(evt);
            }
        });
        jPanel1.add(Campo105, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 30, 30));

        Campo95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo95.setText("jLabel3");
        Campo95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo95MouseClicked(evt);
            }
        });
        jPanel1.add(Campo95, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 30, 30));

        Campo85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo85.setText("jLabel3");
        Campo85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo85MouseClicked(evt);
            }
        });
        jPanel1.add(Campo85, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 30, 30));

        Campo106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo106.setText("jLabel3");
        Campo106.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo106MouseClicked(evt);
            }
        });
        jPanel1.add(Campo106, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 30, 30));

        Campo96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo96.setText("jLabel3");
        Campo96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo96MouseClicked(evt);
            }
        });
        jPanel1.add(Campo96, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 30, 30));

        Campo86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo86.setText("jLabel3");
        Campo86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo86MouseClicked(evt);
            }
        });
        jPanel1.add(Campo86, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 30, 30));

        Campo107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo107.setText("jLabel3");
        Campo107.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo107MouseClicked(evt);
            }
        });
        jPanel1.add(Campo107, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 30, 30));

        Campo97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo97.setText("jLabel3");
        Campo97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo97MouseClicked(evt);
            }
        });
        jPanel1.add(Campo97, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 30, 30));

        Campo87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo87.setText("jLabel3");
        Campo87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo87MouseClicked(evt);
            }
        });
        jPanel1.add(Campo87, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 30, 30));

        Campo108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo108.setText("jLabel3");
        Campo108.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo108MouseClicked(evt);
            }
        });
        jPanel1.add(Campo108, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 30, 30));

        Campo98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo98.setText("jLabel3");
        Campo98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo98MouseClicked(evt);
            }
        });
        jPanel1.add(Campo98, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 30, 30));

        Campo88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo88.setText("jLabel3");
        Campo88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo88MouseClicked(evt);
            }
        });
        jPanel1.add(Campo88, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 30, 30));

        Campo109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo109.setText("jLabel3");
        Campo109.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo109MouseClicked(evt);
            }
        });
        jPanel1.add(Campo109, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 30, 30));

        Campo99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo99.setText("jLabel3");
        Campo99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo99MouseClicked(evt);
            }
        });
        jPanel1.add(Campo99, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 30, 30));

        Campo89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo89.setText("jLabel3");
        Campo89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo89MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Campo89MouseEntered(evt);
            }
        });
        jPanel1.add(Campo89, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 30, 30));

        Campo1010.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo1010.setText("jLabel3");
        Campo1010.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo1010MouseClicked(evt);
            }
        });
        jPanel1.add(Campo1010, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 30, 30));

        Campo910.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo910.setText("jLabel3");
        Campo910.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo910MouseClicked(evt);
            }
        });
        jPanel1.add(Campo910, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 30, 30));

        Campo810.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CampoVazio.png"))); // NOI18N
        Campo810.setText("jLabel3");
        Campo810.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Campo810MouseClicked(evt);
            }
        });
        jPanel1.add(Campo810, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 30, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 154, 61));
        jLabel1.setText("000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 90, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 70, 60));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 16, 20));
        jLabel2.setText("00000");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 70, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRestart.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRestart_Hover.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSair.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSair_Hover.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 70, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 70, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Campo11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo11MouseEntered
        //não usa
    }//GEN-LAST:event_Campo11MouseEntered

    private void Campo11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo11MouseExited
        //não usa
    }//GEN-LAST:event_Campo11MouseExited

    private void Campo11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo11MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  

            control.eventMouseEsquerdoClicked(matriz.getQuadrado(1,1));
            
        }else if (evt.getButton() == MouseEvent.BUTTON3) {  
            
            control.eventMouseDireitoClicked(matriz.getQuadrado(1,1));
            
        }        
    }//GEN-LAST:event_Campo11MouseClicked

    private void Campo12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo12MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(1,2));
            
        }else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(1,2));
            
        }
    }//GEN-LAST:event_Campo12MouseClicked

    private void Campo13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo13MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(1,3));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(1,3));
            
        }
    }//GEN-LAST:event_Campo13MouseClicked

    private void Campo14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo14MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(1,4));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(1,4));
            
        }
    }//GEN-LAST:event_Campo14MouseClicked

    private void Campo15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo15MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(1,5));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(1,5));
            
        }
    }//GEN-LAST:event_Campo15MouseClicked

    private void Campo16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo16MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(1,6));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(1,6));
            
        }
    }//GEN-LAST:event_Campo16MouseClicked

    private void Campo17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo17MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(1,7));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(1,7));
            
        }
    }//GEN-LAST:event_Campo17MouseClicked

    private void Campo18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo18MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(1,8));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(1,8));
            
        }
    }//GEN-LAST:event_Campo18MouseClicked

    private void Campo19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo19MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(1,9));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(1,9));
            
        }
    }//GEN-LAST:event_Campo19MouseClicked

    private void Campo110MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo110MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(1,10));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(1,10));
            
        }
    }//GEN-LAST:event_Campo110MouseClicked

    private void Campo21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo21MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(2,1));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(2,1));
            
        }
    }//GEN-LAST:event_Campo21MouseClicked

    private void Campo22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo22MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(2,2));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(2,2));
            
        }
    }//GEN-LAST:event_Campo22MouseClicked

    private void Campo23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo23MouseEntered
        //não usa
    }//GEN-LAST:event_Campo23MouseEntered

    private void Campo23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo23MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(2,3));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(2,3));
            
        }
    }//GEN-LAST:event_Campo23MouseClicked

    private void Campo24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo24MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(2,4));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(2,4));
            
        }
    }//GEN-LAST:event_Campo24MouseClicked

    private void Campo25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo25MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(2,5));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(2,5));
            
        }
    }//GEN-LAST:event_Campo25MouseClicked

    private void Campo26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo26MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(2,6));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(2,6));
            
        }
    }//GEN-LAST:event_Campo26MouseClicked

    private void Campo27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo27MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(2,7));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(2,7));
            
        }
    }//GEN-LAST:event_Campo27MouseClicked

    private void Campo28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo28MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(2,8));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(2,8));
            
        }
    }//GEN-LAST:event_Campo28MouseClicked

    private void Campo29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo29MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(2,9));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(2,9));
            
        }
    }//GEN-LAST:event_Campo29MouseClicked

    private void Campo210MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo210MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(2,10));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(2,10));
            
        }
    }//GEN-LAST:event_Campo210MouseClicked

    private void Campo31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo31MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(3,1));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(3,1));
            
        }
    }//GEN-LAST:event_Campo31MouseClicked

    private void Campo32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo32MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(3,2));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(3,2));
            
        }
    }//GEN-LAST:event_Campo32MouseClicked

    private void Campo33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo33MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(3,3));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(3,3));
            
        }
    }//GEN-LAST:event_Campo33MouseClicked

    private void Campo34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo34MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(3,4));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(3,4));
            
        }
    }//GEN-LAST:event_Campo34MouseClicked

    private void Campo35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo35MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(3,5));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(3,5));
            
        }
    }//GEN-LAST:event_Campo35MouseClicked

    private void Campo36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo36MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(3,6));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(3,6));
            
        }
    }//GEN-LAST:event_Campo36MouseClicked

    private void Campo37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo37MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(3,7));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(3,7));
            
        }
    }//GEN-LAST:event_Campo37MouseClicked

    private void Campo38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo38MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(3,8));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(3,8));
            
        }
    }//GEN-LAST:event_Campo38MouseClicked

    private void Campo39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo39MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(3,9));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(3,9));
            
        }
    }//GEN-LAST:event_Campo39MouseClicked

    private void Campo310MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo310MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(3,10));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(3,10));
            
        }
    }//GEN-LAST:event_Campo310MouseClicked

    private void Campo41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo41MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(4,1));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(4,1));
            
        }
    }//GEN-LAST:event_Campo41MouseClicked

    private void Campo42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo42MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(4,2));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(4,2));
            
        }
    }//GEN-LAST:event_Campo42MouseClicked

    private void Campo43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo43MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(4,3));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(4,3));
            
        }
    }//GEN-LAST:event_Campo43MouseClicked

    private void Campo44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo44MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(4,4));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(4,4));
            
        }
    }//GEN-LAST:event_Campo44MouseClicked

    private void Campo45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo45MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(4,5));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(4,5));
            
        }
    }//GEN-LAST:event_Campo45MouseClicked

    private void Campo46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo46MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(4,6));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(4,6));
            
        }
    }//GEN-LAST:event_Campo46MouseClicked

    private void Campo47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo47MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(4,7));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(4,7));
            
        }
    }//GEN-LAST:event_Campo47MouseClicked

    private void Campo48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo48MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(4,8));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(4,8));
            
        }
    }//GEN-LAST:event_Campo48MouseClicked

    private void Campo49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo49MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(4,9));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(4,9));
            
        }
    }//GEN-LAST:event_Campo49MouseClicked

    private void Campo410MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo410MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(4,10));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(4,10));
            
        }
    }//GEN-LAST:event_Campo410MouseClicked

    private void Campo51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo51MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(5,1));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(5,1));
            
        }
    }//GEN-LAST:event_Campo51MouseClicked

    private void Campo52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo52MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(5,2));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(5,2));
            
        }
    }//GEN-LAST:event_Campo52MouseClicked

    private void Campo53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo53MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(5,3));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(5,3));
            
        }
    }//GEN-LAST:event_Campo53MouseClicked

    private void Campo54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo54MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(5,4));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(5,4));
            
        }
    }//GEN-LAST:event_Campo54MouseClicked

    private void Campo55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo55MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(5,5));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(5,5));
            
        }
    }//GEN-LAST:event_Campo55MouseClicked

    private void Campo56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo56MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(5,6));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(5,6));
            
        }
    }//GEN-LAST:event_Campo56MouseClicked

    private void Campo57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo57MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(5,7));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(5,7));
            
        }
    }//GEN-LAST:event_Campo57MouseClicked

    private void Campo58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo58MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(5,8));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(5,8));
            
        }
    }//GEN-LAST:event_Campo58MouseClicked

    private void Campo59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo59MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(5,9));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(5,9));
            
        }
    }//GEN-LAST:event_Campo59MouseClicked

    private void Campo510MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo510MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(5,10));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(5,10));
            
        }
    }//GEN-LAST:event_Campo510MouseClicked

    private void Campo61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo61MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(6,1));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(6,1));
            
        }
    }//GEN-LAST:event_Campo61MouseClicked

    private void Campo62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo62MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(6,2));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(6,2));
            
        }
    }//GEN-LAST:event_Campo62MouseClicked

    private void Campo63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo63MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(6,3));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(6,3));
            
        }
    }//GEN-LAST:event_Campo63MouseClicked

    private void Campo64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo64MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(6,4));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(6,4));
            
        }
    }//GEN-LAST:event_Campo64MouseClicked

    private void Campo65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo65MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(6,5));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(6,5));
            
        }
    }//GEN-LAST:event_Campo65MouseClicked

    private void Campo66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo66MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(6,6));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(6,6));
            
        }
    }//GEN-LAST:event_Campo66MouseClicked

    private void Campo67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo67MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(6,7));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(6,7));
            
        }
    }//GEN-LAST:event_Campo67MouseClicked

    private void Campo68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo68MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(6,8));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(6,8));
            
        }
    }//GEN-LAST:event_Campo68MouseClicked

    private void Campo69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo69MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(6,9));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(6,9));
            
        }
    }//GEN-LAST:event_Campo69MouseClicked

    private void Campo610MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo610MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(6,10));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(6,10));
            
        }
    }//GEN-LAST:event_Campo610MouseClicked

    private void Campo71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo71MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(7,1));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(7,1));
            
        }
    }//GEN-LAST:event_Campo71MouseClicked

    private void Campo72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo72MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(7,2));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(7,2));
            
        }
    }//GEN-LAST:event_Campo72MouseClicked

    private void Campo73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo73MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(7,3));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(7,3));
            
        }
    }//GEN-LAST:event_Campo73MouseClicked

    private void Campo74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo74MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(7,4));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(7,4));
            
        }
    }//GEN-LAST:event_Campo74MouseClicked

    private void Campo75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo75MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(7,5));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(7,5));
            
        }
    }//GEN-LAST:event_Campo75MouseClicked

    private void Campo76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo76MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(7,6));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(7,6));
            
        }
    }//GEN-LAST:event_Campo76MouseClicked

    private void Campo77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo77MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(7,7));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(7,7));
            
        }
    }//GEN-LAST:event_Campo77MouseClicked

    private void Campo78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo78MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(7,8));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(7,8));
            
        }
    }//GEN-LAST:event_Campo78MouseClicked

    private void Campo79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo79MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(7,9));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(7,9));
            
        }
    }//GEN-LAST:event_Campo79MouseClicked

    private void Campo710MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo710MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(7,10));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(7,10));
            
        }
    }//GEN-LAST:event_Campo710MouseClicked

    private void Campo81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo81MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(8,1));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(8,1));
            
        }
    }//GEN-LAST:event_Campo81MouseClicked

    private void Campo82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo82MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(8,2));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(8,2));
            
        }
    }//GEN-LAST:event_Campo82MouseClicked

    private void Campo83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo83MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(8,3));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(8,3));
            
        }
    }//GEN-LAST:event_Campo83MouseClicked

    private void Campo84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo84MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(8,4));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(8,4));
            
        }
    }//GEN-LAST:event_Campo84MouseClicked

    private void Campo85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo85MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(8,5));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(8,5));
            
        }
    }//GEN-LAST:event_Campo85MouseClicked

    private void Campo86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo86MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(8,6));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(8,6));
            
        }
    }//GEN-LAST:event_Campo86MouseClicked

    private void Campo87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo87MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(8,7));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(8,7));
            
        }
    }//GEN-LAST:event_Campo87MouseClicked

    private void Campo88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo88MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(8,8));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(8,8));
            
        }
    }//GEN-LAST:event_Campo88MouseClicked

    private void Campo89MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo89MouseEntered

    }//GEN-LAST:event_Campo89MouseEntered

    private void Campo89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo89MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(8,9));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(8,9));
            
        }      
    }//GEN-LAST:event_Campo89MouseClicked

    private void Campo810MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo810MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(8,10));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(8,10));
            
        }
    }//GEN-LAST:event_Campo810MouseClicked

    private void Campo91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo91MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(9,1));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(9,1));
            
        }
    }//GEN-LAST:event_Campo91MouseClicked

    private void Campo92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo92MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(9,2));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(9,2));
            
        }
    }//GEN-LAST:event_Campo92MouseClicked

    private void Campo93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo93MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(9,3));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(9,3));
            
        }
    }//GEN-LAST:event_Campo93MouseClicked

    private void Campo94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo94MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(9,4));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(9,4));
            
        }
    }//GEN-LAST:event_Campo94MouseClicked

    private void Campo95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo95MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(9,5));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(9,5));
            
        }
    }//GEN-LAST:event_Campo95MouseClicked

    private void Campo96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo96MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(9,6));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(9,6));
            
        }
    }//GEN-LAST:event_Campo96MouseClicked

    private void Campo97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo97MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(9,7));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(9,7));
            
        }
    }//GEN-LAST:event_Campo97MouseClicked

    private void Campo98MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo98MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(9,8));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(9,8));
            
        }
    }//GEN-LAST:event_Campo98MouseClicked

    private void Campo99MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo99MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(9,9));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(9,9));
            
        }
    }//GEN-LAST:event_Campo99MouseClicked

    private void Campo910MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo910MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(9,10));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(9,10));
            
        }
    }//GEN-LAST:event_Campo910MouseClicked

    private void Campo101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo101MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(10,1));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(10,1));
            
        }
    }//GEN-LAST:event_Campo101MouseClicked

    private void Campo102MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo102MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(10,2));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(10,2));
            
        }
    }//GEN-LAST:event_Campo102MouseClicked

    private void Campo103MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo103MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(10,3));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(10,3));
            
        }
    }//GEN-LAST:event_Campo103MouseClicked

    private void Campo104MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo104MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(10,4));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(10,4));
            
        }
    }//GEN-LAST:event_Campo104MouseClicked

    private void Campo105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo105MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(10,5));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(10,5));
            
        }
    }//GEN-LAST:event_Campo105MouseClicked

    private void Campo106MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo106MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(10,6));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(10,6));
            
        }
    }//GEN-LAST:event_Campo106MouseClicked

    private void Campo107MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo107MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(10,7));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(10,7));
            
        }
    }//GEN-LAST:event_Campo107MouseClicked

    private void Campo108MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo108MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(10,8));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(10,8));
            
        }
    }//GEN-LAST:event_Campo108MouseClicked

    private void Campo109MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo109MouseClicked
        
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(10,9));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(10,9));
            
        }
    }//GEN-LAST:event_Campo109MouseClicked

    private void Campo1010MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Campo1010MouseClicked
       
        if (evt.getButton() == MouseEvent.BUTTON1) {  
            
            control.eventMouseEsquerdoClicked(matriz.getQuadrado(10,10));
            
        } else if (evt.getButton() == MouseEvent.BUTTON3) {  

            control.eventMouseDireitoClicked(matriz.getQuadrado(10,10));
            
        }
    }//GEN-LAST:event_Campo1010MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        //this.dispose();
//        Facil facil = new Facil();
//        //initFacil();
//        facil.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        this.dispose();
//        Principal principal = new Principal();
//        principal.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Campo101;
    private javax.swing.JLabel Campo1010;
    private javax.swing.JLabel Campo102;
    private javax.swing.JLabel Campo103;
    private javax.swing.JLabel Campo104;
    private javax.swing.JLabel Campo105;
    private javax.swing.JLabel Campo106;
    private javax.swing.JLabel Campo107;
    private javax.swing.JLabel Campo108;
    private javax.swing.JLabel Campo109;
    private javax.swing.JLabel Campo11;
    private javax.swing.JLabel Campo110;
    private javax.swing.JLabel Campo12;
    private javax.swing.JLabel Campo13;
    private javax.swing.JLabel Campo14;
    private javax.swing.JLabel Campo15;
    private javax.swing.JLabel Campo16;
    private javax.swing.JLabel Campo17;
    private javax.swing.JLabel Campo18;
    private javax.swing.JLabel Campo19;
    private javax.swing.JLabel Campo21;
    private javax.swing.JLabel Campo210;
    private javax.swing.JLabel Campo22;
    private javax.swing.JLabel Campo23;
    private javax.swing.JLabel Campo24;
    private javax.swing.JLabel Campo25;
    private javax.swing.JLabel Campo26;
    private javax.swing.JLabel Campo27;
    private javax.swing.JLabel Campo28;
    private javax.swing.JLabel Campo29;
    private javax.swing.JLabel Campo31;
    private javax.swing.JLabel Campo310;
    private javax.swing.JLabel Campo32;
    private javax.swing.JLabel Campo33;
    private javax.swing.JLabel Campo34;
    private javax.swing.JLabel Campo35;
    private javax.swing.JLabel Campo36;
    private javax.swing.JLabel Campo37;
    private javax.swing.JLabel Campo38;
    private javax.swing.JLabel Campo39;
    private javax.swing.JLabel Campo41;
    private javax.swing.JLabel Campo410;
    private javax.swing.JLabel Campo42;
    private javax.swing.JLabel Campo43;
    private javax.swing.JLabel Campo44;
    private javax.swing.JLabel Campo45;
    private javax.swing.JLabel Campo46;
    private javax.swing.JLabel Campo47;
    private javax.swing.JLabel Campo48;
    private javax.swing.JLabel Campo49;
    private javax.swing.JLabel Campo51;
    private javax.swing.JLabel Campo510;
    private javax.swing.JLabel Campo52;
    private javax.swing.JLabel Campo53;
    private javax.swing.JLabel Campo54;
    private javax.swing.JLabel Campo55;
    private javax.swing.JLabel Campo56;
    private javax.swing.JLabel Campo57;
    private javax.swing.JLabel Campo58;
    private javax.swing.JLabel Campo59;
    private javax.swing.JLabel Campo61;
    private javax.swing.JLabel Campo610;
    private javax.swing.JLabel Campo62;
    private javax.swing.JLabel Campo63;
    private javax.swing.JLabel Campo64;
    private javax.swing.JLabel Campo65;
    private javax.swing.JLabel Campo66;
    private javax.swing.JLabel Campo67;
    private javax.swing.JLabel Campo68;
    private javax.swing.JLabel Campo69;
    private javax.swing.JLabel Campo71;
    private javax.swing.JLabel Campo710;
    private javax.swing.JLabel Campo72;
    private javax.swing.JLabel Campo73;
    private javax.swing.JLabel Campo74;
    private javax.swing.JLabel Campo75;
    private javax.swing.JLabel Campo76;
    private javax.swing.JLabel Campo77;
    private javax.swing.JLabel Campo78;
    private javax.swing.JLabel Campo79;
    private javax.swing.JLabel Campo81;
    private javax.swing.JLabel Campo810;
    private javax.swing.JLabel Campo82;
    private javax.swing.JLabel Campo83;
    private javax.swing.JLabel Campo84;
    private javax.swing.JLabel Campo85;
    private javax.swing.JLabel Campo86;
    private javax.swing.JLabel Campo87;
    private javax.swing.JLabel Campo88;
    private javax.swing.JLabel Campo89;
    private javax.swing.JLabel Campo91;
    private javax.swing.JLabel Campo910;
    private javax.swing.JLabel Campo92;
    private javax.swing.JLabel Campo93;
    private javax.swing.JLabel Campo94;
    private javax.swing.JLabel Campo95;
    private javax.swing.JLabel Campo96;
    private javax.swing.JLabel Campo97;
    private javax.swing.JLabel Campo98;
    private javax.swing.JLabel Campo99;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
