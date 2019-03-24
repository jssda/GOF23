/**
 *
 * @Title SxtAirShipDirector.java
 * @Prject GOF23
 * @Package cn.jssd.builder
 * @Description TODO
 * @author jssd  
 * @date 2019年3月21日 上午9:50:37
 * @version V1.0 
 */
package pers.jssd.builder;

/**
 * @ClassName SxtAirShipDirector
 * @author jssd
 *
 * @date: 2019年3月21日 上午9:50:37
 */
public class SxtAirShipDirector implements AirShipDirector {

	private AirShipBuilder builder;
	
	/**
	 * @Title SxtAirShipDirector
	 * @Description TODO
	 *
	 */
	public SxtAirShipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}
	
	
	/* (non Javadoc)
	 * @Title directAirShip
	 * @Description TODO
	 * @return
	 * @see cn.jssd.builder.AirShipDirector#directAirShip()
	 */
	@Override
	public AirShip directAirShip() {
		AirShip airShip = null;
		
		airShip = new AirShip();
		airShip.setEngine(builder.engineBuilder());
		airShip.setEscapTower(builder.escapeTowerBuilder());
		airShip.setOrbitalModule(builder.orbitalModuleBuilder());;
		
		return airShip;
	}

}
