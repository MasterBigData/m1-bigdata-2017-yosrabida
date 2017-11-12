package vue;
import java.awt.Graphics;

import modele.Ring;
import modele.Cercle;

public class DrawableRing extends DrawableCercle {
	public DrawableRing(Cercle s) {
		super(s);
	}


	public void draw(Graphics G) {
		super.draw(G);

	G.drawOval( (S.getCenter().getX()),S.getCenter().getY(),((Ring) S).getRmin(),((Ring) S).getRmin());

	}
	}


