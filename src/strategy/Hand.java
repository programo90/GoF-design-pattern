package strategy;

public class Hand {
	public static final int HADVALUE_GUU = 0;
	public static final int HADVALUE_CHO = 1;
	public static final int HADVALUE_PAA = 2;
	public static final Hand[] hand = {
			new Hand(HADVALUE_GUU)
			,new Hand(HADVALUE_CHO)
			,new Hand(HADVALUE_PAA)
			,
	};
	
	private static final String[] name = {
		"¡÷∏‘", "∞°¿ß", "∫∏",	
	};
	
	private int handvalue;
	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}
	
	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}
	
	public boolean isStrongerThan(Hand h) {
		return fight(h)==1;
	}
	
	public boolean isWeakerThan(Hand h) {
		return fight(h)==-1;
	}
	
	private int fight(Hand h) {
		if(this == h) {
			return 0;
		} else if((this.handvalue+1)%3 == h.handvalue) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public String toString() {
		return name[handvalue];
	}
	
}
