package com.d4rk3on.intranet.common.util.converter;

import java.io.Serializable;

/**
 * Interface for mapping objects of business logic
 * 
 * @author javier.moreno
 *
 * @param <Bean>
 * @param <Entity>
 */
public interface BusinessLogicMapper<Bean, Entity> extends Serializable {

	/**
	 * Maps Entity class to Bean class
	 * 
	 * @param e
	 * @return
	 */
	public Bean entityToBean(Entity e);

	/**
	 * Maps Bean class to Entity class
	 * 
	 * @param b
	 * @return
	 */
	public Entity beanToEntity(Bean b);
}
