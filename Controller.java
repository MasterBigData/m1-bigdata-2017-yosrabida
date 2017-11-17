package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import vue.MyDisplay;

public abstract class Controller implements MouseMotionListener {
	



	private MyDisplay md;

	public Controller() {
		this.md=null;
	}
	public Controller(MyDisplay md) {
		this.md=md;
		 md.addMouseMotionListener(this);

	}
	
	
	
	


	public void mouseMoved(MouseEvent e) {
		
		this.md.w.shapes.get(0).getCenter().setX((e.getX()));
		this.md.w.shapes.get(0).getCenter().setY((e.getY()));
	this.md.repaint();
	}





	public void mouseDragged(MouseEvent e) {
	}
	}
	
	
	

