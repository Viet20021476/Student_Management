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
public class EditStudentDialog extends javax.swing.JDialog implements ActionListener {

    /**
     * Creates new form EditStudentDialog
     */
    private HomeFrm parent;
    private ArrayList<Student> students_list;
    private int editedStdIndex;

    public EditStudentDialog(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtstd_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtstd_cls = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtadyear = new javax.swing.JTextField();
        cbbmajor = new javax.swing.JComboBox<>();
        editStudentbtn = new javax.swing.JButton();
        deleteDatabtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SỬA THÔNG TIN SINH VIÊN");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sửa thông tin sinh viên");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin cá nhân"));

        jLabel10.setText("Số CMND/Căn cước/Hộ chiếu:");
        jLabel10.setToolTipText("CMT/CCCD/Hộ chiếu bao gồm cả chữ và số dài 9-13 ký tự");

        txtps_id.setToolTipText("CMT/CCCD/Hộ chiếu bao gồm cả chữ và số dài 9-13 ký tự");

        jLabel11.setText("Họ và tên:");
        jLabel11.setToolTipText("Họ và tên chỉ bao gồm chữ cái, dài tối đa 40 ký tự");

        txtFullName.setToolTipText("Họ và tên chỉ bao gồm chữ cái, dài tối đa 40 ký tự");

        jLabel12.setText("Địa chỉ:");

        jLabel13.setText("Ngày sinh:");
        jLabel13.setToolTipText("Ngày sinh có định dạng dd/MM/yyyy");

        txtBD.setToolTipText("Ngày sinh có định dạng dd/MM/yyyy");

        jLabel14.setText("Email:");

        jLabel15.setText("Số điện thoại:");
        jLabel15.setToolTipText("Số điện thoại có 10 hoặc 11 chữ số, bắt đầu bằng các đầu số:01,03,04,07,08,09");

        txtPhoneNumber.setToolTipText("Số điện thoại có 10 hoặc 11 chữ số, bắt đầu bằng các đầu số:01,03,04,07,08,09");

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
                .addContainerGap(58, Short.MAX_VALUE))
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin sinh viên"));

        jLabel2.setText("Mã sinh viên:");

        jLabel3.setText("Lớp:");

        jLabel6.setText("Chuyên ngành:");

        jLabel7.setText("Niên khóa:");

        cbbmajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Công nghệ thông tin", "Điện tử viễn thông", "Quản trị kinh doanh", "Khoa học dữ liệu", "Cơ điện tử", "Máy tính và Robot", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstd_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstd_cls, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbmajor, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtadyear, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtstd_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtstd_cls, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbmajor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtadyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        editStudentbtn.setText("Cập nhật");

        deleteDatabtn.setText("Xóa dữ liệu");

        cancelbtn.setText("Hủy bỏ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(editStudentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(deleteDatabtn)
                .addGap(57, 57, 57)
                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editStudentbtn)
                    .addComponent(deleteDatabtn)
                    .addComponent(cancelbtn))
                .addContainerGap(36, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(EditStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditStudentDialog dialog = new EditStudentDialog(new javax.swing.JFrame(), true);
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

    public void setTxtPs_id(String s) {
        txtps_id.setText(s);
    }

    public void setFullName(String s) {
        txtFullName.setText(s);
    }

    public void setTxtAddress(String s) {
        txtAddress.setText(s);
    }

    public void setTxtBirthDate(String s) {
        txtBD.setText(s);
    }

    public void setTxtEmail(String s) {
        txtEmail.setText(s);
    }

    public void setTxtPhoneNumber(String s) {
        txtPhoneNumber.setText(s);
    }

    public void setTxtStd_id(String s) {
        txtstd_id.setText(s);
    }

    public void setTxtStd_class(String s) {
        txtstd_cls.setText(s);
    }

    public void setCbbMajor(String s) {
        cbbmajor.setSelectedItem(s);
    }

    public void setTxtAcyear(String s) {
        txtadyear.setText(s);
    }

    public void seteditedStdIndex(int editedStdIndex) {
        this.editedStdIndex = editedStdIndex;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtn;
    private javax.swing.JComboBox<String> cbbmajor;
    private javax.swing.JButton deleteDatabtn;
    private javax.swing.JButton editStudentbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
        editStudentbtn.addActionListener(this);
        deleteDatabtn.addActionListener(this);
        cancelbtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var obj = e.getSource();

        if (obj.equals(editStudentbtn)) {
            editStudent();
        } else if (obj.equals(deleteDatabtn)) {
            deleData();
        } else if (obj.equals(cancelbtn)) {
            this.dispose();
        }
    }

    public void editStudent() {
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
            JOptionPane.showMessageDialog(rootPane, "Số CMT/CCCD/Hộ chiếu không hợp lệ,"
                    + "CMT/CCCD/Hộ chiếu bao gồm cả chữ và số dài 9-13 ký tự");
            valid = false;
        }

        if (!checkValidName(fullName) && !fullName.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Họ và tên không hợp lệ, họ và tên chỉ bao gồm chữ cái,"
                    + " dài tối đa 40 ký tự");
            valid = false;
        }

        if (!checkValidBirthDate(birthDate) && !birthDate.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ngày sinh không hợp lệ,"
                    + "ngày sinh hợp lệ có định dạng dd/MM/yyyy");
            valid = false;
        }

        if (!checkValidPhoneNumber(phoneNumber) && !phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại không hợp lệ,"
                    + "số điện thoại có 10 hoặc 11 chữ số, bắt đầu bằng các đầu số:01,03,04,07,08,09");
            valid = false;
        }

        if (!checkValidEmail(email) && !email.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Email không hợp lệ!");
            valid = false;
        }

        if (!checkValidStd_id(std_id) && !std_id.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mã số sinh viên không được chứa ký tự đặc biệt!");
            valid = false;
        }

        if (ps_id.isEmpty() || fullName.isEmpty() || address.isEmpty() || birthDate.isEmpty()
                || email.isEmpty() || phoneNumber.isEmpty() || std_id.isEmpty()
                || std_class.isEmpty() || academic_year.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Thông tin không được để trống!");
            notEmpty = false;
        }

        if (valid == true && notEmpty == true) {
            Student student = new Student(ps_id, fullName, birthDate, address, email, phoneNumber,
                    std_id, std_class, major, academic_year);
            if ((!students_list.contains(student)) || (students_list.contains(student)
                    && students_list.get(editedStdIndex).getStd_id().equals(std_id))) {
                parent.updateStudentTable(student, editedStdIndex);
                parent.updateStudentDB(student);
                JOptionPane.showMessageDialog(parent, "Sửa thông tin sinh viên thành công!");
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Sinh viên đã tồn tại");
            }
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
        String name_regex = "^[aAàÀảẢãÃáÁạẠăĂằẰẳẲẵẴắẮặẶâÂầẦẩẨẫẪấẤậẬbBcCdDđ"
                + "ĐeEèÈẻẺẽẼéÉẹẸêÊềỀểỂễỄếẾệỆfFgGhHiIìÌỉỈĩĨíÍịỊjJ"
                + "kKlLmMnNoOòÒỏỎõÕóÓọỌôÔồỒổỔỗỖốỐộỘơƠờỜởỞỡỠớỚợỢpPqQrRsStT"
                + "uUùÙủỦũŨúÚụỤưƯừỪửỬữỮứỨựỰvVwWxXyYỳỲỷỶỹỸýÝỵỴzZ\\s]{1,40}$";
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