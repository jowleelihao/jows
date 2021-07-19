package com.login.service;

import java.util.Date;

import com.login.dao.Userdao;
import com.login.implement.UserserviceImpl;
import com.login.pojo.accout;

public class UserService implements UserserviceImpl {
    Userdao userdao=new Userdao();
	/* （非 Javadoc）
	 * @see com.login.implement.UserserviceImpl#loginService(java.lang.String)
	 * 返回的是用户名匹配的那一项数据
	 */
	@Override
	public accout loginService(String username) {
		  
		// TODO 自动生成的方法存根
		return userdao.login(username);
	}

	@Override
	public void registerService(String username, String password, String gender,String email,String phone,Date birth) {
		// TODO 自动生成的方法存根
	    userdao.register(username, password, gender,email,phone,birth);
		
	}
          
	
}
