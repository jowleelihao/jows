package com.login.implement;

import java.util.Date;

import com.login.pojo.accout;


public interface Usedaoimpl {
      /**
     * @param username
     * @return/**
	 * @author Administrator
	 *   ���ص��������û�������һ�����ݣ�������ֵΪnull����ʾ��ѯ�������û�
	 */
    public accout login(String username);
    /**
     * @author Administrator
       *����true����������ݳɹ�������false��ʾ��������ʧ��
     */
     
	public boolean register(String username, String password, String gender,String email, String phone,Date birth);
}
