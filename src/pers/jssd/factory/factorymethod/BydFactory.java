/**
 *
 * @Title BydFactory.java
 * @Prject GOF23
 * @Package cn.jssd.factory.factorymethod
 * @Description TODO
 * @author jssd  
 * @date 2019年3月20日 上午11:54:15
 * @version V1.0 
 */
package pers.jssd.factory.factorymethod;

/**
 * @ClassName BydFactory
 * @author jssd
 *
 * @date: 2019年3月20日 上午11:54:15
 */
public class BydFactory implements CarFactory{

	/* (non Javadoc)
	 * @Title createCar
	 * @Description TODO
	 * @return
	 * @see cn.jssd.factory.factorymethod.CarFactory#createCar()
	 */
	@Override
	public Car createCar() {
		return new Byd();
	}

}
