/**
 *
 * @Title Mediator.java
 * @Prject GOF23
 * @Package cn.jssd.mediator
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午2:55:49
 * @version V1.0
 */
package cn.jssd.mediator;

/**
 * @ClassName Mediator
 * @author jssd
 *
 * @date: 2019年3月24日 下午2:55:49
 */
public interface Mediator {

	/**
	 * 注册信息， 建立连接
	 * 
	 * @Title regestor
	 * @Description TODO
	 * @param name
	 * @param d
	 * @return void
	 */
	void regestor(String name, Department d);

	/**
	 * 下达指令
	 * 
	 * @Title command
	 * @Description TODO
	 * @param name
	 * @return void
	 */
	void command(String name);

}
