package com.login.implement;

import java.util.Date;

import com.login.pojo.accout;

public interface UserserviceImpl {
     /**
     * @param username
     * @return ���ص��ǲ�ѯ���û�������һ�е�����
     */
    public accout loginService(String username);
   
	public void registerService(String username, String password, String gender, String email, String phone, Date birth);
}
