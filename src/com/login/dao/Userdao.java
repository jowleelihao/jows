package com.login.dao;

import java.util.Date;

import com.login.implement.Usedaoimpl;
import com.login.pojo.accout;


public class Userdao extends Basedao implements Usedaoimpl{
	/**
	 * @author Administrator
	 *   返回的是输入用户名的那一条数据，若返回值为null，表示查询不到该用户
	 */
	@Override
    public accout login(String username) {
	       	String sql="select *from accout where username=?";//问号表示传给Basedao中queryRunner.query(connection, sql, new BeanHandler<T>(type), args)的args;
	       	Userdao userdao=new Userdao();
			return userdao.login(accout.class, sql, username); 
	       	
	}
    /**
     * @param username
     * @param password
     * @param gender
     * @return 返回true代表插入数据成功，返回false表示插入数据失败
     */
	@Override
    public boolean register(String username,String password,String gender,String email,String phone,Date birth) {
		Userdao userdao=new Userdao();
		String sql="insert into accout(username,password,gender,email,phone,birth)values(?,?,?,?,?,?)";
		if(userdao.update(sql, username,password,gender,email,phone,birth)!=-1)return true;
		return false;
	}

	
}
