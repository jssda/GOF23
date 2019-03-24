/**
 *
 * @Title Context.java
 * @Prject GOF23
 * @Package cn.jssd.strategy
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午4:15:33
 * @version V1.0
 */
package pers.jssd.strategy;

/**
 * @ClassName Context
 * @author jssd
 *
 * @date: 2019年3月24日 下午4:15:33
 */
public class Context {

	private Strategy s;

	/**
	 * @Title Context
	 * @Description TODO
	 *
	 * @param s
	 */
	public Context(Strategy s) {
		super();
		this.s = s;
	}

	/**
	 * @param s the s to set
	 */
	public final void setS(Strategy s) {
		this.s = s;
	}

	/**
	 * 具体操作
	 * 
	 * @Title printPrice
	 * @Description TODO
	 * @param price
	 * @return void
	 */
	public void printPrice(double price) {
		System.out.println("您该报价：" + s.getPrice(price));
	}

}
