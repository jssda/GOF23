/**
 *
 * @Title WaterCar.java
 * @Prject GOF23
 * @Package cn.jssd.decorate
 * @Description TODO
 * @author jssd  
 * @date 2019年3月23日 下午7:54:17
 * @version V1.0 
 */
package cn.jssd.decorate;

/**
 * @ClassName WaterCar
 * @author jssd
 *
 * @date: 2019年3月23日 下午7:54:17
 */
public class WaterCar extends SuperCar{

	/**
	 * @Title WaterCar
	 * @Description TODO
	 *
	 * @param car
	 */
	public WaterCar(ICar car) {
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
		System.out.println("WaterCar.move()");
	}

}
