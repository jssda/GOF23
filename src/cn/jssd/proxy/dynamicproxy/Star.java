/**
 *
 * @Title Star.java
 * @Prject GOF23
 * @Package cn.jssd.proxy.staticproxy
 * @Description TODO
 * @author jssd  
 * @date 2019年3月22日 下午6:32:53
 * @version V1.0 
 */
package cn.jssd.proxy.dynamicproxy;

/**
 * @ClassName Star
 * @author jssd
 *
 * @date: 2019年3月22日 下午6:32:53
 */
public interface Star {

	/**
	 * 唱歌啊
	 * @Title sing
	 * @Description TODO
	 * @return void
	 */
	void sing();
	
	/**
	 * 收钱
	 * @Title collectMoney
	 * @Description TODO
	 * @return void
	 */
	void collectMoney();
	
	/**
	 * 签合同 
	 * @Title signature
	 * @Description TODO
	 * @return void
	 */
	void signContract();
	
	/**
	 * 商谈
	 * @Title confer
	 * @Description TODO
	 * @return void
	 */
	void confer();
	
	/**
	 * 订票
	 * @Title bookTicket
	 * @Description TODO
	 * @return void
	 */
	void bookTicket();
}
