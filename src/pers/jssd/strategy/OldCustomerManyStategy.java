/**
 *
 * @Title NewCustomerFewStategy.java
 * @Prject GOF23
 * @Package cn.jssd.strategy
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午4:10:42
 * @version V1.0 
 */
package pers.jssd.strategy;

/**
 * 老客户大批量购买， 打7折
 * 
 * @ClassName NewCustomerFewStategy
 * @author jssd
 *
 * @date: 2019年3月24日 下午4:10:42
 */
public class OldCustomerManyStategy implements Strategy{

	/* (non Javadoc)
	 * @Title getPrice
	 * @Description TODO
	 * @see cn.jssd.strategy.Strategy#getPrice()
	 */
	@Override
	public double getPrice(double standrandPrice) {
		return standrandPrice * 0.7;
	}

}
