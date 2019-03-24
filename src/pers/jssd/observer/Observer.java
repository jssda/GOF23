/**
 *
 * @Title Observer.java
 * @Prject GOF23
 * @Package pers.jssd.observer
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午7:25:19
 * @version V1.0
 */
package pers.jssd.observer;

/**
 * @ClassName Observer
 * @author jssd
 *
 * @date: 2019年3月24日 下午7:25:19
 */
public interface Observer {

	/**
	 * 更新信息
	 * 
	 * @Title update
	 * @Description TODO
	 * @param subject
	 * @return void
	 */
	void update(Subject subject);

}
