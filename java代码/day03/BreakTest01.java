/*
	����java������䵱�е�break��䣺
		1. break��java���Ե��еĹؼ��֣�������Ϊ���ж�/�۶ϡ�;

		2. break + ";" ���Գ�Ϊһ��������java��䣺break;

		3. break���ʹ����switch��䵱�У�������ֹswitch����ִ��

		4. break���ͬ������ʹ����ѭ����䵱�У�������ֹѭ����ִ��

		5. break��ֹ�ĸ�ѭ���أ�

		6. break;���ʹ����for,while,do..whileѭ����䵱�У���������ѭ������ֹѭ����ִ�У���Ϊ������ѭ����ĳ��������ʱ�򣬺�����ѭ��û��Ҫִ���ˣ���ִ��Ҳ�Ǻķ���Դ�����Կ�����ֹѭ��������������߳����ִ��Ч��

		7. ��Ĭ������£�break����жϵ������������ѭ����䣬��Ȼ��Ҳ����ָ����ֹĳ��ѭ������Ҫ��ѭ�����������������﷨��break ѭ������;

*/

public class BreakTest01{

	public static void main(String[] args){
		
		for(int i=0; i<10; i++){
			if(i == 5){
				break; // ��ֹ���ǵ�ǰ��forѭ��
			}
			System.out.println(i); // 0 1 2 3 4
		}

		for(int j=0; j<3; j++){
			for(int i=0; i<10; i++){
				if(i == 5){
					break; // ��ֹ�����ڲ��forѭ������Ϊ���for��������������break����޷���ֹ����forѭ��
				}
				System.out.println(i); // 	
			}
		}

		System.out.println("----------------------------------");

		// �����﷨ʹ�ý���
		// ��forѭ������for1
		for1:for(int j=0; j<3; j++){
			// ��forѭ������for2
			for2:for(int i=0; i<10; i++){
				if(i == 5){
					break for1; // ��ֹfor1ѭ��
				}
				System.out.println(i); // 0 1 2 3 4	
			}
		}


	}
}