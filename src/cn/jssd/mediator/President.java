/**
 *
 * @Title President.java
 * @Prject GOF23
 * @Package cn.jssd.mediator
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午2:59:55
 * @version V1.0 
 */
package cn.jssd.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName President
 * @author jssd
 *
 * @date: 2019年3月24日 下午2:59:55
 */
public class President implements Mediator {

	private Map<String, Department> map = new HashMap<>();
	
	/* (non Javadoc)
	 * @Title regestor
	 * @Description TODO
	 * @param name
	 * @param d
	 * @see cn.jssd.mediator.Mediator#regestor(java.lang.String, cn.jssd.mediator.Development)
	 */
	@Override
	public void regestor(String name, Department d) {
		map.put(name, d);
	}

	/* (non Javadoc)
	 * @Title command
	 * @Description TODO
	 * @see cn.jssd.mediator.Mediator#command()
	 */
	@Override
	public void command(String name) {
		map.get(name).selfAction();
	}

}
