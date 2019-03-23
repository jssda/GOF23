/**
 *
 * @Title Client3.java
 * @Prject GOF23
 * @Package cn.jssd.prototype
 * @Description TODO
 * @author jssd  
 * @date 2019年3月22日 下午3:18:52
 * @version V1.0 
 */
package cn.jssd.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 序列化实现深复制
 * @ClassName Client3
 * @author jssd
 *
 * @date: 2019年3月22日 下午3:18:52
 */
public class Client3 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Date date =  new Date(123123123L);
		Sheep1 sheep = new Sheep1("刘浩", date);
		
		System.out.println(sheep.getName());
		System.out.println(sheep.getData().toString());
		
		
		
//		Sheep2 sheep2 = (Sheep2) sheep.clone();
		Sheep1 sheep2 = null;
		
		//将序列化对象先转成数组，再转会对象
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(sheep);
		byte[] data = baos.toByteArray();
		ByteArrayInputStream bais = new ByteArrayInputStream(data);
		ObjectInputStream ois = new ObjectInputStream(bais);
		sheep2 = (Sheep1) ois.readObject();
		
		date.setTime(456789456L);
		
		sheep2.setName("李浩");
		System.out.println(sheep2.getName());
		System.out.println(sheep2.getData().toString());
		
	}
}
