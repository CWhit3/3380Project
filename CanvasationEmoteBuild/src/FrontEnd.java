
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christian_white
 */

public class FrontEnd extends javax.swing.JFrame {
    /**
     * Creates new form FrontEnd
     */

//START GUI LOGIC VARIABLES AND REFERENCES

    Shape s = new Circle();
    Color brushColor = Color.BLACK;
    Stack<Graphics> frames = new Stack();
    TextBrushListener tbl = new TextBrushListener();
    ArrayList<BufferedImage> history = new ArrayList<>();
    BufferedImage submitted = null;
    String str;
    static String username = "[username]";

//END GUI LOGIC VARIABLES AND REFERENCES

//START AUTOMATED INITIALIZATION BY NETBEANS GUI BUILDER

    public FrontEnd() {
        initComponents();
        DrawPanel.addMouseListener(tbl);
        colorSwatch.setBackground(brushColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ToolPanel = new javax.swing.JPanel();
        BrushSizeSlider = new javax.swing.JSlider();
        CircleBrushButton = new javax.swing.JButton();
        SquareBrushButton = new javax.swing.JButton();
        TextButton = new javax.swing.JButton();
        colorSwatch = new javax.swing.JPanel();
        ColorSelectorButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        UndoButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        HistoryContainer = new javax.swing.JPanel();
        HistoryScrollPane = new javax.swing.JScrollPane();
        HistoryLog = new javax.swing.JPanel();
        textInput = new javax.swing.JTextField();
        DrawPanelContainer = new javax.swing.JPanel();
        DrawPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EmotesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Canvasation");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MainPanel.setBackground(new java.awt.Color(102, 102, 102));

        ToolPanel.setBackground(new java.awt.Color(255, 255, 255));
        ToolPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tools", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shree Devanagari 714", 0, 12))); // NOI18N

        BrushSizeSlider.setBackground(new java.awt.Color(255, 255, 255));
        BrushSizeSlider.setFont(new java.awt.Font("Avenir", 0, 10)); // NOI18N
        BrushSizeSlider.setMajorTickSpacing(5);
        BrushSizeSlider.setMaximum(50);
        BrushSizeSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        BrushSizeSlider.setPaintLabels(true);
        BrushSizeSlider.setValue(10);

        CircleBrushButton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        CircleBrushButton.setText("Circle");
        CircleBrushButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleBrushButtonActionPerformed(evt);
            }
        });

        SquareBrushButton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        SquareBrushButton.setText("Square");
        SquareBrushButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareBrushButtonActionPerformed(evt);
            }
        });

        TextButton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        TextButton.setText("Text");
        TextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout colorSwatchLayout = new javax.swing.GroupLayout(colorSwatch);
        colorSwatch.setLayout(colorSwatchLayout);
        colorSwatchLayout.setHorizontalGroup(
                colorSwatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 33, Short.MAX_VALUE)
        );
        colorSwatchLayout.setVerticalGroup(
                colorSwatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 33, Short.MAX_VALUE)
        );

        ColorSelectorButton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        ColorSelectorButton.setText("Color");
        ColorSelectorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorSelectorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ToolPanelLayout = new javax.swing.GroupLayout(ToolPanel);
        ToolPanel.setLayout(ToolPanelLayout);
        ToolPanelLayout.setHorizontalGroup(
                ToolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SquareBrushButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CircleBrushButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ColorSelectorButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ToolPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(colorSwatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ToolPanelLayout.createSequentialGroup()
                                .addContainerGap(8, Short.MAX_VALUE)
                                .addComponent(BrushSizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        ToolPanelLayout.setVerticalGroup(
                ToolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ToolPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(CircleBrushButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SquareBrushButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BrushSizeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ColorSelectorButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(colorSwatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        SubmitButton.setBackground(new java.awt.Color(153, 153, 153));
        SubmitButton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        UndoButton.setBackground(new java.awt.Color(255, 255, 255));
        UndoButton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        UndoButton.setText("Undo");
        UndoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(255, 255, 255));
        ClearButton.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        EmotesButton.setBackground(new java.awt.Color(255, 255, 255));
        EmotesButton.setFont(new java.awt.Font("Avenir", 0, 13));
        EmotesButton.setText("Emotes");
        EmotesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmotesButtonActionPerformed(evt);
            }
        });

        HistoryContainer.setBackground(new java.awt.Color(255, 255, 255));
        HistoryContainer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "History", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Shree Devanagari 714", 0, 14))); // NOI18N

        HistoryScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        HistoryLog.setBackground(new java.awt.Color(255, 255, 255));
        HistoryLog.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                HistoryLogComponentAdded(evt);
            }
        });
        HistoryLog.setLayout(new javax.swing.BoxLayout(HistoryLog, javax.swing.BoxLayout.Y_AXIS));
        HistoryScrollPane.setViewportView(HistoryLog);

        javax.swing.GroupLayout HistoryContainerLayout = new javax.swing.GroupLayout(HistoryContainer);
        HistoryContainer.setLayout(HistoryContainerLayout);
        HistoryContainerLayout.setHorizontalGroup(
                HistoryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HistoryContainerLayout.createSequentialGroup()
                                .addComponent(HistoryScrollPane)
                                .addContainerGap())
        );
        HistoryContainerLayout.setVerticalGroup(
                HistoryContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HistoryScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );

        textInput.setFont(new java.awt.Font("Avenir", 0, 13)); // NOI18N
        textInput.setText("[Type text here and press ENTER when done]");
        textInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textInputActionPerformed(evt);
            }
        });

        DrawPanelContainer.setBackground(new java.awt.Color(153, 0, 204));
        DrawPanelContainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DrawPanelContainer.setForeground(new java.awt.Color(255, 255, 0));

        DrawPanel.setBackground(new java.awt.Color(255, 255, 255));
        DrawPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DrawPanel.setName(""); // NOI18N
        DrawPanel.setPreferredSize(new java.awt.Dimension(625, 140));
        DrawPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DrawPanelMouseDragged(evt);
            }
        });
        DrawPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DrawPanelMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DrawPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DrawPanelLayout = new javax.swing.GroupLayout(DrawPanel);
        DrawPanel.setLayout(DrawPanelLayout);
        DrawPanelLayout.setHorizontalGroup(
                DrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 681, Short.MAX_VALUE)
        );
        DrawPanelLayout.setVerticalGroup(
                DrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 144, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Shree Devanagari 714", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Created by: " + username);

        javax.swing.GroupLayout DrawPanelContainerLayout = new javax.swing.GroupLayout(DrawPanelContainer);
        DrawPanelContainer.setLayout(DrawPanelContainerLayout);
        DrawPanelContainerLayout.setHorizontalGroup(
                DrawPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DrawPanelContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(DrawPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DrawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                                        .addGroup(DrawPanelContainerLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        DrawPanelContainerLayout.setVerticalGroup(
                DrawPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DrawPanelContainerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DrawPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(UndoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EmotesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(SubmitButton))
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(HistoryContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                                .addComponent(DrawPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(12, 12, 12))))
                                        .addComponent(textInput, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ToolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addComponent(ToolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(8, 8, 8))
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                                .addComponent(HistoryContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(DrawPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(ClearButton)
                                                        .addComponent(UndoButton)
                                                        .addComponent(EmotesButton)
                                                        .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//END AUTOMATED INITIALIZATION BY NETBEANS GUI BUILDER

    //START LISTENERS
    private void DrawPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrawPanelMouseReleased
        frames.push(DrawPanel.getGraphics());
        System.out.println("Frames in stack: " + frames.size());
    }//GEN-LAST:event_DrawPanelMouseReleased

    private void DrawPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrawPanelMouseDragged
        s.draw(DrawPanel.getGraphics(), evt.getPoint(), BrushSizeSlider.getValue());
    }//GEN-LAST:event_DrawPanelMouseDragged

    private void DrawPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrawPanelMouseClicked
        s.draw(DrawPanel.getGraphics(), evt.getPoint(), BrushSizeSlider.getValue());
    }//GEN-LAST:event_DrawPanelMouseClicked

    private void CircleBrushButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleBrushButtonActionPerformed
        s = new Circle();
    }//GEN-LAST:event_CircleBrushButtonActionPerformed

    private void SquareBrushButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareBrushButtonActionPerformed
        s = new Square();
    }//GEN-LAST:event_SquareBrushButtonActionPerformed

    private void TextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextButtonActionPerformed
        s = new Text(str);
    }//GEN-LAST:event_TextButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        submitted = new JPanelToBufferedImageConverter().convertToBI(DrawPanelContainer);
        history.add(submitted);
        HistoryLog.add(new JLabel(new ImageIcon(submitted)));
        clear();
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void HistoryLogComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_HistoryLogComponentAdded
        evt.getChild().setVisible(true);
        evt.getContainer().revalidate();
        evt.getContainer().repaint();
    }//GEN-LAST:event_HistoryLogComponentAdded

    private void UndoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoButtonActionPerformed

    }//GEN-LAST:event_UndoButtonActionPerformed

    private void ColorSelectorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorSelectorButtonActionPerformed
        brushColor = JColorChooser.showDialog(this, "Select a new color", brushColor);
        DrawPanel.getGraphics().setColor(brushColor);
        colorSwatch.setBackground(brushColor);
    }//GEN-LAST:event_ColorSelectorButtonActionPerformed

    private void textInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textInputActionPerformed
        str = textInput.getText();
        s = new Text(str);
    }//GEN-LAST:event_textInputActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        clear();
    }//GEN-LAST:event_ClearButtonActionPerformed

    //START OF EMOTE MENU
    //Creates Emote PopupMenu
    private void EmotesButtonActionPerformed(java.awt.event.ActionEvent evt) {
        JPopupMenu emoteMenu = new JPopupMenu("Emotes");
        emoteMenu.show(EmotesButton, -80, -300);
        emoteMenu.setPopupSize(200, 300);

        GridLayout gl = new GridLayout(0, 2, 3, 3);
        emoteMenu.setLayout(gl);

        Emotes e = new Emotes();

        String[] emote = {"smiley", "smile", "rage", "weary", "joy", "sob", "worried", "thinking", "heart_eyes", "weeb"};
        for (int i = 0; i < emote.length; i++) {
            emoteMenu.add(e.setButton(emote[i], DrawPanel));
            emoteMenu.pack();
        }
        emoteMenu.setVisible(true);
    }

//START HELPER METHODS
    private void clear(){
        frames.clear();
        DrawPanel.removeAll();
        DrawPanel.repaint();
    }

//END HELPER METHODS
//START MAIN

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
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RandomNameGenerator rng = new RandomNameGenerator();
                username = rng.getNewName();
                System.out.println("My username is: " + username);

                new FrontEnd().setVisible(true);
            }
        });
    }

//END MAIN

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider BrushSizeSlider;
    private javax.swing.JButton CircleBrushButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton ColorSelectorButton;
    private javax.swing.JPanel DrawPanel;
    private javax.swing.JPanel DrawPanelContainer;
    private javax.swing.JPanel HistoryContainer;
    private javax.swing.JPanel HistoryLog;
    private javax.swing.JScrollPane HistoryScrollPane;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton SquareBrushButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton TextButton;
    private javax.swing.JPanel ToolPanel;
    private javax.swing.JButton UndoButton;
    private javax.swing.JPanel colorSwatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textInput;
    private javax.swing.JButton EmotesButton;
    // End of variables declaration//GEN-END:variables
}