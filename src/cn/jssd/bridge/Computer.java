/**
 *
 * @Title Computer.java
 * @Prject GOF23
 * @Package cn.jssd.bridge
 * @Description TODO
 * @author jssd  
 * @date 2019年3月23日 下午3:59:47
 * @version V1.0 
 */
package cn.jssd.bridge;

/**
 * @ClassName Computer
 * @author jssd
 *
 * @date: 2019年3月23日 下午3:59:47
 */
public class Computer {

	protected Brand brand;
	
	/**
	 * @Title Computer
	 * @Description TODO
	 *
	 * @param brand
	 */
	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}

	public void sale() {
		brand.sale();
	}
	
}

class Desktop extends Computer {

	/**
	 * @Title Desktop
	 * @Description TODO
	 *
	 * @param brand
	 */
	public Desktop(Brand brand) {
		super(brand);
	}
	
	/* (non Javadoc)
	 * @Title sale
	 * @Description TODO
	 * @see cn.jssd.bridge.Computer#sale()
	 */
	@Override
	public void sale() {
		super.sale();
		System.out.println("Desktop.sale()");
	}
}

class Laptop extends Computer {

	/**
	 * @Title Laptop
	 * @Description TODO
	 *
	 * @param brand
	 */
	public Laptop(Brand brand) {
		super(brand);
	}
	
	/* (non Javadoc)
	 * @Title sale
	 * @Description TODO
	 * @see cn.jssd.bridge.Computer#sale()
	 */
	@Override
	public void sale() {
		super.sale();
		System.out.println("Laptop.sale()");
	}
}