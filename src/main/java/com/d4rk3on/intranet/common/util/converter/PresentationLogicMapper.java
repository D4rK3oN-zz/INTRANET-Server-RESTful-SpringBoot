package com.d4rk3on.intranet.common.util.converter;

import java.io.Serializable;

/**
 * Interface for mapping objects of presentation logic
 * 
 * @author javier.moreno
 *
 * @param <Bean>
 * @param <Dto>
 */
public interface PresentationLogicMapper<Bean, Dto> extends Serializable {

	/**
	 *  Maps Dto class to Bean class
	 * 
	 * @param d
	 * @return
	 */
	public Bean dtoToBean(Dto d);

	/**
	 *  Maps Bean class to Dto class
	 * 
	 * @param b
	 * @return
	 */
	public Dto beanToDto(Bean b);
}
