package memento;

import memento.game.Gamer;
import memento.game.Memento;

public class MementoTester {
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento();
		
		for(int i=0; i<100; i++) {
			System.out.println("====" + i);
			System.out.println("현상 : "+gamer);
			
			gamer.bet();
			
			System.out.println("소지금은 " + gamer.getMoney() + "원 입니다.");
			
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("증가 : 현재 상태 저장");
				memento = gamer.createMemento();
			} else if (gamer.getMoney() < memento.getMoney()) {
				System.out.println("감소 : 이전 상태로 되돌리기");
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
