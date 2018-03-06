/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Davy Sheehy
 */
public class TeacherGUI extends javax.swing.JFrame {

    ArrayList<Teacher> teacherList;
    File inputFile;
    File objectFile;
   
    /**
     * Creates new form TeacherGUI
     */
    public TeacherGUI() {
        initComponents();
        teacherList = new ArrayList<Teacher>();
        inputFile = new File("teachers.txt");
        objectFile = new File("teachers.data");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        schoolLbl = new javax.swing.JLabel();
        salaryLbl = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        schoolTxtFld = new javax.swing.JTextField();
        salaryTxtFld = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLbl.setText("Teacher Graphical User Interface");

        nameLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLbl.setText("Name:");

        schoolLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        schoolLbl.setText("School:");

        salaryLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        salaryLbl.setText("Salary:");

        schoolTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolTxtFldActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        displayBtn.setText("Display");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(nameLbl)
                        .addGap(59, 59, 59)
                        .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(schoolLbl)
                        .addGap(62, 62, 62)
                        .addComponent(schoolTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(displayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salaryLbl)
                                .addGap(57, 57, 57)
                                .addComponent(salaryTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLbl)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLbl)
                    .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(schoolLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(schoolTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salaryLbl)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(salaryTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayBtn)
                    .addComponent(addBtn))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void schoolTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolTxtFldActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        String name = nameTxtFld.getText();
        String school = schoolTxtFld.getText();
        Double salary = Double.parseDouble(salaryTxtFld.getText());
        Teacher t = new Teacher(name,school,salary);
        
        //teacherList.add(t);
        
         FileOutputStream fstream;
        ObjectOutputStream ostream;
        
        try {
        /*
        FileWriter fw = new FileWriter(inputFile, true); //takes input char by char
        BufferedWriter bw = new BufferedWriter(fw); //takes input line by line
        
        bw.write(name);
        bw.close();
            */
        
        fstream = new FileOutputStream(objectFile);
        ostream = new ObjectOutputStream(fstream);
        
        ostream.writeObject(t);
        ostream.close();
       
        
        System.out.println("success");
        
        
        } catch(IOException e) {
            System.out.println("Failed to write to file: "+e);
        }
        
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
        /*
        String output = new String();
        
        
        try {
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            
            output = br.readLine();
            br.close();
        }catch(IOException e) {
            System.out.println(e);
        }
        
        System.out.println(output);
        
        /*
        for (int i =0;i<teacherList.size();i++) {
            JOptionPane.showMessageDialog(null, "Name: "+teacherList.get(i).getName()+"\nSchool: "+teacherList.get(i).getSchoolName()+"\nSalary: "+teacherList.get(i).getSalary());
        }
        */
        
        FileInputStream fstream;
        ObjectInputStream ostream;
        
        
        try {
            fstream = new FileInputStream(objectFile);
            ostream = new ObjectInputStream(fstream);
            
            Teacher t;
            
            t=(Teacher)ostream.readObject();
            
            JOptionPane.showMessageDialog(null, t.getName()+" "+t.getSchoolName()+" "+t.getSalary());
            
            
        }catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_displayBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JLabel salaryLbl;
    private javax.swing.JTextField salaryTxtFld;
    private javax.swing.JLabel schoolLbl;
    private javax.swing.JTextField schoolTxtFld;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}