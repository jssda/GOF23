/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.singleton
 * @Description TODO
 * @author jssd  
 * @date 2019年3月20日 上午11:26:38
 * @version V1.0 
 */
package cn.jssd.singleton;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月20日 上午11:26:38
 */
public class Client {
	public static void main(String[] args) {
		
		//枚举单例使用
		SingletonDemo5.INSTANCE.singletonOpration();
	}
}
