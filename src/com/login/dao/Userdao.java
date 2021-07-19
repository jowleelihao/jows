package com.login.dao;

import java.util.Date;

import com.login.implement.Usedaoimpl;
import com.login.pojo.accout;


public class Userdao extends Basedao implements Usedaoimpl{
	/**
	 * @author Administrator
	 *   ���ص��������û�������һ�����ݣ�������ֵΪnull����ʾ��ѯ�������û�
	 */
	@Override
    public accout login(String username) {
	       	String sql="select *from accout where username=?";//�ʺű�ʾ����Basedao��queryRunner.query(connection, sql, new BeanHandler<T>(type), args)��args;
	       	Userdao userdao=new Userdao();
			return userdao.login(accout.class, sql, username); 
	       	
	}
    /**
     * @param username
     * @param password
     * @param gender
     * @return ����true����������ݳɹ�������false��ʾ��������ʧ��
     */
	@Override
    public boolean register(String username,String password,String gender,String email,String phone,Date birth) {
		Userdao userdao=new Userdao();
		String sql="insert into accout(username,password,gender,email,phone,birth)values(?,?,?,?,?,?)";
		if(userdao.update(sql, username,password,gender,email,phone,birth)!=-1)return true;
		return false;
	}

	
}
