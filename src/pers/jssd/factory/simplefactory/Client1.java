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
 * 未用工厂情况
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月20日 上午11:39:02
 */
public class Client1 {
	public static void main(String[] args) {
		Car audi = new Audi();
		Car byd = new Byd();
		
		audi.run();
		byd.run();
	}
}
