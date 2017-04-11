package guoyang;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class FrameListener extends MouseAdapter {
	private Point lastPoint = null;
	private JFrame window = null;
	
	public FrameListener(JFrame window){
		this.window = window;
	}
	
	@Override
	public void mousePressed(MouseEvent e){
		lastPoint = e.getLocationOnScreen();
		//System.out.println(lastPoint);
	}
	
	@Override
	public void mouseDragged(MouseEvent e){
		//System.out.println(e);
		Point point = e.getLocationOnScreen();
		int offsetX = point.x - lastPoint.x;
		int offsetY = point.y - lastPoint.y;
		
		Rectangle bounds = window.getBounds();
		bounds.x += offsetX;
		bounds.y += offsetY;
		window.setBounds(bounds);
		lastPoint = point;
	}
}