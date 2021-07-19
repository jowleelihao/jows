package com.jdbc.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;




public class JDBCUtils{
	
	private static DataSource dataSource;
	static {
		
		try {
			Properties properties=new Properties();
			InputStream inputStream = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
			properties.load(inputStream);
			 dataSource = (DataSource) DruidDataSourceFactory.createDataSource(properties);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
	}
	/** 
	 * �������ӱ���
	 * @return
	 */
	public  static Connection getConnection() {
		Connection connection=null;
	     try {
			connection=dataSource.getConnection();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	     return connection;
	}
	//�ر����ӣ��贫��������
	public static void close(Connection connection,Statement statement,ResultSet resultSet) {
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		if (statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		if(resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}