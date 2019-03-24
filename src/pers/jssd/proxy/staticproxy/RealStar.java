/**
 *
 * @Title RealStar.java
 * @Prject GOF23
 * @Package cn.jssd.proxy.staticproxy
 * @Description TODO
 * @author jssd
 * @date 2019年3月22日 下午6:35:41
 * @version V1.0
 */
package pers.jssd.proxy.staticproxy;

/**
 * @ClassName RealStar
 * @author jssd
 *
 * @date: 2019年3月22日 下午6:35:41
 */
public class RealStar implements Star {

	/*
	 * (non Javadoc)
	 * @Title sing
	 * @Description TODO
	 * @see cn.jssd.proxy.staticproxy.Star#sing()
	 */
	@Override
	public void sing() {
		System.out.println("RealStar.sing()");
	}

	/*
	 * (non Javadoc)
	 * @Title collectMoney
	 * @Description TODO
	 * @see cn.jssd.proxy.staticproxy.Star#collectMoney()
	 */
	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
	}

	/*
	 * (non Javadoc)
	 * @Title signContract
	 * @Description TODO
	 * @see cn.jssd.proxy.staticproxy.Star#signContract()
	 */
	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
	}

	/*
	 * (non Javadoc)
	 * @Title confer
	 * @Description TODO
	 * @see cn.jssd.proxy.staticproxy.Star#confer()
	 */
	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
	}

	/*
	 * (non Javadoc)
	 * @Title bookTicket
	 * @Description TODO
	 * @see cn.jssd.proxy.staticproxy.Star#bookTicket()
	 */
	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
	}

}
