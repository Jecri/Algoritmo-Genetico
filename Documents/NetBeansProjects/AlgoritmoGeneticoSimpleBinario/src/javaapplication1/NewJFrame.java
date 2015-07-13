package javaapplication1;

import javax.swing.JOptionPane;
import java.awt.*;

public class NewJFrame extends javax.swing.JFrame {

    Algoritmo base;
    public int pobIni_mantener[][] = new int[1000][100];

    
    int x=0;
    
    public NewJFrame() {
        initComponents();
        getIconImage();
        
    }
@Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Resources/ajustes.png"));
        

        return retValue;
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        btnGenerar = new javax.swing.JButton();
        btnProbar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaTextoPrueba = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtM = new javax.swing.JTextField();
        txtN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtnt = new javax.swing.JTextField();
        chk_mantener = new javax.swing.JCheckBox();
        txtcruce = new javax.swing.JLabel();
        txtvru = new javax.swing.JTextField();
        txtmutacion = new javax.swing.JLabel();
        txtmut = new javax.swing.JTextField();
        txtconvergencia = new javax.swing.JLabel();
        txtconv = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prototipo Algoritmos Genéticos - Algoritmo Genético Simple");
        setIconImage(getIconImage());
        setIconImages(null);

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        btnGenerar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnProbar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnProbar.setText("Probar");
        btnProbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbarActionPerformed(evt);
            }
        });

        areaTextoPrueba.setColumns(20);
        areaTextoPrueba.setRows(5);
        jScrollPane2.setViewportView(areaTextoPrueba);

        jLabel1.setText("Salida de generación:");

        jLabel2.setText("Pruebas:");

        txtM.setText("4");
        txtM.setEnabled(false);

        txtN.setText("5");
        txtN.setEnabled(false);

        jLabel3.setText("Tamaño de población (PAR): ");
        jLabel3.setEnabled(false);

        jLabel4.setText("Fenotipo de Cromosoma:");
        jLabel4.setEnabled(false);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("SI");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("NO");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("(Ingresar datos)");

        jLabel6.setText("Pseudocódigo:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("BEGIN /* Algoritmo Genetico Simple */\n\tGenerar una poblacion inicial.\n\tComputar la funcion de evaluacion de cada individuo.\n \tWHILE NOT Terminado DO\n\tBEGIN /* Producir nueva generacion */\n\t\tFOR Taman˜o poblacion/2 DO\n\t\tBEGIN /*Ciclo Reproductivo */\n\t\t\tSeleccionar dos individuos de la anterior generacion,\n\t\t\tpara el cruce (probabilidad de seleccion proporcional\n\t\t\ta la funcion de evaluacion del individuo).\n\t\t\tCruzar con cierta probabilidad los dos\n\t\t\tindividuos obteniendo dos descendientes.\n\t\t\tMutar los dos descendientes con cierta probabilidad.\n\t\t\tComputar la funcion de evaluacion de los dos\n\t\t\tdescendientes mutados.\n\t\t\tInsertar los dos descendientes mutados en la nueva generacion.\n\t\tEND\n\t\tIF la poblacion ha convergido THEN\n\t\t\tTerminado := TRUE\n\tEND\nEND\n");
        jScrollPane3.setViewportView(jTextArea1);

        jLabel8.setText("Número de compeidores para torneo: ");
        jLabel8.setEnabled(false);

        txtnt.setText("3");
        txtnt.setEnabled(false);

        chk_mantener.setText("Mantener población inicial");
        chk_mantener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_mantenerActionPerformed(evt);
            }
        });

        txtcruce.setText("Probabilidad de cruce: ");
        txtcruce.setEnabled(false);

        txtvru.setText("0.5");
        txtvru.setEnabled(false);

        txtmutacion.setText("Probabilidad de mutacion:");
        txtmutacion.setEnabled(false);

        txtmut.setText("0.8");
        txtmut.setEnabled(false);

        txtconvergencia.setText("Convergencia:");
        txtconvergencia.setEnabled(false);

        txtconv.setText("0.95");
        txtconv.setEnabled(false);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Salir");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 1167, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(txtcruce))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtM, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(txtN)
                                    .addComponent(txtvru))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jRadioButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel5)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtnt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnGenerar))
                                            .addComponent(chk_mantener)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtmutacion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtmut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtconvergencia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtconv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(btnProbar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel5)
                    .addComponent(btnProbar)
                    .addComponent(chk_mantener))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcruce)
                            .addComponent(txtvru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmutacion)
                            .addComponent(txtmut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtconvergencia)
                            .addComponent(txtconv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void mantener(int[][] pobla, int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n+2; j++) {
                pobIni_mantener[i][j]=pobla[i][j];
            }
        }
        
    }
            
    
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        
        try{
        
        boolean convergio=false;
        String imprimir="";    
            if (chk_mantener.isSelected() && x>=1) {
                base = new Algoritmo(Integer.parseInt(txtM.getText()),Integer.parseInt(txtN.getText()),Integer.parseInt(txtnt.getText()),Float.parseFloat(txtvru.getText()),Float.parseFloat(txtmut.getText()),Float.parseFloat(txtconv.getText()));
        
                base.Mantener(pobIni_mantener);
            }else{
                base = new Algoritmo(Integer.parseInt(txtM.getText()),Integer.parseInt(txtN.getText()),Integer.parseInt(txtnt.getText()),Float.parseFloat(txtvru.getText()),Float.parseFloat(txtmut.getText()),Float.parseFloat(txtconv.getText()));
                
                base.Genera();
                mantener(base.getPobIni(),Integer.parseInt(txtM.getText()),Integer.parseInt(txtN.getText()));
            }
        
        
        int i=0;
        while(convergio!=true){
            base.Procesar();
            convergio=base.convergio();
            imprimir+=base.imprimir()+"<--Numero de generación : "+(i+1)+"------------------------------------->\n";
            
            base.Reemplazar();
            i++;
        }
        

        areaTexto.setText(imprimir);
        if (base.getSumaPH()>base.getSumaBandera()) {
            JOptionPane.showMessageDialog(null, "Aumento el valor de la población : +"+(base.getSumaPH()-base.getSumaBandera())+" (Diferencia entre valor de pobalción)");
        }else
        if (base.getSumaPH()<base.getSumaBandera()){
            JOptionPane.showMessageDialog(null, "Disminuyó el valor de la población : "+(base.getSumaPH()-base.getSumaBandera())+" (Diferencia entre valor de pobalción)");
        }else
            if (base.getSumaPH()==base.getSumaBandera()) {
            JOptionPane.showMessageDialog(null, "Se mantuvo el valor de la población : "+(base.getSumaPH()-base.getSumaBandera())+" (Diferencia entre valor de pobalción)");

        }
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Error desbordamiento de datos");}
        x++;
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnProbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbarActionPerformed
//
//        int numero = (int)((Math.random()*(base.getM()+1))-1);
//        areaTextoPrueba.setText(""+numero);
        
        String mensaje="";
        int vector[]=new int [4]; 
        int i=0,j; 
        vector[i]=(int)(Math.random()*(5)); 
        for(i=1;i<4;i++) 
        { 
            vector[i]=(int)(Math.random()*(5)); 
            for(j=0;j<i;j++) 
            { 
                if(vector[i]==vector[j]) 
                { 
                    i--; 
                } 
            } 
        } 

        for(i=0;i<4;i++) 
        { 
        mensaje+="."+vector[i];
        } 
        areaTextoPrueba.setText(""+mensaje);
    }//GEN-LAST:event_btnProbarActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (chk_mantener.isSelected()){
            txtM.setEnabled(false);
            txtN.setEnabled(false);
        }else{
        txtM.setEnabled(true);
        txtN.setEnabled(true);
        }
        txtnt.setEnabled(true);
        jLabel3.setEnabled(true);
        jLabel4.setEnabled(true);
        jLabel8.setEnabled(true);
        txtconv.setEnabled(true);
            txtconvergencia.setEnabled(true);
            txtcruce.setEnabled(true);
            txtvru.setEnabled(true);
            txtmut.setEnabled(true);
            txtmutacion.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        txtM.setEnabled(false);
        txtN.setEnabled(false);
        txtnt.setEnabled(false);
        txtM.setText(""+4);
        txtN.setText(""+5);
        txtnt.setText(""+3);
        jLabel3.setEnabled(false);
        jLabel4.setEnabled(false);
        jLabel8.setEnabled(false);
        txtconv.setEnabled(false);
        txtconv.setText(""+9.5);
            txtconvergencia.setEnabled(false);
            txtcruce.setEnabled(false);
            txtvru.setEnabled(false);
            txtvru.setText(""+0.5);
            txtmut.setEnabled(false);
            txtmut.setText(""+0.8);
            txtmutacion.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void chk_mantenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_mantenerActionPerformed
        if (chk_mantener.isSelected()){
            
            if (jRadioButton1.isSelected()) {
                txtM.setEnabled(false);
                txtN.setEnabled(false);
                txtconv.setEnabled(true);
            txtconvergencia.setEnabled(true);
            txtcruce.setEnabled(true);
            txtvru.setEnabled(true);
            txtmut.setEnabled(true);
            txtmutacion.setEnabled(true);
                
            }
            
        }
            if (chk_mantener.isSelected()==false){
                if (jRadioButton1.isSelected()) {
                    txtM.setEnabled(true);
            txtN.setEnabled(true);
                }
            }
        
    }//GEN-LAST:event_chk_mantenerActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JTextArea areaTextoPrueba;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnProbar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk_mantener;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtconv;
    private javax.swing.JLabel txtconvergencia;
    private javax.swing.JLabel txtcruce;
    private javax.swing.JTextField txtmut;
    private javax.swing.JLabel txtmutacion;
    private javax.swing.JTextField txtnt;
    private javax.swing.JTextField txtvru;
    // End of variables declaration//GEN-END:variables
}
