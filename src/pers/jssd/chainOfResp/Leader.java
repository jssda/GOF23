/**
 *
 * @Title Leader.java
 * @Prject GOF23
 * @Package cn.jssd.chainOfResp
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午1:39:38
 * @version V1.0
 */
package pers.jssd.chainOfResp;

/**
 * @ClassName Leader
 * @author jssd
 *
 * @date: 2019年3月24日 下午1:39:38
 */
public abstract class Leader {

	protected String name;
	protected Leader nextLeader;

	/**
	 * @Title Leader
	 * @Description TODO
	 *
	 * @param name
	 */
	public Leader(String name) {
		super();
		this.name = name;
	}

	public final void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}

	/**
	 * 处理请假事项
	 * @Title headleRequest
	 * @Description TODO
	 * @return void
	 */
	public abstract void headleRequest(LeaveRequest request);
	
}
