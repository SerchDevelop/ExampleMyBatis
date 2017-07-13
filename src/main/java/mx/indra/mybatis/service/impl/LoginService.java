package mx.indra.mybatis.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mx.indra.mybatis.beans.UserBean;
import mx.indra.mybatis.mappers.LoginMapper;
import mx.indra.mybatis.service.ILoginService;

@Service("loginService")
public class LoginService implements ILoginService {

	@Resource
	private LoginMapper loginMapper;
	

	public void setLoginMapper(LoginMapper loginMapper) {
		System.out.println("setLoginMapper :::: " + loginMapper);
		this.loginMapper = loginMapper;
	}

	@Override
	public UserBean getUserForName(String userName) {
		
		System.out.println("Servicios getUserForName :: userName :: " + userName);
		
		UserBean userBean = loginMapper.getUser(userName);
		
		if(userBean != null){
			System.out.println("Response 1 :: " + userBean.getFirstName());
			System.out.println("Response 2 :: " + userBean.getLastName());
			System.out.println("Response 3 :: " + userBean.getUserName());
		}
		
		return userBean;
	}	

}