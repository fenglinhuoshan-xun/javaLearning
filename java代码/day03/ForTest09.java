/*
	��дforѭ�����ҳ�1~100֮�����е�����
	�������ֱ���Ϊ������ֻ�ܱ�1���������������ܱ�������������������
*/

public class ForTest09{

	public static void main(String[] args){
		
		
		for(int i=2; i<=100; i++){
			int m = 0; //������ڿ����бȽϳ��á�
			for(int j=2; j<i; j++){
				if(i % j == 0){
					m=1;
				}
			}

			/*
			if(m == 0){
				System.out.println(i);
			}
			*/

			System.out.println(m == 0 ? i + "������" : i + "��������");
		}
		

		/*
		�����棺
		��дforѭ�����ҳ�1~10000�е���������
		Ҫ��ÿ8����һ�����
		*/

		int n = 0;
		for(int i=2; i<=10000; i++){
			int m = 0;
			for(int j=2; j<i; j++){
				if(i % j == 0){
					m=1;
				}
			}
			if(m == 0){
				n += 1;
				System.out.print(i + "	");	
				if(n >= 8){
					System.out.println();
					// ����
					n = 0;
				}

			}
		}
		
	}
}



