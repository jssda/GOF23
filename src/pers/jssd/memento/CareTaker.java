package pers.jssd.memento;

/**
 * 负责人类
 * 负责管理备忘录对象
 * 
 * @ClassName CareTaker
 * @author jssd
 *
 * @date: 2019年3月24日 下午8:11:58
 */
public class CareTaker {

	private EmpMemento memento;

//	private List<EmpMemento> list = new ArrayList<EmpMemento>();

	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}

}
