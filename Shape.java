package modele;

import vue.DrawableShape;

public class Shape {
Point center ;
public DrawableShape ds ;

public Shape(Point P) {
	center=P;
}
public Point getCenter() {
	return center;
}
}
