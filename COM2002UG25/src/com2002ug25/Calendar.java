/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com2002ug25;

/**
 *
 * @author fea13dw
 */
public class Calendar extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Calendar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allCalendars = new javax.swing.JTabbedPane();
        dentistCal = new javax.swing.JPanel();
        daysDen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        timesDen = new javax.swing.JPanel();
        appointmentsDen = new javax.swing.JPanel();
        monDen = new javax.swing.JPanel();
        tueDen = new javax.swing.JPanel();
        wedDen = new javax.swing.JPanel();
        thuDen = new javax.swing.JPanel();
        friDen = new javax.swing.JPanel();
        hygienistCal = new javax.swing.JPanel();
        daysHyg = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        timesHyg = new javax.swing.JPanel();
        appointmentsHyg = new javax.swing.JPanel();
        monHyg = new javax.swing.JPanel();
        tueHyg = new javax.swing.JPanel();
        wedHyg = new javax.swing.JPanel();
        thuHyg = new javax.swing.JPanel();
        friHyg = new javax.swing.JPanel();

        
                
        newAppointment = new javax.swing.JButton();
        Patients = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calendar");

        daysDen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout daysDenLayout = new javax.swing.GroupLayout(daysDen);
        daysDen.setLayout(daysDenLayout);
        daysDenLayout.setHorizontalGroup(
            daysDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        daysDenLayout.setVerticalGroup(
            daysDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        timesDen.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout timesDenLayout = new javax.swing.GroupLayout(timesDen);
        timesDen.setLayout(timesDenLayout);
        timesDenLayout.setHorizontalGroup(
            timesDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        timesDenLayout.setVerticalGroup(
            timesDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane2.setLeftComponent(timesDen);

        appointmentsDen.setLayout(new java.awt.GridLayout(1, 0));

        monDen.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout monDenLayout = new javax.swing.GroupLayout(monDen);
        monDen.setLayout(monDenLayout);
        monDenLayout.setHorizontalGroup(
            monDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        monDenLayout.setVerticalGroup(
            monDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        appointmentsDen.add(monDen);

        tueDen.setBackground(new java.awt.Color(250, 250, 250));
        tueDen.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout tueDenLayout = new javax.swing.GroupLayout(tueDen);
        tueDen.setLayout(tueDenLayout);
        tueDenLayout.setHorizontalGroup(
            tueDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        tueDenLayout.setVerticalGroup(
            tueDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        appointmentsDen.add(tueDen);

        wedDen.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout wedDenLayout = new javax.swing.GroupLayout(wedDen);
        wedDen.setLayout(wedDenLayout);
        wedDenLayout.setHorizontalGroup(
            wedDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        wedDenLayout.setVerticalGroup(
            wedDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        appointmentsDen.add(wedDen);

        thuDen.setBackground(new java.awt.Color(250, 250, 250));
        thuDen.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout thuDenLayout = new javax.swing.GroupLayout(thuDen);
        thuDen.setLayout(thuDenLayout);
        thuDenLayout.setHorizontalGroup(
            thuDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        thuDenLayout.setVerticalGroup(
            thuDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        appointmentsDen.add(thuDen);

        friDen.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout friDenLayout = new javax.swing.GroupLayout(friDen);
        friDen.setLayout(friDenLayout);
        friDenLayout.setHorizontalGroup(
            friDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        friDenLayout.setVerticalGroup(
            friDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        appointmentsDen.add(friDen);

        jSplitPane2.setRightComponent(appointmentsDen);

        jScrollPane1.setViewportView(jSplitPane2);

        javax.swing.GroupLayout dentistCalLayout = new javax.swing.GroupLayout(dentistCal);
        dentistCal.setLayout(dentistCalLayout);
        dentistCalLayout.setHorizontalGroup(
            dentistCalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
            .addComponent(daysDen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dentistCalLayout.setVerticalGroup(
            dentistCalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dentistCalLayout.createSequentialGroup()
                .addComponent(daysDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        allCalendars.addTab("Dentist", dentistCal);

        daysHyg.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout daysHygLayout = new javax.swing.GroupLayout(daysHyg);
        daysHyg.setLayout(daysHygLayout);
        daysHygLayout.setHorizontalGroup(
            daysHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        daysHygLayout.setVerticalGroup(
            daysHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        timesHyg.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout timesHygLayout = new javax.swing.GroupLayout(timesHyg);
        timesHyg.setLayout(timesHygLayout);
        timesHygLayout.setHorizontalGroup(
            timesHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        timesHygLayout.setVerticalGroup(
            timesHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(timesHyg);

        appointmentsHyg.setBackground(new java.awt.Color(200, 200, 200));
        appointmentsHyg.setLayout(new java.awt.GridLayout(1, 0));

        monHyg.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout monHygLayout = new javax.swing.GroupLayout(monHyg);
        monHyg.setLayout(monHygLayout);
        monHygLayout.setHorizontalGroup(
            monHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        monHygLayout.setVerticalGroup(
            monHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        appointmentsHyg.add(monHyg);

        tueHyg.setBackground(new java.awt.Color(250, 250, 250));
        tueHyg.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout tueHygLayout = new javax.swing.GroupLayout(tueHyg);
        tueHyg.setLayout(tueHygLayout);
        tueHygLayout.setHorizontalGroup(
            tueHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        tueHygLayout.setVerticalGroup(
            tueHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        appointmentsHyg.add(tueHyg);

        wedHyg.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout wedHygLayout = new javax.swing.GroupLayout(wedHyg);
        wedHyg.setLayout(wedHygLayout);
        wedHygLayout.setHorizontalGroup(
            wedHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        wedHygLayout.setVerticalGroup(
            wedHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        appointmentsHyg.add(wedHyg);

        thuHyg.setBackground(new java.awt.Color(250, 250, 250));
        thuHyg.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout thuHygLayout = new javax.swing.GroupLayout(thuHyg);
        thuHyg.setLayout(thuHygLayout);
        thuHygLayout.setHorizontalGroup(
            thuHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        thuHygLayout.setVerticalGroup(
            thuHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        appointmentsHyg.add(thuHyg);

        friHyg.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout friHygLayout = new javax.swing.GroupLayout(friHyg);
        friHyg.setLayout(friHygLayout);
        friHygLayout.setHorizontalGroup(
            friHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
        friHygLayout.setVerticalGroup(
            friHygLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        appointmentsHyg.add(friHyg);

        jSplitPane1.setRightComponent(appointmentsHyg);

        jScrollPane2.setViewportView(jSplitPane1);

        javax.swing.GroupLayout hygienistCalLayout = new javax.swing.GroupLayout(hygienistCal);
        hygienistCal.setLayout(hygienistCalLayout);
        hygienistCalLayout.setHorizontalGroup(
            hygienistCalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(daysHyg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        hygienistCalLayout.setVerticalGroup(
            hygienistCalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hygienistCalLayout.createSequentialGroup()
                .addComponent(daysHyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
        );

        allCalendars.addTab("Hygienist", hygienistCal);
        
        

        newAppointment.setText("New Appointment");
        newAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               NewAppointment newA =  new NewAppointment(new javax.swing.JFrame(), true);
               newA.main();
                /*newAppointmentActionPerformed(evt);*/
            }
        });
        
        

        Patients.setText("Patients");
        Patients.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                  Patients newP = new Patients (new javax.swing.JFrame(),true);
                  newP.main();
            }

        });
        
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newAppointment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Patients)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(allCalendars, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(allCalendars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAppointment)
                    .addComponent(Patients)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newAppointmentActionPerformed

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
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Patients;
    private javax.swing.JTabbedPane allCalendars;
    private javax.swing.JPanel appointmentsDen;
    private javax.swing.JPanel appointmentsHyg;
    private javax.swing.JPanel daysDen;
    private javax.swing.JPanel daysHyg;
    private javax.swing.JPanel dentistCal;
    private javax.swing.JPanel friDen;
    private javax.swing.JPanel friHyg;
    private javax.swing.JPanel hygienistCal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel monDen;
    private javax.swing.JPanel monHyg;
    private javax.swing.JButton newAppointment;
    private javax.swing.JPanel thuDen;
    private javax.swing.JPanel thuHyg;
    private javax.swing.JPanel timesDen;
    private javax.swing.JPanel timesHyg;
    private javax.swing.JPanel tueDen;
    private javax.swing.JPanel tueHyg;
    private javax.swing.JPanel wedDen;
    private javax.swing.JPanel wedHyg;
    // End of variables declaration//GEN-END:variables
    
}
