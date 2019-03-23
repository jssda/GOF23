package cn.jssd.factory.abstractfactory;

/**
 * 汽车工厂接口, 创建各个零件
 * @ClassName CarFactory
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:52:51
 */
public interface CarFactory {
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}

