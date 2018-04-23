/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvasationgroupform;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author christian_white
 */
public class TextBrushListener implements MouseListener{
    private Point textCoords = new Point();
    
    private void setCoords(MouseEvent e){
        textCoords.x = e.getX();
        textCoords.y = e.getY();
    }
    
    public Point getTextCoords(){
        return textCoords;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        setCoords(e);
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        setCoords(e);
    }
  
    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
   
}
