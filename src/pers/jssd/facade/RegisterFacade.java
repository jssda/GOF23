package pers.jssd.facade;

/**
 * 办理注册公司流程的门面对象
 * 
 * @ClassName RegisterFacade
 * @author jssd
 *
 * @date: 2019年3月23日 下午8:43:46
 */
public class RegisterFacade {
	public void register() {
		工商局 a = new 海淀区工商局();
		a.checkName();
		质检局 b = new 海淀质检局();
		b.orgCodeCertificate();
		税务局 c = new 海淀税务局();
		c.taxCertificate();
		银行 d = new 中国工商银行();
		d.openAccount();
	}
}
