package cn.jssd.factory.abstractfactory;

/**
 * 座椅接口
 * @ClassName Seat
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:56:29
 */
public interface Seat {
	void massage();
}

/**
 * 高端接口
 * @ClassName LuxurySeat
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:56:35
 */
class LuxurySeat implements Seat {

	@Override
	public void massage() {
		System.out.println("可以自动按摩！");
	}
	
}

/**
 * 低端接口
 * @ClassName LowSeat
 * @author jssd
 *
 * @date: 2019年3月20日 下午5:56:45
 */
class LowSeat implements Seat {

	@Override
	public void massage() {
		System.out.println("不能按摩！");
	}
	
}
