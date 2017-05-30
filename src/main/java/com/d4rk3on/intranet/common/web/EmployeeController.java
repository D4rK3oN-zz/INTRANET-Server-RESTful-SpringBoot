package com.d4rk3on.intranet.common.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.d4rk3on.intranet.common.model.dto.response.EmployeeResponseDto;
import com.d4rk3on.intranet.common.util.constant.AppConstants;
import com.d4rk3on.intranet.common.util.constant.UrlConstants;

/**
 * Employee controller
 * 
 * @author javier.moreno
 *
 */
@RestController
@RequestMapping(UrlConstants.PATH_SECURE + UrlConstants.EMPLOYEE)
public class EmployeeController extends GenericController {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -5113575402724058415L;

	/**
	 * Obtiene el empleado por su número de empleado.
	 * 
	 * @param employeeId
	 * @return EmployeeResponseDto
	 */
	@RequestMapping(value = UrlConstants.EMPLOYEE_ID, method = RequestMethod.GET)
	public EmployeeResponseDto getEmployeeById(@Valid @PathVariable("employeeId") Integer employeeId) {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Entrada al método: [{}];",
				SecurityContextHolder.getContext().getAuthentication().getName(), Thread.currentThread().getId(),
				Thread.currentThread().getStackTrace()[AppConstants.STACK_TRACE_CUR_METHOD].getMethodName());

		LOGGER.debug("[Uid: {}] [Thread: {}] >>> Parámetros de entrada: <employeeId> [{}];",
				SecurityContextHolder.getContext().getAuthentication().getName(), Thread.currentThread().getId(),
				employeeId);

		return null;
	}

	/**
	 * Recupera el listado de empleados.
	 * 
	 * @return List<EmployeeResponseDto>
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<EmployeeResponseDto> getEmployees() {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Entrada al método: [{}];",
				SecurityContextHolder.getContext().getAuthentication().getName(), Thread.currentThread().getId(),
				Thread.currentThread().getStackTrace()[AppConstants.STACK_TRACE_CUR_METHOD].getMethodName());
		return null;
	}

}
