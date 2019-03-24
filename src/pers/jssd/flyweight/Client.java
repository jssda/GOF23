/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.flyweight
 * @Description TODO
 * @author jssd  
 * @date 2019年3月23日 下午9:04:01
 * @version V1.0 
 */
package pers.jssd.flyweight;

/**
 * 享元模式测试类
 * 
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月23日 下午9:04:01
 */
public class Client {

	public static void main(String[] args) {
		FlyWeight fw = FlyWeightFactory.getChess("黑色");
		fw.display(new Coordinate(10, 10));
		System.out.println(fw);
		
		FlyWeight fw2 = FlyWeightFactory.getChess("黑色");
		fw.display(new Coordinate(20, 20));
		System.out.println(fw2);
	}
	
}
