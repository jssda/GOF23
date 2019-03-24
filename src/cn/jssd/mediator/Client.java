/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.mediator
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午3:09:07
 * @version V1.0 
 */
package cn.jssd.mediator;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月24日 下午3:09:07
 */
public class Client {

	public static void main(String[] args) {
		Mediator m = new President();
		
		Financial f = new Financial(m);
		Develepment d = new Develepment(m);
		
		f.selfAction();
		f.OutAction();
	}
	
}
