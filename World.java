package modele;

import java.util.*;


public class World extends Observable { 
	public ArrayList<Shape> shapes = new ArrayList<Shape>();
	
	public void add(Shape s) {
		shapes.add(s);

		notifyObservers();
	}}
