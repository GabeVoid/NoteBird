package notebird;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NoteBird extends javax.swing.JFrame {
    
    private File file;
    private boolean textChanged = false;
            
    private static void initFrame() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoteBird.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new NoteBird().setVisible(true);
        });
    }

    public NoteBird() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("NoteBird.png")));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfPath = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taTextArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        btNew = new javax.swing.JMenuItem();
        btOpen = new javax.swing.JMenuItem();
        btSave = new javax.swing.JMenuItem();
        btSaveAs = new javax.swing.JMenuItem();
        menuSeparator = new javax.swing.JPopupMenu.Separator();
        btClose = new javax.swing.JMenuItem();
        menuOptions = new javax.swing.JMenu();
        btFont = new javax.swing.JMenuItem();
        btTheme = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NoteBird");
        setLocation(new java.awt.Point(100, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tfPath.setEditable(false);
        tfPath.setForeground(java.awt.Color.darkGray);

        taTextArea.setBackground(new java.awt.Color(51, 51, 51));
        taTextArea.setColumns(20);
        taTextArea.setForeground(new java.awt.Color(255, 255, 255));
        taTextArea.setRows(5);
        taTextArea.setCaretColor(java.awt.Color.cyan);
        taTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                taTextAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(taTextArea);

        menuFile.setText("Arquivo");

        btNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/New.png"))); // NOI18N
        btNew.setText("Novo");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });
        menuFile.add(btNew);

        btOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Open.png"))); // NOI18N
        btOpen.setText("Abrir");
        btOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpenActionPerformed(evt);
            }
        });
        menuFile.add(btOpen);

        btSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        btSave.setText("Salvar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        menuFile.add(btSave);

        btSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SaveAs.png"))); // NOI18N
        btSaveAs.setText("Salvar como");
        btSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveAsActionPerformed(evt);
            }
        });
        menuFile.add(btSaveAs);
        menuFile.add(menuSeparator);

        btClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        btClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        btClose.setText("Sair");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });
        menuFile.add(btClose);

        menuBar.add(menuFile);

        menuOptions.setText("Opções");

        btFont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Font.png"))); // NOI18N
        btFont.setText("Fonte");
        btFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFontActionPerformed(evt);
            }
        });
        menuOptions.add(btFont);

        btTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Theme.png"))); // NOI18N
        btTheme.setText("Tema");
        btTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemeActionPerformed(evt);
            }
        });
        menuOptions.add(btTheme);

        menuBar.add(menuOptions);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(tfPath))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        newFile();
    }//GEN-LAST:event_btNewActionPerformed

    private void taTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_taTextAreaKeyTyped
        textChanged = true;
        if(file == null){
            tfPath.setText("[!]");
        }else{
            tfPath.setText("[!] "+file.getAbsolutePath());
        }
    }//GEN-LAST:event_taTextAreaKeyTyped

    private void btOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpenActionPerformed
        openFile();
    }//GEN-LAST:event_btOpenActionPerformed

    private void btSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveAsActionPerformed
        try {
            saveAsFile();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao tentar salvar o arquivo!\n"+e);
        }
    }//GEN-LAST:event_btSaveAsActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        saveFile();
    }//GEN-LAST:event_btSaveActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(textChanged){
            switch (saveChanges("Sair")) {
                case 0:
                    saveFile();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    break;
                case 1:
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    break;
                default:
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        }else{
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemeActionPerformed
        ThemeFrame tf = new ThemeFrame(this,taTextArea.getBackground(),taTextArea.getForeground());
    }//GEN-LAST:event_btThemeActionPerformed

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        if(textChanged){
            switch (saveChanges("Sair")) {
                case 0:
                    saveFile();
                    System.exit(0);
                    break;
                case 1:
                    System.exit(0);
                    break;
                default:
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            }
        }else{
            System.exit(0);
        }
    }//GEN-LAST:event_btCloseActionPerformed

    private void btFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFontActionPerformed
        FontFrame ff = new FontFrame(taTextArea.getFont(), this);
    }//GEN-LAST:event_btFontActionPerformed

    public static void main(String args[]) {
        initFrame();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btClose;
    private javax.swing.JMenuItem btFont;
    private javax.swing.JMenuItem btNew;
    private javax.swing.JMenuItem btOpen;
    private javax.swing.JMenuItem btSave;
    private javax.swing.JMenuItem btSaveAs;
    private javax.swing.JMenuItem btTheme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuOptions;
    private javax.swing.JPopupMenu.Separator menuSeparator;
    private javax.swing.JTextArea taTextArea;
    private javax.swing.JTextField tfPath;
    // End of variables declaration//GEN-END:variables

    private void newFile() {
        if(!textChanged){
            cleanAll();
        }else{
            switch (saveChanges("Novo")) {
                case 0:
                    saveFile();
                    cleanAll();
                    break;
                case 1:
                    cleanAll();
                    break;
                default:
            }
        }
    }
    
    private void cleanAll(){
        taTextArea.setText("");
        tfPath.setText("");
        file = null;
        textChanged = false;
    }
    
    private int saveChanges(String operation){
        return JOptionPane.showConfirmDialog(rootPane, "Salvar alterações do texto atual?", operation, JOptionPane.YES_NO_CANCEL_OPTION);
    }

    private void saveFile() {
        if(file!=null){
            try {
                saveFileOperation();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao tentar salvar o arquivo!\n"+e);
            }
        }else{
            try {
            saveAsFile();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao tentar salvar o arquivo!\n"+e);
            }
        }
    }
    
    private void saveAsFile() throws IOException{
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de Texto (*.txt)", "txt");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            if (!file.getName().endsWith(".txt")) {
                file = new File(file.getAbsolutePath() + ".txt");
            }
            // Obtém a string que será salva no arquivo
            String text = taTextArea.getText();
            try ( // Salva a string no arquivo
                BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(text);
                writer.close();
            }
            tfPath.setText(file.getAbsolutePath());
            textChanged = false;
        }
    }

    private void openFile() {
        if(!textChanged){
            try {
                loadFile();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao tentar abrir arquivo!\n"+e);
            }
        }else{
            switch (saveChanges("Abrir")) {
                case 0:
                    saveFile();
                    try {
                        loadFile();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao tentar abrir arquivo!\n"+e);
                    }
                    break;
                case 1:
                    try {
                        loadFile();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao tentar abrir arquivo!\n"+e);
                    }
                    break;
                default:
            }
        }
    }
    
    private void loadFile() throws FileNotFoundException, IOException{
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de Texto (*.txt)", "txt");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            // Verifica se o arquivo tem extensão .txt
            if (!file.getName().endsWith(".txt")) {
                System.out.println("O arquivo selecionado não tem extensão .txt");
                return;
            }
            // Lê o conteúdo do arquivo para uma String
            StringBuilder text = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while(reader.ready()){
                    text.append(reader.readLine());
                    if(reader.ready()){
                        text.append("\n");
                    }
                }
            }
            String content = text.toString();
            taTextArea.setText(content);
            tfPath.setText(file.getAbsolutePath());
            textChanged = false;
        }
    }

    private void saveFileOperation() throws IOException {
        String text = taTextArea.getText();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
        }
        textChanged = false;
        tfPath.setText(file.getAbsolutePath());
    }
    
    public void changeFont(Font newFont){
        taTextArea.setFont(newFont);
    }
    
    public void changeTheme(Color clBackground, Color clForeground){
        taTextArea.setBackground(clBackground);
        taTextArea.setForeground(clForeground);
    }
}
