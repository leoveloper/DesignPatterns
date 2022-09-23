/**
 *
 */
package com.es.designPattern.iterator.imp;

import java.util.Iterator;

/**
 * 本棚のインテグレータ
 * @author gmoue
 * @param <E>
 *
 */
public class BookShelfIterator<E> implements Iterator<E> {

	/**
	 * 対象本棚
	 */
	private BookShelf bookShelf;

	/**
	 * カレント書類のINDEX。
	 */
	private int index = 0;

	public BookShelfIterator(BookShelf bs) {
		this.bookShelf = bs;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getBookShelfLen()) {
			return true;
		} else {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public E next() {
		com.es.designPattern.iterator.imp.Book book = bookShelf.getBookAt(index);
		index++;
		return (E) book;
	}
}
