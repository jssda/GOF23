/**
 *
 * @Title ConcrateSubject.java
 * @Prject GOF23
 * @Package pers.jssd.observer
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午7:21:25
 * @version V1.0
 */
package pers.jssd.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName ConcrateSubject
 * @author jssd
 *
 * @date: 2019年3月24日 下午7:21:25
 */
public class ConcrateSubject implements Subject {

	// 观察者容器
	private Set<Observer> set = new HashSet<>();
	// 自己的状态
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
		notifyAllObserver();
	}

	/*
	 * (non Javadoc)
	 * @Title regestorObserver
	 * @Description TODO
	 * @param observer
	 * @see pers.jssd.observer.Subject#regestorObserver(pers.jssd.observer.Observer)
	 */
	public void regestorObserver(Observer observer) {
		set.add(observer);
	}

	/*
	 * (non Javadoc)
	 * @Title remeObserver
	 * @Description TODO
	 * @param observer
	 * @see pers.jssd.observer.Subject#remeObserver(pers.jssd.observer.Observer)
	 */
	public void remeObserver(Observer observer) {
		set.remove(observer);
	}

	/*
	 * (non Javadoc)
	 * @Title notifyAllObserver
	 * @Description TODO
	 * @see pers.jssd.observer.Subject#notifyAllObserver()
	 */
	@Override
	public void notifyAllObserver() {
		for (Observer observer : set) {
			observer.update(this);
		}
	}

}
