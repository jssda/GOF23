package cn.jssd.singleton;

/**
 * 静态内部类实现单例模式，兼顾懒汉式延时特点，饿汉式效率特点，并且线程同步
 * 很常用
 * 
 * – 外部类没有static属性，则不会像饿汉式那样立即加载对象。
 * – 只有真正调用getInstance(),才会加载静态内部类。加载类时是线程 安全的。 instance是static final
 *   类型，保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证了线程安全性.
 * – 兼备了并发高效调用和延迟加载的优势！
 * 
 * @ClassName SingletonDemo3
 * @author jssd
 *
 * @date: 2019年3月19日 下午10:44:30
 */
public class SingletonDemo4 {

	private static class SingletonInstance {
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}

	private SingletonDemo4() {
	}

	public static SingletonDemo4 getInstance() {
		return SingletonInstance.instance;
	}

}