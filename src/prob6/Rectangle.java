package prob6;

public class Rectangle extends Shape implements Resizable {

	
	public Rectangle ( int width, int height ) {
		super.setWidth(width);
		super.setHeight(height);
	}
	
	
	
	@Override
	public void resize(double d) {
		super.setHeight( super.getHeight() * d );
		super.setWidth( super.getWidth() * d );

	}

	@Override
	public double getArea() {
		return ( super.getHeight() * super.getWidth() );
	}

	@Override
	public double getPerimeter() {
		return ( (super.getHeight() * 2 ) + ( super.getWidth() * 2 ) ) ;
	}

}
