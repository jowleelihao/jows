package com.login.implement;

import java.util.Date;

import com.login.pojo.accout;


public interface Usedaoimpl {
      /**
     * @param username
     * @return/**
	 * @author Administrator
	 *   返回的是输入用户名的那一条数据，若返回值为null，表示查询不到该用户
	 */
    public accout login(String username);
    /**
     * @author Administrator
       *返回true代表插入数据成功，返回false表示插入数据失败
     */
     
	public boolean register(String username, String password, String gender,String email, String phone,Date birth);
}
