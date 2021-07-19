package com.login.test;


import java.util.*;

import com.login.dao.Userdao;
import com.login.pojo.accout;
import com.login.service.UserService;
public class test {
public static void main(String[] args) {
//     String choose=null;
//     @SuppressWarnings("resource")
//	Scanner sc=new Scanner(System.in);
//     boolean flag=true;
//     while(flag) {
//     System.out.println("1.登录系统");
//     System.out.println("2.注册系统");
//     choose=sc.nextLine();
//     switch (choose) {
//	case "1 ":
//		login_simpleCheck();
//		break;
//    case "2 ":
//    	register_update();
//	default:
//		flag=false;
//		break;
//	}
//     }
	
	System.out.println(new UserService().loginService("kole").toString());
}

@SuppressWarnings({ "resource", "unused" })
private static void login_simpleCheck() {
	// TODO 自动生成的方法存根
     Scanner sc=new Scanner(System.in);
     System.out.println("--------登录系统----");
	System.out.println("请输入用户名：");
	String username = sc.nextLine();
	System.out.println("请输入密码：");
	String password = sc.nextLine();
	accout login_accout = new Userdao().login(username);
	if(login_accout==null)System.out.println("用户不存在请重新输入！");
	else {
		if(login_accout.getPassword().equals(password))System.out.println("登录成功！");
		else System.out.println("密码错误！");
	}
}}
//@SuppressWarnings({ "resource", "unused" })
//public static void register_update() {
//	 Scanner sc=new Scanner(System.in);
//     System.out.println("--------注册系统-------");
//	System.out.println("请输入用户名：");
//	String username = sc.nextLine();
//	System.out.println("请输入密码：");
//	String password = sc.nextLine();
//	System.out.println("请输入性别：");
//	String gender=sc.nextLine();
//	boolean check=new Userdao().register(username, password, gender,);
//	if(check)System.out.println("注册成功");
//	else System.out.println("注册失败");
//	
//}
//}
