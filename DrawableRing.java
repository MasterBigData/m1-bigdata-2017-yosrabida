ckage vue;
import java.awt.Graphics;

import modele.Ring;
import modele.Cercle;

public class DrawableRing extends DrawableCercle {
	public DrawableRing(Cercle s) {
		super(s);
	}


	public void draw(Graphics G) {
		super.draw(G);

	G.drawOval( (S.getCenter().getX()-((Ring)S).getRmin()),S.getCenter().getY()-((Ring)S).getRmin(),((Ring) S).getRmin()*2,((Ring) S).getRmin()*2);

	}
	}


