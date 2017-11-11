package modele;

import java.awt.Dimension;

import javax.swing.JFrame;

import vue.MyDisplay;

public class Test {
	public static void main(String []args){
		

		JFrame frame=new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Point P1= new Point(100,50);
		Cercle C1= new Cercle(P1,200);
		Point P2= new Point(300,300);
		Cercle C2= new Cercle(P2,100);
		
		World w = new World();
		w.shapes.add(C1);
		w.shapes.add(C2);

		MyDisplay d=new MyDisplay(w);
		
		w.addObserver(d);
		frame.add(d);
	}

}
