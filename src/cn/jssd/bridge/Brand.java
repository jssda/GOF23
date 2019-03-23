/**
 *
 * @Title Brand.java
 * @Prject GOF23
 * @Package cn.jssd.bridge
 * @Description TODO
 * @author jssd  
 * @date 2019年3月23日 下午4:00:25
 * @version V1.0 
 */
package cn.jssd.bridge;

/**
 * 电脑品牌接口
 * 
 * @ClassName Brand
 * @author jssd
 *
 * @date: 2019年3月23日 下午4:00:25
 */
public interface Brand {

	void sale();
	
}

class Lenove implements Brand {

	/* (non Javadoc)
	 * @Title sale
	 * @Description TODO
	 * @see cn.jssd.bridge.Brand#sale()
	 */
	@Override
	public void sale() {
		System.out.println("Lenove.sale()");
	}
}

class Dell implements Brand {

	/* (non Javadoc)
	 * @Title sale
	 * @Description TODO
	 * @see cn.jssd.bridge.Brand#sale()
	 */
	@Override
	public void sale() {
		System.out.println("Dell.sale()");
	}
}
