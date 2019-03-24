/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.command
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午3:29:29
 * @version V1.0 
 */
package cn.jssd.command;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月24日 下午3:29:29
 */
public class Client {

	public static void main(String[] args) {
		Command c = new ConcrateCommand(new Reciver());
		new Invoke(c).Call();;
	}
	
}
