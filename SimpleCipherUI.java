/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecipher;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.table.*;
/**
 *
 * @author Drass
 */
public class SimpleCipherUI extends javax.swing.JFrame {
    
    static boolean firstRun = true;
    static String originalText = "", newText = "";
    static int charCount = 0, swappedCharCount = 0;
    static ArrayList<SimpleCipher> actions = new ArrayList<SimpleCipher>();
    SimpleCipher sc;
    
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Ошибка: " + titleBar, JOptionPane.ERROR_MESSAGE);
    }
    
    public void loadFromFile(){
        try(BufferedReader br = new BufferedReader(new FileReader(filePathBox.getText()))){
            inputTextBox.setEditable(false);
            inputTextBox.setText("");
            String str = "";
            do{
                str = br.readLine();
                inputTextBox.append(str);
            } while (str != null);
        } catch(FileNotFoundException e) { SimpleCipherUI.infoBox(e.toString(), "Ошибка!");  
        } catch(IOException e){ SimpleCipherUI.infoBox(e.toString(), "Ошибка!"); }
    }
    
    public SimpleCipherUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTextBox = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lastEventBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        changeFromBox = new javax.swing.JFormattedTextField();
        changeToBox = new javax.swing.JFormattedTextField();
        fromRandButton = new javax.swing.JToggleButton();
        toRandButton = new javax.swing.JToggleButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        filePathBox = new javax.swing.JTextField();
        fileLoadButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventLog = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        numberOfTimesBox = new javax.swing.JSpinner();
        jScrollPane4 = new javax.swing.JScrollPane();
        inputTextBox = new javax.swing.JTextArea();
        symbolsNumber = new javax.swing.JLabel();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        outputTextBox.setEditable(false);
        outputTextBox.setColumns(20);
        outputTextBox.setRows(5);
        jScrollPane1.setViewportView(outputTextBox);

        jLabel1.setText("Оригинальный тест");

        jLabel2.setText("Изменённый текст");

        jLabel4.setText("Заменить:");

        jLabel5.setText("На:");

        lastEventBox.setEditable(false);

        jLabel6.setText("Последние операции");

        try {
            changeFromBox.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            changeToBox.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("*")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        fromRandButton.setText("Rand");
        fromRandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromRandButtonActionPerformed(evt);
            }
        });

        toRandButton.setText("Rand");
        toRandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toRandButtonActionPerformed(evt);
            }
        });

        eventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane5.setViewportView(eventTable);
        if (eventTable.getColumnModel().getColumnCount() > 0) {
            eventTable.getColumnModel().getColumn(0).setResizable(false);
        }

        filePathBox.setText("Путь к файлу...");
        filePathBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                filePathBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                filePathBoxFocusLost(evt);
            }
        });
        filePathBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePathBoxActionPerformed(evt);
            }
        });

        fileLoadButton.setText("Загрузить");
        fileLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileLoadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(filePathBox, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(fileLoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filePathBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileLoadButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(changeFromBox)
                            .addComponent(changeToBox)
                            .addComponent(jLabel4)
                            .addComponent(fromRandButton, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(toRandButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastEventBox, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastEventBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changeFromBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(fromRandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeToBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toRandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        eventLog.setEditable(false);
        eventLog.setColumns(20);
        eventLog.setRows(5);
        jScrollPane2.setViewportView(eventLog);

        jLabel3.setText("Журнал событий");

        jButton1.setText("Выполнить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Раз");

        numberOfTimesBox.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        inputTextBox.setColumns(20);
        inputTextBox.setRows(5);
        inputTextBox.setText("Съешь ещё этих мягких французских булок, да выпей же чаю");
        jScrollPane4.setViewportView(inputTextBox);

        symbolsNumber.setText("Количество уникальных символов: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(numberOfTimesBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(symbolsNumber)
                        .addGap(81, 81, 81))
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(symbolsNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberOfTimesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        // Collecting information about the input text, including the number of characters;
        if(firstRun == true){
            originalText = inputTextBox.getText();
            newText = originalText;
            for(int i=0; i<originalText.length(); i++){
                char ch = originalText.charAt(i);
                if(!SimpleCipher.newChars.contains(ch)){
                    SimpleCipher.addNewChars(ch);
                    System.out.println(ch);
                    System.out.println(SimpleCipher.origChars.size());
                    charCount++;
                }
            }
            symbolsNumber.setText("Количество уникальных символов: " + charCount);
            inputTextBox.setEditable(false);
            firstRun = false;
        }
        
        // Preventing the user from trying to swap out more symbols than possible
        if((int) numberOfTimesBox.getValue() > charCount-actions.size()){
            SimpleCipherUI.infoBox("Во всём тексте не осталось такого количества символов!", "Ошибка!");
        }
        // Allowing the user to swap multiple (random) symbols at once
        else for(int i=0; i< (int) numberOfTimesBox.getValue() ; i++){
            if(fromRandButton.isSelected()) changeFromBox.setValue(Character.toString(SimpleCipher.chooseRandom(1)));
            if(toRandButton.isSelected()) changeToBox.setValue(Character.toString(SimpleCipher.chooseRandom(2)));
            try {
                String str = (String)changeFromBox.getValue(), str2 = (String)changeToBox.getValue();
                sc = new SimpleCipher(str.charAt(0),str2.charAt(0));
                newText = sc.swapLetters(originalText, newText);
                actions.add(sc);
            } catch (WrongSwappedException e) { SimpleCipherUI.infoBox("Некорректный заменяемый символ", "Ошибка!");
            } catch (WrongSwapperException e) { SimpleCipherUI.infoBox("Некорректный заменяющий символ", "Ошибка!"); 
            } catch (SwapLimitException e) { SimpleCipherUI.infoBox(e.toString(), "Ошибка!"); }
        lastEventBox.setText(" "+actions.size()+") Произведена замена: \'" + sc.getFirst() + "\' -> \'" + sc.getSecond()+"\'");
        eventLog.append(lastEventBox.getText() + "\n");
        }
        outputTextBox.setText(newText);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Disabling input for the text fields controlling which letters are swapped when the "random" button is pressed
    private void fromRandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromRandButtonActionPerformed
        if(fromRandButton.isSelected()) changeFromBox.setEditable(false);
        else changeFromBox.setEditable(true);
    }//GEN-LAST:event_fromRandButtonActionPerformed

    private void toRandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toRandButtonActionPerformed
        if(toRandButton.isSelected()) changeToBox.setEditable(false);
        else changeToBox.setEditable(true);
    }//GEN-LAST:event_toRandButtonActionPerformed
    
    // Loading the initial text from a text file
    private void fileLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileLoadButtonActionPerformed
        loadFromFile();
    }//GEN-LAST:event_fileLoadButtonActionPerformed

    private void filePathBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filePathBoxActionPerformed
        loadFromFile();
    }//GEN-LAST:event_filePathBoxActionPerformed

    private void filePathBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filePathBoxFocusGained
        filePathBox.setText("");
    }//GEN-LAST:event_filePathBoxFocusGained

    private void filePathBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filePathBoxFocusLost
        filePathBox.setText("Путь к файлу...");
    }//GEN-LAST:event_filePathBoxFocusLost

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
            java.util.logging.Logger.getLogger(SimpleCipherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimpleCipherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimpleCipherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimpleCipherUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleCipherUI().setVisible(true);     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField changeFromBox;
    private javax.swing.JFormattedTextField changeToBox;
    private javax.swing.JTextArea eventLog;
    private javax.swing.JTable eventTable;
    private javax.swing.JButton fileLoadButton;
    private javax.swing.JTextField filePathBox;
    private javax.swing.JToggleButton fromRandButton;
    private javax.swing.JTextArea inputTextBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField lastEventBox;
    private javax.swing.JSpinner numberOfTimesBox;
    private javax.swing.JTextArea outputTextBox;
    private javax.swing.JLabel symbolsNumber;
    private javax.swing.JToggleButton toRandButton;
    // End of variables declaration//GEN-END:variables
}
