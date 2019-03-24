/**
 *
 * @Title ObserverA.java
 * @Prject GOF23
 * @Package pers.jssd.observer
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午7:26:21
 * @version V1.0
 */
package pers.jssd.observer;

/**
 * @ClassName ObserverA
 * @author jssd
 *
 * @date: 2019年3月24日 下午7:26:21
 */
public class ObserverA implements Observer {

	//自身的状态
	private int state;

	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

	/*
	 * (non Javadoc)
	 * @Title update
	 * @Description TODO
	 * @see pers.jssd.observer.Observer#update()
	 */
	@Override
	public void update(Subject subject) {
		this.state = ((ConcrateSubject)subject).getState();
	}

}
