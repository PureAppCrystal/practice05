package prob6;

public class RectTriangle extends Shape  {


	public RectTriangle ( int width, int height ) {
		super.setWidth(width);
		super.setHeight(height);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return ( super.getHeight() * super.getWidth() * 0.5 );
	}

	@Override
	public double getPerimeter() {
		double height = super.getHeight();
		double width  = super.getWidth();
		double side   = Math.sqrt( ( Math.pow(height, 2) + Math.pow(width, 2) ) );
		
		return height + width + side;
	}

}
