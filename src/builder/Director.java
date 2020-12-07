package builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("��ħ�� ����");
		builder.makeItems(new String[] {
				"���� ��ħ"
				,"�������"
				,
		});
		
		builder.makeString("�㿡");
		builder.makeItems(new String[] {
				"�ȳ��ϼ���"
				,"�ȳ��� �ֹ�����"
				,"�ȳ��� �輼��"
				,
		});
	}
}
