/**
 *
 * @Title CheckedState.java
 * @Prject GOF23
 * @Package pers.jssd.state
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午6:17:35
 * @version V1.0 
 */
package pers.jssd.state;

/**
 * @ClassName CheckedState
 * @author jssd
 *
 * @date: 2019年3月24日 下午6:17:35
 */
public class CheckedState implements State {

	/* (non Javadoc)
	 * @Title handle
	 * @Description TODO
	 * @see pers.jssd.state.State#handle()
	 */
	@Override
	public void handle() {
		System.out.println("住房状态");
	}

}
