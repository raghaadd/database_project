/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.FontFactory;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Section;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Msys
 */
public class try_report extends javax.swing.JFrame {

    /**
     * Creates new form try_report
     */
    public try_report() {
        initComponents();
         super.pack();
        super.setLocationRelativeTo(null);
        //this.setVisible(true);
        jLabel1.setText(issueticket.passportID); jLabel2.setText(issueticket.ticketid);
        jLabel3.setText(issueticket.firstname); jLabel4.setText(issueticket.lastname);
        jLabel5.setText(issueticket.travelfrom); jLabel6.setText(issueticket.trvaelto);
        jLabel7.setText(issueticket.room); jLabel8.setText(issueticket.car);
        jLabel9.setText(issueticket.traveldate); jLabel10.setText(issueticket.totalprice);
        jLabel11.setText(issueticket.chooseoffer); jLabel12.setText(issueticket.offername);
        
        //frame to pdf:
        
         String path="";
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION)
        {
            path=j.getSelectedFile().getPath();
        }
        Document doc=new Document();
      BaseColor c=new BaseColor(32,170,183);
        Font f1=new Font(Font.TIMES_ROMAN,40,Font.BOLD);
        Font f2=new Font(Font.TIMES_ROMAN,14,Font.NORMAL);
         Font f3=new Font(Font.TIMES_ROMAN,24,Font.BOLD);
         //com.itextpdf.text.Font.FontFamily
                // Font f=new Font(com.itextpdf.text.Font.FontFamily.TIMES_ROMAN,40,Font.BOLD,c);
   
        
  
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"Bill.pdf"));
            
            PdfWriter w=PdfWriter.getInstance(doc, new FileOutputStream(path+"Bill.pdf"));
            
            doc.open();
            doc.add(new Paragraph("                                                                          "+jLabelbell.getText(),f1));
            doc.add(new Paragraph("                            ----------------------------------------------------------------------------------                                            "));
            //doc.add(new Paragraph("                                                                          "));
            doc.add(new Paragraph("                                                          "+jLabelpid.getText()+"       "+issueticket.passportID,f2));
            doc.add(new Paragraph("                                                          "+jLabeltid.getText()+"         "+issueticket.ticketid,f2));
            doc.add(new Paragraph("                                                          "+jLabelfn.getText()+"       "+issueticket.firstname,f2));
            doc.add(new Paragraph("                                                          "+jLabelln.getText()+"       "+issueticket.lastname,f2));
            doc.add(new Paragraph("                                                          "+jLabelfrom.getText()+"     "+issueticket.travelfrom,f2));
            doc.add(new Paragraph("                                                          "+jLabelto.getText()+"         "+issueticket.trvaelto,f2));
            doc.add(new Paragraph("                                                          "+jLabelroom.getText()+"      "+issueticket.room,f2));
            doc.add(new Paragraph("                                                          "+jLabelcar.getText()+"           "+issueticket.car,f2));
            doc.add(new Paragraph("                                                          "+jLabelchoose.getText()+"     "+issueticket.chooseoffer,f2));
            doc.add(new Paragraph("                                                          "+jLabeloffername.getText()+"       "+issueticket.offername,f2));
            doc.add(new Paragraph("                                                          "+jLabeldate.getText()+"       "+issueticket.traveldate,f2));
            doc.add(new Paragraph("                         "+"---------------------------------------------------------------------------",f2));
            doc.add(new Paragraph("                                 "+jLabelprice.getText()+"   "+issueticket.totalprice+"$",f3));
            
//            PdfPTable tb1=new PdfPTable(2);
//           tb1.addCell(jLabelpid.getText()); tb1.addCell(issueticket.passportID); tb1.addCell(jLabeltid.getText()); tb1.addCell(issueticket.ticketid);
//            tb1.addCell(jLabelfn.getText()); tb1.addCell(issueticket.firstname); tb1.addCell(jLabelln.getText()); tb1.addCell(issueticket.lastname);
//             tb1.addCell(jLabelfrom.getText()); tb1.addCell(issueticket.travelfrom); tb1.addCell(jLabelto.getText()); tb1.addCell(issueticket.trvaelto);
//              tb1.addCell(jLabelroom.getText()); tb1.addCell(issueticket.room); tb1.addCell(jLabelcar.getText()); tb1.addCell(issueticket.car);
//              tb1.addCell(jLabelchoose.getText()); tb1.addCell(issueticket.chooseoffer); tb1.addCell(jLabeloffername.getText()); tb1.addCell(issueticket.offername);
//               tb1.addCell(jLabeldate.getText()); tb1.addCell(issueticket.traveldate); tb1.addCell(jLabelprice.getText()); tb1.addCell(issueticket.totalprice);
 
           // doc.add(tb1);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(try_report.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(try_report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        doc.close();
       
        two_options.al.setVisible(false);
        alonetravel.it.setVisible(false);
        alonetravel.h.setVisible(false);
        Hotel.ah.setVisible(false);
        alonetravel.tc.setVisible(false);
        Take_Car.ac.setVisible(false);
        two_options.wt.setVisible(false);
        
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
        jLabelbell = new javax.swing.JLabel();
        jLabelpid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabeltid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelfn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelln = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelfrom = new javax.swing.JLabel();
        jLabelto = new javax.swing.JLabel();
        jLabelroom = new javax.swing.JLabel();
        jLabelcar = new javax.swing.JLabel();
        jLabeldate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelprice = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelchoose = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabeloffername = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelbell.setFont(new java.awt.Font("Traditional Arabic", 1, 48)); // NOI18N
        jLabelbell.setForeground(new java.awt.Color(32, 170, 183));
        jLabelbell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelbell.setText("Bell");

        jLabelpid.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabelpid.setForeground(new java.awt.Color(32, 170, 183));
        jLabelpid.setText("Passport ID:");

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 170, 183));

        jLabeltid.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabeltid.setForeground(new java.awt.Color(32, 170, 183));
        jLabeltid.setText("Ticket ID:");

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(32, 170, 183));

        jLabelfn.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabelfn.setForeground(new java.awt.Color(32, 170, 183));
        jLabelfn.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 170, 183));

        jLabelln.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabelln.setForeground(new java.awt.Color(32, 170, 183));
        jLabelln.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 170, 183));

        jLabelfrom.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabelfrom.setForeground(new java.awt.Color(32, 170, 183));
        jLabelfrom.setText("Travel From:");

        jLabelto.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabelto.setForeground(new java.awt.Color(32, 170, 183));
        jLabelto.setText("Travel To:");

        jLabelroom.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabelroom.setForeground(new java.awt.Color(32, 170, 183));
        jLabelroom.setText("Book Room:");

        jLabelcar.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabelcar.setForeground(new java.awt.Color(32, 170, 183));
        jLabelcar.setText("Take Car:");

        jLabeldate.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabeldate.setForeground(new java.awt.Color(32, 170, 183));
        jLabeldate.setText("Travel Date:");

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 170, 183));

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 170, 183));

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 170, 183));

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 170, 183));

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 170, 183));

        jLabelprice.setFont(new java.awt.Font("Traditional Arabic", 0, 36)); // NOI18N
        jLabelprice.setForeground(new java.awt.Color(32, 170, 183));
        jLabelprice.setText("Total Price:");

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 170, 183));

        jButton1.setBackground(new java.awt.Color(32, 170, 183));
        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelchoose.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabelchoose.setForeground(new java.awt.Color(32, 170, 183));
        jLabelchoose.setText("Choose Offer:");

        jLabel11.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(32, 170, 183));

        jLabeloffername.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabeloffername.setForeground(new java.awt.Color(32, 170, 183));
        jLabeloffername.setText("Offer Name:");

        jLabel12.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(32, 170, 183));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelfn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelroom, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelpid, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeldate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelchoose, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabeloffername, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeltid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelcar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabelprice, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabelbell, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelbell, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelpid)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeltid))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelfn)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelln)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelfrom)
                            .addComponent(jLabelto)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelroom)
                            .addComponent(jLabelcar)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelchoose)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabeloffername)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabeldate)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
         question que=new question();
        que.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(try_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(try_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(try_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(try_report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new try_report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelbell;
    private javax.swing.JLabel jLabelcar;
    private javax.swing.JLabel jLabelchoose;
    private javax.swing.JLabel jLabeldate;
    private javax.swing.JLabel jLabelfn;
    private javax.swing.JLabel jLabelfrom;
    private javax.swing.JLabel jLabelln;
    private javax.swing.JLabel jLabeloffername;
    private javax.swing.JLabel jLabelpid;
    private javax.swing.JLabel jLabelprice;
    private javax.swing.JLabel jLabelroom;
    private javax.swing.JLabel jLabeltid;
    private javax.swing.JLabel jLabelto;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
