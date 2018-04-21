/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvasationgroupform;

import java.awt.Point;
import java.util.Stack;

/**
 *
 * @author christian_white
 */
public class Stroke {
    private Stack<Shape> points = new Stack();
    private Stack<Point> coords = new Stack();
    
    public Stroke(Shape s, Point p){
        points.push(s);
        coords.push(p);
    }
    
    public Stack<Shape> getPointsAfterUndo(){
        return points;
    }
    public Stack<Point> getCoordsAfterUndo(){
        return coords;
    }
    
    
}
