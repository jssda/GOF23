/**
 *
 * @Title Financial.java
 * @Prject GOF23
 * @Package cn.jssd.mediator
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午3:03:39
 * @version V1.0 
 */
package pers.jssd.mediator;

/**
 * @ClassName Financial
 * @author jssd
 *
 * @date: 2019年3月24日 下午3:03:39
 */
public class Financial implements Department {

	private Mediator m;
	
	/**
	 * @Title Financial
	 * @Description TODO
	 *
	 * @param m
	 */
	public Financial(Mediator m) {
		super();
		this.m = m;
		m.regestor("financial", this);
	}

	/* (non Javadoc)
	 * @Title selfAction
	 * @Description TODO
	 * @see cn.jssd.mediator.Development#selfAction()
	 */
	@Override
	public void selfAction() {
		System.out.println("数钱");
	}

	/* (non Javadoc)
	 * @Title OutAction
	 * @Description TODO
	 * @see cn.jssd.mediator.Development#OutAction()
	 */
	@Override
	public void OutAction() {
		System.out.println("缺个系统， 研发帮下忙");
		m.command("develpment");
	}

}
