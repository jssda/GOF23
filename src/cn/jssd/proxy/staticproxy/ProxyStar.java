/**
 *
 * @Title ProxyStar.java
 * @Prject GOF23
 * @Package cn.jssd.proxy.staticproxy
 * @Description TODO
 * @author jssd
 * @date 2019年3月22日 下午6:36:34
 * @version V1.0
 */
package cn.jssd.proxy.staticproxy;

/**
 * @ClassName ProxyStar
 * @author jssd
 *
 * @date: 2019年3月22日 下午6:36:34
 */
public class ProxyStar implements Star {

	private Star realStar;

	/**
	 * @Title ProxyStar
	 * @Description TODO
	 *
	 * @param realStar
	 */
	public ProxyStar(Star realStar) {
		super();
		this.realStar = realStar;
	}

	/*
	 * (non Javadoc)
	 * @Title sing
	 * @Description TODO
	 * @see cn.jssd.proxy.staticproxy.Star#sing()
	 */
	@Override
	public void sing() {
		realStar.sing();
	}

	/*
	 * (non Javadoc)
	 * @Title collectMoney
	 * @Description TODO
	 * @see cn.jssd.proxy.staticproxy.Star#collectMoney()
	 */
	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

	/*
	 * (non Javadoc)
	 * @Title signContract
	 * @Description TODO
	 * @see cn.jssd.proxy.staticproxy.Star#signContract()
	 */
	@Override
	public void signContract() {
		System.out.println("ProxyStar.signContract()");
	}

	/*
	 * (non Javadoc)
	 * @Title confer
	 * @Description TODO
	 * @see cn.jssd.proxy.staticproxy.Star#confer()
	 */
	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	/*
	 * (non Javadoc)
	 * @Title bookTicket
	 * @Description TODO
	 * @see cn.jssd.proxy.staticproxy.Star#bookTicket()
	 */
	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

}
