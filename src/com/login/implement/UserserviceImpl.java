package com.login.implement;

import java.util.Date;

import com.login.pojo.accout;

public interface UserserviceImpl {
     /**
     * @param username
     * @return 返回的是查询的用户名的那一行的数据
     */
    public accout loginService(String username);
   
	public void registerService(String username, String password, String gender, String email, String phone, Date birth);
}
