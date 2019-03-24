/**
 *
 * @Title Client.java
 * @Prject GOF23
 * @Package cn.jssd.composite
 * @Description TODO
 * @author jssd  
 * @date 2019年3月23日 下午5:41:25
 * @version V1.0 
 */
package pers.jssd.composite;

/**
 * 组合模式设计测试
 * 
 * @ClassName Client
 * @author jssd
 *
 * @date: 2019年3月23日 下午5:41:25
 */
public class Client {
	
	public static void main(String[] args) {
		AbstactFile f1, f2, f3;
		Folder f = new Folder("杂物");
		f1 = new ImageFile("证件照.jpg");
		f2 = new TextFile("笔记.txt");
		f3 = new ImageFile("刘浩.jpg");
		f.add(f1);
		f.add(f2);
		f.add(f3);
		
		f1.killVirus();
		f.killVirus();
	}
	
}
