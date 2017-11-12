
package modele;

import vue.DrawableRing;
public class Ring extends Cercle{
public int Rmin;

public Ring(Point p, int Rmax ,int Rmin)
{
	
super (p,Rmax);
this.Rmin=Rmin;
ds=new DrawableRing(this);

}
public Ring() {
	this(null,0,0);
}

public Point getCenter() {
	return center;
}

public int getRmin() {
	return Rmin;
}
}



