/**
 *
 * @Title Coordinate.java
 * @Prject GOF23
 * @Package cn.jssd.flyweight
 * @Description TODO
 * @author jssd
 * @date 2019年3月23日 下午9:02:33
 * @version V1.0
 */
package cn.jssd.flyweight;

/**
 * @ClassName Coordinate
 * @author jssd
 *
 * @date: 2019年3月23日 下午9:02:33
 */
public class Coordinate {

	private int x;
	private int y;

	/**
	 * @Title Coordinate
	 * @Description TODO
	 *
	 * @param x
	 * @param y
	 */
	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public final int getX() {
		return x;
	}

	public final int getY() {
		return y;
	}

	public final void setX(int x) {
		this.x = x;
	}

	public final void setY(int y) {
		this.y = y;
	}

}
