/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.proxy.dynamicproxy
 * @Description TODO
 * @author jssd
 * @date 2019年3月22日 下午7:42:59
 * @version V1.0
 */
package pers.jssd.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月22日 下午7:42:59
 */
public class Client {

	public static void main(String[] args) {
		Star star = new RealStar();
		StarHandler handler = new StarHandler(star);
		
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, handler);
		
		proxy.sing();
	}

}
