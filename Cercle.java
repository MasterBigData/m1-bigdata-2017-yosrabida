package modele;

import vue.DrawableCercle;

public class Cercle extends Shape {
	
int rayon ;

public Cercle (Point p,int rayon) {
super(p);
this.rayon=rayon;
ds=new DrawableCercle(this);
}


public Cercle() {
	this(null,0);
}

public int getRayon() {
	return rayon;
}
public String ToString (){
	return (this.getCenter()+","+this.getRayon()+","+this.surface());
}

public double surface() {
	double s=getRayon()*getRayon()*3.14;
	return s;
}
public boolean contains(Point p) {
	if (Math.sqrt(Math.pow(p.getX()-this.center.getX(),2)+Math.pow(p.getY()-this.center.getY(), 2))==this.rayon) {
		return true;
	}
	return false;
}



}
