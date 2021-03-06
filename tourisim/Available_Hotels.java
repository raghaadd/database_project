/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourisim;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.SystemTray;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static tourisim.issueticket.falg;
import static tourisim.issueticket.sendMail;
import static tourisim.issueticket.totalpricereg;

/**
 *
 * @author Msys
 */
public class Available_Hotels extends javax.swing.JFrame {
     EntityManagerFactory emf=Persistence.createEntityManagerFactory("TourisimPU");
     EntityManager em=emf.createEntityManager();
    EntityManager eoffer=Persistence.createEntityManagerFactory("TourisimPU").createEntityManager();

    static int count=1;
    Icon hotel=null;
    /**
     * Creates new form Available_Hotels
     */
    public Available_Hotels() {
        initComponents();
         super.pack();
        super.setLocationRelativeTo(null);
        hotel=new ImageIcon(getClass().getResource("/Images/2-stars.jpeg"));
        jButton2.setIcon(hotel);
        Color c=new Color(32,170,183);
        //border for buttons and it's thickness
        jButton1.setBorder(BorderFactory.createLineBorder(c, 4));
        jButton2.setBorder(BorderFactory.createLineBorder(c, 8));
            
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(32, 170, 183));
        jLabel1.setText("Available Hotels");

        jButton1.setBackground(new java.awt.Color(32, 170, 183));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nexthotel.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(count==0)
        {
             hotel=new ImageIcon(getClass().getResource("/Images/2-stars.jpeg"));
            jButton2.setIcon(hotel);
            count++;
        }
        else if(count==1)
        {
                hotel=new ImageIcon(getClass().getResource("/Images/3-stars.jpeg"));
                jButton2.setIcon(hotel);
                count++;
        }
        else if(count==2)
        {
            hotel=new ImageIcon(getClass().getResource("/Images/4-stars.jpeg"));
            jButton2.setIcon(hotel);
            count++;
        }
        else if(count==3)
        {
            hotel=new ImageIcon(getClass().getResource("/Images/5-Stars.jpeg"));
            jButton2.setIcon(hotel);
            count=0;
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       
       // int numberofromm=Hotel.numberofromm;
       int numberofromm=0;
     
        try{    
        RegisterClients register=new RegisterClients();
       
                   
        Query qry=eoffer.createNamedQuery("BookingRoom.findAllorder");
       Query qryreg=eoffer.createNamedQuery("RegisterClients.findAllorder");
        
        java.util.List<BookingRoom> roomlist=qry.getResultList();
        BookingRoom room=new BookingRoom();
        Clients client=new Clients();
        Hotel_1 hotel=new Hotel_1();
        BigDecimal rowcount = null;
        String HotelName="";
        BigInteger price=null;
        
        
        for(BookingRoom book:roomlist)
        {
            rowcount=book.getRawCount();
        }
        int rowid;
        if(rowcount==null)
        {
            rowid=1;
        }
        else
        {
           rowid=rowcount.intValue()+1; 
        }
        
        BigDecimal bigrawID=BigDecimal.valueOf(rowid);
        room.setRawCount(bigrawID);
        BigDecimal bdpassport=BigDecimal.valueOf(Long.parseLong(question.passid));
       client.setPassportId(bdpassport);
        room.setPassportId(client);
        room.setCheckinDate(Hotel.jDateChooser1.getDate());
        room.setCheckoutDate(Hotel.jDateChooser2.getDate());
        BigInteger bigromm=BigInteger.valueOf(Long.parseLong(Hotel.numberofromm));
        room.setNumberOfRooms(bigromm);
        numberofromm=room.getNumberOfRooms().intValue();
        String desc = ((ImageIcon)jButton2.getIcon()).getDescription();
        if(desc.equals("file:/C:/Users/Msys/OneDrive/Desktop/Database/Tourisim/build/classes/Images/2-stars.jpeg"))
        {
                    HotelName="Holly House Hotel";
                    hotel.setHotelName(HotelName);
                    hotel.setHotelPrice(BigInteger.valueOf(Long.parseLong("50")));
                    room.setHotelName(hotel);
                    price=hotel.getHotelPrice();
                    price=BigInteger.valueOf(price.intValue()*numberofromm);
                    room.setTotalPrice(price);
                    
        }
        else if(desc.equals("file:/C:/Users/Msys/OneDrive/Desktop/Database/Tourisim/build/classes/Images/3-stars.jpeg"))
        {
            HotelName="The Glory Hotel";
            hotel.setHotelName(HotelName);
            hotel.setHotelPrice(BigInteger.valueOf(Long.parseLong("80")));
              room.setHotelName(hotel);
                    price=hotel.getHotelPrice();
                    price=BigInteger.valueOf(price.intValue()*numberofromm);
                    room.setTotalPrice(price);
        }
        else if(desc.equals("file:/C:/Users/Msys/OneDrive/Desktop/Database/Tourisim/build/classes/Images/4-stars.jpeg"))
        {
            HotelName="Four Seasons Hotel";
            hotel.setHotelName(HotelName);
          hotel.setHotelPrice(BigInteger.valueOf(Long.parseLong("100")));
                    room.setHotelName(hotel);
                    price=hotel.getHotelPrice();
                    price=BigInteger.valueOf(price.intValue()*numberofromm);
                    
                    room.setTotalPrice(price);
            
        }
        else if(desc.equals("file:/C:/Users/Msys/OneDrive/Desktop/Database/Tourisim/build/classes/Images/5-Stars.jpeg"))
        {
            
            HotelName="Elite Hotel";
              hotel.setHotelName(HotelName);
          hotel.setHotelPrice(BigInteger.valueOf(Long.parseLong("150")));
                    room.setHotelName(hotel);
                    price=hotel.getHotelPrice();
                    price=BigInteger.valueOf(price.intValue()*numberofromm);
                    room.setTotalPrice(price);
            
        }
       
         int response1=JOptionPane.showConfirmDialog(this,"Do You Want To Take Car?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);   
        if(response1==JOptionPane.YES_OPTION)
        {
          this.dispose();
          alonetravel.tc.setVisible(true);
          totalpricereg=totalpricereg+room.getTotalPrice().intValue();
        }
        else if(response1==JOptionPane.NO_OPTION)
        {
             java.util.List<RegisterClients> reglist=qryreg.getResultList();
            BigDecimal regID = null;
        for(RegisterClients rc:reglist)
        {
           regID=rc.getRegisteerId();
        }
        int registerID;
        if(regID==null)
        {
         registerID=20;   
        }
        else
        {
           registerID=regID.intValue()+1; 
        }
        BigDecimal bigregisterID=BigDecimal.valueOf(registerID);
        register.setRegisteerId(bigregisterID);
        register.setRegisteerId(register.getRegisteerId());
        client.setPassportId(bdpassport);
        register.setPassportId(client);
        ClientType ctype=new ClientType();
        ctype.setClientsType("nt");
        register.setClientsType(ctype);
        issueticket.totalpricereg=issueticket.totalpricereg+price.intValue();
        
        register.setTotalPrice(BigInteger.valueOf(issueticket.totalpricereg));
        issueticket.totalprice=register.getTotalPrice().toString();
        
        
        //register.setTotalPrice(price);
        JOptionPane.showMessageDialog(this, "Successfully Issueing the Ticket And Booking The Room", "Information", JOptionPane.INFORMATION_MESSAGE);
//        this.dispose();
//        question que=new question();
//        que.setVisible(true);
//       two_options.al.setVisible(false);
         em.persist(register);
         
         ///send email:
         
         sendMail("air333761@gmail.com");
        
        
             if(falg)
             {
            try {
                Thread.sleep(7000);
            } catch (InterruptedException ex) {
                Logger.getLogger(issueticket.class.getName()).log(Level.SEVERE, null, ex);
            }
                  if (SystemTray.isSupported()) {
            issueticket td = new issueticket();
            try {
                td.displayTray();
            } catch (AWTException ex) {
                Logger.getLogger(issueticket.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.err.println("System tray not supported!");
        }
             }
             
             //bill:
         issueticket.car="no"; issueticket.room="yes"; issueticket.chooseoffer="no"; issueticket.offername="-----";
         new try_report().setVisible(true);
         
        }//else if
        
        
        
         em.getTransaction().begin();
        em.persist(room);
        em.getTransaction().commit();
        em.close();
        }
        
        catch(Exception e)
        {
           Logger.getLogger(WithTrip.class.getName()).log(Level.SEVERE, null, e); 
        }
        
    
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Available_Hotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Available_Hotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Available_Hotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Available_Hotels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Available_Hotels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
