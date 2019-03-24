/**
 *
 * @Title Strategy.java
 * @Prject GOF23
 * @Package cn.jssd.strategy
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午4:09:08
 * @version V1.0
 */
package pers.jssd.strategy;

/**
 * 算法族接口， 不同的算法都可以实现此接口
 * 
 * @ClassName Strategy
 * @author jssd
 *
 * @date: 2019年3月24日 下午4:09:08
 */
public interface Strategy {

	/**
	 * 取得钱数
	 * @Title getPrice
	 * @Description TODO
	 * @param standrandPrice
	 * @return double
	 */
	double getPrice(double standrandPrice);

}
