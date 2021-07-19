package com.login.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.utils.JDBCUtils;

public class JdbcUtilsTest {
	public static void main(String[] args) {
		Connection conn=null;
		Statement   stat=null;
		 try {
			 conn=JDBCUtils.getConnection();
			 System.out.println(conn);
			 stat=conn.createStatement();
		String sql="select *from accout";
		ResultSet re = stat.executeQuery(sql);
		while(re.next()) {
			System.out.println(re.getString(1));
		}
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			if(stat!=null)
			try {
				stat.close();
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		 
	}
     
      
}