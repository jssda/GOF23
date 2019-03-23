package cn.jssd.factory.abstractfactory;

/**
 * 
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:52:59
 */
public class Client {

	public static void main(String[] args) {
		CarFactory  factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.run();
		e.start();
		
		
	}
}
