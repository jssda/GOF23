/**
 *
 * @Title Subject.java
 * @Prject GOF23
 * @Package pers.jssd.observer
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午7:18:43
 * @version V1.0 
 */
package pers.jssd.observer;

/**
 * @ClassName Subject
 * @author jssd
 *
 * @date: 2019年3月24日 下午7:18:43
 */
public interface Subject {

	/**
	 * 添加观察者
	 * 
	 * @Title regestorObserver
	 * @Description TODO
	 * @param observer
	 * @return void
	 */
	void regestorObserver(Observer observer);
	
	/**
	 * 删除观察者
	 * 
	 * @Title remeObserver
	 * @Description TODO
	 * @param observer
	 * @return void
	 */
	public void remeObserver(Observer observer);
	
	/**
	 * 通知所有观察者
	 * @Title notifyAllObserver
	 * @Description TODO
	 * @return void
	 */
	void notifyAllObserver();
	
}
