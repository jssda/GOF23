/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package pers.jssd.templateMethod
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午6:03:06
 * @version V1.0
 */
package pers.jssd.templateMethod;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月24日 下午6:03:06
 */
public class Client {

	public static void main(String[] args) {
		/**
		 * 用子类实现
		 */
		DrawMoney drawMoney = new DrawMoney();
		drawMoney.process();

		/**
		 * 用匿名内部类实现
		 */
		BankTemplateMethod bank = new BankTemplateMethod() {
			@Override
			public void transact() {
				System.out.println("我要取钱");
			}
		};
		bank.process();
	}

}

/**
 * 实现模板方法类
 * 
 * @ClassName DrawMoney
 * @author jssd
 *
 * @date: 2019年3月24日 下午6:03:44
 */
class DrawMoney extends BankTemplateMethod {

	/*
	 * (non Javadoc)
	 * @Title transact
	 * @Description TODO
	 * @see pers.jssd.templateMethod.BankTemplateMethod#transact()
	 */
	@Override
	public void transact() {
		System.out.println("取钱流程");
	}

}
