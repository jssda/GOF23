/**
 *
 * @Title SxtAirShipBuilder.java
 * @Prject GOF23
 * @Package cn.jssd.builder
 * @Description TODO
 * @author jssd  
 * @date 2019年3月21日 上午9:48:20
 * @version V1.0 
 */
package cn.jssd.builder;

/**
 * @ClassName SxtAirShipBuilder
 * @author jssd
 *
 * @date: 2019年3月21日 上午9:48:20
 */
public class SxtAirShipBuilder implements AirShipBuilder{

	/* (non Javadoc)
	 * @Title engineBuilder
	 * @Description TODO
	 * @return
	 * @see cn.jssd.builder.AirShipBuilder#engineBuilder()
	 */
	@Override
	public Engine engineBuilder() {
		System.out.println("构建发动机");
		return new Engine("京京牌发动机");
	}

	/* (non Javadoc)
	 * @Title orbitalModuleBuilder
	 * @Description TODO
	 * @return
	 * @see cn.jssd.builder.AirShipBuilder#orbitalModuleBuilder()
	 */
	@Override
	public OrbitalModule orbitalModuleBuilder() {
		System.out.println("构建轨道仓");
		return new OrbitalModule("京京牌轨道仓");
	}

	/* (non Javadoc)
	 * @Title escapeTower
	 * @Description TODO
	 * @return
	 * @see cn.jssd.builder.AirShipBuilder#escapeTower()
	 */
	@Override
	public EscapeTower escapeTowerBuilder() {
		System.out.println("构建逃逸塔");
		return new EscapeTower("京京牌逃逸塔");
	}

}
