package vue;
import java.awt.Graphics;

import modele.Ring;
import modele.Shape;
public class DrawableRing extends DrawableShape {
	public DrawableRing(Shape R) {
		super(R);
	}



	public void draw(Graphics G) {

	G.drawOval( (S.getCenter().getX()),S.getCenter().getY(),((Ring) S).getRmax(),((Ring) S).getRmax());
	G.drawOval( (S.getCenter().getX()),S.getCenter().getY(),((Ring) S).getRmin(),((Ring) S).getRmin());

	}
	}

