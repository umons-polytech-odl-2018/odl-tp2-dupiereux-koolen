package exercise3;

public class Rectangle extends ConvexPolygon {
	protected Point upperLeft;
	protected Point lowerRight;
	public Rectangle(Point upperLeft, Point lowerRight){
		super(new Point[]{upperLeft,
			new Point(lowerRight.getX(), upperLeft.getY()),
			lowerRight,
			new Point(upperLeft.getX(), lowerRight.getY())});
		this.upperLeft=upperLeft;
		this.lowerRight=lowerRight;
	}

}
