/*
	����java���Ե��е�if��䣬����ѡ��ṹ��if����ֱ���Ϊ��֧���/�����������;
		1. if�����ṹ�����ֱ�д��ʽ
			-- ��һ�֣�
				if(�������ʽ){
					java���;
					java���;
					...
				}

			˵��ÿһ��if���Ƕ����ģ�����Ӱ�죬ÿ��if��������ж�

			-- �ڶ��֣�
				if(�������ʽ){
					java���;
					java���;
					...
				}else{
					java���;
					java���;
					...
				}

			-- �����֣�
				if(�������ʽ){
					java���;
					java���;
					...					
				}else if(�������ʽ){
					java���;
					java���;
					...
				}else if(�������ʽ){
					java���;
					java���;
					...
				}else if(�������ʽ){
					java���;
					java���;
					...
				}...

			-- �����֣�
				if(�������ʽ){
					java���;
					java���;
					...					
				}else if(�������ʽ){
					java���;
					java���;
					...
				}else if(�������ʽ){
					java���;
					java���;
					...
				}else if(�������ʽ){
					java���;
					java���;
					...
				}else{
					java���;
					java���;
					...
				}

		2. �ص㣺��Ӧjava�е�if�����˵��ֻҪ��һ����ִ֧�У�����if���ȫ������
	
		3. ���ϵĵڶ��ֱ�д��ʽ�͵����ֱ�д��ʽ������else��֧�������ַ�ʽ����100%��֤���з�ִ֧��

		4. ���еĿ�����䶼�ǿ��Ի���Ƕ��ʹ�õģ�ֻҪ����Ƕ�׾���
			ע�⣺Ƕ��ʹ�õ�ʱ�򣬴����ʽҪ��֤��������������ʱ�򣬱���Ҫ�������󲿷�����£���{}��Χ�����ݣ���Ҫ������
			if(){
				if(){
					if(){
					
					}
				}
			}else{
				if(){
				
				}else{
					if(){
						if(){
						
						}
					}
				}
			}

		5. if���ķ�֧�����ֻ��һ��java���Ļ��������ſ���ʡ�Բ�д
			if(true/false){
				һ��java���;
			}

			if(true/false) һ��java���; // ���ַ�ʽ���Ƽ�ʹ�ã�����Ҫ�ܿ��Ķ�

				
*/

public class IfTest01{

	public static void main(String[] args){

		// ��������λ�õ��幫�ﷶΧ֮�ڣ��пϵ»��Ļ���ȥKFC���緹
		// ������
		double distance = 1.0; // ��λ��KM
		// �ж����\
		if(distance < 5){
			System.out.println("ȥKFC���緹��");
		}

		/*
			����ϵͳ����һ�������ĳɼ����ɼ����ܴ���С����
			����ѧ���ĳɼ��жϸ�ѧ���ĵȼ�
				[90 ~ 100]	A 
				[80 ~ 90]	B
				[70 ~ 80]	C 
				[60 ~ 70]	D
				[0 ~ 60]	E
			���ϵ��߼��жϲ���if�����ɣ�Ӧ����ôд��
		*/

		// �������󣬾���ѡ�õ����ֽṹ�����
		/*
		double score = 0;

		if(score < 0 || score > 100){
			System.out.println("�Բ������ṩ�Ŀ����ɼ����Ϸ�");
		}else if(90 <= score){
			System.out.println('A');
		} else if(80 <= score){
			System.out.println('B');
		}else if(70 <= score){
			System.out.println('C');
		}else if(60 <= score){
			System.out.println('D');
		}else{
			System.out.println('E');
		}
		*/


		double score = 101;

		String grade = "E";

		if(score < 0 || score > 100){
			grade = "�Բ������ṩ�ĳɼ����Ϸ�";
		}else if(90 <= score){
			grade = "A";
		}else if(80 <= score){
			grade = "B";
		}else if(70 <= score){
			grade = "C";
		}else if(60 <= score){
			grade = "D";
		}

		System.out.println(grade);

	}
}

