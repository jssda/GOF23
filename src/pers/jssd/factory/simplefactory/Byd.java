/**
 *
 * @Title Byd.java
 * @Prject GOF23
 * @Package cn.jssd.factory.simplefactory
 * @Description TODO
 * @author jssd  
 * @date 2019年3月20日 上午11:37:29
 * @version V1.0 
 */
package pers.jssd.factory.simplefactory;

/**
 * @ClassName Byd
 * @author jssd
 *
 * @date: 2019年3月20日 上午11:37:29
 */
public class Byd implements Car {

	/* (non Javadoc)
	 * @Title run
	 * @Description TODO
	 * @see cn.jssd.factory.simplefactory.Car#run()
	 */
	@Override
	public void run() {
		System.out.println("Byd 再跑");
	}

}
