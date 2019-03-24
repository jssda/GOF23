/**
 *
 * @Title ObserverA.java
 * @Prject GOF23
 * @Package pers.jssd.observer2
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午7:53:53
 * @version V1.0
 */
package pers.jssd.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName ObserverA
 * @author jssd
 *
 * @date: 2019年3月24日 下午7:53:53
 */
public class ObserverA implements Observer {

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
	}

	/*
	 * (non Javadoc)
	 * @Title update
	 * @Description TODO
	 * @param o
	 * @param arg
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		this.state = ((ConcrateSubject)o).getState();
	}

}
