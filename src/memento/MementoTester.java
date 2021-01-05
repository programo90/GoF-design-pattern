package memento;

import memento.game.Gamer;
import memento.game.Memento;

public class MementoTester {
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento();
		
		for(int i=0; i<100; i++) {
			System.out.println("====" + i);
			System.out.println("���� : "+gamer);
			
			gamer.bet();
			
			System.out.println("�������� " + gamer.getMoney() + "�� �Դϴ�.");
			
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("���� : ���� ���� ����");
				memento = gamer.createMemento();
			} else if (gamer.getMoney() < memento.getMoney()) {
				System.out.println("���� : ���� ���·� �ǵ�����");
				gamer.restoreMemento(memento);
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("");
			}
		}
	}
}
