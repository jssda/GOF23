package cn.jssd.facade;

/**
 * 
 * @ClassName 税务局
 * @author jssd
 *
 * @date: 2019年3月23日 下午8:41:50
 */
public interface 税务局 {
	void taxCertificate(); // 办理税务登记证
}

/**
 * 
 * @ClassName 海淀税务局
 * @author jssd
 *
 * @date: 2019年3月23日 下午8:41:53
 */
class 海淀税务局 implements 税务局 {

	@Override
	public void taxCertificate() {
		System.out.println("在海淀税务局办理税务登记证！");
	}

}
