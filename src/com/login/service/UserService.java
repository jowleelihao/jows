package com.login.service;

import java.util.Date;

import com.login.dao.Userdao;
import com.login.implement.UserserviceImpl;
import com.login.pojo.accout;

public class UserService implements UserserviceImpl {
    Userdao userdao=new Userdao();
	/* ���� Javadoc��
	 * @see com.login.implement.UserserviceImpl#loginService(java.lang.String)
	 * ���ص����û���ƥ�����һ������
	 */
	@Override
	public accout loginService(String username) {
		  
		// TODO �Զ����ɵķ������
		return userdao.login(username);
	}

	@Override
	public void registerService(String username, String password, String gender,String email,String phone,Date birth) {
		// TODO �Զ����ɵķ������
	    userdao.register(username, password, gender,email,phone,birth);
		
	}
          
	
}
