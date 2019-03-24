/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.decorate
 * @Description TODO
 * @author jssd  
 * @date 2019年3月23日 下午7:56:26
 * @version V1.0 
 */
package pers.jssd.decorate;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月23日 下午7:56:26
 */
public class Client {

	public static void main(String[] args) {
		System.out.println("--------------会游又会自动走的AI汽车---------------");
		new AICar(new WaterCar(new Car())).move();
	}
	
}
