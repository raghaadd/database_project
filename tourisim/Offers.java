/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import oracle.jdbc.pool.OracleDataSource;
import static tourisim.Login_Admin.flag;

/**
 *
 * @author Msys
 */
public class Offers extends javax.swing.JFrame {

     EntityManagerFactory emf=Persistence.createEntityManagerFactory("TourisimPU");
     EntityManager em=emf.createEntityManager();
     EntityManager eoffer=Persistence.createEntityManagerFactory("TourisimPU").createEntityManager();
    /**
     * Creates new form Offers
     */
   private JLabel labelimage=new JLabel();
   
    public Offers() {
        initComponents();
        super.pack();
        super.setLocationRelativeTo(null);
        super.setSize(730, 520);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButtonback = new javax.swing.JButton();
        jButtonadd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButtonimage = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(740, 391));
        setResizable(false);
        setSize(new java.awt.Dimension(710, 391));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 1, 56)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 170, 183));
        jLabel9.setText("Trip Offers");

        jButtonback.setBackground(new java.awt.Color(32, 170, 183));
        jButtonback.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButtonback.setForeground(new java.awt.Color(255, 255, 255));
        jButtonback.setText("Back");
        jButtonback.setBorder(null);
        jButtonback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonback.setPreferredSize(new java.awt.Dimension(146, 44));
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });

        jButtonadd.setBackground(new java.awt.Color(32, 170, 183));
        jButtonadd.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButtonadd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonadd.setText("Add Offer");
        jButtonadd.setBorder(null);
        jButtonadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 170, 183));
        jLabel1.setText("Offer Name:");

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 170, 183));
        jLabel2.setText("Describition:");

        jTextFieldname.setBackground(new java.awt.Color(32, 170, 183));
        jTextFieldname.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(32, 170, 183));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonimage.setBackground(new java.awt.Color(32, 170, 183));
        jButtonimage.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButtonimage.setForeground(new java.awt.Color(255, 255, 255));
        jButtonimage.setText("Click to Add Image");
        jButtonimage.setBorder(null);
        jButtonimage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonimageActionPerformed(evt);
            }
        });

        jButtondelete.setBackground(new java.awt.Color(32, 170, 183));
        jButtondelete.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButtondelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtondelete.setText("Delete Offer");
        jButtondelete.setBorder(null);
        jButtondelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 170, 183));
        jLabel3.setText("Price:");

        jTextFieldprice.setBackground(new java.awt.Color(32, 170, 183));
        jTextFieldprice.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 170, 183));
        jLabel4.setText("Trip Start:");

        jDateChooser1.setBackground(new java.awt.Color(32, 170, 183));

        jDateChooser2.setBackground(new java.awt.Color(32, 170, 183));

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 170, 183));
        jLabel5.setText("Trip End:");

        jLabel12.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(32, 170, 183));
        jLabel12.setText("Language:");
        jLabel12.setToolTipText("");

        jComboBox1.setBackground(new java.awt.Color(32, 170, 183));
        jComboBox1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arabic", "Chinese", "English", "French", "Spanish", "Turkish" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldname)
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel12))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jButtonback, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(177, 177, 177))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(10, 10, 10)
                .addComponent(jButtonimage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtondelete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonback, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
       
        try{
        Offers_1 of=new Offers_1();
         Languages lang=new Languages();
        //for eid:
        Query qry=eoffer.createNamedQuery("Offers_1.findAll");
       // List<Offers_1> offerlist=qry.getResultList();
        of.setOfferName(jTextFieldname.getText());
        of.setOfferStartDate(jDateChooser1.getDate()); of.setOfferEndDate(jDateChooser2.getDate());
        BigInteger price=BigInteger.valueOf(Long.parseLong(jTextFieldprice.getText()));
        of.setPrice(price);
        of.setDescriptions(jTextArea1.getText());
        //file name give me the name of image
        of.setImages(filename);
        lang.setLanguages(jComboBox1.getSelectedItem().toString());
        of.setLanguages(lang);
        em.getTransaction().begin();
        em.persist(of);
        em.getTransaction().commit();
        em.close();
        eoffer.close();
        
        JPanel jPanel4 = new javax.swing.JPanel(new GridLayout(1,2));
       Color c=new Color(32,170,183);
       jPanel4.setBackground(c);
       //change background color:
       JDesktopPane jDesktopPane1 = new javax.swing.JDesktopPane() {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
};
       labelimage.setBounds(new Rectangle(new Point(10, 10), labelimage.getPreferredSize()));
      jDesktopPane1.add(labelimage);
       JTextArea area=new JTextArea(50,50);
       area.setBackground(Color.white);
       area.setForeground(c);
       area.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
       area.setEditable(false);
         DateFormat dateformat=new SimpleDateFormat("dd/MMM/yyyy");
          String start=dateformat.format(jDateChooser1.getDate());
          String end=dateformat.format(jDateChooser2.getDate());
       area.setText(jTextArea1.getText()+"\nTrip Start: "+start+"\nTrip End: "+end
       +"\nTotal Price: "+jTextFieldprice.getText()+"\nLanguage:"+jComboBox1.getSelectedItem().toString());
       
       jPanel4.add(area);
       jPanel4.add(jDesktopPane1);
       jTabbedPane1.addTab(jTextFieldname.getText(), jPanel4);
       
       jTextArea1.setText(null); jTextFieldname.setText(null); jTextFieldprice.setText(null);
       jDateChooser1.setDate(null); jDateChooser2.setDate(null);
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Make sure to fill all fields!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
       
       
    }//GEN-LAST:event_jButtonaddActionPerformed

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
        super.setVisible(false);
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed

    OracleDataSource ods;
        
        try {
            ods = new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            ods.setUser("c##Travel"); ods.setPassword("987654");
            Connection con=ods.getConnection();
           
             Query qry=eoffer.createNamedQuery("Offers_1.findAll");
             List<Offers_1> offerlist=qry.getResultList();
             String offername=jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex());
             for(Offers_1 offer: offerlist)
             {
                 if(offer.getOfferName().equals(offername))
                 {
                     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                     Date date =new Date();
                     Date date2=offer.getOfferEndDate();
                     int result = date.compareTo(date2);
                     System.out.println("result "+result);
		if(result==0|| result==1)
                {
                    String qryoffer="Delete OFFERS where OFFER_NAME= '"+offername+"'";
                String qryoffer2="Delete CHOOSE_OFFER where OFFER_NAME= '"+offername+"'";
                PreparedStatement ps2=con.prepareStatement(qryoffer2);
                   ps2.executeUpdate();
            PreparedStatement ps=con.prepareStatement(qryoffer);
              ps.executeUpdate();
           JOptionPane.showMessageDialog(this, "Deleted Successfully!", "Information", JOptionPane.INFORMATION_MESSAGE); 
            //rmove tab:
              removeTabWithTitle(jTabbedPane1.getTitleAt(jTabbedPane1.getSelectedIndex()));
              break;
            
                }//if result
                else
                {
                    JOptionPane.showMessageDialog(this, "Offer Can NOT be Deleted!", "Warning", JOptionPane.WARNING_MESSAGE);
                    break;
                }
                 }//if
             }//end for 
         
               
           } 
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "You have to get details before Delete!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        catch(Exception ex)
        {
             Logger.getLogger(Offers.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonimageActionPerformed
         JFileChooser chooser=new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
      labelimage.setIcon(new ImageIcon(f.toString()));
       filename=f.getAbsolutePath();
       //jLabel2.setText(filename);
        
    }//GEN-LAST:event_jButtonimageActionPerformed

       private void removeTabWithTitle(String tabTitleToRemove) {
        for (int i = 0; i < jTabbedPane1.getTabCount(); i++) {
        String tabTitle = jTabbedPane1.getTitleAt(i);
        if (tabTitle.equals(tabTitleToRemove)) {
            jTabbedPane1.remove(i);
            break;
        }
    }
       }
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
            java.util.logging.Logger.getLogger(Offers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Offers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Offers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Offers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Offers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonback;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtonimage;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldprice;
    // End of variables declaration//GEN-END:variables

byte[]photo=null;
String filename=null;

}

