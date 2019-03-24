/**
 *
 * @Title Client1.java
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
 * 原型模式 浅克隆
 * @ClassName Client1
 * @author jssd
 *
 * @date: 2019年3月21日 下午3:43:00
 */
public class Client1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Date date =  new Date(123123123L);
		Sheep1 sheep1 = new Sheep1("刘浩", date);
		
		System.out.println(sheep1.getName());
		System.out.println(sheep1.getData().toString());
		date.setTime(456789456L);
		System.out.println(sheep1.getName());
		System.out.println(sheep1.getData().toString());
		
		Sheep1 sheep2 = (Sheep1) sheep1.clone();
		sheep2.setName("李浩");
		System.out.println(sheep2.getName());
		System.out.println(sheep2.getData().toString());
	}
}
