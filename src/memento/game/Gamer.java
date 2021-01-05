package memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
	private int money;
	private List fruits = new ArrayList();
	private Random random = new Random();
	private static String[] fruitsname = {
			"���", "����", "������", "��",
	};
	
	public Gamer(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void bet() {
		int dice = random.nextInt(6) +1;
		if(dice==1) {
			money +=100;
			System.out.println("������ ����");
		} else if(dice==2) {
			money /=2;
			System.out.println("������ ��");
		} else if(dice == 6) {
			String f= getFruit();
			System.out.println("���� (" + f + ")�� �޾ҽ��ϴ�.");
			fruits.add(f);
		} else {
			System.out.println("���� ����");
		}
	}
	
	public Memento createMemento() {
		Memento m = new Memento(money);
		Iterator it = fruits.iterator();
		while(it.hasNext()) {
			String f = (String)it.next();
			if(f.startsWith("���ִ�")) {
				m.addFruit(f);
			}
		}
		
		return m;
	}
	
	public void restoreMemento(Memento memento) {
		this.money = memento.money;
		this.fruits = memento.getFruits();
	}
	
	public String toString() {
		return "[money = " + money + ", fruits = " + fruits + "]";
	}
	
	private String getFruit() {
		String prefix = "";
		if(random.nextBoolean()) {
			prefix = "���ִ�";
		}
		return prefix + fruitsname[random.nextInt(fruitsname.length)];
	}
}
