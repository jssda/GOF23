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
package cn.jssd.adapter;

/**
 * 继承操作方式
 * 
 * @ClassName Adapter
 * @author jssd
 *
 * @date: 2019年3月22日 下午4:16:37
 */
public class Adapter2 extends Adaptee implements Target {

	/*
	 * (non Javadoc)
	 * @Title handleRequest
	 * @Description TODO
	 * @see cn.jssd.adapter.Target#handleRequest()
	 */
	@Override
	public void handleRequest() {
		this.request();
	}

}
