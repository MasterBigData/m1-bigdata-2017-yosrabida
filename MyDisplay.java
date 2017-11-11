package vue;

import java.awt.Graphics;
import java.util.*;

import javax.swing.*;

import modele.World;
public class MyDisplay extends JPanel implements Observer{
	World w = new World();
	
	public MyDisplay(World w) {
		this.w=w;}
protected void paintComponent(Graphics G) {for(int i=0; i<w.shapes.size();i++) {
	
	w.shapes.get(i).ds.draw(G);
	
}
	}

public void update(Observable o, Object arg){

}


}