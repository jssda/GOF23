package cn.jssd.factory.abstractfactory;

/**
 * 轮胎接口
 * @ClassName Tyre
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:55:55
 */
public interface Tyre {
	void revolve();
}

/**
 * 高端轮胎
 * @ClassName LuxuryTyre
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:56:09
 */
class LuxuryTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("旋转不磨损！");
	}
	
}

/**
 * 低端轮胎
 * @ClassName LowTyre
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:56:18
 */
class LowTyre implements Tyre {

	@Override
	public void revolve() {
		System.out.println("旋转磨损快！");
	}
	
}