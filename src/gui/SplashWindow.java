package gui;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SplashWindow extends javax.swing.JFrame {

    
    public SplashWindow() {
        initComponents();
        loadingAnimation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loadingProBar = new javax.swing.JProgressBar();
        loadingLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FlatLaf Custome UI");
        setUndecorated(true);
        setResizable(false);

        loadingProBar.setForeground(new java.awt.Color(102, 255, 102));

        loadingLabel.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        loadingLabel.setText("Loading...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadingProBar, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(loadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(loadingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingProBar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loadingLabel;
    private javax.swing.JProgressBar loadingProBar;
    // End of variables declaration//GEN-END:variables

    private void loadingAnimation() {
        Thread t = new Thread(
             new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    
                    if ( i == 20){
                        loadingLabel.setText("Please Wait...");
                    }else if( i == 40){
                         loadingLabel.setText("Libraries Loading...");
                    }else if ( i == 60){
                        loadingLabel.setText("Creating Database Connection...");
                    }else if ( i == 80){
                        loadingLabel.setText("UI Genarated Successfully...");
                    }else if ( i == 90){
                        loadingLabel.setText("Creating Database Connection Successfully...");
                    }else if ( i == 100){
                        loadingLabel.setText("Done...");
                    }
                    
                    loadingProBar.setValue(i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                    
                    }
                }
                
                new SingInWindow().setVisible(true);
                claer();
                
            }
        }
        );
        t.start();
        

    }
    private void claer(){
        this.dispose();
    }

}
