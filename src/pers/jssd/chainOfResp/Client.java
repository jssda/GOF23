/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.chainOfResp
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午1:51:58
 * @version V1.0 
 */
package pers.jssd.chainOfResp;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月24日 下午1:51:58
 */
public class Client {

	public static void main(String[] args) {
		Leader director = new Director("张三");
		Leader manager = new Manager("李四");
		Leader generalManager = new GeneralManager("王五");
		
		director.setNextLeader(manager);
		manager.nextLeader = generalManager;
		
		LeaveRequest l = new LeaveRequest("刘浩", 50, "玩");
		director.headleRequest(l);
	}
	
}
