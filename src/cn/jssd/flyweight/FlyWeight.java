/**
 *
 * @Title FlyWeight.java
 * @Prject GOF23
 * @Package cn.jssd.flyweight
 * @Description TODO
 * @author jssd
 * @date 2019年3月23日 下午8:59:29
 * @version V1.0
 */
package cn.jssd.flyweight;

/**
 * @ClassName FlyWeight
 * @author jssd
 *
 * @date: 2019年3月23日 下午8:59:29
 */
public interface FlyWeight {

	/**
	 * 显示位置
	 * 
	 * @Title display
	 * @Description TODO
	 * @return void
	 */
	void display(Coordinate c);

	/**
	 * 取得颜色
	 * 
	 * @Title getColor
	 * @Description TODO
	 * @return void
	 */
	String getColor();

}
