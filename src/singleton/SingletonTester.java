package singleton;

public class SingletonTester {

	public static void main(String[] args) {
		System.out.println("�ý��� ����");
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("�� �ν��Ͻ��� ������ �ν��Ͻ� �Դϴ�.");
		}
	}

}
