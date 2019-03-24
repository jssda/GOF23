/**
 *
 * @Title Invoke.java
 * @Prject GOF23
 * @Package cn.jssd.command
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午3:25:07
 * @version V1.0
 */
package cn.jssd.command;

/**
 * @ClassName Invoke
 * @author jssd
 *
 * @date: 2019年3月24日 下午3:25:07
 */
public class Invoke {

	private Command command; // 可用容器进行更为复杂的操作

	/**
	 * @Title Invoke
	 * @Description TODO
	 *
	 * @param command
	 */
	public Invoke(Command command) {
		super();
		this.command = command;
	}

	/**
	 * 调用命令， 进行处理， 如果是个容器的话， 就可以进行批处理
	 * 
	 * @Title Call
	 * @Description TODO
	 * @return void
	 */
	public void Call() {
		command.execute();
	}
}
