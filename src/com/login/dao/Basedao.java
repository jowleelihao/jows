package com.login.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.jdbc.utils.JDBCUtils;


public abstract class Basedao {
	//QueryRunner���query������sql����ѯ���ݲ�����һ�����ͣ��������ݱ��е������������е�args�������sql����е��ʺ�
	QueryRunner queryRunner= new QueryRunner();
 /**
 * @param type
 * @param sql
 * @param args
 * @return ������null�����ʾ��ѯ�������û�
 */
public <T> T login(Class<T> type,String sql,Object...args) {
	Connection connection=JDBCUtils.getConnection();
	  try {
		return queryRunner.query(connection, sql, new BeanHandler<T>(type), args);
	} catch (SQLException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}finally {
		if(connection!=null)
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
	}
	 return null;
	
}
 /**
 * @param sql
 * @param args
 * @return �������-1����±�ʧ��
 */
public int update(String sql,Object...args) {
	 Connection connection=JDBCUtils.getConnection();
	 try {
		return queryRunner.update(connection,sql,args);
	} catch (SQLException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}finally {
		if(connection!=null)
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
	}
	return -1;
}
}
