/**
 *
 * @Title SingletonDemo1.java
 * @Prject GOF23
 * @Package cn.jssd.singleton
 * @Description TODO
 * @author jssd
 * @date 2019年3月19日 下午10:33:42
 * @version V1.0
 */
package cn.jssd.singleton;

/**
 * 恶汉式单例模式 类初始化时候加载对象，执行效率高， 不能延时加载
 * 
 * @ClassName SingletonDemo1
 * @author jssd
 *
 * @date: 2019年3月19日 下午10:33:42
 */
public class SingletonDemo1 {

	private static SingletonDemo1 instance = new SingletonDemo1();

	/**
	 * 私有化构造方法
	 * @Title SingletonDemo1
	 * @Description TODO
	 *
	 */
	private SingletonDemo1 (){
	}
	
	public static SingletonDemo1 getInstance() {
		return instance;
	}
	
}
