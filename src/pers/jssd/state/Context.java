/**
 *
 * @Title Context.java
 * @Prject GOF23
 * @Package pers.jssd.state
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午6:19:55
 * @version V1.0
 */
package pers.jssd.state;

/**
 * @ClassName Context
 * @author jssd
 *
 * @date: 2019年3月24日 下午6:19:55
 */
public class Context {

	private State state;

	/**
	 * @Title Context
	 * @Description TODO
	 *
	 * @param state
	 */
	public Context(State state) {
		super();
		setState(state);
	}

	/**
	 * @param state the state to set
	 */
	public final void setState(State state) {
		System.out.println("修改状态");
		this.state = state;
		state.handle();

	}

}
