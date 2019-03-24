/**
 *
 * @Title ConcrateSubject.java
 * @Prject GOF23
 * @Package pers.jssd.observer2
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午7:44:49
 * @version V1.0 
 */
package pers.jssd.observer2;

import java.util.Observable;

/**
 * @ClassName ConcrateSubject
 * @author jssd
 *
 * @date: 2019年3月24日 下午7:44:49
 */
public class ConcrateSubject extends Observable{

	private int state;

	/**
	 * @return the state
	 */
	public final int getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public final void setState(int state) {
		this.state = state;
		this.setChanged();
		this.notifyObservers(state);
	}

	
}
