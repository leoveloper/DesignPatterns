package com.es.designPattern.iterator.imp;

/**
 * 本クラス
 * @author gmoue
 *
 */
public class Book {
	private String name;

	public Book(String name) {
		// 名称
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
