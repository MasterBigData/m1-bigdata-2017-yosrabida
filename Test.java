package modele;

import java.awt.Dimension;


import javax.swing.JFrame;

import vue.MyDisplay;


public class Test {
	public static void main(String []args){
		

		JFrame frame=new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		
		
		Point P1= new Point(100,50);
		Point P2= new Point(300,300);
		Cercle C1= new Cercle(P1,200);
		Cercle C2= new Cercle(P1,400);

		Ring R1= new Ring(P1,300,200);
		Ring R2=new Ring(P2,200,170);
		World w = new World();
        w.shapes.add(C1);
        w.shapes.add(C2);
        w.shapes.add(R1);
        w.shapes.add(R2);
		MyDisplay d=new MyDisplay(w);
		
			MyDisplay d=new MyDisplay(w);
		Controller mc=new Controller(d);
			  

		
		w.addObserver(d);
		frame.add(d);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
