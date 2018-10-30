package pkgShape;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testShape {

	@Test
	// Test Rectangle
	void RecTest() {
		Rectangle myrectangle = new Rectangle(3, 2);

		// Test getter methods
		assertEquals(myrectangle.getiLength(), 2);
		assertEquals(myrectangle.getiWidth(), 3);
		//Test setter methods
		myrectangle.setiWidth(2);
		myrectangle.setiLength(3);

		// Test area()
		assertEquals(myrectangle.area(), 6);

		// Test perimeter
		assertEquals(myrectangle.perimeter(), 10);

		// Test compareTo(Object)
		// ensure rectangles are being sorted correctly
		Rectangle[] myrectangles = { new Rectangle(2, 2), new Rectangle(4, 6) };

		Arrays.sort(myrectangles);

	}

	// Test Cuboid
	@Test
	void CuboidTest() {
		Cuboid cube = new Cuboid(2, 2, 2);

		// Test getter/setter methods
		assertEquals(cube.getiLength(), 2);
		assertEquals(cube.getiWidth(), 2);
		assertEquals(cube.getiDepth(), 2);

		cube.setiWidth(4);
		cube.setiLength(4);
		cube.setiDepth(4);

		// Test area()
		assertEquals(cube.area(), 96);

		// Testing perimeter exception method (lambda expression)
		Assertions.assertThrows(UnsupportedOperationException.class, () -> cube.perimeter());

		// Test volume
		assertEquals(cube.volume(), 64);

		// Test SortByArea
		ArrayList<Cuboid> cubes = new ArrayList<Cuboid>();
		cubes.add(new Cuboid(1,1,1));
		cubes.add(new Cuboid(2,2,2));

		Collections.sort(cubes, new SortByArea());

		// Test SortByVolume
		cubes.set(0, new Cuboid(2, 2, 2));
		cubes.set(1, new Cuboid(1, 1, 1));

		Collections.sort(cubes, new SortByVolume());
	}

}
