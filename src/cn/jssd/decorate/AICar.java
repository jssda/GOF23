/**
 *
 * @Title AICar.java
 * @Prject GOF23
 * @Package cn.jssd.decorate
 * @Description TODO
 * @author jssd  
 * @date 2019年3月23日 下午7:55:14
 * @version V1.0 
 */
package cn.jssd.decorate;

/**
 * @ClassName AICar
 * @author jssd
 *
 * @date: 2019年3月23日 下午7:55:14
 */
public class AICar extends SuperCar{

	/**
	 * @Title AICar
	 * @Description TODO
	 *
	 * @param car
	 */
	public AICar(ICar car) {
		super(car);
	}

	/* (non Javadoc)
	 * @Title move
	 * @Description TODO
	 * @see cn.jssd.decorate.SuperCar#move()
	 */
	@Override
	public void move() {
		super.move();
		System.out.println("AICar.move()");
	}
	
}
