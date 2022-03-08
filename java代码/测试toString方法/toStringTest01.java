// Ĭ�ϼ̳�Object��Object��������Щ�����أ�
/*
	package java.lang;

	import jdk.internal.vm.annotation.IntrinsicCandidate;

	public class Object {

		@IntrinsicCandidate
		public Object() {}

		@IntrinsicCandidate
		public final native Class<?> getClass(); // ע�⣺��Դ�뵱��һ�������ԡ�;����β���������η��б����С�native���ؼ��ֵ�ʱ�򣬱�ʾ�ײ����C++д��dll����dll��̬���ӿ��ļ���

		@IntrinsicCandidate // ע��
		public native int hashCode();  // �ײ�Ҳ�ǵ���C++

		// equals������Ӧ���ܿ���
		// public�ǹ�����
		// boolean�ǲ�������
		// equals��һ������������ʾ��ȵ���˼
		// (Object obj) �β�
		// ֻ����Ŀǰ����֪������������ڵ�����
		public boolean equals(Object obj) {
			// ������
			return (this == obj);
		}

		// ���ж���a���봴��һ����aһģһ���Ķ�������Ե��������¡����
		// �ײ�Ҳ�ǵ���C++
		@IntrinsicCandidate
		protected native Object clone() throws CloneNotSupportedException;

		// һ�����ǿ��Բ���һ��toString����
		// public��ʾ������
		// String�Ƿ���ֵ���ͣ�toString()����ִ�н���֮�󷵻�һ���ַ���
		// toString�Ƿ�����
		// {}��ʾ�βθ���Ϊ0
		public String toString() {
			return getClass().getName() + "@" + Integer.toHexString(hashCode());
		}

		@IntrinsicCandidate
		public final native void notify();

		@IntrinsicCandidate
		public final native void notifyAll();

		public final void wait() throws InterruptedException {
			wait(0L);
		}

		public final native void wait(long timeoutMillis) throws InterruptedException;

		public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
			if (timeoutMillis < 0) {
				throw new IllegalArgumentException("timeoutMillis value is negative");
			}

			if (nanos < 0 || nanos > 999999) {
				throw new IllegalArgumentException(
									"nanosecond timeout value out of range");
			}

			if (nanos > 0 && timeoutMillis < Long.MAX_VALUE) {
				timeoutMillis++;
			}

			wait(timeoutMillis);
		}

		@Deprecated(since="9")
		protected void finalize() throws Throwable { }
	}

*/

public class toStringTest01{

	// toStringTest01Ĭ�ϼ̳�Object
	// toStringTest01��������toString()����
	// ����toString()������һ��ʵ����������Ҫ����������ܵ���

	public static void main(String[] args){

		// ��������������ִ����
		// ���뱨��
		// toStringTest01.toString();
		/*
		public String toString() {
			return getClass().getName() + "@" + Integer.toHexString(hashCode());
		}	
		*/

		// ��new����
		toStringTest01 tst = new toStringTest01();
		String retValue = tst.toString();

		// 15db9742 ���ԡ���ͬ�����������ڶ��ڴ浱�е��ڴ��ַ
		// ʵ�������ڴ��ַ��������ϣ�㷨���ó���ʮ�����ƵĽ��
		System.out.println(retValue); // toStringTest01@15db9742

		// ��������
		Product pro = new Product();
		String retValue2 = pro.toString();
		System.out.println(retValue2); // Product@6d06d69c

		// �������д���ϲ�Ϊһ�У����ԣ�
		// ��Ϊ����ֻnew��һ�Σ����Խ��һ��
		System.out.println(pro.toString()); // Product@6d06d69c

		// ���ֱ����������á��أ�
		// println�������Զ�����pro��toString()����
		System.out.println(pro); // Product@6d06d69c

	}
}

class Product{

}




