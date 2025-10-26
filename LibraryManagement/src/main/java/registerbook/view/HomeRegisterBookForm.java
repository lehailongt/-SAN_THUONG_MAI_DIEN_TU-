
package registerbook.view;

import adminstrator.model.Employee;
import adminstrator.view.AdminFunctionForm;
import adminstrator.view.LoginAdminForm;
import book.Controller.DataFuctionImplement;
import book.Model.Book;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import registerbook.controller.DataRegisterBookimp;
import registerbook.model.OutOfDate;
import registerbook.model.RegisterBook;
import student.controller.DataStudentFunctionImp;
import student.model.Student;

public class HomeRegisterBookForm extends javax.swing.JFrame {

    private ArrayList<RegisterBook> listRb;
    private ArrayList<Book> listB;
    private ArrayList<Student> listSt;
    private ArrayList<OutOfDate> listOOD;
    private DefaultTableModel tableModelRb;
    private DefaultTableModel tableModelOOD;
    private Employee emp;
    private int stt;
    private DataRegisterBookimp drb;
    private int edit;
    private int sumBook;
    private int sumBorrowBook;
    private int sumBookRest;

    public HomeRegisterBookForm() {
        initComponents();
        setLocationRelativeTo(null);
        listRb = new ArrayList<>();
        listB = new ArrayList<>();
        listSt = new ArrayList<>();
        listOOD = new ArrayList<>();
        addButtonGroup();
        tableModelRb = (DefaultTableModel) tableRegisterBook.getModel();
        tableModelOOD = (DefaultTableModel) tableOutOfDate.getModel();
        stt = 1;
        edit = -1;
        sumBook = 0;
        sumBorrowBook = 0;
        sumBookRest = 0;
        drb = new DataRegisterBookimp();
        LabelCheckSTid.setText("");
        LabelCheckBookId.setText("");
        addReadSQL();
        showListRb();
        readOutOfDate();
        setStatistics();
        setSTT();
        tableRegisterBook.setAutoCreateRowSorter(true);
    }

    public HomeRegisterBookForm(Employee e) {
        this();
        this.emp = e;
    }

    public ArrayList<RegisterBook> getListRb() {
        return listRb;
    }

    public void setListRb(ArrayList<RegisterBook> listRb) {
        this.listRb = listRb;
    }

    public ArrayList<Book> getListB() {
        return listB;
    }

    public void setListB(ArrayList<Book> listB) {
        this.listB = listB;
    }

    public ArrayList<Student> getListSt() {
        return listSt;
    }

    public void setListSt(ArrayList<Student> listSt) {
        this.listSt = listSt;
    }

    public DataRegisterBookimp getDrb() {
        return drb;
    }

    public void setDrb(DataRegisterBookimp drb) {
        this.drb = drb;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSeach = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rbtnSeachGiveBookBack = new javax.swing.JRadioButton();
        rbtnStudentId = new javax.swing.JRadioButton();
        rbtnBookId = new javax.swing.JRadioButton();
        txtSeachRB = new javax.swing.JTextField();
        btnSeachRb = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LabelStudentId = new javax.swing.JLabel();
        LabelBookId = new javax.swing.JLabel();
        LabelborrowDate = new javax.swing.JLabel();
        btnCheckStudentId = new javax.swing.JButton();
        btnCheckBookId = new javax.swing.JButton();
        txtStudentId = new javax.swing.JTextField();
        txtBookId = new javax.swing.JTextField();
        txtappointDate = new javax.swing.JTextField();
        LabelCheckSTid = new javax.swing.JLabel();
        LabelCheckBookId = new javax.swing.JLabel();
        labelAmount = new javax.swing.JLabel();
        spinnerAmount = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        btnAddRegisterBook = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnPayBook = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegisterBook = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelSumBook = new javax.swing.JLabel();
        labelSumBorrowBook = new javax.swing.JLabel();
        labelRemainingBooks = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableOutOfDate = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("tìm kiếm"));

        rbtnSeachGiveBookBack.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnSeachGiveBookBack.setText("Theo Phiếu Mượn Trả Sách");

        rbtnStudentId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnStudentId.setText("Theo Mã Sinh Viên Mượn Sách");

        rbtnBookId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbtnBookId.setText("Theo Mã Sách Được Mượn");
        rbtnBookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBookIdActionPerformed(evt);
            }
        });

        txtSeachRB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSeachRB.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnSeachRb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSeachRb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seach.png"))); // NOI18N
        btnSeachRb.setText("Tìm Kiếm");
        btnSeachRb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSeachRb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeachRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachRbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnSeachGiveBookBack)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbtnStudentId)
                        .addGap(74, 74, 74)
                        .addComponent(txtSeachRB, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeachRb, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbtnBookId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rbtnSeachGiveBookBack)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeachRB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeachRb)
                    .addComponent(rbtnStudentId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnBookId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Mượn Sách"));

        LabelStudentId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LabelStudentId.setText("Mã Sinh Viên:");

        LabelBookId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LabelBookId.setText("Mã Sách:");

        LabelborrowDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LabelborrowDate.setText("Ngày Hẹn Trả:");

        btnCheckStudentId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCheckStudentId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/check.png"))); // NOI18N
        btnCheckStudentId.setText("Kiểm Tra");
        btnCheckStudentId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCheckStudentId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStudentIdActionPerformed(evt);
            }
        });

        btnCheckBookId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCheckBookId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/check.png"))); // NOI18N
        btnCheckBookId.setText("Kiểm Tra");
        btnCheckBookId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCheckBookId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckBookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckBookIdActionPerformed(evt);
            }
        });

        txtStudentId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtBookId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtappointDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        LabelCheckSTid.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        LabelCheckSTid.setText("* Tên Sinh Viên");

        LabelCheckBookId.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        LabelCheckBookId.setText("*Tên Sách");

        labelAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelAmount.setText("Số Lượng :");

        spinnerAmount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        spinnerAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelborrowDate, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(labelAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(169, 169, 169)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtappointDate, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCheckSTid, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCheckBookId, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCheckStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btnCheckBookId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LabelStudentId)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCheckStudentId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelCheckSTid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBookId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelBookId)
                            .addComponent(btnCheckBookId))
                        .addGap(7, 7, 7)))
                .addComponent(LabelCheckBookId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerAmount)
                    .addComponent(labelAmount))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelborrowDate)
                    .addComponent(txtappointDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức Năng"));

        btnAddRegisterBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddRegisterBook.setText("Mượn Sách");
        btnAddRegisterBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddRegisterBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddRegisterBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRegisterBookActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Sửa Thông Tin");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnPayBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPayBook.setText("Trả Sách");
        btnPayBook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPayBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPayBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayBookActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/turn.png"))); // NOI18N
        btnRefresh.setText("Làm Mới");
        btnRefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnUpdate1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/remove.png"))); // NOI18N
        btnUpdate1.setText("Xóa");
        btnUpdate1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnAddRegisterBook, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(btnPayBook, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnPayBook)
                    .addComponent(btnRefresh)
                    .addComponent(btnAddRegisterBook)
                    .addComponent(btnUpdate1))
                .addGap(39, 39, 39))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        tableRegisterBook.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableRegisterBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sinh Viên", "Mã Sách", "Số  Lượng Sách", "Ngày Mượn", "Ngày hẹn Trả", "Ngày Trả", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableRegisterBook);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Quản Lý Mượn Trả", jPanel1);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Tổng Số Lượng Sách:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Tổng Số Lượng Sách Đang mượn:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Tổng Số Lượng Sách còn trong Kho:");

        labelSumBook.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelSumBook.setText("*Tổng số Sách");

        labelSumBorrowBook.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelSumBorrowBook.setText("*Tổng Số Sách Đang Mượn");

        labelRemainingBooks.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelRemainingBooks.setText("*Tổng Số Sách còn trong kho");

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thống kê");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(labelSumBorrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(labelRemainingBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(113, 113, 113)
                        .addComponent(labelSumBook, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(142, 142, 142))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(labelSumBook))
                        .addGap(23, 23, 23)
                        .addComponent(labelSumBorrowBook)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(labelRemainingBooks)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(153, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("danh sách quá hạn"));

        tableOutOfDate.setBackground(new java.awt.Color(204, 255, 255));
        tableOutOfDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableOutOfDate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Sinh Viên", "Tên Sinh Viên", "Mã Sách", "Tên Sách", "Số Lượng", "Số Ngày quá Hạn", "Trạng Thái(Sách)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOutOfDate.setGridColor(new java.awt.Color(204, 255, 255));
        tableOutOfDate.setShowGrid(true);
        jScrollPane2.setViewportView(tableOutOfDate);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Danh Sách Qúa Hạn && Thống Kê", jPanel5);

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 204));
        jMenuBar1.setBorder(null);
        jMenuBar1.setOpaque(true);

        jMenu1.setText("Hệ Thống");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Thoát");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Đăng Xuất");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int choic = JOptionPane.showConfirmDialog(this, "bạn có chắc chắn muốn đăng xuất!");
        if (choic == JOptionPane.YES_OPTION) {
            LoginAdminForm laf = new LoginAdminForm();
            laf.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AdminFunctionForm hForm = new AdminFunctionForm(emp);
        hForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        edit = tableRegisterBook.getSelectedRow();
        if (!listRb.isEmpty()) {
            if (edit != -1) {
                RegisterBook e = listRb.get(edit);
                if (e.getGiveBookBack().equalsIgnoreCase("đã trả")) {
                    int choic = JOptionPane.showConfirmDialog(this, "bạn có chắc chắn xóa!");
                    if (choic == JOptionPane.YES_OPTION) {
                        DataRegisterBookimp dataRegisterBookimp = new DataRegisterBookimp();
                        dataRegisterBookimp.deleteRegisterBookSQL(e);
                        listRb.remove(edit);
                        tableModelRb.removeRow(edit);
                        JOptionPane.showMessageDialog(this, "xóa sinh viên thành công");
                        showListRb();
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "sinh viên chưa trả sách không thể xóa!");

                }

            } else {

                JOptionPane.showMessageDialog(this, "vui lòng chọn bảng ghi cần xóa!");
            }

        } else {

            JOptionPane.showMessageDialog(this, "danh sách rỗng");
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        showRefreshListRb();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnPayBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayBookActionPerformed
        if (!listRb.isEmpty()) {
            edit = tableRegisterBook.getSelectedRow();
            if (edit != -1) {
                int choic = JOptionPane.showConfirmDialog(this, "bạn có chắc chắn muốn trả sách?");
                if (choic == JOptionPane.YES_OPTION) {
                    RegisterBook rb = listRb.get(edit);
                    if (rb.getGiveBookBack().equalsIgnoreCase("chưa trả")) {
                        Date dateNow = new Date();
                        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        rb.setPayDate(df.format(dateNow));
                        rb.setGiveBookBack("đã trả");
                        drb.updateRegisterBookSQL(rb, rb.getBookId(), rb.getStudentId());
                        Book book = checkBookId(rb.getBookId());
                        int amount = book.getAmount() + rb.getAmountBook();
                        book.setAmount(amount);
                        DataFuctionImplement dfbook = new DataFuctionImplement();
                        dfbook.updateBookSQL(book);
                        editTableModelRB(rb);
                        sumBorrowBook -= rb.getAmountBook();
                        labelSumBorrowBook.setText(sumBorrowBook + "");
                        sumBookRest += rb.getAmountBook();
                        labelRemainingBooks.setText(sumBookRest + "");
                        int countDate
                        = (int) ((rb.getPayDate().getTime()
                            - rb.getAppointDate().getTime()) / (1000 * 60 * 60 * 24));
                    if (countDate > 0) {
                        updateTableOutOfDate(rb);
                    }
                    edit = -1;
                    JOptionPane.showMessageDialog(this, "trả thành công");
                } else {

                    JOptionPane.showMessageDialog(this, "trả sách thất bạn vì mã sinh viên: "
                        + rb.getStudentId() + "đã trả sách trước đó!");
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "vui lòng chọn số hàng để trả sách");

        }
        } else {
            JOptionPane.showMessageDialog(this, "danh sách rỗng");
        }
    }//GEN-LAST:event_btnPayBookActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (!listRb.isEmpty()) {
            edit = tableRegisterBook.getSelectedRow();
            if (edit != -1) {
                RegisterBook rb = this.listRb.get(edit);
                int amountOld = rb.getAmountBook();
                EditRegisterBook eRB = new EditRegisterBook(this, true, rb);
                eRB.setVisible(true);
                int amountNew = rb.getAmountBook();
                if (amountNew != amountOld) {
                    sumBorrowBook -= amountOld;
                    sumBorrowBook += amountNew;
                    sumBookRest += amountOld;
                    sumBookRest -= amountNew;
                    labelSumBorrowBook.setText(sumBorrowBook + "");
                    labelRemainingBooks.setText(sumBookRest + "");
                }
                edit = -1;

            } else {
                JOptionPane.showMessageDialog(this, "vui lòng chọn số hàng để sửa thông tin");
            }

        } else {
            JOptionPane.showMessageDialog(this, "danh sách rỗng");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddRegisterBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRegisterBookActionPerformed
        if (!listRb.isEmpty()) {
            String studentId = txtStudentId.getText();
            String bookId = txtBookId.getText();
            int amount = (int) spinnerAmount.getValue();
            String appointDateText = txtappointDate.getText();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat dfbd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            if (((studentId.isEmpty() || bookId.isEmpty()) || amount <= 0)
                || appointDateText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "vui lòng không để trống thông tin mượn sách!");

            } else {
                try {
                    Student st = checkSt(studentId);
                    Book book = checkBookId(bookId);
                    if (st != null) {
                        if (book != null) {
                            if (amount < book.getAmount()) {
                                if (amount <= 3) {
                                    Date dateNow = new Date();
                                    Date appointDate = df.parse(appointDateText);
                                    if (appointDate.getTime() > dateNow.getTime()) {
                                        RegisterBook rb = new RegisterBook(st.getStudentId(), book.getBookId());
                                        if (!listRb.contains(rb)) {
                                            int amountRestBook = book.getAmount() - amount;
                                            book.setAmount(amountRestBook);
                                            DataFuctionImplement dbf = new DataFuctionImplement();
                                            dbf.updateBookSQL(book);
                                            RegisterBook addrb = new RegisterBook(st.getStudentId(), book.getBookId(), amount,
                                                dfbd.format(dateNow), df.format(appointDate));
                                            listRb.add(addrb);
                                            drb.writeRegisterBookSQL(addrb);
                                            addtableModelRb(addrb);
                                            sumBorrowBook += amount;
                                            labelSumBorrowBook.setText(sumBorrowBook + " ");
                                            sumBookRest -= amount;
                                            labelRemainingBooks.setText(sumBookRest + " ");
                                            txtStudentId.setText("");
                                            txtBookId.setText("");
                                            spinnerAmount.setValue(0);
                                            txtappointDate.setText("");
                                            LabelCheckSTid.setText("");
                                            LabelCheckBookId.setText("");
                                            JOptionPane.showMessageDialog(this, "thêm thành công");

                                        } else {

                                            JOptionPane.showMessageDialog(this, "mã sinh viên: "
                                                + st.getStudentId() + " đã mượn sách với "
                                                + "mã sách:" + book.getBookId());
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(this, "ngày hẹn trả phải "
                                            + "lớn hơn ngày hiện thời");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, " chỉ mượn tối đa 3 quyển");

                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "số lượng sách trong "
                                    + "thư viên không đủ cho "
                                    + "bạn mượn(số sách còn lại là: "
                                    + book.getAmount() + ")");
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "mã sách không tồn tại");

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "mã sinh viên không tồn tại");
                    }
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(this, "vui lòng nhập đúng định dạng (vd: 22/12/2022)!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "danh sách mượn trả rỗng!");

        }
    }//GEN-LAST:event_btnAddRegisterBookActionPerformed

    private void btnCheckBookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckBookIdActionPerformed
        if (!listB.isEmpty()) {
            String bookId = txtBookId.getText();
            if (!bookId.isEmpty()) {
                Book b = checkBookId(bookId);
                if (b != null) {
                    LabelCheckBookId.setText(b.getName() + ",Tác giả: " + b.getAuthor());
                    LabelCheckBookId.setForeground(Color.GREEN);

                } else {
                    LabelCheckBookId.setText("mã sách không tồn tại");
                    LabelCheckBookId.setForeground(Color.RED);

                }

            } else {
                JOptionPane.showMessageDialog(this, "ô mã sách đang rỗng!");
            }

        } else {
            JOptionPane.showMessageDialog(this, "danh sách quản lý sách rỗng!");

        }
    }//GEN-LAST:event_btnCheckBookIdActionPerformed

    private void btnCheckStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStudentIdActionPerformed
        if (!listSt.isEmpty()) {
            String studentId = txtStudentId.getText();
            if (!studentId.isEmpty()) {
                Student st = checkSt(studentId);
                if (st != null) {
                    String fullName = st.getName();
                    LabelCheckSTid.setText(fullName + ", " + st.getAddress());
                    LabelCheckSTid.setForeground(Color.GREEN);
                } else {

                    LabelCheckSTid.setText("mã sinh viên không tồn tại");
                    LabelCheckSTid.setForeground(Color.RED);
                    txtStudentId.setText("");

                }

            } else {
                JOptionPane.showMessageDialog(this, "ô mã sinh viên đang rỗng!");

            }
        } else {

            JOptionPane.showMessageDialog(this, "danh sách sinh viên rỗng");
        }
    }//GEN-LAST:event_btnCheckStudentIdActionPerformed

    private void btnSeachRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachRbActionPerformed
        ArrayList<RegisterBook> listSeachRb = new ArrayList<>();
        String seach = txtSeachRB.getText();
        if (!seach.isEmpty()) {
            if (rbtnBookId.isSelected()) {
                listSeachRb = drb.seachByBookId(listRb, seach);
                if (listSeachRb.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "không tồn tại mã sách!");

                } else {
                    showListRb(listSeachRb);
                }
            } else if (rbtnStudentId.isSelected()) {
                listSeachRb = drb.seachByStudentId(listRb, seach);
                if (listSeachRb.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "không tồn tại mã sinh viên");

                } else {
                    showListRb(listSeachRb);
                }

            } else if (rbtnSeachGiveBookBack.isSelected()) {
                listSeachRb = drb.seachByGiveBookBack(this.listRb, seach);
                if (listSeachRb.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "không có phiếu mượn nào!");

                } else {
                    showListRb(listSeachRb);
                }

            } else {

                JOptionPane.showMessageDialog(this, "vui lòng chọn các chức năng");
            }
            txtSeachRB.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "ô tìm kiếm đang rỗng!");
        }
    }//GEN-LAST:event_btnSeachRbActionPerformed

    private void rbtnBookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnBookIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnBookIdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBookId;
    private javax.swing.JLabel LabelCheckBookId;
    private javax.swing.JLabel LabelCheckSTid;
    private javax.swing.JLabel LabelStudentId;
    private javax.swing.JLabel LabelborrowDate;
    private javax.swing.JButton btnAddRegisterBook;
    private javax.swing.JButton btnCheckBookId;
    private javax.swing.JButton btnCheckStudentId;
    private javax.swing.JButton btnPayBook;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSeachRb;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.ButtonGroup buttonGroupSeach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelAmount;
    private javax.swing.JLabel labelRemainingBooks;
    private javax.swing.JLabel labelSumBook;
    private javax.swing.JLabel labelSumBorrowBook;
    private javax.swing.JRadioButton rbtnBookId;
    private javax.swing.JRadioButton rbtnSeachGiveBookBack;
    private javax.swing.JRadioButton rbtnStudentId;
    private javax.swing.JSpinner spinnerAmount;
    private javax.swing.JTable tableOutOfDate;
    private javax.swing.JTable tableRegisterBook;
    private javax.swing.JTextField txtBookId;
    private javax.swing.JTextField txtSeachRB;
    private javax.swing.JTextField txtStudentId;
    private javax.swing.JTextField txtappointDate;
    // End of variables declaration//GEN-END:variables

    private void addReadSQL() {
        DataFuctionImplement dfbook = new DataFuctionImplement();
        dfbook.readBookSQL(listB);
        DataStudentFunctionImp dfStudent = new DataStudentFunctionImp();
        dfStudent.readStudentSQL(listSt);
        drb.readRegisterBookSQL(listRb);

    }

    private void showListRb() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat dfAppoint = new SimpleDateFormat("dd/MM/yyyy");
        int stt = 1;

        tableModelRb.setRowCount(0);
        for ( RegisterBook e : listRb) {
            if (e.getPayDate() == null) {
                Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                    df.format(e.getBorrowDate()),
                    dfAppoint.format(e.getAppointDate()), "", e.getGiveBookBack()};
                tableModelRb.addRow(row);
            } else {
                Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                    df.format(e.getBorrowDate()), dfAppoint.format(e.getAppointDate()),
                    df.format(e.getPayDate()), e.getGiveBookBack()};
                tableModelRb.addRow(row);
            }
        }
        tableModelRb.fireTableDataChanged();
    }

    private void addtableModelRb(RegisterBook e) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat dfAppoint = new SimpleDateFormat("dd/MM/yyyy");

        if (e.getPayDate() == null) {
            Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                df.format(e.getBorrowDate()),
                dfAppoint.format(e.getAppointDate()), "", e.getGiveBookBack()};
            tableModelRb.addRow(row);
        } else {
            Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                df.format(e.getBorrowDate()), dfAppoint.format(e.getAppointDate()),
                df.format(e.getPayDate()), e.getGiveBookBack()};
            tableModelRb.addRow(row);
        }

        tableModelRb.fireTableDataChanged();
    }

    private Student checkSt(String studentId) {
        for ( Student e : listSt) {
            if (e.getStudentId().equalsIgnoreCase(studentId)) {
                return e;

            }

        }
        return null;
    }

    private Book checkBookId(String bookId) {
        for ( Book e : listB) {

            if (e.getBookId().equalsIgnoreCase(bookId)) {

                return e;
            }

        }
        return null;
    }

    public void editTableModelRB(RegisterBook e) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat dfAppoint = new SimpleDateFormat("dd/MM/yyyy");
        tableModelRb.removeRow(edit);
        if (e.getPayDate() == null) {
            Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                df.format(e.getBorrowDate()),
                dfAppoint.format(e.getAppointDate()), "", e.getGiveBookBack()};
            tableModelRb.insertRow(edit, row);

        } else {
            Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                df.format(e.getBorrowDate()), dfAppoint.format(e.getAppointDate()),
                df.format(e.getPayDate()), e.getGiveBookBack()};
            tableModelRb.insertRow(edit, row);
        }
        tableModelRb.fireTableDataChanged();

    }

    private void addButtonGroup() {
        buttonGroupSeach.add(rbtnSeachGiveBookBack);
        buttonGroupSeach.add(rbtnStudentId);
        buttonGroupSeach.add(rbtnBookId);
    }

    private void showListRb(ArrayList<RegisterBook> listSeachRb) {

        tableModelRb.setRowCount(0);
        for ( RegisterBook e : listSeachRb) {
            addtableModelRb(e);

        }
    }

    private String checkNameST(String studentId) {
        String fullNameST = "";
        for ( Student e : listSt) {
            if (e.getStudentId().equalsIgnoreCase(studentId)) {
                fullNameST = e.getName();

            }

        }
        return fullNameST;
    }

    private String checkNameBook(String bookId) {
        String nameBook = "";
        for ( Book e : listB) {
            if (e.getBookId().equalsIgnoreCase(bookId)) {
                nameBook = e.getName();

            }

        }
        return nameBook;
    }

    private void showListOOP() {
        int sttOOP = 1;
        tableModelOOD.setRowCount(0);
        if (!listOOD.isEmpty()) {
            for ( OutOfDate e : listOOD) {
                Object[] row = new Object[]{sttOOP++, e.getStudentId(), e.getFullName(), e.getBookId(),
                    e.getNameBook(), e.getAmount(), e.getCountDate(), e.getGiveBackBook()};
                tableModelOOD.addRow(row);
            }
            tableModelRb.fireTableDataChanged();

        } else {
            JOptionPane.showMessageDialog(this, "không có sinh viên nào trả sách muộn!");
        }
    }

    private void showRefreshListRb() {
        int stt = 1;
        tableModelRb.setRowCount(0);
        for ( RegisterBook e : listRb) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            SimpleDateFormat dfAppoint = new SimpleDateFormat("dd/MM/yyyy");

            if (e.getPayDate() == null) {
                Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                    df.format(e.getBorrowDate()),
                    dfAppoint.format(e.getAppointDate()), "", e.getGiveBookBack()};
                tableModelRb.addRow(row);
            } else {
                Object[] row = new Object[]{stt++, e.getStudentId(), e.getBookId(), e.getAmountBook(),
                    df.format(e.getBorrowDate()), dfAppoint.format(e.getAppointDate()),
                    df.format(e.getPayDate()), e.getGiveBookBack()};
                tableModelRb.addRow(row);
            }
        }
        tableModelRb.fireTableDataChanged();

    }

    private void setStatistics() {
        int countBookRest = 0;

        for ( Book e : listB) {
            countBookRest += e.getAmount();
        }
        for ( RegisterBook e : listRb) {
            if (e.getGiveBookBack().equalsIgnoreCase("chưa trả")) {
                sumBorrowBook += e.getAmountBook();

            }

        }
        sumBook = countBookRest + sumBorrowBook;
        labelSumBook.setText(sumBook + "");
        labelSumBorrowBook.setText(sumBorrowBook + "");
        sumBookRest = sumBook - sumBorrowBook;
        labelRemainingBooks.setText(sumBookRest + "");

    }

    private void readOutOfDate() {
        int countDate;
        if (!listRb.isEmpty()) {
            for ( RegisterBook e : listRb) {
                if (e.getPayDate() == null) {
                    Date dateNow = new Date();
                    countDate = (int) ((dateNow.getTime() - e.getAppointDate().getTime()) / (1000 * 60 * 60 * 24));
                    if (countDate > 0) {
                        String fullNameST = checkNameST(e.getStudentId());
                        String nameBook = checkNameBook(e.getBookId());

                        OutOfDate oOD = new OutOfDate(e.getStudentId(), fullNameST,
                                e.getBookId(), nameBook, e.getAmountBook(), countDate, e.getGiveBookBack());
                        listOOD.add(oOD);
                    }

                } else {
                    countDate = (int) ((e.getPayDate().getTime() - e.getAppointDate().getTime()) / (1000 * 60 * 60 * 24));
                    if (countDate > 0) {
                        String fullNameST = checkNameST(e.getStudentId());
                        String nameBook = checkNameBook(e.getBookId());

                        OutOfDate oOD = new OutOfDate(e.getStudentId(), fullNameST,
                                e.getBookId(), nameBook, e.getAmountBook(), countDate, e.getGiveBookBack());
                        listOOD.add(oOD);

                    }

                }

            }

            showListOOP();

        } else {
            JOptionPane.showMessageDialog(this, "danh sách phiếu mượn rỗng");
        }
    }

    private void updateTableOutOfDate(RegisterBook rb) {
        for (int i = 0; i < tableOutOfDate.getRowCount(); i++) {
            if (rb.getBookId().equalsIgnoreCase((String) tableOutOfDate.getValueAt(i, 3))
                    && rb.getStudentId().equalsIgnoreCase((String) tableOutOfDate.getValueAt(i, 1))) {
                tableOutOfDate.setValueAt("đã Trả", i, 7);
                break;
            }

        }
        tableModelRb.fireTableDataChanged();
    }

    private void setSTT() {
        if (!listRb.isEmpty()) {
            stt = listRb.size() + 1;
        }
    }

}
