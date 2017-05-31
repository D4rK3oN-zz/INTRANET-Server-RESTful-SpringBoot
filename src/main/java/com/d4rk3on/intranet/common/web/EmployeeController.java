package com.d4rk3on.intranet.common.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.d4rk3on.intranet.common.model.bean.EmployeeBean;
import com.d4rk3on.intranet.common.model.dto.response.EmployeeCompleteResponseDto;
import com.d4rk3on.intranet.common.model.dto.response.EmployeeSimpleResponseDto;
import com.d4rk3on.intranet.common.service.EmployeeService;
import com.d4rk3on.intranet.common.util.component.Utils;
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

	@Autowired
	private Utils utils;

	@Autowired
	private EmployeeService employeeService;

	/**
	 * Obtiene el empleado por su número de empleado.
	 * 
	 * @param employeeId
	 * @return EmployeeCompleteResponseDto
	 */
	@RequestMapping(value = UrlConstants.EMPLOYEE_ID, method = RequestMethod.GET)
	public EmployeeCompleteResponseDto getEmployeeByEmployeeNumber(
			@Valid @PathVariable("employeeId") String employeeId) {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Entrada al método: [{}];", utils.getAuthenticationName(),
				utils.getThreadId(), utils.getMethodName(Thread.currentThread().getStackTrace()));

		LOGGER.debug("[Uid: {}] [Thread: {}] >>> Parámetros de entrada: <employeeId> [{}];",
				utils.getAuthenticationName(), utils.getThreadId(), employeeId);

		EmployeeBean employee = employeeService.getEmployeeById(employeeId);

		return null;
	}

	/**
	 * Recupera el listado de empleados.
	 * 
	 * @return List<EmployeeResponseDto>
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<EmployeeSimpleResponseDto> getEmployees() {
		LOGGER.info("[Uid: {}] [Thread: {}] >>> Entrada al método: [{}];", utils.getAuthenticationName(),
				utils.getThreadId(), utils.getMethodName(Thread.currentThread().getStackTrace()));
		return null;
	}

}
