/**
 *
 * @Title LeaveRequest.java
 * @Prject GOF23
 * @Package cn.jssd.chainOfResp
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午1:43:10
 * @version V1.0
 */
package cn.jssd.chainOfResp;

/**
 * 请假时间
 * 
 * @ClassName LeaveRequest
 * @author jssd
 *
 * @date: 2019年3月24日 下午1:43:10
 */
public class LeaveRequest {

	private String employee;
	private int dayTime;
	private String reason;

	/**
	 * @Title LeaveRequest
	 * @Description TODO
	 *
	 * @param employee
	 * @param dayTime
	 * @param reason
	 */
	public LeaveRequest(String employee, int dayTime, String reason) {
		super();
		this.employee = employee;
		this.dayTime = dayTime;
		this.reason = reason;
	}

	/**
	 * @return the employee
	 */
	public final String getEmployee() {
		return employee;
	}

	/**
	 * @return the dayTime
	 */
	public final int getDayTime() {
		return dayTime;
	}

	/**
	 * @return the reason
	 */
	public final String getReason() {
		return reason;
	}

	/**
	 * @param employee the employee to set
	 */
	public final void setEmployee(String employee) {
		this.employee = employee;
	}

	/**
	 * @param dayTime the dayTime to set
	 */
	public final void setDayTime(int dayTime) {
		this.dayTime = dayTime;
	}

	/**
	 * @param reason the reason to set
	 */
	public final void setReason(String reason) {
		this.reason = reason;
	}

	
}
