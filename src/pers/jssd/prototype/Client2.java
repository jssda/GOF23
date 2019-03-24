/**
 *
 * @Title Client2.java
 * @Prject GOF23
 * @Package cn.jssd.prototype
 * @Description TODO
 * @author jssd  
 * @date 2019年3月21日 下午3:43:00
 * @version V1.0 
 */
package pers.jssd.prototype;

import java.util.Date;

/**
 * 原型模式 深克隆
 * @ClassName Client2
 * @author jssd
 *
 * @date: 2019年3月21日 下午3:43:00
 */
public class Client2 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Date date =  new Date(123123123L);
		Sheep2 sheep = new Sheep2("刘浩", date);
		
		System.out.println(sheep.getName());
		System.out.println(sheep.getData().toString());
		date.setTime(456789456L);
		System.out.println(sheep.getName());
		System.out.println(sheep.getData().toString());
		
		Sheep2 sheep2 = (Sheep2) sheep.clone();
		sheep2.setName("李浩");
		System.out.println(sheep2.getName());
		System.out.println(sheep2.getData().toString());
	}
}
