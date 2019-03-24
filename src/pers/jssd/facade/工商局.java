package pers.jssd.facade;

/**
 * 
 * @ClassName 工商局
 * @author jssd
 *
 * @date: 2019年3月23日 下午8:41:36
 */
public interface 工商局 {
	void checkName(); // 核名
}

/**
 * 
 * @ClassName 海淀区工商局
 * @author jssd
 *
 * @date: 2019年3月23日 下午8:41:43
 */
class 海淀区工商局 implements 工商局 {

	@Override
	public void checkName() {
		System.out.println("检查名字是否有冲突！");
	}

}
