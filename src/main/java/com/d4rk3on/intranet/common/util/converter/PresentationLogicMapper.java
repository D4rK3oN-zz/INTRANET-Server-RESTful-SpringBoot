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
	 * @param dto
	 * @return
	 */
	public Bean dtoToBean(Dto dto);

	/**
	 *  Maps Bean class to Dto class
	 * 
	 * @param bean
	 * @return
	 */
	public Dto beanToDto(Bean bean);
}
