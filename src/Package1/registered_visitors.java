/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * registered_visitors.java
 *
 * Created on Jun 12, 2017, 5:23:34 PM
 */

package Package1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kartik Tyagi
 */
public class registered_visitors extends javax.swing.JFrame {

    /** Creates new form registered_visitors */
    public registered_visitors() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 560));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 50, 580, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel2.setText("Library Card Numbers");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 260, 28);

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 210, 430);

        jButton1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton1.setText("View Records");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 90, 180, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package1/images/home 1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 70, 90, 80);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel3.setText("Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 170, 80, 30);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel4.setText("Phone Number :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 230, 101, 30);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel5.setText("Registration Date :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 290, 117, 30);

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel6.setText("Number Of Visits :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 350, 113, 30);

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel7.setText("Address :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(240, 410, 80, 20);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(370, 170, 170, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(370, 230, 170, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(370, 290, 170, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(370, 350, 170, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(370, 410, 180, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package1/images/666.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-290, -10, 870, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Main_Page ob=new Main_Page();
ob.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
DefaultListModel l=(DefaultListModel)jList1.getModel();
l.clear();
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextArea1.setText("");
 try
 {
    Class.forName("java.sql.Driver");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
    Statement stmt=(Statement)con.createStatement();
    Statement stmt1=(Statement)con.createStatement();
    String query="Select LibraryCard_Number from Registered_issuers";
    ResultSet rs=stmt1.executeQuery(query);
      while(rs.next())
      {
        String s=rs.getString(1);
        l.addElement(s);
      }
    stmt.close();
    con.close();
 }
 catch(Exception e)
 {
        if(e.getMessage().equals("Illegal operation on empty result set."))
        {
            JOptionPane.showMessageDialog(this,"No records to display");
            int i=JOptionPane.showConfirmDialog(this,"Would someone like to register?","First Registration.",JOptionPane.YES_NO_OPTION);
            if(i==0)
            {
                register_new_visitor ob= new register_new_visitor();
                ob.setVisible(true);
                this.dispose();
            }
            else
            {
                registered_visitors ob=new registered_visitors();
                ob.setVisible(true);
                this.dispose();
            }

        }
        else
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
 int count=0;
 if(jList1.getSelectedValue()==null)
 {
     JOptionPane.showMessageDialog(this,"No Record Present.");
 }
 else
 {
   try
   {
     Class.forName("java.sql.Driver");
     Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
     Statement stmt=(Statement)con.createStatement();
     Object s1=jList1.getSelectedValue();
     String query="select * from disposed;";
     ResultSet rs=stmt.executeQuery(query);
     int count1=0;
       while(rs.next())
       {
         if(s1.equals(rs.getString(2)))
         {
           count1=1;
           break;
         }
       }
       if(count1==1)
       {
         JOptionPane.showMessageDialog(this,"These records have been disposed.");
         int i=JOptionPane.showConfirmDialog(this,"Wish to undispose?","Question",JOptionPane.YES_NO_OPTION);
           if(i==0)
           {
             Statement stmts=(Statement)con.createStatement();
             String query1="Delete from disposed where LibraryCard_number='"+s1+"';";
             stmts.executeUpdate(query1);
             JOptionPane.showMessageDialog(this,"Undisposed.");
           }
       }
       else if(count1==0)
       {
         String s="Select name_of_issuer,Phone_numbers,Date_Registration,address from Registered_issuers where LibraryCard_Number='"+s1+"';";
         ResultSet rs1=stmt.executeQuery(s);
           while(rs1.next())
           {
             jTextField1.setText(rs1.getString(1));
             jTextField2.setText(rs1.getString(2));
             jTextField3.setText(rs1.getString(3));
             jTextArea1.setText(rs1.getString(4));
           }
         String as="Select Record_Number from Transaction_records where LibraryCard_Number='"+s1+"';";
         ResultSet rs2=stmt.executeQuery(as);
         while(rs2.next())
         {
           count++;
         }
         int visits=count;
           if(count==1)
           {
             jTextField4.setText(Integer.toString(visits)+" visit");
           }
           else
           {
             jTextField4.setText(Integer.toString(visits)+" visits");
           }
       }
     stmt.close();
     con.close();
   }
   catch(Exception e)
   {
     if(jList1.getSelectedValue()==null)
     {
       JOptionPane.showMessageDialog(this,"No Library Card Number Selected");
     }
     else
     {
       JOptionPane.showMessageDialog(this,e.getMessage());
     }
   }
 }
    }//GEN-LAST:event_jList1MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registered_visitors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
