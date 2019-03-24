package pers.jssd.factory.abstractfactory;

/**
 * 低端零件制造工厂
 * 
 * @ClassName LowCarFactory
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:53:11
 */
public class LowCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		return new LowSeat();
	}

	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}

}
