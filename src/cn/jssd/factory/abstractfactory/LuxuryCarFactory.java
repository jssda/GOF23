package cn.jssd.factory.abstractfactory;

/**
 * 高端零件制造工厂
 * @ClassName LuxuryCarFactory
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:56:55
 */
public class LuxuryCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}


}
