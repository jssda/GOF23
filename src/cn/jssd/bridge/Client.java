/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.bridge
 * @Description TODO
 * @author jssd  
 * @date 2019年3月23日 下午4:06:51
 * @version V1.0 
 */
package cn.jssd.bridge;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月23日 下午4:06:51
 */
public class Client {

	public static void main(String[] args) {
		Computer c = new Desktop(new Dell());
		c.sale();
	}
	
}
