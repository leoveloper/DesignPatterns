/**
 *
 */
package com.es.designPattern.iterator.inf;

import java.util.Iterator;

/**
 * @author gmoue
 *
 */
public interface Aggregate {
	@SuppressWarnings("rawtypes")
	public Iterator iterator();
}
