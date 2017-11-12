package vue;
import java.awt.Graphics;

import modele.Ring;
import modele.Cercle;
public class DrawableRing extends DrawableCercle {
	public DrawableRing(Cercle s) {
		super(s);
	}



	public void draw(Graphics G) {

	G.drawOval( (S.getCenter().getX()),S.getCenter().getY(),((Ring) S).getRmax(),((Ring) S).getRmax());
	G.drawOval( (S.getCenter().getX()),S.getCenter().getY(),((Ring) S).getRmin(),((Ring) S).getRmin());

	}
	}
