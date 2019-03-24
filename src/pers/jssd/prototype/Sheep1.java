/**
 *
 * @Title Sheep1.java
 * @Prject GOF23
 * @Package cn.jssd.prototype
 * @Description TODO
 * @author jssd  
 * @date 2019年3月21日 下午3:40:13
 * @version V1.0 
 */
package pers.jssd.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 原型羊, 浅复制
 * 
 * @ClassName Sheep1
 * @author jssd
 *
 * @date: 2019年3月21日 下午3:40:13
 */
public class Sheep1 implements Cloneable, Serializable{

	private String name;
	private Date data;
	
	/**
	 * @Title Sheep
	 * @Description TODO
	 *
	 */
	public Sheep1() {
	}
	
	/**
	 * @Title Sheep
	 * @Description TODO
	 *
	 * @param name
	 * @param data
	 */
	public Sheep1(String name, Date data) {
		super();
		this.name = name;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public Date getData() {
		return data;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	/* (non Javadoc)
	 * @Title clone
	 * @Description TODO
	 * @return
	 * @throws CloneNotSupportedException
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
