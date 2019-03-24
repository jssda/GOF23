/**
 *
 * @Title MyIterator.java
 * @Prject GOF23
 * @Package cn.jssd.iterator
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午2:05:17
 * @version V1.0
 */
package pers.jssd.iterator;

/**
 * 自己定义的迭代奇对象
 * 
 * @ClassName MyIterator
 * @author jssd
 *
 * @date: 2019年3月24日 下午2:05:17
 */
public interface MyIterator {

	/**
	 * 是否有下一个
	 * 
	 * @Title hasNext
	 * @Description TODO
	 * @return
	 * @return boolean
	 */
	boolean hasNext();

	/**
	 * 到第一个
	 * 
	 * @Title first
	 * @Description TODO
	 * @return void
	 */
	void first();

	/**
	 * 到最后一个
	 * 
	 * @Title last
	 * @Description TODO
	 * @return void
	 */
	void last();

	/**
	 * 是否是第一个对象
	 * 
	 * @Title isFirst
	 * @Description TODO
	 * @return
	 * @return boolean
	 */
	boolean isFirst();

	/**
	 * 是否是最后一个对象
	 * 
	 * @Title isLast
	 * @Description TODO
	 * @return
	 * @return boolean
	 */
	boolean isLast();
	
	/**
	 * 下一个
	 * @Title next
	 * @Description TODO
	 * @return void
	 */
	void next();

	/**
	 * 获得当前对象
	 * 
	 * @Title getCurrentObj
	 * @Description TODO
	 * @return
	 * @return Object
	 */
	Object getCurrentObj();

}
