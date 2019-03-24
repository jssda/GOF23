/**
 *
 * @Title FlyWeightFactory.java
 * @Prject GOF23
 * @Package cn.jssd.flyweight
 * @Description TODO
 * @author jssd  
 * @date 2019年3月23日 下午9:06:21
 * @version V1.0 
 */
package pers.jssd.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FlyWeightFactory
 * @author jssd
 *
 * @date: 2019年3月23日 下午9:06:21
 */
public class FlyWeightFactory {

	private static Map<String, ChessFlyWeight> map = new HashMap<>();
	
	public static ChessFlyWeight getChess(String color) {
		
		if(map.containsKey(color)) {
			return map.get(color);
		} else {
			ChessFlyWeight fw = new ChessFlyWeight(color);
			map.put(color, fw);
			return fw;
		}
		
	}
	
}
