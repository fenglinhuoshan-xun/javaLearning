package com.bjpowernode.javase.day09.test005;

/**
 * myeclipse/eclipse��༭�����ٱ༭��֧�ֶ���ͬʱ�༭
 */
public class ConstructorTest03 {
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		System.out.println(c1.getNo());
		System.out.println(c1.getName());
		System.out.println(c1.getBitrh());
		
		Customer c2 = new Customer(1111,"zhangsan","2000-01-26");
		System.out.println(c2.getNo());
		System.out.println(c2.getName());
		System.out.println(c2.getBitrh());
		
	}

}
