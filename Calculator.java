import java.text.DecimalFormat;

/**
 * Simple arithmetic 4 function calculator
 * Calculator can add, subtract, multiply, and divide
 * @author Steven Aherne (C18742005)
 */
public class Calculator extends javax.swing.JFrame {
    
    public Calculator() {
        initComponents();
    }

    /**
    * Performs the calculation once the equal (=) button is pressed
    * The function will add, subtract, multiply, or divide depending 
    * on the calc variable
    */
    public void calculation() {
        switch(calc){
            case 1: // Adding
                answer = num + Double.parseDouble(jTextFieldScreen.getText());
                
                break;
            case 2: // Subtracting
                answer = num - Double.parseDouble(jTextFieldScreen.getText());
                
                break;
            case 3: // Multiplying
                answer = num * Double.parseDouble(jTextFieldScreen.getText());
                
                break;
            case 4: // Dividing
                answer = num / Double.parseDouble(jTextFieldScreen.getText());
                
                break;
        }
        
        jTextFieldScreen.setText(df.format(answer));
    }

    /**
    * Initialises all of the buttons, text fields and labels
    * that are used to create the GUI of the application
    * Sets defaults for the app such as dimensions, resize, title and type
    */                       
    private void initComponents() {

        // Create number buttons
        jButtonZero = new javax.swing.JButton();
        jButtonOne = new javax.swing.JButton();
        jButtonTwo = new javax.swing.JButton();
        jButtonThree = new javax.swing.JButton();
        jButtonFour = new javax.swing.JButton();
        jButtonFive = new javax.swing.JButton();
        jButtonSix = new javax.swing.JButton();
        jButtonSeven = new javax.swing.JButton();
        jButtonEight = new javax.swing.JButton();
        jButtonNine = new javax.swing.JButton();
        jButtonPoint = new javax.swing.JButton();

        // Create clear and delete buttons
        jButtonDel = new javax.swing.JButton();
        jButtonClr = new javax.swing.JButton();

        // Create arithmetic buttons
        jButtonPlus = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonMultiply = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();

        // Create display field and label
        jTextFieldScreen = new javax.swing.JTextField();
        jLabelCalc = new javax.swing.JLabel();

        // Set application defaults
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        // Set fonts, text, and event listeners for numerical buttons
        jButtonZero.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonZero.setText("0");
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZeroActionPerformed(evt);
            }
        });

        jButtonOne.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonOne.setText("1");
        jButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOneActionPerformed(evt);
            }
        });

        jButtonTwo.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonTwo.setText("2");
        jButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTwoActionPerformed(evt);
            }
        });

        jButtonThree.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonThree.setText("3");
        jButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThreeActionPerformed(evt);
            }
        });

        jButtonFour.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonFour.setText("4");
        jButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFourActionPerformed(evt);
            }
        });

        jButtonFive.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonFive.setText("5");
        jButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiveActionPerformed(evt);
            }
        });

        jButtonSix.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonSix.setText("6");
        jButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSixActionPerformed(evt);
            }
        });

        jButtonSeven.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonSeven.setText("7");
        jButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSevenActionPerformed(evt);
            }
        });

        jButtonEight.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonEight.setText("8");
        jButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEightActionPerformed(evt);
            }
        });

        jButtonNine.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonNine.setText("9");
        jButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNineActionPerformed(evt);
            }
        });

        jButtonPoint.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonPoint.setText(".");
        jButtonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPointActionPerformed(evt);
            }
        });

        // Set fonts, text, and event listeners for clear and delete buttons
        jButtonDel.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonDel.setText("<");
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        jButtonClr.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonClr.setText("C");
        jButtonClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClrActionPerformed(evt);
            }
        });

        // Set fonts, text, and event listeners for arithmetic buttons
        jButtonPlus.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonPlus.setText("+");
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        jButtonMinus.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonMinus.setText("-");
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });

        jButtonMultiply.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonMultiply.setText("*");
        jButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplyActionPerformed(evt);
            }
        });

        jButtonDivide.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonDivide.setText("/");
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivideActionPerformed(evt);
            }
        });

        jButtonEquals.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButtonEquals.setText("=");
        jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualsActionPerformed(evt);
            }
        });

        // Set defaults for the calculator screen and label
        jTextFieldScreen.setEditable(false);
        jTextFieldScreen.setFont(new java.awt.Font("Tahoma", 1, 24));
        jTextFieldScreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabelCalc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        // Set up the layout of the GUI
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldScreen)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonDel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonClr, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabelCalc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelCalc, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonClr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }                                                                

    /**
    * Functions that control the actions that will be performed when each button is pressed
    * Numerical buttons add their text to the calculator display
    * Clear button will clear the display and label
    * Delete button will remove the last digit on the display
    * Arithmetic buttons will perform their desired operation i.e. add, subtract, multiply, divide
    */
    private void jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {                                            
        jTextFieldScreen.setText(jTextFieldScreen.getText() + "0");
    } 

    private void jButtonOneActionPerformed(java.awt.event.ActionEvent evt) {                                           
        jTextFieldScreen.setText(jTextFieldScreen.getText() + "1");
    }                                          

    private void jButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        jTextFieldScreen.setText(jTextFieldScreen.getText() + "2");
    }                                          

    private void jButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jTextFieldScreen.setText(jTextFieldScreen.getText() + "3");
    }                                           

    private void jButtonFourActionPerformed(java.awt.event.ActionEvent evt) {                                            
        jTextFieldScreen.setText(jTextFieldScreen.getText() + "4");
    }

    private void jButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {                                            
        jTextFieldScreen.setText(jTextFieldScreen.getText() + "5");
    }                                           

    private void jButtonSixActionPerformed(java.awt.event.ActionEvent evt) {                                           
        jTextFieldScreen.setText(jTextFieldScreen.getText() + "6");
    }                                          

    private void jButtonSevenActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jTextFieldScreen.setText(jTextFieldScreen.getText() + "7");
    }                                            

    private void jButtonEightActionPerformed(java.awt.event.ActionEvent evt) {                                             
        jTextFieldScreen.setText(jTextFieldScreen.getText() + "8");
    }                                            

    private void jButtonNineActionPerformed(java.awt.event.ActionEvent evt) {                                            
        jTextFieldScreen.setText(jTextFieldScreen.getText() + "9");
    }

    private void jButtonPointActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if(!jTextFieldScreen.getText().contains(".")){
            jTextFieldScreen.setText(jTextFieldScreen.getText() + ".");
        }
    }  

    private void jButtonClrActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // Clear the text field and the label
        jTextFieldScreen.setText("");
        jLabelCalc.setText("");
    }                                            

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String newVal;
        
        // Check if there is a number to delete
        if(jTextFieldScreen.getText().length() > 0) {
            // Delete the number and update the value in the text field
            int numToDelete = jTextFieldScreen.getText().length() - 1;
            StringBuilder back = new StringBuilder(jTextFieldScreen.getText());
            back.deleteCharAt(numToDelete);
            
            newVal = back.toString();
            jTextFieldScreen.setText(newVal);
        }
    }

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) { 
        // Check if their is a figure entered                                              
        if(jTextFieldScreen.getText().length() != 0){
            // Specify addition to be performed in the label field
            num = Double.parseDouble(jTextFieldScreen.getText());
            calc = 1;
            jTextFieldScreen.setText("");
            jLabelCalc.setText(num + " +");
        }
    }

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {  
        // Check if their is a figure entered                                             
        if(jTextFieldScreen.getText().length() != 0) {
            // Specify subtraction to be performed in the label field
            num = Double.parseDouble(jTextFieldScreen.getText());
            calc = 2;
            jTextFieldScreen.setText("");
            jLabelCalc.setText(num + " -");
        } else {
            // Specify the figure entered is a negative number
            jTextFieldScreen.setText("-");
        }
    }                                                                                                                                                                          

    private void jButtonMultiplyActionPerformed(java.awt.event.ActionEvent evt) {  
        // Check if their is a figure entered                                               
        if(jTextFieldScreen.getText().length() != 0){
            // Specify multiplication to be performed in the label field
            num = Double.parseDouble(jTextFieldScreen.getText());
            calc = 3;
            jTextFieldScreen.setText("");
            jLabelCalc.setText(num + " *");
        }
    } 

    private void jButtonDivideActionPerformed(java.awt.event.ActionEvent evt) { 
        // Check if their is a figure entered                                            
        if(jTextFieldScreen.getText().length() != 0){
            // Specify division to be performed in the label field
            num = Double.parseDouble(jTextFieldScreen.getText());
            calc = 4;
            jTextFieldScreen.setText("");
            jLabelCalc.setText(num + " /");
        }
    }                                                                                                                                                                              

    private void jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {
        // Check there is an arithmetic operation to be performed                                              
        if(jLabelCalc.getText().length() > 0){
            // Perform the operation and reset the label field
            calculation();
            jLabelCalc.setText("");
        }
    }                                             

    /**
     * @param args the command line arguments
     * Starts the simple calculator application
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Create and display the calculator app
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration
    private double num, answer;
    private int calc;
    private DecimalFormat df = new DecimalFormat("###.#####");

    private javax.swing.JButton jButtonZero; 
    private javax.swing.JButton jButtonOne;
    private javax.swing.JButton jButtonTwo;
    private javax.swing.JButton jButtonThree;
    private javax.swing.JButton jButtonFour;
    private javax.swing.JButton jButtonFive;
    private javax.swing.JButton jButtonSix;
    private javax.swing.JButton jButtonSeven;
    private javax.swing.JButton jButtonEight;
    private javax.swing.JButton jButtonNine;
    private javax.swing.JButton jButtonPoint;

    private javax.swing.JButton jButtonClr;
    private javax.swing.JButton jButtonDel;

    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMultiply;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonEquals;

    private javax.swing.JLabel jLabelCalc;
    private javax.swing.JTextField jTextFieldScreen;
    // End of variables declaration                   
}
