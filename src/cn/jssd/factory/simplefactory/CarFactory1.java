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
 * 汽车简单工厂类 
 * 也称为静态工厂类, 局限: 违反开闭原则, 添加实例时候,需要修改代码
 * 
 * @ClassName CarFactory
 * @author jssd
 *
 * @date: 2019年3月20日 上午11:40:29
 */
public class CarFactory1 {
	
	public static Car createCar(String type) {
		if("奥迪".equals(type)) {
			return new Audi();
		}
		
		if("比亚迪".equals(type)) {
			return new Byd();
		}
		
		return null;
	}
	
}
