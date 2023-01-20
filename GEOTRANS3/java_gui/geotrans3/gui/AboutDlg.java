// CLASSIFICATION: UNCLASSIFIED

/*
 * About.java
 *
 * Created on May 18, 2001, 7:37 PM
 *
 * MODIFICATION HISTORY:
 *
 * DATE      NAME        DR#               DESCRIPTION
 *
 * 08/13/10  S Gillis    BAEts27457        Update to GeoTrans 3.1
 * 05/31/11  K. Lam      BAEts28657        Update version to 3.2
 * 11/18/11  K. Lam      MSP_029475        Update version to 3.3
 * 07/30/13  K. Lam      MSP_029595        Update version to 3.4
 * 08/19/14  K. Lam      MSP_029964        Update version to 3.5
 * 01/12/16  K. Chen     MSP_00030518      Update version to 3.7
 */

package geotrans3.gui;

import geotrans3.utility.Platform;
import geotrans3.utility.Utility;
import geotrans3.utility.*;

/**
 *
 * @author  amy
 * @version 
 */
public class AboutDlg extends javax.swing.JDialog {

    /** Creates new form AboutDlg */
    public AboutDlg(java.awt.Frame parent,boolean modal) {
        super (parent, modal);
        initComponents ();
        pack ();
        Utility.center(parent, this);
        iconPanel.add(new AboutIconPanel("/geotrans3/gui/icons/msp_logo.gif"));
        //iconPanel.add(new AboutIconPanel("/geotrans3/gui/icons/NGA.gif"));
        if (Platform.isJavaV1_3)
        {
            versionLabel.setForeground(java.awt.Color.black);
            tecLabel.setForeground(java.awt.Color.black);
            tecDivisionLabel.setForeground(java.awt.Color.black);
            ngaLabel.setForeground(java.awt.Color.black);
            ngaDivisionLabel.setForeground(java.awt.Color.black);
        }
        if (Platform.isUnix)
        {
            versionLabel.setFont(new java.awt.Font("Dialog", 1, 10));
            tecLabel.setFont(new java.awt.Font("Dialog", 1, 10));
            tecDivisionLabel.setFont(new java.awt.Font("Dialog", 1, 10));
            ngaLabel.setFont(new java.awt.Font("Dialog", 1, 10));
            ngaDivisionLabel.setFont(new java.awt.Font("Dialog", 1, 10));
            okButton.setFont(new java.awt.Font("Dialog", 1, 10));
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    descriptPanel = new javax.swing.JPanel();
    versionPanel = new javax.swing.JPanel();
    versionLabel = new javax.swing.JLabel();
    tecPanel = new javax.swing.JPanel();
    tecLabel = new javax.swing.JLabel();
    tecDivisionLabel = new javax.swing.JLabel();
    ngaPanel = new javax.swing.JPanel();
    ngaLabel = new javax.swing.JLabel();
    ngaDivisionLabel = new javax.swing.JLabel();
    buttonPanel = new javax.swing.JPanel();
    okButton = new javax.swing.JButton();
    iconPanel = new javax.swing.JPanel();
    tempPanel = new javax.swing.JPanel();

    setTitle("About MSP GEOTRANS 3.7");
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        closeDialog(evt);
      }
    });

    descriptPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 5, 0));
    descriptPanel.setMinimumSize(new java.awt.Dimension(270, 105));
    descriptPanel.setPreferredSize(new java.awt.Dimension(270, 105));
    descriptPanel.setLayout(new java.awt.GridLayout(3, 1, 0, 2));

    versionPanel.setMinimumSize(new java.awt.Dimension(50, 5));
    versionPanel.setPreferredSize(new java.awt.Dimension(50, 5));
    versionPanel.setLayout(new java.awt.GridLayout(1, 1));

    versionLabel.setText("MSP GEOTRANS 3.7");
    versionPanel.add(versionLabel);

    descriptPanel.add(versionPanel);

    tecPanel.setMinimumSize(new java.awt.Dimension(50, 5));
    tecPanel.setPreferredSize(new java.awt.Dimension(50, 5));
    tecPanel.setLayout(new java.awt.GridLayout(2, 1));

    tecLabel.setText("National Geospatial-Intelligence Agency (NGA)");
    tecLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    tecPanel.add(tecLabel);

    tecDivisionLabel.setText("Mensuration Services Program (MSP)");
    tecPanel.add(tecDivisionLabel);

    descriptPanel.add(tecPanel);

    //ngaPanel.setMinimumSize(new java.awt.Dimension(50, 5));
    //ngaPanel.setPreferredSize(new java.awt.Dimension(50, 5));
    //ngaPanel.setLayout(new java.awt.GridLayout(2, 1));

    //ngaLabel.setText("National Geospatial-Intelligence Agency");
    //ngaLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
    //ngaPanel.add(ngaLabel);

    //ngaDivisionLabel.setText("Exploitation Division");
    //ngaPanel.add(ngaDivisionLabel);

    //descriptPanel.add(ngaPanel);

    getContentPane().add(descriptPanel, java.awt.BorderLayout.CENTER);

    buttonPanel.setMinimumSize(new java.awt.Dimension(53, 21));
    buttonPanel.setPreferredSize(new java.awt.Dimension(53, 21));

    okButton.setMnemonic(java.awt.event.KeyEvent.VK_O);
    okButton.setText("OK");
    okButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    okButton.setMaximumSize(new java.awt.Dimension(45, 24));
    okButton.setMinimumSize(new java.awt.Dimension(45, 24));
    okButton.setPreferredSize(new java.awt.Dimension(45, 24));
    okButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        okActionPerformed(evt);
      }
    });
    buttonPanel.add(okButton);

    getContentPane().add(buttonPanel, java.awt.BorderLayout.EAST);

    iconPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 5, 0));
    iconPanel.setMinimumSize(new java.awt.Dimension(45, 105));
    iconPanel.setPreferredSize(new java.awt.Dimension(45, 105));
    iconPanel.setLayout(new java.awt.GridLayout(3, 1, 0, 2));

    tempPanel.setMinimumSize(new java.awt.Dimension(45, 5));
    tempPanel.setPreferredSize(new java.awt.Dimension(45, 5));
    iconPanel.add(tempPanel);

    getContentPane().add(iconPanel, java.awt.BorderLayout.WEST);
  }// </editor-fold>//GEN-END:initComponents

  private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        setVisible (false);
        dispose ();
  }//GEN-LAST:event_okActionPerformed

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible (false);
        dispose ();
    }//GEN-LAST:event_closeDialog

    /**
    * @param args the command line arguments
    */
    public static void main (String args[]) {
        new AboutDlg (new javax.swing.JFrame (), true).show ();
    }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel buttonPanel;
  private javax.swing.JPanel descriptPanel;
  private javax.swing.JPanel iconPanel;
  private javax.swing.JLabel ngaDivisionLabel;
  private javax.swing.JLabel ngaLabel;
  private javax.swing.JPanel ngaPanel;
  private javax.swing.JButton okButton;
  private javax.swing.JLabel tecDivisionLabel;
  private javax.swing.JLabel tecLabel;
  private javax.swing.JPanel tecPanel;
  private javax.swing.JPanel tempPanel;
  private javax.swing.JLabel versionLabel;
  private javax.swing.JPanel versionPanel;
  // End of variables declaration//GEN-END:variables

}

// CLASSIFICATION: UNCLASSIFIED
