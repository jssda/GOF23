/**
 *
 * @Title Audi.java
 * @Prject GOF23
 * @Package cn.jssd.factory.simplefactory
 * @Description TODO
 * @author jssd  
 * @date 2019年3月20日 上午11:37:29
 * @version V1.0 
 */
package cn.jssd.factory.simplefactory;

/**
 * @ClassName Audi
 * @author jssd
 *
 * @date: 2019年3月20日 上午11:37:29
 */
public class Audi implements Car {

	/* (non Javadoc)
	 * @Title run
	 * @Description TODO
	 * @see cn.jssd.factory.simplefactory.Car#run()
	 */
	@Override
	public void run() {
		System.out.println("Audi 再跑");
	}

}
