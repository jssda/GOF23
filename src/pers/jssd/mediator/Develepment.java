/**
 *
 * @Title Department.java
 * @Prject GOF23
 * @Package cn.jssd.mediator
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午2:57:23
 * @version V1.0 
 */
package pers.jssd.mediator;

/**
 * @ClassName Department
 * @author jssd
 *
 * @date: 2019年3月24日 下午2:57:23
 */
public class Develepment implements Department {

	private Mediator m;
	
	/**
	 * @Title Department
	 * @Description TODO
	 *
	 * @param m
	 */
	public Develepment(Mediator m) {
		super();
		this.m = m;
		m.regestor("develpment", this);
	}

	/* (non Javadoc)
	 * @Title selfAction
	 * @Description TODO
	 * @see cn.jssd.mediator.Development#selfAction()
	 */
	@Override
	public void selfAction() {
		System.out.println("Department.selfAction(), 专心研发");
	}

	/* (non Javadoc)
	 * @Title OutAction
	 * @Description TODO
	 * @see cn.jssd.mediator.Development#OutAction()
	 */
	@Override
	public void OutAction() {
		System.out.println("缺少资金， 需要协调");
		m.command("financial");
	}

}
