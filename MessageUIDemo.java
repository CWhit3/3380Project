import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import javax.swing.*;
/**
 *
 * @author Michael Christian White
 */

public class Canvasation {
	
	//FIELDS START
		
	//COMPONENTS
	private JFrame frame             = new JFrame();					//frame containing components
	private JPanel panel             = new JPanel();					//panel which components are added to
	private JPanel drawingPane       = new JPanel();				    //canvas (i.e. drawing area)
	private JTextField textContainer = new JTextField();				//text container for typing input
	
	private Color current            = Color.BLACK;					    //current brush color
	private boolean isClicking       = false;						    //boolean for whether currently clicking to draw
	private boolean isTextSelected   = false;							//text button toggle
	private boolean isDrawSelected   = false;							//draw button toggle
    
    
    //FIELDS END
	
    /**
     * sets up all message creation frame components at correct locations
     */
    private void setup(){
        frame.setSize(500, 500);							//frame size
        frame.setVisible(true);								//frame is visible
        
        panel.setSize(500, 500);							//fill JFrame
        panel.setVisible(true);								//panel is visible
        frame.add(panel);									//panel added to frame as primary component
        
        //START DRAWING AREA/CANVAS
        panel.add(drawingPane);
        drawingPane.setSize(400, 475);
        drawingPane.setLocation(100, 25);
        drawingPane.setBackground(Color.LIGHT_GRAY);
        drawingPane.setVisible(true);
        //END DRAWING AREA/CANVAS
        
        //START TEXT AREA
        drawingPane.add(textContainer);
        textContainer.setOpaque(false);
        textContainer.setVisible(true);
        textContainer.setEnabled(false);
        textContainer.setSize(400, 475);
        //END TEXT AREA
        
        //START DRAWING TOGGLE BUTTON
        JButton drawToggle = new JButton("Draw");
        panel.add(drawToggle);
        drawToggle.setLocation(0, 200);
        drawToggle.setSize(75, 25);
        drawToggle.setVisible(true);
        drawToggle.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				isDrawSelected = true;	
				isTextSelected = false;
			} 	
        });
        //END DRAWING TOGGLE BUTTON
        
        //START TYPING TOGGLE BUTTON
        JButton textToggle = new JButton("Type");
        panel.add(textToggle);
        textToggle.setLocation(0, 225);
        textToggle.setSize(75, 25);
        textToggle.setVisible(true);
        textToggle.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				isTextSelected = true;	
				textContainer.setEnabled(isTextSelected);
				isDrawSelected = false;
			} 	
        });
        //END TYPING TOGGLE BUTTON
        
        //START EXIT BUTTON
        JButton exit = new JButton("X");
        panel.add(exit);
        exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }   
        });
        exit.setLocation(475, 0);
        exit.setSize(25, 25);							
        exit.setVisible(true);
        //END EXIT BUTTON
        
        //START COLOR SWATCH LABEL "CURRENT COLOR"
        JLabel colorLabel = new JLabel("Current Color");
        panel.add(colorLabel);
        colorLabel.setLocation(0, 425);
        colorLabel.setVisible(true);
        colorLabel.setSize(100, 25);
        //END COLOR SWATCH LABEL "CURRENT COLOR"
        
        //START COLOR SWATCH
        JPanel colorDisplay = new JPanel();
        panel.add(colorDisplay);
        colorDisplay.setBackground(current);
        colorDisplay.setVisible(true);
        colorDisplay.setLocation(0, 450);
        colorDisplay.setSize(100,  50);
        //END COLOR SWATCH
        
        //START COLOR SWATCH BUTTON OVERLAY TO OPEN CHOOSER BY CLICKING COLOR
        JButton colorButtonOverlay = new JButton(" ");
        colorButtonOverlay.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				current = JColorChooser.showDialog(panel, "Select a color", Color.black);	
				System.out.println("Color selected: " + current.toString());
				colorDisplay.setBackground(current);
			}	
        });
        colorButtonOverlay.setOpaque(false);
        colorButtonOverlay.setVisible(true);
        colorButtonOverlay.setLocation(0, 450);
        colorButtonOverlay.setSize(100,  50);
        //END COLOR SWATCH BUTTON OVERLAY
        
        //START "COLOR SELECTOR" BUTTON
        JButton colorPalette = new JButton("Color Selector");
        panel.add(colorPalette);
        colorPalette.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				current = JColorChooser.showDialog(panel, "Select a color", Color.black);	
				System.out.println(current.toString());
				colorDisplay.setBackground(current);
			}	
        });
        colorPalette.setLocation(0, 0);
        colorPalette.setSize(100, 20);
        colorPalette.setVisible(true);
        //END "COLOR SELECTOR" BUTTON
        
        //LISTENERS
        
        //START MOUSE LISTENER CONTROLLING WHETHER DRAWING IS DONE
        drawingPane.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				Point p = drawingPane.getMousePosition();
				JPanel dot = new JPanel();
				drawingPane.add(dot);
				dot.setLocation(p.x, p.y);
				dot.setBackground(current);
				dot.setSize(5, 5);
				dot.setVisible(true);
				drawingPane.add(dot);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				isClicking = true;
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				isClicking = false;
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
        	
        });
        //END MOUSE LISTENER FOR CLICKING
         
        //START MOUSE MOTION LISTENER THAT, IF USER IS CLICKING, DRAWS SHAPES ALONG USER MOUSE PATH
        drawingPane.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent e) {
				//TODO: STREAMLINE INTO STROKE CLASS TO BE PUT IN A STACK TO IMPLEMENT "UNDO" FEATURE
				if(isClicking && isDrawSelected){
					Point p = drawingPane.getMousePosition();
					JPanel dot = new JPanel();
					drawingPane.add(dot);
					dot.setLocation(p.x, p.y);
					dot.setBackground(current);
					dot.setSize(5, 5);
					dot.setVisible(true);
					drawingPane.add(dot);
					System.out.println(p.x + " " + p.y);
				}
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				
			}
        	
        });
        //END MOUSE MOTION LISTENER
        
        //START KEYBOARD LISTENER
        drawingPane.addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e) {
				if(isTextSelected){
					textContainer.setEnabled(true);
					textContainer.setHorizontalAlignment(JTextField.LEFT);
					textContainer.setText(textContainer.getText() + e.getKeyChar());
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				textContainer.setEnabled(false);	
			}
        	
        });
        //END KEYBOARD LISTENER
        
    }
    
    public static void main(String[] args) {
        Canvasation message = new Canvasation();
        message.setup();
    }
    
}
