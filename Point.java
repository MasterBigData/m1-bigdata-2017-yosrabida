package modele;

public class Point {
	
		private  int x;
		private  int y ;
	public Point() {
	x=0;
	y=0;
	}
		public static void main() {
			Point p=new Point();
			System.out.println(p.x+" "+p.y);
		}	
		
	
		
		public Point(int x , int y) {
			int som=0 ;
			
			this.x=x;
			this.y=y;
			som=som++;
		}
	
		
		
	public Point (Point p) {
		this(p.x,p.y);
	}
	
	public String ToString() {
		return ( "("+ x +","+y+")" );
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
	

