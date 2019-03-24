/**
 *
 * @Title Adapter.java
 * @Prject GOF23
 * @Package cn.jssd.adapter
 * @Description TODO
 * @author jssd
 * @date 2019年3月22日 下午4:16:37
 * @version V1.0
 */
package pers.jssd.adapter;

/**
 * 组合对象操作方式
 * 
 * @ClassName Adapter
 * @author jssd
 *
 * @date: 2019年3月22日 下午4:16:37
 */
public class Adapter implements Target {

	private Adaptee adaptee;

	/**
	 * @Title Adapter
	 * @Description TODO
	 *
	 * @param adatpee
	 */
	public Adapter(Adaptee adatpee) {
		super();
		this.adaptee = adatpee;
	}

	/*
	 * (non Javadoc)
	 * @Title handleRequest
	 * @Description TODO
	 * @see cn.jssd.adapter.Target#handleRequest()
	 */
	@Override
	public void handleRequest() {
		adaptee.request();
	}

}
