package bendavisnc.gmail.common.math;


import android.graphics.PointF;

import org.junit.Test;

import bendavisnc.gmail.common.math.BasicLinearAlgebra;

import static junit.framework.Assert.assertEquals;

public class BasicLinearAlgebraTests {

	@Test
	public void toRadians() throws Exception {
		assertEquals(
			BasicLinearAlgebra.toRadians(180),
			(float)Math.PI);
	}

	@Test
	public void translate() throws Exception {
		assertEquals(
			BasicLinearAlgebra.translate(new PointF(2f, 3f), 4f, 5f),
			new PointF(6f, 8f));
	}

	@Test
	public void rotateAroundOrigin() throws Exception {
		assertEquals(
			BasicLinearAlgebra.rotate(new PointF(0.5f, 0.6f), 180),
			new PointF(-0.50000006f, -0.59999996f));
	}

	@Test
	public void rotate() throws Exception {
		assertEquals(
			BasicLinearAlgebra.rotate(new PointF(0.5f, 1.5f), 45, new PointF(2, 3)),
			new PointF(-0.12132025f, 3.0f));
	}
}


