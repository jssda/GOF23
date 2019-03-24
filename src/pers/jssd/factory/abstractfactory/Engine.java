package pers.jssd.factory.abstractfactory;

/**
 * 发动机接口
 * 
 * @ClassName Engine
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:53:03
 */
public interface Engine {
	void run();

	void start();
}

/**
 * 高端发动机类
 * 
 * @ClassName LuxuryEngine
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:55:16
 */
class LuxuryEngine implements Engine {

	@Override
	public void run() {
		System.out.println("转的快！");
	}

	@Override
	public void start() {
		System.out.println("启动快!可以自动启停！");
	}

}

/**
 * 低端发动机类
 * 
 * @ClassName LowEngine
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:55:34
 */
class LowEngine implements Engine {

	@Override
	public void run() {
		System.out.println("转的慢！");
	}

	@Override
	public void start() {
		System.out.println("启动慢!");
	}

}