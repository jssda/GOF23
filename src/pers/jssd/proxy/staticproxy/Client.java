/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.proxy.staticproxy
 * @Description TODO
 * @author jssd  
 * @date 2019年3月22日 下午6:38:35
 * @version V1.0 
 */
package pers.jssd.proxy.staticproxy;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月22日 下午6:38:35
 */
public class Client {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		Star proxyStar = new ProxyStar(realStar);
		
		proxyStar.bookTicket();
		proxyStar.collectMoney();
		proxyStar.confer();
		proxyStar.signContract();
		proxyStar.sing();
	}
}
