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
//     System.out.println("1.��¼ϵͳ");
//     System.out.println("2.ע��ϵͳ");
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
	// TODO �Զ����ɵķ������
     Scanner sc=new Scanner(System.in);
     System.out.println("--------��¼ϵͳ----");
	System.out.println("�������û�����");
	String username = sc.nextLine();
	System.out.println("���������룺");
	String password = sc.nextLine();
	accout login_accout = new Userdao().login(username);
	if(login_accout==null)System.out.println("�û����������������룡");
	else {
		if(login_accout.getPassword().equals(password))System.out.println("��¼�ɹ���");
		else System.out.println("�������");
	}
}}
//@SuppressWarnings({ "resource", "unused" })
//public static void register_update() {
//	 Scanner sc=new Scanner(System.in);
//     System.out.println("--------ע��ϵͳ-------");
//	System.out.println("�������û�����");
//	String username = sc.nextLine();
//	System.out.println("���������룺");
//	String password = sc.nextLine();
//	System.out.println("�������Ա�");
//	String gender=sc.nextLine();
//	boolean check=new Userdao().register(username, password, gender,);
//	if(check)System.out.println("ע��ɹ�");
//	else System.out.println("ע��ʧ��");
//	
//}
//}
