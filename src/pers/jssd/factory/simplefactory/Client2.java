/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.factory.simplefactory
 * @Description TODO
 * @author jssd
 * @date 2019年3月20日 上午11:39:02
 * @version V1.0
 */
package pers.jssd.factory.simplefactory;

/**
 * 使用工厂类情况
 * 
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月20日 上午11:39:02
 */
public class Client2 {
	public static void main(String[] args) {
		Car audi = CarFactory1.createCar("奥迪");
		Car byd = CarFactory1.createCar("比亚迪");

		audi.run();
		byd.run();
	}
}
