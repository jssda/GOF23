/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.adapter
 * @Description TODO
 * @author jssd  
 * @date 2019年3月22日 下午4:18:02
 * @version V1.0 
 */
package pers.jssd.adapter;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月22日 下午4:18:02
 */
public class Client {

	public static void main(String[] args) {
		Target t = new Adapter(new Adaptee());
		t.handleRequest();
	}
	
}
