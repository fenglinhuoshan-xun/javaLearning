/*
	1. �ٸ����ӣ���ǡ����ʱ��ʹ��super(ʵ�ʲ����б�);
	2. ��Ȼ�����˹��췽���������ڹ��췽��ִ�й����У�һ���������˸���Ĺ��췽��������Ĺ��췽���ּ������µ������ĸ���Ĺ��췽��������ʵ���ϣ�����ֻ������һ��

	3. ˼������supr(ʵ��)�������Ǹ�ɶ�ģ�
		super(ʵ��)�������ǣ���ʼ����ǰ����ĸ����������������Ǵ����¶���ʵ���϶���ֻ������һ��

	4. super�ؼ��ִ�����ʲô��
		super�ؼ��ִ���ľ��ǡ���ǰ���󡱵��ǲ��ָ���������
		�磺�Ҽ̳����Ҹ��׵�һ�����������磺
			�۾���Ƥ����
			super����ľ��ǡ��۾���Ƥ���ȡ�
			���۾���Ƥ���ȡ���Ȼ�Ǽ̳��˸��׵ģ������ⲿ������������

*/
// ���Գ���
public class SuperTest03{

	public static void main(String[] args){
		CreditAccount ca1 = new CreditAccount();
		System.out.println(ca1.getActno() + "," + ca1.getBalance() + "," + ca1.getCredit());
		CreditAccount ca2 = new CreditAccount("1111", 10000.0, 0.99);
		System.out.println(ca2.getActno() + "," + ca2.getBalance() + "," + ca2.getCredit());
	}
}
// �˻�
class Account extends Object{
	
	private String actno;
	private double balance;
	
	public Account() {
		// Ĭ�ϻ���
		// super();
		// this.actno = null;
		// this.balance = 0.0;
	}
	
	public Account(String actno, double balance) {
		// super();
		this.actno = actno;
		this.balance = balance;
	}
	
	public String getActno() {
		return actno;
	}
	
	public void setActnc(String actno) {
		this.actno = actno;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

//�����˻�
class CreditAccount extends Account{
	
	// ���ԣ�������
	// �������е�һ������������û��
	private double credit;
	
	// ���췽��
	public CreditAccount() {
		// Ĭ���е�
		// supr();
		// this.credit = 0.0;
	}

	// �в����Ĺ��췽��
	// �������³����Ƿ���ڱ�����󣿣���
	public CreditAccount(String actno, double balance, double credit){
		// ˽�е�����ֻ���ڱ����з���
		/*
		this.actno = actno;
		this.balance = balance;
		*/

		// ���µ����д�����ǡ����λ�ã����ÿ���ʹ�ã�super(actno,balance);
		// ͨ������Ĺ��췽�����ø���Ĺ��췽��
		super(actno,balance);
		this.credit = credit;
	}

	public double getCredit() {
		return credit;
	}
	
	public void setCredit(double credit) {
		this.credit = credit;
	}
	
}