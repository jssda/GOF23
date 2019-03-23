package cn.jssd.facade;

/**
 * 
 * @ClassName 银行
 * @author jssd
 *
 * @date: 2019年3月23日 下午8:42:05
 */
public interface 银行 {
	void openAccount(); // 开户
}

/**
 * 
 * @ClassName 中国工商银行
 * @author jssd
 *
 * @date: 2019年3月23日 下午8:42:10
 */
class 中国工商银行 implements 银行 {

	@Override
	public void openAccount() {
		System.out.println("在中国工商银行开户！");
	}

}
