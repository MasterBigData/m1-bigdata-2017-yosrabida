package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import vue.MyDisplay;

public abstract class Controller implements MouseMotionListener {
	



	private MyDisplay md;

	public Controller(MyDisplay md) {
		this.md=md;
		 md.addMouseMotionListener(this);

	}
	
	
	
	


	public void mouseMoved(MouseEvent e) {
		
		md.getX().get(0)=e.getX();
		md.getY().get(0)=e.getY();

	}
	
	
	public void mouseDragged(MouseEvent e) {
	}
	}
	
	
	


