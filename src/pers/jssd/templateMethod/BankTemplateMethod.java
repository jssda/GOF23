package pers.jssd.templateMethod;

/**
 * 模板方法抽象类
 * 
 * @ClassName BankTemplateMethod
 * @author jssd
 *
 * @date: 2019年3月24日 下午6:01:38
 */
public abstract class BankTemplateMethod {

	/**
	 * 取号方法
	 * 
	 * @Title takeNumber
	 * @Description TODO
	 * @return void
	 */
	public void takeNumber() {
		System.out.println("取号排队");
	}

	/**
	 * 具体业务方法， 需要子类实现
	 * 
	 * @Title transact
	 * @Description TODO
	 * @return void
	 */
	public abstract void transact(); // 办理具体的业务 //钩子方法

	/**
	 * 反馈方法
	 * 
	 * @Title evaluate
	 * @Description TODO
	 * @return void
	 */
	public void evaluate() {
		System.out.println("反馈评分");
	}

	/**
	 * 整个流程
	 * 
	 * @Title process
	 * @Description TODO
	 * @return void
	 */
	public final void process() { // 模板方法！！！
		this.takeNumber();

		this.transact();

		this.evaluate();
	}

}
