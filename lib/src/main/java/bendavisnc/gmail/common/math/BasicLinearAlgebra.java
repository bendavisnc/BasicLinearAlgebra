package bendavisnc.gmail.common.math;


import android.graphics.PointF;

/**
 * A utils class that adds basic linear algebra functions.
 */
public class BasicLinearAlgebra {

	/**
	 * @param p The point to translate
	 * @param dx The translation amount along the x axis
	 * @param dy The translation amount along the y axis
	 * @return The resulting translated point
	 */
	public static PointF translate(PointF p, float dx, float dy) {
		return new PointF(p.x + dx, p.y + dy);
	}

	/**
	 * @param degrees The amount in degrees
	 * @return The amount in radians
	 */
	public static float toRadians(float degrees) {
		return (float) (degrees * (Math.PI / 180));
	}

	/**
	 * @param p The point to rotate
	 * @param degrees The degrees of rotation
	 * @param pivot The pivot point of rotation
	 * @return The resulting rotated point
	 */
	public static PointF rotate(PointF p, float degrees, PointF pivot) {
		PointF p1 = translate(p, pivot.x * -1, pivot.y * -1);
		PointF p2 = rotate(p1, degrees);
		return translate(p2, pivot.x, pivot.y);
	}

	/**
	 * @param p The point to rotate (about the origin)
	 * @param degrees The degrees of rotation
	 * @return The resulting rotated point
	 */
	public static PointF rotate(PointF p, float degrees) {
		final float theta = toRadians(degrees);
		return new PointF(
			((float)((p.x * Math.cos(theta)) + (p.y * Math.sin(theta)))),
			((float)((p.x * Math.sin(theta) * -1) + (p.y * Math.cos(theta)))));
	}

}
