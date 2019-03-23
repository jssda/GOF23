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
 * 枚举实现单例模式
 * 
 * @ClassName SingletonDemo1
 * @author jssd
 *
 * @date: 2019年3月19日 下午10:33:42
 */
public enum SingletonDemo5 {

	INSTANCE;

	//功能操作
	public void singletonOpration() {
		System.out.println("Hello World");
	}
	
}
