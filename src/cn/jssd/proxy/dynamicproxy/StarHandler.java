/**
 *
 * @Title StarHandler.java
 * @Prject GOF23
 * @Package cn.jssd.proxy.dynamicproxy
 * @Description TODO
 * @author jssd
 * @date 2019年3月22日 下午6:54:56
 * @version V1.0
 */
package cn.jssd.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName StarHandler
 * @author jssd
 *
 * @date: 2019年3月22日 下午6:54:56
 */
public class StarHandler implements InvocationHandler {

	private Star star;

	/**
	 * @Title StarHandler
	 * @Description TODO
	 *
	 * @param star
	 */
	public StarHandler(Star star) {
		super();
		this.star = star;
	}

	/*
	 * (non Javadoc)
	 * @Title invoke
	 * @Description TODO
	 * @param proxy
	 * @param method
	 * @param args
	 * @return
	 * @throws Throwable
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		method.invoke(star, args);

		return null;
	}

}
