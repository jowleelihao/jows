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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}
	/** 
	 * 返回连接变量
	 * @return
	 */
	public  static Connection getConnection() {
		Connection connection=null;
	     try {
			connection=dataSource.getConnection();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	     return connection;
	}
	//关闭连接，需传入量参数
	public static void close(Connection connection,Statement statement,ResultSet resultSet) {
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if (statement!=null) {
			try {
				statement.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(resultSet!=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}