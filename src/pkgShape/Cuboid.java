package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	private int iDepth;

	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
	}
	// getters and setters
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	public double volume() {
		return getiWidth() * getiLength() * iDepth;
	}

	@Override
//Surface area= 2*(width*length +width*depth +depth*length)
	public double area() {
		return (2 * (getiWidth() * getiLength() + getiWidth() * iDepth + iDepth * getiLength()));
	}

	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("Invalid perimeter for cuboid");
	}
}

//sorting by area in ascending order (smallest --> largest)
class SortByArea implements Comparator<Cuboid> {

	@Override
	public int compare(Cuboid o1, Cuboid o2) {
		return (int) (o1.area() - o2.area());
	}

}

//sorting by volume in ascending order (smallest --> largest)
class SortByVolume implements Comparator<Cuboid> {

	@Override
	public int compare(Cuboid o1, Cuboid o2) {
		return (int) (o1.volume() - o2.volume());
	}

}
