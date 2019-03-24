/**
 *
 * @Title Client1.java
 * @Prject GOF23
 * @Package cn.jssd.factory.factorymethod
 * @Description TODO
 * @author jssd  
 * @date 2019年3月20日 上午11:55:38
 * @version V1.0 
 */
package pers.jssd.factory.factorymethod;

/**
 * @ClassName Client1
 * @author jssd
 *
 * @date: 2019年3月20日 上午11:55:38
 */
public class Client1 {
	
	public static void main(String[] args) {
		Car audi = new AudiFactory().createCar();
		Car byd = new BydFactory().createCar();
		
		audi.run();
		byd.run();
	}
	
}
