package com.bjpowernode.javase.test004;

/**
 * ��this.��ʲôʱ����ʡ�ԣ�
 *	�������־ֲ�������ʵ��������ʱ�򣬲���ʡ�ԣ���this.������ʡ�� 
 */
// �û���
public class User {
	
	// ����˽�л�
	private int id;
	private String name;
	
	// ���캯��
	public User() {
		
	}
	
	/*
	public User(int a,String s) {
		id = a;
		name = s;
	}
	*/
	
	// ����this���Ժ����ǵĹ��췽����������д������֪��
	public User(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	// setter and getter
	/*
	public void setId(int a) {
		id = a;
	}
	*/
	
	// java��ѭ�ͽ�ԭ��
	// ���³����id��ʵ������id�޹أ����ܲ������ַ�ʽ
	/*
	public void setId(int id) {
		id = id;
	}
	*/
	
	/*
	public void setId(int id) {
		// �Ⱥź����id���Ǿֲ�����id���Ⱥ�ǰ���this.id��ʵ������id
		this.id = id; 
	}
	*/
	
	// myeclipse�Զ����ɵ�setter��getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
