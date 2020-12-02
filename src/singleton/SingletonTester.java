package singleton;

public class SingletonTester {

	public static void main(String[] args) {
		System.out.println("시스템 시작");
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("두 인스턴스는 동일한 인스턴스 입니다.");
		}
	}

}
