/**
 *
 * @Title Director.java
 * @Prject GOF23
 * @Package cn.jssd.chainOfResp
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午1:45:52
 * @version V1.0
 */
package cn.jssd.chainOfResp;

/**
 * 经理
 * @ClassName Manager
 * @author jssd
 *
 * @date: 2019年3月24日 下午1:49:36
 */
public class Manager extends Leader {

	/**
	 * @Title Manager
	 * @Description TODO
	 *
	 * @param name
	 */
	public Manager(String name) {
		super(name);
	}

	/*
	 * (non Javadoc)
	 * @Title headleRequest
	 * @Description TODO
	 * @param request
	 * @see
	 * cn.jssd.chainOfResp.Leader#headleRequest(cn.jssd.chainOfResp.LeaveRequest)
	 */
	@Override
	public void headleRequest(LeaveRequest request) {

		if (request.getDayTime() < 10) {
			System.out.println(request.getEmployee() + "请假了" + request.getDayTime() + "天， " + this.name + "批准！");
		} else {
			if(this.nextLeader != null) {
				this.nextLeader.headleRequest(request);
			}
		}

	}

}
