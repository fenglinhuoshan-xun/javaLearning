package com.bjpowernode.javase.test003;

/**
 * ���ս��ۣ�
 * 	�ڴ���static�ķ������У����ܡ�ֱ�ӡ�����ʵ��������ʵ����������Ϊʵ��������ʵ����������Ҫ����ĵĴ��ڣ���static�ķ���������û��this�ģ�Ҳ����˵��ǰ�����ǲ����ڵģ���ȻҲ���޷����ʵ�ǰ�����ʵ��������ʵ������
 */
public class ThisTest {

	// ������
	// ����static
	public static void main(String[] args) {
		
		// ����doSome����
		ThisTest.doSome();
		
		// ����doSome����
		doSome();
		
		// doOther��ʵ������
		// ʵ�������ĵ��ñ����ж������
		// ���´����ʾ�ĺ��壺���õ�ǰ�����doOther����
		// ����main������û��this���������·������ܵ���
		// doOther(); // �������
		
		// ����doOther����
		// ʵ�����������ȴ�������ͨ������.�ķ�ʽ����
		ThisTest tt = new ThisTest();
		tt.doOther();
		
		tt.run();
		
		
	}
	
	// ����static
	public static void doSome() {
		System.out.println("do some!");
	}
	
	// ʵ������
	public void doOther() {
		// this��ʾ��ǰ����
		System.out.println("do other!");
	}
	
	// ʵ������
	// run��ʵ������������run������һ�����ж�����ڵ�
	// һ�����ȴ�����һ�����󣬲��ܵ���run����
	public void run() {
		// �ڴ������еĴ���ִ�й����У�һ�����С���ǰ����ġ�
		// Ҳ����˵������ һ���С�this��
		System.out.println("run execute!");
		
		// doOther��һ��ʵ��������ʵ�������ĵ��ñ����ж���Ĵ���
		// ���´����ʾ�ĺ�����ǣ����õ�ǰ�����doOther����
		doOther();
		// this.doOther();
	}
	
}
