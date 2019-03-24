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

import java.util.Date;

/**
 * 原型羊, 深复制
 * 
 * @ClassName Sheep2
 * @author jssd
 *
 * @date: 2019年3月21日 下午4:55:53
 */
public class Sheep2 implements Cloneable {

	private String name;
	private Date date;

	/**
	 * @Title Sheep2
	 * @Description TODO
	 *
	 */
	public Sheep2() {
	}

	/**
	 * @Title Sheep2
	 * @Description TODO
	 *
	 * @param name
	 * @param data
	 */
	public Sheep2(String name, Date data) {
		super();
		this.name = name;
		this.date = data;
	}

	public String getName() {
		return name;
	}

	public Date getData() {
		return date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setData(Date data) {
		this.date = data;
	}

	/*
	 * (non Javadoc)
	 * @Title clone
	 * @Description TODO
	 * @return
	 * @throws CloneNotSupportedException
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		
		Sheep2 temp = (Sheep2) obj;
		temp.date = (Date) this.date.clone();
		
		return obj;
	}
}
