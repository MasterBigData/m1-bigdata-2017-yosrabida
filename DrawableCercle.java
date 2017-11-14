package vue;
import java.awt.Graphics;

import modele.Cercle;
import modele.Shape;
public class DrawableCercle extends DrawableShape {
public DrawableCercle(Shape s) {
	super(s);
}







public void draw(Graphics G) {

G.drawOval( (S.getCenter().getX()-((Cercle) S).getRayon()),S.getCenter().getY()-((Cercle) S).getRayon(),((Cercle) S).getRayon()*2,((Cercle) S).getRayon()*2);
}
}
