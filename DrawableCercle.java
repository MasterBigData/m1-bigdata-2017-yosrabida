package vue;
import java.awt.Graphics;
import java.awt.Shape;

import modele.Cercle;

public class DrawableCercle extends DrawableShape {
public DrawableCercle(Shape s) {
	super((Cercle) s);
}
public DrawableCercle(Cercle C) {
	super((Cercle) C);
}


public void draw(Graphics G) {

	G.drawOval( ((Cercle) S).getCenter().getX(),((Cercle) S).getCenter().getY(),((Cercle) S).getRayon(),((Cercle) S).getRayon());
}
}