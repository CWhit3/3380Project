/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author christian_white
 */
public class Text extends Shape{
    private String str;

    public Text(String s){
        str = s;
    }
    @Override
    public void draw(Graphics g, Point drawAt, int size) {
        g.drawString(str, drawAt.x, drawAt.y);
    }

}