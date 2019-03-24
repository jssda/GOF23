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
package pers.jssd.chainOfResp;

/**
 * 总经理
 * @ClassName GeneralManager
 * @author jssd
 *
 * @date: 2019年3月24日 下午1:49:36
 */
public class GeneralManager extends Leader {

	/**
	 * @Title GeneralManager
	 * @Description TODO
	 *
	 * @param name
	 */
	public GeneralManager(String name) {
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

		if (request.getDayTime() < 30) {
			System.out.println(request.getEmployee() + "请假了" + request.getDayTime() + "天， " + this.name + "批准！");
		} else {
			System.out.println("时间太长， 不准假");
		}

	}

}
