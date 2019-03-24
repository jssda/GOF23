/**
 *
 * @Title Command.java
 * @Prject GOF23
 * @Package cn.jssd.command
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午3:21:51
 * @version V1.0
 */
package cn.jssd.command;

/**
 * @ClassName Command
 * @author jssd
 *
 * @date: 2019年3月24日 下午3:21:51
 */
public interface Command {

	/**
	 * 发送命令
	 * 
	 * @Title execute
	 * @Description TODO
	 * @return void
	 */
	void execute();

}

class ConcrateCommand implements Command {

	private Reciver reciver;

	/**
	 * @Title ConcrateCommand
	 * @Description TODO
	 *
	 * @param reciver
	 */
	public ConcrateCommand(Reciver reciver) {
		super();
		this.reciver = reciver;
	}

	/*
	 * (non Javadoc)
	 * @Title execute
	 * @Description TODO
	 * @see cn.jssd.command.Command#execute()
	 */
	@Override
	public void execute() {
		reciver.action();
	}

}
