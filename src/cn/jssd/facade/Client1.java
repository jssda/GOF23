package cn.jssd.facade;

/**
 * 外观模式测试， 也叫门面模式
 *    其实说白了就是个封装的思想
 * 
 * @ClassName Client1
 * @author jssd
 *
 * @date: 2019年3月23日 下午8:42:36
 */
public class Client1 {

	public static void main(String[] args) {
//		工商局  a = new 海淀区工商局();
//		a.checkName();
//		质检局 b = new 海淀质检局();
//		b.orgCodeCertificate();
//		税务局  c  = new 海淀税务局();
//		c.taxCertificate();
//		银行  d = new 中国工商银行();
//		d.openAccount();

		new RegisterFacade().register();

	}
}
