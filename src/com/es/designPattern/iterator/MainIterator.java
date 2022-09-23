/**
 *
 */
package com.es.designPattern.iterator;

import com.es.designPattern.iterator.imp.Book;
import com.es.designPattern.iterator.imp.BookShelf;
import com.es.designPattern.iterator.imp.BookShelfIterator;

/**
 * @author gmoue
 *
 */
public class MainIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BookShelf bs = new BookShelf(5);
		bs.appendBook(new Book("1.Desing patter"));
		bs.appendBook(new Book("2.Desing patter"));
		bs.appendBook(new Book("3.Desing patter"));
		bs.appendBook(new Book("4.Desing patter"));
		bs.appendBook(new Book("5.Desing patter"));

		BookShelfIterator<Book> it = new BookShelfIterator<Book>(bs);
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}

}
