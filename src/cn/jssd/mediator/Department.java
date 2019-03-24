/**
 *
 * @Title Development.java
 * @Prject GOF23
 * @Package cn.jssd.mediator
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午2:54:40
 * @version V1.0
 */
package cn.jssd.mediator;

/**
 * 部门工作接口
 * 
 * @ClassName Development
 * @author jssd
 *
 * @date: 2019年3月24日 下午2:54:40
 */
public interface Department {

	/**
	 * 自己部门工作
	 * 
	 * @Title selfAction
	 * @Description TODO
	 * @return void
	 */
	void selfAction();

	/**
	 * 外部协调工作
	 * 
	 * @Title OutAction
	 * @Description TODO
	 * @return void
	 */
	void OutAction();

}
