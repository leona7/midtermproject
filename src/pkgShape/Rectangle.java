package pkgShape;

public class Rectangle extends Shape implements Comparable {
	private int iWidth;
	private int iLength;

	public Rectangle(int iWidth, int iLength) {
		super();
		this.iWidth = iWidth;
		this.iLength = iLength;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}

//sorts the rectangles in order of smallest to largest by area
	@Override
	public int compareTo(Object o) {
		return (int) (this.area() - ((Rectangle) o).area());
	}

	@Override
	public double area() {
		return iWidth * iLength;
	}

	@Override
	public double perimeter() {
		return (2 * iWidth + 2 * iLength);
	}
}
