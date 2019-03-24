/**
 *
 * @Title AirShip.java
 * @Prject GOF23
 * @Package cn.jssd.builder
 * @Description TODO
 * @author jssd
 * @date 2019年3月21日 上午9:33:04
 * @version V1.0
 */
package pers.jssd.builder;

/**
 * 飞船
 * 
 * @ClassName AirShip
 * @author jssd
 *
 * @date: 2019年3月21日 上午9:33:04
 */
public class AirShip {

	private Engine engine;
	private OrbitalModule orbitalModule;
	private EscapeTower escapTower;

	public AirShip() {
		
	}
	
	/**
	 * @Title AirShip
	 * @Description TODO
	 *
	 * @param engine
	 * @param orbitalModule
	 * @param escapTower
	 */
	public AirShip(Engine engine, OrbitalModule orbitalModule, EscapeTower escapTower) {
		super();
		this.engine = engine;
		this.orbitalModule = orbitalModule;
		this.escapTower = escapTower;
	}

	public Engine getEngine() {
		return engine;
	}

	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}

	public EscapeTower getEscapTower() {
		return escapTower;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}

	public void setEscapTower(EscapeTower escapTower) {
		this.escapTower = escapTower;
	}

}

/**
 * 发动机组件
 * 
 * @ClassName Engine
 * @author jssd
 *
 * @date: 2019年3月21日 上午9:33:43
 */
class Engine {

	private String name;

	/**
	 * @Title Engine
	 * @Description TODO
	 *
	 * @param name
	 */
	public Engine(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

/**
 * 轨道仓
 * 
 * @ClassName OrbitalModule
 * @author jssd
 *
 * @date: 2019年3月21日 上午9:35:57
 */
class OrbitalModule {
	private String name;

	/**
	 * @Title OrbitalModule
	 * @Description TODO
	 *
	 * @param name
	 */
	public OrbitalModule(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

/**
 * 逃逸塔
 * 
 * @ClassName EscapeTower
 * @author jssd
 *
 * @date: 2019年3月21日 上午9:37:38
 */
class EscapeTower {
	private String name;

	/**
	 * @Title EscapeTower
	 * @Description TODO
	 *
	 * @param name
	 */
	public EscapeTower(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
