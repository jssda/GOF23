/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package pers.jssd.observer
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午7:30:52
 * @version V1.0
 */
package pers.jssd.observer;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月24日 下午7:30:52
 */
public class Client {

	public static void main(String[] args) {
		ConcrateSubject subject = new ConcrateSubject();
		
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		subject.regestorObserver(obs1);
		subject.regestorObserver(obs2);
		subject.regestorObserver(obs3);
		
		subject.setState(300);
		System.out.println(obs1.getState());
		System.out.println(obs2.getState());
		System.out.println(obs3.getState());
	}
}
