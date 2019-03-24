/**
 *
 * @Title AbstactFile.java
 * @Prject GOF23
 * @Package cn.jssd.composite
 * @Description TODO
 * @author jssd
 * @date 2019年3月23日 下午5:32:35
 * @version V1.0
 */
package pers.jssd.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象类构建， 便于统一的操作
 * 
 * @ClassName AbstactFile
 * @author jssd
 *
 * @date: 2019年3月23日 下午5:32:35
 */
public interface AbstactFile {

	/**
	 * 杀毒方法
	 * 
	 * @Title killVirus
	 * @Description TODO
	 * @return void
	 */
	void killVirus();

}

/**
 * 图片文件杀毒实现
 * 
 * @ClassName ImageFile
 * @author jssd
 *
 * @date: 2019年3月23日 下午5:35:50
 */
class ImageFile implements AbstactFile {

	private String name;

	/**
	 * @Title ImageFile
	 * @Description TODO
	 *
	 * @param name
	 */
	public ImageFile(String name) {
		super();
		this.name = name;
	}

	/*
	 * (non Javadoc)
	 * @Title killVirus
	 * @Description TODO
	 * @see cn.jssd.composite.AbstactFile#killVirus()
	 */
	@Override
	public void killVirus() {
		System.out.println("ImageFile.killVirus()" + name);
	}

}

/**
 * 文本文件杀毒实现
 * 
 * @ClassName TextFile
 * @author jssd
 *
 * @date: 2019年3月23日 下午5:36:37
 */
class TextFile implements AbstactFile {

	private String name;

	/**
	 * @Title ImageFile
	 * @Description TODO
	 *
	 * @param name
	 */
	public TextFile(String name) {
		super();
		this.name = name;
	}

	/*
	 * (non Javadoc)
	 * @Title killVirus
	 * @Description TODO
	 * @see cn.jssd.composite.AbstactFile#killVirus()
	 */
	@Override
	public void killVirus() {
		System.out.println("TextFile.killVirus()" + name);
	}
}

/**
 * 文件夹文件
 * 
 * @ClassName Folder
 * @author jssd
 *
 * @date: 2019年3月23日 下午5:41:02
 */
class Folder implements AbstactFile {

	private String name;
	private List<AbstactFile> list = new ArrayList<AbstactFile>();

	/**
	 * @Title ImageFile
	 * @Description TODO
	 *
	 * @param name
	 */
	public Folder(String name) {
		super();
		this.name = name;
	}

	/**
	 * 添加文件
	 * 
	 * @Title add
	 * @Description TODO
	 * @param abstactFile
	 * @return void
	 */
	public void add(AbstactFile abstactFile) {
		list.add(abstactFile);
	}

	/**
	 * 删除文件
	 * 
	 * @Title remove
	 * @Description TODO
	 * @param abstactFile
	 * @return void
	 */
	public void remove(AbstactFile abstactFile) {
		list.remove(abstactFile);
	}

	/**
	 * 取得文件
	 * 
	 * @Title get
	 * @Description TODO
	 * @param index
	 * @return
	 * @return AbstactFile
	 */
	public AbstactFile get(int index) {
		return list.get(index);
	}

	/*
	 * (non Javadoc)
	 * @Title killVirus
	 * @Description TODO
	 * @see cn.jssd.composite.AbstactFile#killVirus()
	 */
	@Override
	public void killVirus() {
		for (AbstactFile file : list) {
			file.killVirus();
		}
	}
}
