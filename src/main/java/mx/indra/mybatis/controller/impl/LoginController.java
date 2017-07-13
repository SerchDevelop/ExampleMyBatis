package mx.indra.mybatis.controller.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mx.indra.mybatis.beans.UserBean;
import mx.indra.mybatis.controller.ILoginController;
import mx.indra.mybatis.service.ILoginService;

@Controller
@RequestMapping("/api/login")
public class LoginController implements ILoginController {
	
	static final Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	ILoginService loginService;
			
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Integer changePAssword() {
		
		String method = "test";
		logger.info("Controller :: LoginController :: " + method);
		
		return 0;

	}

	@Override
	@RequestMapping(value = "/get/userForName/{userName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserBean getUserForName(
			@PathVariable(value = "userName")String userName) {

		String method = "getUserForName";
		logger.info("Controller :: LoginController :: " + method);
		logger.info("Params :: userName :: " + userName);
		
		System.out.println("Params :: userName :: " + userName);
		
		return loginService.getUserForName(userName);
		
	}

}
