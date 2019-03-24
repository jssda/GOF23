/**
 *
 * @Title ConcrateMyAggregate.java
 * @Prject GOF23
 * @Package cn.jssd.iterator
 * @Description TODO
 * @author jssd
 * @date 2019年3月24日 下午2:09:05
 * @version V1.0
 */
package cn.jssd.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcrateMyAggregate
 * @author jssd
 *
 * @date: 2019年3月24日 下午2:09:05
 */
public class ConcrateMyAggregate<T> {

	private List<T> list = new ArrayList<>();

	/**
	 * 添加元素
	 * 
	 * @Title addElement
	 * @Description TODO
	 * @param o
	 * @return void
	 */
	public void addElement(T o) {
		this.list.add(o);
	}

	/**
	 * 删除元素
	 * 
	 * @Title remoElement
	 * @Description TODO
	 * @param index
	 * @return void
	 */
	public void remoElement(int index) {
		this.list.remove(index);
	}

	/**
	 * 取得迭代器
	 * 
	 * @Title getIterator
	 * @Description TODO
	 * @return
	 * @return MyIterator
	 */
	public MyIterator getIterator() {
		return new ConcrateIterator();
	}

	private class ConcrateIterator implements MyIterator {

		private int cusor;

		/*
		 * (non Javadoc)
		 * @Title hasNext
		 * @Description TODO
		 * @return
		 * @see cn.jssd.iterator.MyIterator#hasNext()
		 */
		@Override
		public boolean hasNext() {
			return cusor < list.size() ? true : false;
		}

		/*
		 * (non Javadoc)
		 * @Title first
		 * @Description TODO
		 * @see cn.jssd.iterator.MyIterator#first()
		 */
		@Override
		public void first() {
			cusor = 0;
		}

		/*
		 * (non Javadoc)
		 * @Title last
		 * @Description TODO
		 * @see cn.jssd.iterator.MyIterator#last()
		 */
		@Override
		public void last() {
			cusor = list.size() - 1;
		}

		/*
		 * (non Javadoc)
		 * @Title isFirst
		 * @Description TODO
		 * @return
		 * @see cn.jssd.iterator.MyIterator#isFirst()
		 */
		@Override
		public boolean isFirst() {
			return cusor == 0 ? true : false;
		}

		/*
		 * (non Javadoc)
		 * @Title isLast
		 * @Description TODO
		 * @return
		 * @see cn.jssd.iterator.MyIterator#isLast()
		 */
		@Override
		public boolean isLast() {
			return cusor == (list.size() - 1) ? true : false;
		}

		/*
		 * (non Javadoc)
		 * @Title getCurrentObj
		 * @Description TODO
		 * @return
		 * @see cn.jssd.iterator.MyIterator#getCurrentObj()
		 */
		@Override
		public Object getCurrentObj() {
			return list.get(cusor);
		}

		/* (non Javadoc)
		 * @Title next
		 * @Description TODO
		 * @see cn.jssd.iterator.MyIterator#next()
		 */
		@Override
		public void next() {
			if(cusor < list.size()) {
				cusor ++;
			}
		}

	}
}
