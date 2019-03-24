/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.iterator
 * @Description TODO
 * @author jssd  
 * @date 2019年3月24日 下午2:16:44
 * @version V1.0 
 */
package pers.jssd.iterator;

/**
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月24日 下午2:16:44
 */
public class Client {

	public static void main(String[] args) {
		ConcrateMyAggregate<String> l = new ConcrateMyAggregate<>();
		
		l.addElement("aaaa");
		l.addElement("bbbb");
		l.addElement("cccc");
		l.addElement("dddd");
		
		MyIterator iterator = l.getIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.getCurrentObj());
			iterator.next();
		}
	}
	
}
