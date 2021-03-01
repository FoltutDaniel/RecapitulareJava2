package recapitulare2.Point;

public class MyPoint {
	private int x,y;
	public MyPoint() {
		// TODO Auto-generated constructor stub
	}
	public MyPoint(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
	}
	public double distance(MyPoint point) {
		return Math.sqrt(Math.pow(this.x-point.getX(),2)+Math.pow(this.y-point.getY(),2));
	}
}
