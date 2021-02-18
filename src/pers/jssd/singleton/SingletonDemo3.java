package pers.jssd.singleton;

/**
 * 双重检测机制
 *
 * @author jssd
 * @version v2.0 2021-02-18 16:17:05
 * @date 2019年3月19日 下午10:44:30
 */
public class SingletonDemo3 {

	private static volatile SingletonDemo3 instance;

	private SingletonDemo3() {
	}

	public static SingletonDemo3 getInstance() {
		if (instance == null) {
			synchronized (SingletonDemo3.class) {
				if (instance == null) {
					instance = new SingletonDemo3();
				}
			}
		}
		return instance;
	}
}