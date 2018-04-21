/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author christian_white
 */
public class JPanelToBufferedImageConverter {

    /**
     * Converts the panel into a BufferedImage
     * to be displayed in the HistoryScrollPane and stored in Firebase
     * @param panel: panel to be converted to a BufferedImage
     * @return: BufferedImage of user's drawing to be sent
     */
    public BufferedImage convertToBI(JPanel panel){
        //Get top-left coordinate of drawPanel w/ respect to screen
        Point p = panel.getLocationOnScreen();

        //Get the region with width and height of panel and 
        // starting coordinates of p.x and p.y
        Rectangle region = panel.getBounds();
        region.x = p.x;
        region.y = p.y;

        //Get screen capture over the area of region
        BufferedImage bi = null;
        try {
            bi = new Robot().createScreenCapture( region );
        } catch (AWTException ex) {
            Logger.getLogger(FrontEnd.class.getName()).log(Level.SEVERE, null, ex);
        }

        return bi;
    }
}