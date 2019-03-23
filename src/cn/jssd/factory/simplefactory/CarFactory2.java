/**
 *
 * @Title CarFactory.java
 * @Prject GOF23
 * @Package cn.jssd.factory.simplefactory
 * @Description TODO
 * @author jssd  
 * @date 2019年3月20日 上午11:40:29
 * @version V1.0 
 */
package cn.jssd.factory.simplefactory;

/**
 * 汽车简单工厂类  实现方式二
 * 
 * @ClassName CarFactory
 * @author jssd
 *
 * @date: 2019年3月20日 上午11:40:29
 */
public class CarFactory2 {
	
	public static Car createAudi() {
			return new Audi();
	}
	
	public static Car createByd() {
			return new Byd();
	}
	
}
