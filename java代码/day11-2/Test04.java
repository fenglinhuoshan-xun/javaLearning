package org.apache;

/*
	import����������������࣬ͬһ�����µ��࣬����Ҫ���룬����ͬһ��������Ҫ�ֶ�����
	
	import�﷨��ʽ��
		import ����;
		import ����.*;

	import�����Ҫ��д��package���֮�£�class���֮��
*/

// import com.bjpowernode.javase.day11.Test01;

// import java.lang.String;

import com.bjpowernode.javase.day11.*;

import java.util.*;
import java.util.Date;

public class Test04{

	public static void main(String[] args){

		com.bjpowernode.javase.day11.Test01 tt = new com.bjpowernode.javase.day11.Test01();
		System.out.println(tt); // com.bjpowernode.javase.day11.Test01@15db9742

		com.bjpowernode.javase.day11.Test01 ttt = new com.bjpowernode.javase.day11.Test01();
		System.out.println(ttt); // com.bjpowernode.javase.day11.Test01@6d06d69c

		com.bjpowernode.javase.day11.Test01 tttt = new com.bjpowernode.javase.day11.Test01();
		System.out.println(tttt); // com.bjpowernode.javase.day11.Test01@7852e922

		// ���ϳ�����ԣ������鷳һЩ
		Test01 x = new Test01();
		System.out.println(x); // com.bjpowernode.javase.day11.Test01@4e25154f

		Test01 y = new Test01();
		System.out.println(y); // com.bjpowernode.javase.day11.Test01@70dea4e

		String s = "abc";
		System.out.println(s);

		// java.lang.*;����Ҫ�ֶ����ã�ϵͳ�Զ�����
		// lang��language���԰�����java���Եĺ����࣬����Ҫ�ֶ�����
		java.lang.String str = "abc";
		System.out.println(str);

		// ֱ�ӱ�д���´��룬���������ΪDate��û���ҵ�
		// Date d = new Date(); // ����

		// java.util.Date d = new java.util.Date(); // ����

		// ʹ��import���֮��import java.util.Date
		Date d = new Date();

	}
}

/*
	���ս��ۣ�
		ʲôʱ����Ҫimport��
			* ����java.lang���£����Ҳ���ͬһ�����µ�ʱ����Ҫʹ��import��������
*/