/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package pers.jssd.state
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午6:21:03
 * @version V1.0 
 */
package pers.jssd.state;

/**
 * 状态模式， 测试
 * 
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月24日 下午6:21:03
 */
public class Client {

	public static void main(String[] args) {
		Context c = new Context(new FreeState());
		c = new Context(new BookedState());
	}
	
}
