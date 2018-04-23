/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvasationgroupform;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

/**
 *
 * @author christian_white
 */
public class Square extends Shape{

    @Override
    public void draw(Graphics g, Point drawAt, int size, Color c) {
        g.setColor(c);
        g.fillRect(drawAt.x - size/2, drawAt.y - size/2, size, size);
    }
    
}
