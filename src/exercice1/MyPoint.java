package exercice1;

public class MyPoint {
	//propriétes
	private int x = 0;
	private int y = 0;
	
	//constructeur sans parametre
	public MyPoint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//constructeur avec parametre
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//getters et setters
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
	
	public int[] getXY() {
		return new int[] {
				this.x, this.y
		};
		
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	


	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}

	
	public double distance(int x, int y) {
		double dist = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
		return dist;
	
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPoint p1 = new MyPoint(3, 4);
		System.out.println(p1.distance(5, 6));

	}


}
