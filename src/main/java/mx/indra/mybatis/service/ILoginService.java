package mx.indra.mybatis.service;

import mx.indra.mybatis.beans.UserBean;

public interface ILoginService {
	
	public UserBean getUserForName(String userName);

}
