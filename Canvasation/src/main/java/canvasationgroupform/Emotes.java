package canvasationgroupform;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
public class Emotes {
    //Initializes all the buttons onto PopupMenu
    public JButton setButton(String emote, JPanel DrawPanel) {
        JButton button = new JButton();
        ImageIcon icon = new ImageIcon(getClass().getResource("/canvasationgroupform/"+emote+".png"));
        Image image = icon.getImage();
        Image newimage = image.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimage);
        button.setIcon(icon);
        button.setSize(80, 80);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt, emote, DrawPanel);
            }
        });
        return button;
    }
    //When a PopupMenu button is clicked
    public void buttonActionPerformed(java.awt.event.ActionEvent evt, String emote, JPanel DrawPanel) {
        placeEmote(emote, DrawPanel);
    }
    //Places the emote selected onto the canvas
    public void placeEmote(String emote, JPanel DrawPanel) {
        JLabel label = new JLabel((Icon) new ImageIcon(getClass().getResource("/canvasationgroupform/"+emote+".png")));
        label.setSize(50, 50);
        label.setLocation(DrawPanel.getX()+300, DrawPanel.getY()+10);
        DrawPanel.add(label);
        DrawPanel.repaint(new Rectangle(DrawPanel.getX() + 300, DrawPanel.getY() + 10, 50, 50));
        label.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                labelMouseDragged(evt, label, DrawPanel);
            }
        });
    }
    //Ability to drag the emote across the canvas
    public int mouseX = 0;
    public int mouseY = 0;
    public void labelMouseDragged(java.awt.event.MouseEvent evt, JLabel label, JPanel DrawPanel) {
        mouseX = MouseInfo.getPointerInfo().getLocation().x - DrawPanel.getLocationOnScreen().x - (label.getWidth()/2);
        mouseY = MouseInfo.getPointerInfo().getLocation().y - DrawPanel.getLocationOnScreen().y - (label.getHeight()/2);
        label.setBounds(mouseX, mouseY, 100, 50);
    }
}
