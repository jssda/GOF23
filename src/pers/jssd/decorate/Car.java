/**
 *
 * @Title Car.java
 * @Prject GOF23
 * @Package cn.jssd.decorate
 * @Description TODO
 * @author jssd  
 * @date 2019年3月23日 下午7:52:10
 * @version V1.0 
 */
package pers.jssd.decorate;

/**
 * @ClassName Car
 * @author jssd
 *
 * @date: 2019年3月23日 下午7:52:10
 */
public class Car implements ICar {

	/* (non Javadoc)
	 * @Title move
	 * @Description TODO
	 * @see cn.jssd.decorate.ICar#move()
	 */
	@Override
	public void move() {
		System.out.println("Car.move()");
	}

}
