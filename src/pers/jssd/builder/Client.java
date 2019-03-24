/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.builder
 * @Description TODO
 * @author jssd  
 * @date 2019年3月21日 下午3:25:41
 * @version V1.0 
 */
package pers.jssd.builder;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月21日 下午3:25:41
 */
public class Client {

	public static void main(String[] args) {
		AirShip airShip = new SxtAirShipDirector(new SxtAirShipBuilder()).directAirShip();
		System.out.println(airShip.getEngine());
	}
	
}
