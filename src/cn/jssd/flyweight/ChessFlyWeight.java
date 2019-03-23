/**
 *
 * @Title ChessFlyWeight.java
 * @Prject GOF23
 * @Package cn.jssd.flyweight
 * @Description TODO
 * @author jssd  
 * @date 2019年3月23日 下午9:00:56
 * @version V1.0 
 */
package cn.jssd.flyweight;

/**
 * @ClassName ChessFlyWeight
 * @author jssd
 *
 * @date: 2019年3月23日 下午9:00:56
 */
public class ChessFlyWeight implements FlyWeight {

	private String color;

	/**
	 * @Title ChessFlyWeight
	 * @Description TODO
	 *
	 * @param color
	 */
	public ChessFlyWeight(String color) {
		super();
		this.color = color;
	}
	
	/* (non Javadoc)
	 * @Title display
	 * @Description TODO
	 * @see cn.jssd.flyweight.FlyWeight#display()
	 */
	@Override
	public void display(Coordinate c) {
		System.out.println("x = " + c.getX() + ", y = " + c.getY());
	}

	/* (non Javadoc)
	 * @Title getColor
	 * @Description TODO
	 * @see cn.jssd.flyweight.FlyWeight#getColor()
	 */
	@Override
	public String getColor() {
		return color;
	}

}
