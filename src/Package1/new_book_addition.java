/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * new_book_addition.java
 *
 * Created on Jun 15, 2017, 9:33:40 PM
 */

package Package1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kartik Tyagi
 */
public class new_book_addition extends javax.swing.JFrame {

    /** Creates new form new_book_addition */
    public new_book_addition() {
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

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(473, 565));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("New Book Records");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 10, 220, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 60, 480, 30);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Title :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 80, 60, 30);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Author :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 148, 51, 40);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Accession No. :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 220, 93, 30);

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Price :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 290, 50, 30);

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Genre :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 360, 44, 30);

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 80, 240, 30);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 150, 240, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 220, 240, 30);

        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(190, 290, 240, 30);

        jComboBox1.setModel(new DefaultComboBoxModel());
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(190, 360, 240, 30);

        jButton1.setFont(new java.awt.Font("Cambria", 1, 18));
        jButton1.setText("Add To Database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 433, 190, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package1/images/home 1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 430, 90, 80);

        jButton3.setFont(new java.awt.Font("Cambria", 1, 16));
        jButton3.setText("<<<<Back<<<<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(40, 490, 190, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package1/images/library-one1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-150, 0, 650, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String a1=jTextField1.getText();
String b=jTextField2.getText();
String c=jTextField3.getText();
String d=jTextField4.getText();
Object a=jComboBox1.getSelectedItem();
if(a1.isEmpty()||b.isEmpty()||c.isEmpty()||d.isEmpty()||a.equals(""))
{
    JOptionPane.showMessageDialog(this,"Information Required");
}
else
{
int k=1;
 try
 {
    Class.forName("java.sql.Driver");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
    Statement stmt=(Statement) con.createStatement();
    String s="insert into Book_information(Title,Author,Accession_number,Price,Genre,stock_available) values ('"+a1+"','"+b+"','"+c+"','"+d+"','"+a+"','"+k+"');";
    int p=stmt.executeUpdate(s);
    if(p==1)
    {
        JOptionPane.showMessageDialog(this,"Data Updated");
    }
    stmt.close();
    con.close();
 }
 catch(Exception e)
 {
    JOptionPane.showMessageDialog(this,e.getMessage());
 }
}
update_book_records ob=new update_book_records();
ob.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Main_Page ob=new Main_Page();
ob.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
update_book_records ob=new update_book_records();
ob.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
try
{
  Class.forName("java.sql.Driver");
  Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
  Statement stmt=(Statement)con.createStatement();
  Statement stmt1=(Statement)con.createStatement();
  String s="select Accession_Number from Book_information";
  ResultSet rs1=stmt1.executeQuery(s);
  ResultSet rs=stmt.executeQuery(s);
  rs1.first();
  String k1=rs1.getString(1);
    while(rs.next())
    {
      if(rs.last())
      {
        String a=rs.getString(1);
        String a1=a.substring(1);
        int k=Integer.parseInt(a1);
        k=k+1;
         if(k>10)
         {
           jTextField3.setText("B"+Integer.toString(k));
         }
         else
         {
           jTextField3.setText("B0"+Integer.toString(k));
         }
      }
    }
  rs.close();
  stmt.close();
  con.close();
}
catch(Exception e2)
{
  if(e2.getMessage().equals("Illegal operation on empty result set."))
  {
    jTextField3.setText("B01");
  }
  else
  {
    JOptionPane.showMessageDialog(null,e2.getMessage());
  }
}
DefaultComboBoxModel m1=(DefaultComboBoxModel)(jComboBox1.getModel());
 try
 {
   Class.forName("java.sql.Driver");
   Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
   Statement stmt=(Statement)con.createStatement();
   String s="select distinct genre from book_information;";
   ResultSet rs=stmt.executeQuery(s);
     while(rs.next())
     {
       String a=rs.getString(1);
       m1.addElement(a);
     }
   rs.close();
   stmt.close();
   con.close();
 }
 catch(Exception e)
 {
   JOptionPane.showMessageDialog(this,e.getMessage());
 }
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
Object s=jComboBox1.getSelectedItem();
if(s.equals("New"))
{
  Object s1=JOptionPane.showInputDialog(this,"New Genre");
  jComboBox1.addItem(s1);
  jComboBox1.setSelectedItem(s1);
}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
String s=jTextField1.getText();
int l=s.length();
if(s.isEmpty()==false)
{
  for(int i=0;i<l;i++)
  {
    char ch=s.charAt(i);
     if(Character.isLetter(ch)==false)
     {
        if(ch==' ')
        {
          continue;
        }
      JOptionPane.showMessageDialog(this,"Title must be in alphabets");
      jTextField1.setText("");
      break;
     }
  }
}
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
String s=jTextField2.getText();
int l=s.length();
if(s.isEmpty()==false)
{
  for(int i=0;i<l;i++)
  {
    char ch=s.charAt(i);
      if(Character.isLetter(ch)==false)
      {
        if(ch==' ')
        {
          continue;
        }
        JOptionPane.showMessageDialog(this,"Author name must be in alphabets");
        jTextField2.setText("");
        break;
      }
  }
}
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
String s=jTextField4.getText();
int l=s.length();
if(s.isEmpty()==false)
{
  for(int i=0;i<l;i++)
  {
    char ch=s.charAt(i);
      if(Character.isDigit(ch)==false)
      {
        JOptionPane.showMessageDialog(this,"Price must be in digits");
        jTextField4.setText("");
        break;
      }
  }
}
    }//GEN-LAST:event_jTextField4FocusLost

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_book_addition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
