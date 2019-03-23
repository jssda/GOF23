/**
 *
 * @Title AirShipBuilder.java
 * @Prject GOF23
 * @Package cn.jssd.builder
 * @Description TODO
 * @author jssd
 * @date 2019年3月21日 上午9:42:00
 * @version V1.0
 */
package cn.jssd.builder;

/**
 * @ClassName AirShipBuilder
 * @author jssd
 *
 * @date: 2019年3月21日 上午9:42:00
 */
public interface AirShipBuilder {

	/**
	 * 发动机构建方法
	 * @Title engineBuilder
	 * @Description TODO
	 * @return
	 * @return Engine
	 */
	Engine engineBuilder();

	/**
	 * 轨道舱构建方法
	 * @Title orbitalModuleBuilder
	 * @Description TODO
	 * @return
	 * @return OrbitalModule
	 */
	OrbitalModule orbitalModuleBuilder();
	
	/**
	 * 逃逸仓构建方法
	 * @Title escapeTowerBuilder
	 * @Description TODO
	 * @return
	 * @return EscapeTower
	 */
	EscapeTower escapeTowerBuilder();
}
