package cn.jssd.singleton;

/**
 * 双重检测机制， 工作不常用， 有时候会失灵
 * 
 * @ClassName SingletonDemo3
 * @author jssd
 *
 * @date: 2019年3月19日 下午10:44:30
 */
public class SingletonDemo3 {

	private static SingletonDemo3 instance;

	private SingletonDemo3() {
	}

	public static SingletonDemo3 getInstance() {
		if (instance == null) {
			SingletonDemo3 sc;
			synchronized (SingletonDemo3.class) {
				sc = instance;
				if (sc == null) {
					synchronized (SingletonDemo3.class) {
						if (sc == null) {
							sc = new SingletonDemo3();
						}
					}
					instance = sc;
				}
			}
		}
		return instance;
	}
}