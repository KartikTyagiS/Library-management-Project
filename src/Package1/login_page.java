/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * login_page.java
 *
 * Created on Jun 8, 2017, 9:09:28 AM
 */

package Package1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Kartik Tyagi
 */
public class login_page extends javax.swing.JFrame {

    /** Creates new form login_page */
    public login_page() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(452, 418));
        setName("frame1\n"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin Login");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 20, 190, 41);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User ID :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 110, 60, 18);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("______________________________");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 330, 450, 30);

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 170, 69, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(179, 100, 210, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Forgot My Password.");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 200, 210, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 240, 210, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Not yet registered?");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 310, 140, 20);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(180, 170, 210, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("Sign Up");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 310, 100, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 60, 460, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package1/images/img-man-reading.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 430, 330);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Package1/images/tumblr_static_dark_wood.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 390);

        getAccessibleContext().setAccessibleName("Login\n");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Sign_Up_Page ob=new Sign_Up_Page();
ob.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String a=jTextField1.getText();
try
{
    Class.forName("java.sql.Driver");
    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
    Statement stmt=(Statement)con.createStatement();
    String query="Select Question,Answer,Password,Name from User_id where UserID='"+a+"';";
    ResultSet rs=stmt.executeQuery(query);
    rs.first();
    String secques=rs.getString(1);
    String ans=rs.getString(2);
    String ansbyuser=JOptionPane.showInputDialog(this,secques);
    String libinch=rs.getString(4);
    ansbyuser.toLowerCase();
    ans.toLowerCase();
    if(ansbyuser.equals(ans))
    {
        String pass=rs.getString(3);
        JOptionPane.showMessageDialog(this,"Your Password Is :\n"+pass);
        Main_Page ob=new Main_Page();
        ob.setVisible(true);
        ob.setTitle("Librarian Incharge : "+libinch);
        this.dispose();
        this.setEnabled(false);
    }
    else
    {
        JOptionPane.showMessageDialog(this,"Wrong answer");
        login_page ob=new login_page();
        ob.setVisible(true);
        this.dispose();
    }
    stmt.close();
    con.close();
}
catch(Exception e)
{
    if(e.getMessage().equals("Illegal operation on empty result set."))
    {
        JOptionPane.showMessageDialog(this,"Please enter valid username");
        jTextField1.setText("");
        jPasswordField1.setText("");
    }
    else
    {
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int count=0;
String uid,password;
uid=jTextField1.getText();
password=jPasswordField1.getText();
if(uid.equals("")||password.equals(""))
{
    JOptionPane.showMessageDialog(this,"Please enter the required information");
}
else
{
    try
    {
    Class.forName("java.sql.Driver");
    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
    Statement stmt=(Statement)con.createStatement();
    String query="Select userID,password,Name from user_id";
    ResultSet rs=stmt.executeQuery(query);
          while(rs.next())
          {
              String c1=rs.getString(1);
              String c2=rs.getString(2);
                   if((uid.equals(c1))&&(password.equals(c2)))
                   {
                        String c3=rs.getString(3);
                        JOptionPane.showMessageDialog(this,"Registration Confirmed");
                        JOptionPane.showMessageDialog(this,"Your Administrator code is \n"+ "KT149209 \n"+
                                                                                       "Remember your code for future reference");
                        Main_Page ob=new Main_Page();
                        ob.setVisible(true);
                        ob.setTitle("Librarian Incharge : "+c3);
                        this.dispose();
                        this.setEnabled(false);
                        count=1;
                        break;
                   }
                   else
                   {
                        count=0;
                        continue;
                   }
           }
                       if(count==0)
                       {
                            JOptionPane.showMessageDialog(this,"Not Yet Registered.Click SignUp and get yourself registered");
                            jTextField1.setText("");
                            jPasswordField1.setText("");
                       }
    }
    catch(Exception e)
    {
         if(e.getMessage().equals("Illegal operation on empty result set."))
         {
             JOptionPane.showMessageDialog(this,"Not registered");
             jTextField1.setText("");
             jPasswordField1.setText("");
         }
         else
         {
             JOptionPane.showMessageDialog(this,e.getMessage());
         }
    }
}
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
