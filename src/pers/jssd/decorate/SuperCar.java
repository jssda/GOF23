/**
 *
 * @Title SuperCar.java
 * @Prject GOF23
 * @Package cn.jssd.decorate
 * @Description TODO
 * @author jssd
 * @date 2019年3月23日 下午7:53:06
 * @version V1.0
 */
package pers.jssd.decorate;

/**
 * 装饰器汽车
 * 
 * @ClassName SuperCar
 * @author jssd
 *
 * @date: 2019年3月23日 下午7:53:06
 */
public class SuperCar implements ICar {

	protected ICar car;

	/**
	 * @Title SuperCar
	 * @Description TODO
	 *
	 * @param car
	 */
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	/*
	 * (non Javadoc)
	 * @Title move
	 * @Description TODO
	 * @see cn.jssd.decorate.ICar#move()
	 */
	@Override
	public void move() {
		car.move();
	}

}
