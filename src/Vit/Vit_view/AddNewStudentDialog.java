/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vit.view;

import Vit.model.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class AddNewStudentDialog extends javax.swing.JDialog implements ActionListener {

    /**
     * Creates new form AddNewStudentDialog
     */
    private ArrayList<Student> students_list;
    private HomeFrm parent;

    public AddNewStudentDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.parent = (HomeFrm) parent;
        setLocationRelativeTo(null);
        addActionListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtstd_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtstd_cls = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtadyear = new javax.swing.JTextField();
        cbbmajor = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtps_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtBD = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        addNewStudentbtn = new javax.swing.JButton();
        deleteDatabtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();

        jLabel4.setText("H??? v?? t??n:");

        jLabel5.setText("S??? CMND/C??n c?????c/H??? chi???u:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TH??M M???I SINH VI??N");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Th??m m???i sinh vi??n");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Th??ng tin sinh vi??n"));

        jLabel2.setText("M?? sinh vi??n:");

        jLabel3.setText("L???p:");

        jLabel6.setText("Chuy??n ng??nh:");

        jLabel7.setText("Ni??n kh??a:");

        cbbmajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C??ng ngh??? th??ng tin", "??i???n t??? vi???n th??ng", "Qu???n tr??? kinh doanh", "Khoa h???c d??? li???u", "C?? ??i???n t???", "M??y t??nh v?? Robot", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtadyear, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbmajor, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtstd_cls, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtstd_id, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtstd_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtstd_cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbbmajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtadyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Th??ng tin c?? nh??n"));

        jLabel10.setText("S??? CMND/C??n c?????c/H??? chi???u:");
        jLabel10.setToolTipText("CMT/CCCD/H??? chi???u bao g???m c??? ch??? v?? s??? d??i 9-13 k?? t???");

        txtps_id.setToolTipText("CMT/CCCD/H??? chi???u bao g???m c??? ch??? v?? s??? d??i 9-13 k?? t???");

        jLabel11.setText("H??? v?? t??n:");
        jLabel11.setToolTipText("H??? v?? t??n ch??? bao g???m ch??? c??i, d??i t???i ??a 40 k?? t???");

        txtFullName.setToolTipText("H??? v?? t??n ch??? bao g???m ch??? c??i, d??i t???i ??a 40 k?? t???");

        jLabel12.setText("?????a ch???:");

        jLabel13.setText("Ng??y sinh:");
        jLabel13.setToolTipText("Ng??y sinh c?? ?????nh d???ng dd/MM/yyyy");

        txtBD.setToolTipText("Ng??y sinh c?? ?????nh d???ng dd/MM/yyyy");

        jLabel14.setText("Email:");

        jLabel15.setText("S??? ??i???n tho???i:");
        jLabel15.setToolTipText("S??? ??i???n tho???i c?? 10 ho???c 11 ch??? s???, b???t ?????u b???ng c??c ?????u s???:01,03,04,07,08,09");

        txtPhoneNumber.setToolTipText("S??? ??i???n tho???i c?? 10 ho???c 11 ch??? s???, b???t ?????u b???ng c??c ?????u s???:01,03,04,07,08,09");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtps_id, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBD, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtps_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        addNewStudentbtn.setText("Th??m m???i");

        deleteDatabtn.setText("X??a d??? li???u");

        cancelbtn.setText("H???y b???");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(addNewStudentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(deleteDatabtn)
                .addGap(57, 57, 57)
                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(241, 241, 241)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelbtn)
                    .addComponent(addNewStudentbtn)
                    .addComponent(deleteDatabtn))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(243, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNewStudentDialog dialog = new AddNewStudentDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public void setStd_list(ArrayList<Student> students_list) {
        this.students_list = students_list;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewStudentbtn;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JComboBox<String> cbbmajor;
    private javax.swing.JButton deleteDatabtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBD;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtadyear;
    private javax.swing.JTextField txtps_id;
    private javax.swing.JTextField txtstd_cls;
    private javax.swing.JTextField txtstd_id;
    // End of variables declaration//GEN-END:variables

    public void addActionListener() {
        addNewStudentbtn.addActionListener(this);
        deleteDatabtn.addActionListener(this);
        cancelbtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var obj = e.getSource();

        if (obj.equals(addNewStudentbtn)) {
            addNewStudent();
        } else if (obj.equals(deleteDatabtn)) {
            deleData();
        } else if (obj.equals(cancelbtn)) {
            this.dispose();
        }
    }

    public boolean checkValidPs_id(String ps_id) {
        Pattern pt1 = Pattern.compile("^[a-zA-Z0-9]{9,13}$");
        Pattern pt2 = Pattern.compile("^.*[0-9].*$");
        Pattern pt3 = Pattern.compile("^.*[a-z].*$");
        Pattern pt4 = Pattern.compile("^.*[A-Z].*$");

        return (pt1.matcher(ps_id).matches() && pt2.matcher(ps_id).matches() && pt3.matcher(ps_id).matches())
                || (pt1.matcher(ps_id).matches() && pt2.matcher(ps_id).matches() && pt4.matcher(ps_id).matches());
    }

    public boolean checkValidName(String fullName) {
        String name_regex = "^[aA????????????????????????????????????????????????????????????????????????????????????????????bBcCdD??"
                + "??eE????????????????????????????????????????????????????????????fFgGhHiI????????????????????????jJ"
                + "kKlLmMnNoO????????????????????????????????????????????????????????????????????????????????????????????pPqQrRsStT"
                + "uU??????????????????????????????????????????????????????????vVwWxXyY????????????????????????????zZ\\s]{1,40}$";
        Pattern pattern = Pattern.compile(name_regex);

        return pattern.matcher(fullName).matches();
    }

    public boolean checkValidBirthDate(String birthDate) {
        Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        return pattern.matcher(birthDate).matches();
    }

    public boolean checkValidPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^(01|03|04|07|08|09)[0-9]{8,9}$");
        return pattern.matcher(phoneNumber).matches();
    }

    public boolean checkValidEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-z0-9._]+@[a-zA-Z]+(\\.[a-zA-Z]+)+$");
        return pattern.matcher(email).matches();
    }

    public boolean checkValidStd_id(String std_id) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        return pattern.matcher(std_id).matches();
    }

    public void addNewStudent() {
        String ps_id = txtps_id.getText();
        String fullName = txtFullName.getText();
        String address = txtAddress.getText();
        String birthDate = txtBD.getText();
        String email = txtEmail.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String std_id = txtstd_id.getText();
        String std_class = txtstd_cls.getText();
        String major = cbbmajor.getSelectedItem().toString();
        String academic_year = txtadyear.getText();

        boolean valid = true;
        boolean notEmpty = true;

        if (!checkValidPs_id(ps_id) && !ps_id.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "S??? CMT/CCCD/H??? chi???u kh??ng h???p l???,"
                    + "CMT/CCCD/H??? chi???u bao g???m c??? ch??? v?? s??? d??i 9-13 k?? t???");
            valid = false;
        }

        if (!checkValidName(fullName) && !fullName.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "H??? v?? t??n kh??ng h???p l???, h??? v?? t??n ch??? bao g???m ch??? c??i,"
                    + " d??i t???i ??a 40 k?? t???");
            valid = false;
        }

        if (!checkValidBirthDate(birthDate) && !birthDate.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ng??y sinh kh??ng h???p l???,"
                    + "ng??y sinh h???p l??? c?? ?????nh d???ng dd/MM/yyyy");
            valid = false;
        }

        if (!checkValidPhoneNumber(phoneNumber) && !phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "S??? ??i???n tho???i kh??ng h???p l???,"
                    + "s??? ??i???n tho???i c?? 10 ho???c 11 ch??? s???, b???t ?????u b???ng c??c ?????u s???:01,03,04,07,08,09");
            valid = false;
        }

        if (!checkValidEmail(email) && !email.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Email kh??ng h???p l???!");
            valid = false;
        }

        if (!checkValidStd_id(std_id) && !std_id.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "M?? s??? sinh vi??n kh??ng ???????c ch???a k?? t??? ?????c bi???t!");
            valid = false;
        }

        if (ps_id.isEmpty() || fullName.isEmpty() || address.isEmpty() || birthDate.isEmpty()
                || email.isEmpty() || phoneNumber.isEmpty() || std_id.isEmpty()
                || std_class.isEmpty() || academic_year.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Th??ng tin kh??ng ???????c ????? tr???ng!");
            notEmpty = false;
        }

        if (valid == true && notEmpty == true) {
            Student student = new Student(ps_id, fullName, birthDate, address, email, phoneNumber,
                    std_id, std_class, major, academic_year);
            if (!students_list.contains(student)) {
                students_list.add(student);
                parent.showLastStudent();
                parent.writeStudentToDB(student);
                JOptionPane.showMessageDialog(rootPane, "Th??m m???i sinh vi??n th??nh c??ng!");
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Sinh vi??n ???? t???n t???i");
            }
        }
    }

    public void deleData() {
        txtps_id.setText("");
        txtAddress.setText("");
        txtBD.setText("");
        txtEmail.setText("");
        txtFullName.setText("");
        txtPhoneNumber.setText("");
        txtadyear.setText("");
        txtstd_cls.setText("");
        txtstd_id.setText("");
        cbbmajor.setSelectedIndex(0);
    }
}
