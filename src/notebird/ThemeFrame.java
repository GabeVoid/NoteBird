package notebird;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JColorChooser;

public class ThemeFrame extends javax.swing.JFrame {
    
    private NoteBird noteBird;
    
    public ThemeFrame(NoteBird currentNoteBird, Color clBackground, Color clForeground) {
        initComponents();
        initFrame();
        tfCustom.setBackground(clBackground);
        tfCustom.setForeground(clForeground);
        noteBird = currentNoteBird;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        rbDark = new javax.swing.JRadioButton();
        rbLight = new javax.swing.JRadioButton();
        rbCustom = new javax.swing.JRadioButton();
        tfDefaultDark = new javax.swing.JTextField();
        tfDefaultLight = new javax.swing.JTextField();
        tfCustom = new javax.swing.JTextField();
        btBackground = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btForeground = new javax.swing.JButton();
        btOk = new javax.swing.JButton();
        btOk1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tema");
        setLocation(new java.awt.Point(150, 150));
        setResizable(false);

        buttonGroup.add(rbDark);

        buttonGroup.add(rbLight);

        buttonGroup.add(rbCustom);
        rbCustom.setSelected(true);

        tfDefaultDark.setBackground(new java.awt.Color(51, 51, 51));
        tfDefaultDark.setForeground(new java.awt.Color(255, 255, 255));
        tfDefaultDark.setText("Padrão Escuro");

        tfDefaultLight.setText("Padrão Claro");

        tfCustom.setBackground(new java.awt.Color(0, 0, 0));
        tfCustom.setForeground(new java.awt.Color(0, 204, 0));
        tfCustom.setText("Personalizado");

        btBackground.setText("Fundo");
        btBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackgroundActionPerformed(evt);
            }
        });

        btForeground.setText("Texto");
        btForeground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btForegroundActionPerformed(evt);
            }
        });

        btOk.setText("Ok");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });

        btOk1.setText("Cancelar");
        btOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOk1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbDark)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDefaultDark, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbLight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDefaultLight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbCustom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btForeground, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btOk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOk1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbDark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDefaultDark, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbLight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDefaultLight, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbCustom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOk, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btForeground, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOk1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackgroundActionPerformed
        Color color = JColorChooser.showDialog(rootPane, "Escolha a cor", tfCustom.getBackground());
        tfCustom.setBackground(color);
    }//GEN-LAST:event_btBackgroundActionPerformed

    private void btForegroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btForegroundActionPerformed
        Color color = JColorChooser.showDialog(rootPane, "Escolha a cor", tfCustom.getForeground());
        tfCustom.setForeground(color);
    }//GEN-LAST:event_btForegroundActionPerformed

    private void btOk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOk1ActionPerformed
        dispose();
    }//GEN-LAST:event_btOk1ActionPerformed

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        int selecButton = 2;
        if(rbDark.isSelected()) selecButton = 0;
        if(rbLight.isSelected()) selecButton = 1;
        switch (selecButton) {
            case 0:
                noteBird.changeTheme(tfDefaultDark.getBackground(), tfDefaultDark.getForeground());
                break;
            case 1:
                noteBird.changeTheme(tfDefaultLight.getBackground(), tfDefaultLight.getForeground());
                break;
            default:
                noteBird.changeTheme(tfCustom.getBackground(), tfCustom.getForeground());
        }
        dispose();
    }//GEN-LAST:event_btOkActionPerformed
    
    private void initFrame(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Theme.png")));
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBackground;
    private javax.swing.JButton btForeground;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btOk1;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbCustom;
    private javax.swing.JRadioButton rbDark;
    private javax.swing.JRadioButton rbLight;
    private javax.swing.JTextField tfCustom;
    private javax.swing.JTextField tfDefaultDark;
    private javax.swing.JTextField tfDefaultLight;
    // End of variables declaration//GEN-END:variables
}
