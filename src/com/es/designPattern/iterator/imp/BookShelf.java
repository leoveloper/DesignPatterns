package com.es.designPattern.iterator.imp;

import java.util.Iterator;

import com.es.designPattern.iterator.inf.Aggregate;

/**
 * 本棚クラス
 *
 * @author gmoue
 *
 */
public class BookShelf implements Aggregate {

	private Book[] books;
	private int last = 0;

	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}

	@Override
	/**
	 * ★★★本棚をスキャンするクラス。
	 */
	public Iterator<BookShelf> iterator() {
		// 自動生成されたメソッド・スタブ
		return new BookShelfIterator<BookShelf>(this);
	}

	/**
	 * 本を追加する。
	 * @param book
	 */
	public void appendBook(Book book) {
		books[last] = book;
		last++;
	}

	/**
	 * 本棚の容量を戻す。
	 * @return 本棚の容量
	 */
	public int getBookShelfLen() {
		return books.length;
	}

	/**
	 * Indexより本を取得する。
	 * 
	 * @param bookIndex
	 * @return
	 */
	public Book getBookAt(int bookIndex) {
		return books[bookIndex];
	}
}
