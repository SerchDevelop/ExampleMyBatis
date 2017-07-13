package mx.indra.mybatis.controller;

import mx.indra.mybatis.beans.UserBean;

public interface ILoginController {
	
	public UserBean getUserForName(String userName);

}
