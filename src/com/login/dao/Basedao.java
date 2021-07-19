package com.login.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.jdbc.utils.JDBCUtils;


public abstract class Basedao {
	//QueryRunner类的query方法按sql语句查询数据并返回一个泛型，包括数据表中的所有数据其中的args代表的是sql语句中的问号
	QueryRunner queryRunner= new QueryRunner();
 /**
 * @param type
 * @param sql
 * @param args
 * @return 若返回null，则表示查询不到该用户
 */
public <T> T login(Class<T> type,String sql,Object...args) {
	Connection connection=JDBCUtils.getConnection();
	  try {
		return queryRunner.query(connection, sql, new BeanHandler<T>(type), args);
	} catch (SQLException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}finally {
		if(connection!=null)
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	}
	 return null;
	
}
 /**
 * @param sql
 * @param args
 * @return 如果返回-1则更新表失败
 */
public int update(String sql,Object...args) {
	 Connection connection=JDBCUtils.getConnection();
	 try {
		return queryRunner.update(connection,sql,args);
	} catch (SQLException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}finally {
		if(connection!=null)
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
	}
	return -1;
}
}
