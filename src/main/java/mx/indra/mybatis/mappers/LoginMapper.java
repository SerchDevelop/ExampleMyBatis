package mx.indra.mybatis.mappers;

import org.apache.ibatis.annotations.Param;

import mx.indra.mybatis.beans.UserBean;

public interface LoginMapper {
	
	UserBean getUser(
			@Param(value="userName") String userName);

}
