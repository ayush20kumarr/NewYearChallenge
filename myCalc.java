/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author euayukm
 */
public class myCalc extends javax.swing.JFrame {
double num1 = 0, num2 = 0;
String operator = null;
    /**
     * Creates new form myCalc
     */
    public myCalc() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        Screen = new javax.swing.JTextField();
        bSeven = new javax.swing.JButton();
        bEight = new javax.swing.JButton();
        bNine = new javax.swing.JButton();
        bDivide = new javax.swing.JButton();
        bFour = new javax.swing.JButton();
        bFive = new javax.swing.JButton();
        bSix = new javax.swing.JButton();
        bMultiply = new javax.swing.JButton();
        bOne = new javax.swing.JButton();
        bTwo = new javax.swing.JButton();
        bThree = new javax.swing.JButton();
        bSubtracte = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        bZero = new javax.swing.JButton();
        bPoint = new javax.swing.JButton();
        bEqual = new javax.swing.JButton();
        bAddition = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Calculator");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 233;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 22);
        getContentPane().add(jLabel1, gridBagConstraints);

        Screen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 256;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 22, 0, 0);
        getContentPane().add(Screen, gridBagConstraints);

        bSeven.setText("7");
        bSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSevenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 22, 0, 0);
        getContentPane().add(bSeven, gridBagConstraints);

        bEight.setText("8");
        bEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEightActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 19, 0, 0);
        getContentPane().add(bEight, gridBagConstraints);

        bNine.setText("9");
        bNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNineActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 26, 0, 0);
        getContentPane().add(bNine, gridBagConstraints);

        bDivide.setText("/");
        bDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivideActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 20, 0, 0);
        getContentPane().add(bDivide, gridBagConstraints);

        bFour.setText("4");
        bFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFourActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 22, 0, 0);
        getContentPane().add(bFour, gridBagConstraints);

        bFive.setText("5");
        bFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 19, 0, 0);
        getContentPane().add(bFive, gridBagConstraints);

        bSix.setText("6");
        bSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSixActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 26, 0, 0);
        getContentPane().add(bSix, gridBagConstraints);

        bMultiply.setText("X");
        bMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiplyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        getContentPane().add(bMultiply, gridBagConstraints);

        bOne.setText("1");
        bOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOneActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 22, 0, 0);
        getContentPane().add(bOne, gridBagConstraints);

        bTwo.setText("2");
        bTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTwoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 19, 0, 0);
        getContentPane().add(bTwo, gridBagConstraints);

        bThree.setText("3");
        bThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bThreeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 26, 0, 0);
        getContentPane().add(bThree, gridBagConstraints);

        bSubtracte.setText("-");
        bSubtracte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubtracteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        getContentPane().add(bSubtracte, gridBagConstraints);

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 22, 22, 0);
        getContentPane().add(bClear, gridBagConstraints);

        bBack.setText("Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 61;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 19, 22, 0);
        getContentPane().add(bBack, gridBagConstraints);

        bZero.setText("0");
        bZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 22, 0, 0);
        getContentPane().add(bZero, gridBagConstraints);

        bPoint.setText(".");
        bPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPointActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 19, 0, 0);
        getContentPane().add(bPoint, gridBagConstraints);

        bEqual.setText("=");
        bEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEqualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 26, 0, 0);
        getContentPane().add(bEqual, gridBagConstraints);

        bAddition.setText("+");
        bAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdditionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 20, 0, 0);
        getContentPane().add(bAddition, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSevenActionPerformed
        Screen.setText(Screen.getText() + "7");
    }//GEN-LAST:event_bSevenActionPerformed

    private void bEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEightActionPerformed
        // TODO add your handling code here:
        Screen.setText(Screen.getText() + "8");
    }//GEN-LAST:event_bEightActionPerformed

    private void bNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNineActionPerformed
        // TODO add your handling code here:
        Screen.setText(Screen.getText() + "9");
    }//GEN-LAST:event_bNineActionPerformed

    private void bFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFourActionPerformed
        // TODO add your handling code here:
        Screen.setText(Screen.getText() + "4");
    }//GEN-LAST:event_bFourActionPerformed

    private void bFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiveActionPerformed
        // TODO add your handling code here:
        Screen.setText(Screen.getText() + "5");
    }//GEN-LAST:event_bFiveActionPerformed

    private void bSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSixActionPerformed
        // TODO add your handling code here:
        Screen.setText(Screen.getText() + "6");
    }//GEN-LAST:event_bSixActionPerformed

    private void bOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOneActionPerformed
        // TODO add your handling code here:
        Screen.setText(Screen.getText() + "1");
    }//GEN-LAST:event_bOneActionPerformed

    private void bTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTwoActionPerformed
        // TODO add your handling code here:
        Screen.setText(Screen.getText() + "2");
    }//GEN-LAST:event_bTwoActionPerformed

    private void bThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThreeActionPerformed
        // TODO add your handling code here:
        Screen.setText(Screen.getText() + "3");
    }//GEN-LAST:event_bThreeActionPerformed

    private void bZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZeroActionPerformed
        // TODO add your handling code here:y
        Screen.setText(Screen.getText() + "0");
    }//GEN-LAST:event_bZeroActionPerformed

    private void bDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivideActionPerformed
        // TODO add your handling code here:
      //  Screen.setText(Screen.getText() + "/");
        num1 = Double.parseDouble(Screen.getText());
        Screen.setText("");
        
        operator = "/";
    }//GEN-LAST:event_bDivideActionPerformed

    private void bMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiplyActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(Screen.getText());
        Screen.setText("");
        
        operator = "*";
    }//GEN-LAST:event_bMultiplyActionPerformed

    private void bSubtracteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubtracteActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(Screen.getText());
        Screen.setText("");
        
        operator = "-";
    }//GEN-LAST:event_bSubtracteActionPerformed

    private void bAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdditionActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(Screen.getText());
        Screen.setText("");
        
        operator = "*";
    }//GEN-LAST:event_bAdditionActionPerformed

    private void bPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPointActionPerformed
        // TODO add your handling code here:
        Screen.setText(Screen.getText() + ".");
    }//GEN-LAST:event_bPointActionPerformed

    private void bEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEqualActionPerformed
        // TODO add your handling code here:
        num2 = Double.parseDouble(Screen.getText());
        
        double ans = 0;
        
        if(operator == "+"){
            ans = num1 + num2;
        }
        else if(operator == "-"){
            ans = num1 - num2;
        }
        else if(operator == "*"){
            ans = num1 * num2;
        }
        else{
            ans = num1 / num2;
        }
        Screen.setText(""+ans);
        
        operator = null;
    }//GEN-LAST:event_bEqualActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        Screen.setText("");
    }//GEN-LAST:event_bClearActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        // TODO add your handling code here:
        String str = Screen.getText();
        
        Screen.setText(str.substring(0, str.length()-1));
    }//GEN-LAST:event_bBackActionPerformed

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
            java.util.logging.Logger.getLogger(myCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Screen;
    private javax.swing.JButton bAddition;
    private javax.swing.JButton bBack;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDivide;
    private javax.swing.JButton bEight;
    private javax.swing.JButton bEqual;
    private javax.swing.JButton bFive;
    private javax.swing.JButton bFour;
    private javax.swing.JButton bMultiply;
    private javax.swing.JButton bNine;
    private javax.swing.JButton bOne;
    private javax.swing.JButton bPoint;
    private javax.swing.JButton bSeven;
    private javax.swing.JButton bSix;
    private javax.swing.JButton bSubtracte;
    private javax.swing.JButton bThree;
    private javax.swing.JButton bTwo;
    private javax.swing.JButton bZero;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
