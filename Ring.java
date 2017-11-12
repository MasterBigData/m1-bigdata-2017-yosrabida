package modele;

import vue.DrawableRing;


public class Ring extends Cercle{
public int Rmin;
public int Rmax;

public Ring(Point p , int Rmax, int Rmin)
{
	
super (p,Rmax);
this.Rmin=Rmin;
this.Rmax=Rmax;
ds=new DrawableRing(this);

}
public Ring() {
	this(null,0,0);
}

public Point getCenter() {
	return center;
}
public int getRmax() {
	return Rmax;
}
public int getRmin() {
	return Rmin;
}
public String ToString (Ring A){
	return (A.getCenter()+","+A.getRmax()+","+A.getRmin());
}
public boolean contains(Point p) {
	if (Math.sqrt(Math.pow(p.getX()-this.center.getX(),2)+Math.pow(p.getY()-this.center.getY(), 2))==this.Rmax) {
		return true;
	}
	return false;
}
}



