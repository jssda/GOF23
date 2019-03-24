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
package pers.jssd.singleton;

/**
 * 懒汉式单例模式 类初始化时候不加载对象，需要同步， 执行效率低
 * 
 * @ClassName SingletonDemo1
 * @author jssd
 *
 * @date: 2019年3月19日 下午10:33:42
 */
public class SingletonDemo2 {

	private static SingletonDemo2 instance;

	/**
	 * 私有化构造方法
	 * 
	 * @Title SingletonDemo1
	 * @Description TODO
	 *
	 */
	private SingletonDemo2() {
	}

	/**
	 * 需要同步， 可延迟
	 * @Title getInstance
	 * @Description TODO
	 * @return
	 * @return SingletonDemo2
	 */
	public synchronized static SingletonDemo2 getInstance() {

		if (instance == null) {
			instance = new SingletonDemo2();
		}

		return instance;
	}

}
