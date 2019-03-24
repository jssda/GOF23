/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package pers.jssd.observer2
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午7:55:05
 * @version V1.0 
 */
package pers.jssd.observer2;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月24日 下午7:55:05
 */
public class Client {
	public static void main(String[] args) {
		ConcrateSubject subject = new ConcrateSubject();
		
		ObserverA o1 = new ObserverA();
		ObserverA o2 = new ObserverA();
		ObserverA o3 = new ObserverA();
		
		subject.addObserver(o1);
		subject.addObserver(o2);
		subject.addObserver(o3);
		
		subject.setState(100);
		System.out.println(o1.getState());
		System.out.println(o2.getState());
		System.out.println(o3.getState());
	}
}
