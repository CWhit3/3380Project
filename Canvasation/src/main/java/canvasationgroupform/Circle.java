/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvasationgroupform;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author christian_white
 */
public class Circle extends Shape{

    @Override
    public void draw(Graphics g, Point drawAt, int size) {
        g.fillOval(drawAt.x - size/2, drawAt.y - size/2, size, size);
    }
    
}
