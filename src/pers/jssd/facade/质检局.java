package pers.jssd.facade;

/**
 * 
 * @ClassName 质检局
 * @author jssd
 *
 * @date: 2019年3月23日 下午8:42:19
 */
public interface 质检局 {
	void orgCodeCertificate(); // 办理组织机构代码证
}

/**
 * 
 * @ClassName 海淀质检局
 * @author jssd
 *
 * @date: 2019年3月23日 下午8:42:24
 */
class 海淀质检局 implements 质检局 {

	@Override
	public void orgCodeCertificate() {
		System.out.println("在海淀区质检局办理组织机构代码证！");
	}

}
