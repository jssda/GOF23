/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.strategy
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午4:17:30
 * @version V1.0
 */
package pers.jssd.strategy;

/**
 * 策略模式测试
 * 上下文调用方法
 * 使用策略族中不同的策略
 * 
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月24日 下午4:17:30
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context(new NewCustomerManyStategy());
		context.printPrice(100);
	}

}
